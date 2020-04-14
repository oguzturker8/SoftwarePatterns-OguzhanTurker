package objectpool;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreading implements Runnable {
    public void run() {
        try {
            System.out.println();
            System.out.println("Thread" + Thread.currentThread().getId() + " is running");
            ObjectPool pool = ObjectPool.getInstance();
            for (int i = 0; i < 100; i++) {
                Object obj = pool.getObject("Oguz1337");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
