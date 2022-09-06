package com.semih;

public class Runner {
    public static void main(String[] args) {
        MyFramework mFramework = new MyFramework();
        IPrinter printer = (IPrinter) mFramework.getObjectInstance("com.semih.MessageProviderEN", "com.semih.StandartPrinter");
        printer.print();
    }
}
