package com.company;

public class Main {
    // main method represents main thread

    public static void main(String[] args) {
        // write your code here
        // whatever i write in here will be executed by main thread
        // threads always execute the jobs in a sequence
        System.out.println("==Application Started==");

        System.out.println("== Application Finished==");


    }
}






/* thread is built-in support for multi-thread programming, A multi-thread program contains two or
more parts that can run concurrently, each part of such program called thread and each thread defines
a separate path of execution. when java programs starts up, one thread begins running immediately that's
called main thread, because this thread executed when program begins. the main thread is created
  automatically.
  # thread is light-weight sub process
  # thread follow inherited rules like super thread & child threads,child inherits parent.
  # main thread can call currentThread();
  # It is the smallest independent unit of a program
  # Every Java programs contains at least one thread
  # A thread is created & controlled by the Java.lang.Thread Class
  # Thread life-cycle== New < Runnable < Running < Waiting < Terminated
  # playing song or downloading image can be good example of thread
  # We can create thread by implementing runnable interface or extends thread
  # What make Java applications concurrent? java.lang.Thread/ java.lang.Runnable/ java.util.concurrent
 */
