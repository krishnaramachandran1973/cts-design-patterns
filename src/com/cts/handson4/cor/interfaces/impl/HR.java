package com.cts.handson4.cor.interfaces.impl;

import com.cts.handson4.cor.LeaveRequest;
import com.cts.handson4.cor.interfaces.ILeaveRequestHandler;


/*
    HR implementation
 */


public class HR extends ILeaveRequestHandler {

    public HR() {
        this.successor = new Management();
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        int leaveDays = leaveRequest.getLeaveDays();

        Consideration consideration = (leaveDays >= 5 && leaveDays < 10) ? Consideration.APPROVE :
                (leaveDays >= 10) ? Consideration.NEXT : Consideration.REJECT;

        Util.handler(HR.class, consideration, leaveRequest, this.successor);
    }


}
