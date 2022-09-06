package com.semih;

public class MyFramework {
    public MyFramework(){}

    public Object getObjectInstance(String className){
        try{
            return Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e){
            System.out.println("Something get wrong.. "+e.getMessage());
            throw new RuntimeException();
        }
    }
}
