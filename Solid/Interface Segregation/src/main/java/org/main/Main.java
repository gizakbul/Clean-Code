package org.main;

import org.interfaces.IScanner;
import org.interfaces.Machine;
import org.interfaces.Printer;
import org.model.Document;
import org.services.JustAPrinter;
import org.services.MultiFunctionMachine;
import org.services.MultiFunctionPrinter;
import org.services.OldFashionedPrinter;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();

        // MultiFunctionPrinter kullanımı
        Machine multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print(doc);
        try {
            multiFunctionPrinter.fax(doc);
            multiFunctionPrinter.scan(doc);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

        // OldFashionedPrinter kullanımı
        Machine oldFashionedPrinter = new OldFashionedPrinter();
        oldFashionedPrinter.print(doc);
        try {
            oldFashionedPrinter.fax(doc);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

        // MultiFunctionMachine kullanımı
        Printer printer = new JustAPrinter();
        IScanner scanner = new JustAPrinter();
        MultiFunctionMachine multiFunctionMachine = new MultiFunctionMachine(printer, scanner);
        try {
            multiFunctionMachine.Print(doc);
            multiFunctionMachine.Scan(doc);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}