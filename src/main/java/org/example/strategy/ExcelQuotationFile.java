package org.example.strategy;

public class ExcelQuotationFile extends FileType {

    public ExcelQuotationFile() {
        fileTypeDecider = new ExcelFileType();
        fileContentDecider = new QuotationFile();
    }

}
