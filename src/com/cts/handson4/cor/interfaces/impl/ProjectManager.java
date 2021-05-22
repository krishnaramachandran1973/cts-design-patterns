package com.cts.handson4.cor.interfaces.impl;

import com.cts.handson4.cor.LeaveRequest;
import com.cts.handson4.cor.interfaces.ILeaveRequestHandler;


/*
    ProjectManager implementation
 */


public class ProjectManager extends ILeaveRequestHandler {

    public ProjectManager() {
        this.successor = new HR();
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        int leaveDays = leaveRequest.getLeaveDays();

        Consideration consideration = (leaveDays >= 3 && leaveDays < 5) ? Consideration.APPROVE :
                (leaveDays >= 5) ? Consideration.NEXT : Consideration.REJECT;
        Util.handler(ProjectManager.class, consideration, leaveRequest, this.successor);
    }
}
