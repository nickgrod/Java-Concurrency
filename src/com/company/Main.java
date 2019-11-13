package com.company;

import static com.company.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello");
        Thread anotherThread = new SecondThread();
        anotherThread.start();
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();
        System.out.println(ANSI_PURPLE + "Hello again from main thread");

    }
}
