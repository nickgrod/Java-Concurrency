package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import static com.company.ThreadColor.ANSI_GREEN;
import static com.company.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello");
        /*
            Creates a new thread by creating a class that is a subclass of Thread
         */
        Thread anotherThread = new SecondThread();
        anotherThread.setName("Another thread.");
        anotherThread.start();
        /*
            creates a thread from an anonymous class
         */
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();
        /*
            Creates a new thread by creating a class that implements Runnable
         */
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();
        System.out.println(ANSI_PURPLE + "Hello again from main thread");

        /*
            Using a Runnable is considered the most common method, but the others are not 'wrong'
            Important note: we need to implement what we want into the run() method, but when we call the
            Runnable we have to use the start() method as opposed to calling run() directly.

            This is because if we use run() then it runs on the same thread that called it, whereas if we
            use start() it called a new thread that calls run()
         */
    }
}
