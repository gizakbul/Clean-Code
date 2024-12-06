package org.services;

import org.interfaces.IScanner;
import org.interfaces.Printer;
import org.model.Document;

public class JustAPrinter implements Printer, IScanner {
    public void Print(Document d) {
        // Printing logic
    }
    public void Scan(Document d) throws Exception {
        throw new Exception("Scan not supported.");
    }
}
