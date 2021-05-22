package com.cts.handson4.cor;

import com.cts.handson4.cor.interfaces.impl.Supervisor;

public class CORProgramDemo {
    public static void main(String[] args) {
        // Create the Employee
        Employee krishna = new Employee(1L, "Krishnakumar", "Ramachandran");
        // Leave Request
        LeaveRequest leaveRequest = new LeaveRequest(krishna, 9);
        Supervisor supervisor = new Supervisor();
        // Pass Leave Request to the supervisor
        supervisor.handleRequest(leaveRequest);
    }
}
