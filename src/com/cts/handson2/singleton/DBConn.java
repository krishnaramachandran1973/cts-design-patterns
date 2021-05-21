package com.cts.handson2.singleton;

/*
Singleton DBConn class
 */
public class DBConn {
    // Static variable to hold our one and only instance
    private static DBConn dbConn;

    // Constructor is private so no one outside can create
    // an instance with "new".
    private DBConn() {
    }

    // This static method gives access to the instance.
    public static DBConn getInstance() {
        // if instance is not created, enter the synchronized block.
        if (dbConn == null) {
            // We only synchronize the first time, not ever again
            // thus reducing synchronization overheads.
            synchronized (DBConn.class) {
                if (dbConn == null) {
                    dbConn = new DBConn();
                }
            }
        }
        // By the time we hit this line,
        // we have an instance and return it
        return dbConn;
    }
}
