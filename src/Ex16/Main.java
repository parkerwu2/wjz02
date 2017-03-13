package Ex16;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Step {
    public volatile int value = 1;
    synchronized public int get() {
        return value % 3;
    }
    synchronized public void add(int n) {
        value += n;
    }
}
class A extends Thread {
    private Step step;
    public A(Step s) {
        step = s;
    }
    @Override
    public void run() {
        synchronized (step) {
            for (int i = 1; i <= 52; i+= 2) {
                while (step.get() == 0) {
                    try {
                        step.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(i + String.valueOf(i + 1));
                step.add(2);
                step.notifyAll();
            }
        }
    }
}
class B extends Thread {
    private Step step;
    public B(Step s) {
        step = s;
    }
    String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    @Override
    public void run() {
        synchronized (step) {
            for (int i = 0; i < 26; i++) {
                while (step.get() != 0) {
                    try {
                        step.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(s.charAt(i));
                step.add(1);
                step.notifyAll();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> m = new ConcurrentHashMap<>();
        m.put(1, 1);
        Step s = new Step();
        new A(s).start();
        new B(s).start();
    }
}
