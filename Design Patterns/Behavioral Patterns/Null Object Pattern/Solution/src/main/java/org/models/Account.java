package org.models;

import org.logs.Log;

public class Account {
    private Log log;

    public Account(Log log) {
        this.log = log;
    }

    public void someOperation() throws Exception {
        int c = log.getRecordCount();
        log.logInfo("Performing an operation");
        if (c + 1 != log.getRecordCount()) {
            throw new Exception("Log count mismatch!");
        }
        if (log.getRecordCount() >= log.getRecordLimit()) {
            throw new Exception("Log limit exceeded!");
        }
    }
}
