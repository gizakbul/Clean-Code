package org.logs;

public interface Log {
    int getRecordLimit();
    int getRecordCount();
    void logInfo(String message);
}
