package com.cts.handson4.cor.interfaces.impl;

import com.cts.handson4.cor.LeaveRequest;
import com.cts.handson4.cor.interfaces.ILeaveRequestHandler;

/*
    Supervisor implementation
 */

public class Supervisor extends ILeaveRequestHandler {

    public Supervisor() {
        this.successor = new ProjectManager();
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        int leaveDays = leaveRequest.getLeaveDays();

        Consideration consideration = (leaveDays > 0 && leaveDays < 3) ? Consideration.APPROVE :
                (leaveDays >= 3) ? Consideration.NEXT : Consideration.REJECT;

        Util.handler(Supervisor.class, consideration, leaveRequest, this.successor);
    }
}
