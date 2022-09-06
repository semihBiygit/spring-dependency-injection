package com.semih;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryBuilder implements Factory {
    private IProvider provider;
    private IPrinter printer;
    private static FactoryBuilder instance;
    private Properties properties;

    static {
        instance = new FactoryBuilder();
    }

    public static FactoryBuilder getInstance() {
        return instance;
    }

    {
        properties = new Properties();
        try {
            // D:\SpringDI_Ornek\Ornek2\Di005Five\src\application.properties
            /**
             * 1. application.properties dosyasını okumak için
             */
            properties.load(new FileInputStream("C:\\Users\\semih\\Desktop\\IdeaProjects\\SpringDependencyInjection\\Di005\\src\\application.properties"));
            /**
             * 2. application içinde tanımlanan key/value şekndeki bilgileri çekiyoruz.
             */
            String printerClass = properties.getProperty("printer");
            String providerClass = properties.getProperty("provider");
            /**
             * 3. Bir sınıf kullanılacağını belirtiyoruz. burada Object olarak alınan sınıftan bir instance oluşturuluyor.
             */
            provider = (IProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
            printer = (IPrinter) Class.forName(printerClass).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println("Hata Oluştu....: " + e.getMessage());
        }

    }

    @Override
    public IProvider getProvider() {
        return provider;
    }

    @Override
    public IPrinter getPrinter() {
        return printer;
    }
}
