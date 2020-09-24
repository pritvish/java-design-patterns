package org.example.strategy;

public class QuotationFile implements FileContentDecider {
    @Override
    public void fileContentType() {
        System.out.println("This file contains quotation");
    }
}
