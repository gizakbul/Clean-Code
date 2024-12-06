package org.services;

import org.interfaces.IScanner;
import org.interfaces.Printer;
import org.model.Document;

public class Photocopier implements Printer, IScanner {
    public void Print(Document d) throws Exception {
        throw new Exception("Print not supported");
    }

    public void Scan(Document d) throws Exception {
        throw new Exception("Scan not supported");
    }
}
