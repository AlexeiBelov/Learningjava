package thread1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Алексей on 10.01.2016.
 */
public class Thread1 {
    public static void main(String[] args) {
//        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());//способ обезопасить работу для небольших map
        Map<String, String> map = new ConcurrentHashMap<String, String>();//более эффективно
        Thread thread1 = new Thread(new Runnable() {//создает и запускает поток
            @Override
            public void run() {
                for (; ; ) {
//                    System.out.println("I thread1");
                    map.put("1", "thread1");
//                    try {
//                        Thread.sleep(ThreadLocalRandom.current().nextInt(0, 5));//выкинет случайное число
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        });
//        synchronized (thread1){//блок, позволяет синхронизироваться
            thread1.start();
//        }

        Thread thread2 = new Thread(() -> {
            for (; ; ) {
//                System.out.println("I thread2");
                map.put("1", "thread2");
//                long start = System.currentTimeMillis();
//                System.out.println(start);
//                while (System.currentTimeMillis() < start + 1000 && !Thread.interrupted()) {// жрет время процессора
//                }
//                try {
//                    Thread.sleep(ThreadLocalRandom.current().nextInt(0, 5));
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        });
        thread2.start();
    }
    private synchronized void full(){

    }
}
