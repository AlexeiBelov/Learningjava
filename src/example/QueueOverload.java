package example;

import java.util.Arrays;

public class QueueOverload {
    private char[] g;
    private int getLog;
    private int putLog;

    public QueueOverload(int size) {
        this.g = new char[size + 1];
        this.getLog = 0;
        this.putLog = 0;
    }

    public QueueOverload(QueueOverload ob) {
        this.g = new char[ob.g.length];
        this.getLog = ob.getLog;
        this.putLog = ob.putLog;
        for (int i = getLog + 1; i < putLog; i++) {
            g[i] = ob.g[i];

        }
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
        QueueOverload queue = new QueueOverload(100);
        char ch = 'А';

        for (int i = 0; i < 32; i++) {
            queue.put(ch);
            ch++;
        }

        for (int i = 0; i < 32; i++) {
            ch = queue.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
    }
}
