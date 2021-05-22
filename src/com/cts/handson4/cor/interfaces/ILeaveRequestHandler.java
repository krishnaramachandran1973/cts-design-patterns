package com.cts.handson4.cor.interfaces;

import com.cts.handson4.cor.LeaveRequest;

/*
    Interface for Leave request considerations
 */

public abstract class ILeaveRequestHandler {
    protected ILeaveRequestHandler successor;

    public abstract void handleRequest(LeaveRequest leaveRequest);
}
