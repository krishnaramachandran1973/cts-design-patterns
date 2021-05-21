package com.cts.handson2.singleton;
/*
For testing DBConn com.cts.handson2.singleton in a threading context
 */
public class TestDbConn implements Runnable{
    DBConn dbConn;

    @Override
    public void run() {
        dbConn = DBConn.getInstance();
        System.out.println(dbConn);
    }
}
