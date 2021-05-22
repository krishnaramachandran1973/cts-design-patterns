package com.cts.handson4.cor;

/*
    Leave Request to be created by the requester.
 */
public class LeaveRequest {
    private final Employee employee;
    private final int leaveDays;

    public LeaveRequest(Employee employee, int leaveDays) {
        this.employee = employee;
        this.leaveDays = leaveDays;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

}
