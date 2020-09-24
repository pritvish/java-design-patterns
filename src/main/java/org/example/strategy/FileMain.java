package org.example.strategy;

public class FileMain {
    public static void main(String[] args) {
        PDFInvoiceFile pdfInvoiceFile = new PDFInvoiceFile();
        pdfInvoiceFile.display();

        System.out.println("---------------------------------");

        ExcelQuotationFile excelQuotationFile = new ExcelQuotationFile();
        excelQuotationFile.display();
    }
}
