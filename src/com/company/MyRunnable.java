package com.company;

import static com.company.ThreadColor.ANSI_RED;

/**
 * Created by nickg on 11/13/2019.
 * This class runs a new thread by implementing the Runnable interface
 */
public class MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println(ANSI_RED + "MyRunnable running now");
    }
}
