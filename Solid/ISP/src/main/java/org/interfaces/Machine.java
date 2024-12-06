package org.interfaces;

import org.model.Document;

public interface Machine {
    void print(Document d);
    void fax(Document d) throws Exception;
    void scan(Document d) throws Exception;
}
