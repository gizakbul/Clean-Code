package org.services;

import org.interfaces.Machine;
import org.model.Document;

public class OldFashionedPrinter implements Machine {
    public void print(Document d) {
        // Printing logic
    }

    public void fax(Document d) throws Exception {
        throw new Exception("Fax not supported");
    }

    public void scan(Document d) throws Exception {
        throw new Exception("Scan not supported");
    }
}
