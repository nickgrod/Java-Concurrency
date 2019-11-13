package com.company;

import static com.company.ThreadColor.ANSI_RED;

/**
 * Created by nickg on 11/13/2019.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.printf(ANSI_RED + "MyRunnable running now");
    }
}
