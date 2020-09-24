package org.example.strategy;

public class PDFFileType implements FileTypeDecider {
    @Override
    public void fileType() {
        System.out.println("This is PDFFileType");
    }
}
