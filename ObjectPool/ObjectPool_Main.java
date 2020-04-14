package objectpool;

public class ObjectPool_Main {
    public static void main(String[] args) throws InterruptedException {

        ObjectPool pool = ObjectPool.getInstance();

        System.out.println("Normal Test");
        for (int i = 0; i < 100; i++) {
            Object obj = pool.getObject("Oguz");
        }
        System.out.println();
        System.out.println("Threading Test");
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new MultiThreading());
            thread.start();
        }

    }

}
