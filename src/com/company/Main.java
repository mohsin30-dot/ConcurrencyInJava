package com.company;

public class Main {
    // main method represents main thread

    public static void main(String[] args) {
        // write your code here
        // whatever i write in here will be executed by main thread
        // threads always execute the jobs in a sequence
        // thread is a execution context

        System.out.println("==Application Started=="); //job 1
        //creating multiplication tables 4
        int num1 = 4;
        for( int i =1; i<= 10; i++)// first initialize then conditions provided then value incremented
        {
            System.out.println(num1+ "x" + i + "=" + num1*i );// Concatenation
            // if i want this value will provide by user then need to use Scanner class
        }
        int num2 = 5;
        for( int i =1; i<= 10; i++) {
            System.out.println(num2+ "x" + i + "=" + num2*i );
        }
        int num3 = 6;
        for( int i =1; i<= 10; i++) {
            System.out.println(num3+ "x" + i + "=" + num3*i );
        }
        int num4 = 7;
        for( int i =1; i<= 10; i++) {
            System.out.println(num4+ "x" + i + "=" + num4*i );
        }




       /*for (int doc=1; doc<=10;doc++){
           System.out.println("printing document #" + doc); // job 2
        } */

        System.out.println("== Application Finished=="); //job 3


    }
}






/*
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
  # only one thread run at a time in any given process.
  # if we want to inherit & override, its good to use extending thread but if we just want to
 creating thread & we do not intend inherit class then use runnable interface, its lot more flexible.
 we cannot inherit multiple class in java
  # thread-scheduler decide which thread to run, each thread has a priority, High priority tasks
 executed until higher priority tasks appear
 # multi-thread is the ability of the program to run two or more threads concurrently,
 where each thread can handle a different task at the same time making optimal use of the available resources.
 */





