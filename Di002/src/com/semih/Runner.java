package com.semih;

public class Runner {
    public static void main(String[] args) {
        //datatype   variableName  value;
        Print        print =       new Print();

        print.getMessage(MessageType.STANDART);
        print.getMessage(MessageType.ERROR);
    }
}
