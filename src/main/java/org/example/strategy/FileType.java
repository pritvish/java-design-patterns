package org.example.strategy;

public abstract class FileType {

    FileTypeDecider fileTypeDecider;
    FileContentDecider fileContentDecider;

    public void fileType() {
        fileTypeDecider.fileType();
    }

    public void fileContent() {
        fileContentDecider.fileContentType();
    }

    public void display() {
        this.fileContent();
        this.fileType();
    }
}
