package com.cts.handson4.cor.interfaces.impl;

import com.cts.handson4.cor.LeaveRequest;
import com.cts.handson4.cor.interfaces.ILeaveRequestHandler;


/*
    Management implementation
 */


public class Management extends ILeaveRequestHandler {
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        System.out.println("Management: Leave request rejected.");
    }
}
