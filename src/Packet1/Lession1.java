package Packet1;

import java.io.Serializable;

public class Lession1 {
//    public static void main(String[] args)
//    {
//        Nhat nhat = new Nhat();
//    }
}
class person{
    String name;
    public person() {
        System.out.println("Person");
    }
    public person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void showname(){
        System.out.println(this.name);
    }
}
class Nhat extends person{
    String age;
    public Nhat(){
        System.out.println("Nhat");
    }
    public Nhat(String age) {
        this.age = age;
    }
    public Nhat(String name, String age) {
        super(name);
        this.age = age;
    }
    public void showname(){
        System.out.println("Name " +this.name);
    }
}
class MyClass implements Serializable {
    private transient int transientVar;
    private int normalVar;
}

class Counter {
    private volatile int count = 0;
    public int getCount() {
        return count;
    }
    public void increment() {
        count++;
    }
}

class IncrementThread extends Thread {
    private Counter counter;
    public IncrementThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Incre thread :"+counter.getCount());
            counter.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintThread extends Thread {
    private Counter counter;

    public PrintThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("PrintThread: " + counter.getCount());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        IncrementThread incrementThread = new IncrementThread(counter);
        PrintThread printThread = new PrintThread(counter);

        incrementThread.start();
        printThread.start();
    }
}

