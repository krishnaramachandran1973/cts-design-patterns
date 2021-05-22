package com.cts.handson4.cor.interfaces.impl;

import com.cts.handson4.cor.LeaveRequest;
import com.cts.handson4.cor.interfaces.ILeaveRequestHandler;

/*
    Utility class to handle output and decision making to avoid duplicate code.
 */
public class Util {

    public static void handler(Class clazz, Consideration consideration, LeaveRequest leaveRequest, ILeaveRequestHandler successor) {

        switch (consideration) {
            case APPROVE:
                System.out.println(clazz.getSimpleName() + " : Leave request for Employee with id: " + leaveRequest.getEmployee()
                        .getId() + " approved");
                break;
            case NEXT:
                System.out.println("Delegating to " + successor.getClass().getSimpleName() + "...");
                successor.handleRequest(leaveRequest);
                break;
            case REJECT:
                System.out.println("LeaveRequest not in proper format");
                break;
        }
    }
}
