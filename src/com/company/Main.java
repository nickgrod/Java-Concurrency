package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        Thread anotherThread = new SecondThread();
        anotherThread.start();

    }
}
