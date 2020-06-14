package com.company;

class ThreadDemo {
    // main method represents main thread
    // class cannot declare in any method

    public static void main(String[] args) {
        // write your code here
        // whatever i write in here will be executed by main thread
        // threads always execute the jobs in a sequence
        // thread is a execution context

        System.out.println("==Application Started=="); //thread started
        //creating multiplication tables 4

        RunnableDemo1 runnableDemo1 = new RunnableDemo1(4);
        Thread thread1 = new Thread(runnableDemo1); // constructor overloading
        thread1.start();// after start method call thread will start
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { // exception handling
            e.printStackTrace();
        }

        RunnableDemo1 runnableDemo2 = new RunnableDemo1(5);
        Thread thread2 = new Thread(runnableDemo2); // constructor overloading
        thread2.start();// after start method call thread will start
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { // exception handling
            e.printStackTrace();
        }


        RunnableDemo1 runnableDemo3 = new RunnableDemo1(6);
        Thread thread3 = new Thread(runnableDemo3); // constructor overloading
        thread3.start();// after start method call thread will start
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { // exception handling
            e.printStackTrace();
        }

        RunnableDemo1 runnableDemo4 = new RunnableDemo1(7);
        Thread thread4 = new Thread(runnableDemo4); // constructor overloading
        thread4.start();// after start method call thread will start


        /*Thread thread2 = */
       /* new Thread(new Runnable(){ // anonymous class created
            @Override
            public void run() {
                int num1 = 5;
                for( int i =1; i<= 10; i++)// first initialize then conditions provided then value incremented
                {
                    System.out.println(num1+ "x" + i + "=" + num1*i );// Concatenation
                    // if i want this value will provide by user then need to use Scanner(import java.util.Scanner) class
                }
            }
        }).start(); // method chaining
        //thread2.start();


       /* for (int doc=1; doc<=10;doc++){
           System.out.println("printing document #" + doc); //
        }
        */

        System.out.println("== Application Finished=="); //thread completed


    }
}


class RunnableDemo1 implements Runnable {
    int multiplicationNumber;
    RunnableDemo1(int multiplicationNumber){
        this.multiplicationNumber = multiplicationNumber;
    }
    @Override
    public void run() {
        int num1 = multiplicationNumber; // dynamic way to multiply
        for( int i =1; i<= 10; i++)// first initialize then conditions provided then value incremented
        {
            System.out.println(num1+ "x" + i + "=" + num1*i );// Concatenation
            // if i want this value will provide by user then need to use Scanner(import java.util.Scanner) class
        }

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





