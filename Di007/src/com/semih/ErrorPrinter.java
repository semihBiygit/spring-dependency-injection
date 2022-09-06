package com.semih;

public class ErrorPrinter implements IPrinter {

    private IProvider provider;

    @Override
    public void setProvider(IProvider provider) {
        this.provider = provider;
    }

    @Override
    public void print() {
        System.err.println(provider.getMessage());
    }

}

