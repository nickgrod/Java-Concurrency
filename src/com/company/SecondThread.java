package com.company;


import static com.company.ThreadColor.ANSI_BLUE;
import static com.company.ThreadColor.ANSI_CYAN;

/**
 * Created by nickg on 11/12/2019.
 * This class is able to run on a thread by extending the Thread class
 */
public class SecondThread extends Thread {
    @Override
    public void run(){
        System.out.println(ANSI_CYAN + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println(ANSI_BLUE + " Another thread woke me up.");
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed and now I'm awake");
    }
}
