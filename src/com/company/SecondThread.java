package com.company;


import static com.company.ThreadColor.ANSI_CYAN;

/**
 * Created by nickg on 11/12/2019.
 */
public class SecondThread extends Thread {
    @Override
    public void run(){
        System.out.println(ANSI_CYAN + "Second thread running");
    }
}
