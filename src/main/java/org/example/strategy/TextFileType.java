package org.example.strategy;

public class TextFileType implements FileTypeDecider {
    @Override
    public void fileType() {
        System.out.println("This is TextFileType");
    }
}
