package org.example.strategy;

public class ExcelFileType implements FileTypeDecider {
    @Override
    public void fileType() {
        System.out.println("This is ExcelFileType");
    }
}
