package com.semih;

public class Runner {
    public static void main(String[] args) {
        Factory factory = FactoryBuilder.getInstance();
        IProvider provider = factory.getProvider();
        IPrinter printer = factory.getPrinter();
        printer.setProvider(provider);
        printer.print();

    }
}
