package com.semih;

public class Print {

    public void getMessage(MessageType type) {
        switch (type) {
            case STANDART:
                System.out.println("Standart message");
                break;
            case ERROR:
                System.err.println("Error message");
                break;
        }
    }
}
