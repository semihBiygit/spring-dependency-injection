package com.semih;

public class Runner {
    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter();
        StandartPrinter standartPrinter = new StandartPrinter();
        MessageProviderEN messageProviderEN = new MessageProviderEN();
        MessageProviderTR messageProviderTR = new MessageProviderTR();

        errorPrinter.setProvider(messageProviderEN);
        errorPrinter.print();
        standartPrinter.setProvider(messageProviderEN);
        standartPrinter.print();

        errorPrinter.setProvider(messageProviderTR);
        errorPrinter.print();
        standartPrinter.setProvider(messageProviderTR);
        standartPrinter.print();


        //  Alternative way



    }

}
