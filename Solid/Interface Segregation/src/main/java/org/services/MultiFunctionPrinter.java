package org.services;

import org.interfaces.Machine;
import org.model.Document;

public class MultiFunctionPrinter implements Machine {
    public void print(Document d) {
        // Printing logic
    }

    public void fax(Document d) {
        // Faxing logic
    }

    public void scan(Document d) {
        // Scanning logic
    }
}
