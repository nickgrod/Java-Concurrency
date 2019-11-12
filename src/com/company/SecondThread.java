package com.company;


/**
 * Created by nickg on 11/12/2019.
 */
public class SecondThread extends Thread {
    @Override
    public void run(){
        System.out.println("Second thread running");
    }
}
