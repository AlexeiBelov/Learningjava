package example;

import java.util.Arrays;

public class Queue {
    private char[] g;
    private int getLog;
    private int putLog;

    public Queue(int size) {
        this.g = new char[size + 1];
        this.getLog = 0;
        this.putLog = 0;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "g=" + Arrays.toString(g) +
                ", getLog=" + getLog +
                ", putLog=" + putLog +
                '}';
    }

    void put(char ch) {
        if (putLog == g.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        putLog++;
        g[putLog] = ch;
    }

    char get() {
        if (getLog == putLog) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        getLog++;
        return g[getLog];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(100);
        char ch = 'А';

        for (int i = 0; i < 32; i++) {
            queue.put(ch);
            ch++;
        }

        for (int i = 0; i < 32; i++) {
            ch = queue.get();
            if (ch != (char) 0){
                System.out.print(ch);
            }


        }

    }
}
