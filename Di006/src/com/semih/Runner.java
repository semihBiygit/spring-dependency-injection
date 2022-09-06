package com.semih;

public class Runner {
    public static void main(String[] args) {
        MyFramework mFramework = new MyFramework();
        IProvider provider =(IProvider) mFramework.getObjectInstance("com.semih.MessageProviderEN");
        IPrinter printer = (IPrinter) mFramework.getObjectInstance("com.semih.StandartPrinter");
        printer.setProvider(provider);
        printer.print();
    }
}
