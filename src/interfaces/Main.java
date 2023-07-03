package interfaces;

import interfaces.demo.Document;
import interfaces.demo.Printable;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
//        document.print();
//        document.printText("Pesho");



        Printable printableDocument = new Document();
        printableDocument.print();
    }
}
