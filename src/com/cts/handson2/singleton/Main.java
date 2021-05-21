package com.cts.handson2.singleton;

public class Main {
    public static void main(String[] args) {
        // Create the runnable
        TestDbConn con = new TestDbConn();
        // Passing the runnable to 4 threads
        Thread t1 = new Thread(con);
        Thread t2 = new Thread(con);
        Thread t3 = new Thread(con);
        Thread t4 = new Thread(con);
        // check the output, the 4 threads have the same DBConn instance
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
