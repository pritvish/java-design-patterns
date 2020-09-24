package org.example.strategy;

public class InvoiceFile implements FileContentDecider {
    @Override
    public void fileContentType() {
        System.out.println("This file contains Invoice");
    }
}
