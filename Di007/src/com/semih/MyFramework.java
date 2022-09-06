package com.semih;

public class MyFramework {
    public MyFramework() {
    }

    private IProvider provider;
    private IPrinter printer;

    public Object getObjectInstance(String providerClassname, String printerClassname) {
        Object objectProvider = null;
        Object objectPrinter = null;

        try {
            objectProvider = Class.forName(providerClassname).getDeclaredConstructor().newInstance();
            objectPrinter = Class.forName(printerClassname).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println("Something get wrong.. " + e.getMessage());
            throw new RuntimeException();
        }
        if (objectProvider instanceof IProvider)
            provider = (IProvider) objectProvider;
        if (objectPrinter instanceof IPrinter)
            printer = (IPrinter) objectPrinter;
        printer.setProvider(provider);
        return printer;
    }
}
