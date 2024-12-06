package org.services;

import org.interfaces.IScanner;
import org.interfaces.MultiFunctionDevice;
import org.interfaces.Printer;
import org.model.Document;

public class MultiFunctionMachine implements MultiFunctionDevice {
    private Printer printer;
    private IScanner scanner;

    public MultiFunctionMachine(Printer printer, IScanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void Print(Document d) throws Exception {
        printer.Print(d);
    }

    public void Scan(Document d) throws Exception {
        scanner.Scan(d);
    }
}
