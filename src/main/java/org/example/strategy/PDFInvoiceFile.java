package org.example.strategy;

public class PDFInvoiceFile extends FileType {

    public PDFInvoiceFile() {
        fileTypeDecider = new PDFFileType();
        fileContentDecider = new InvoiceFile();
    }

}
