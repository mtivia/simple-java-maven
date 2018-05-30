package com.formation.app;

public class App{

    private final String message = "Hello World!";

    public App() throws Exception {
    	throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
