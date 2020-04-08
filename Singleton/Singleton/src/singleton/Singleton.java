package singleton;

class TSThreading extends Thread{
    @Override
    public void run()
    {
        try
            { 
            ThreadSafeSingleton instance = ThreadSafeSingleton.getTSInstance();
            System.out.println(this.getName()+" : "+instance);

            } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    }
}

public class Singleton{
    public static void main(String[] args) {
        // NORMAL DENEME TS SINGLETON
        System.out.println("");
        System.out.println("TS Deneme1:");
        ThreadSafeSingleton ts1 = ThreadSafeSingleton.getTSInstance();
        ThreadSafeSingleton ts2 = ThreadSafeSingleton.getTSInstance();
        ThreadSafeSingleton ts3 = ThreadSafeSingleton.getTSInstance();
        ts1.log("");
        ts2.log("");
        ts3.log("");
        ts1.context = "s1";
        ts1.log("");
        ts2.log("");
        ts3.log("");
       

        System.out.println("");
        System.out.println("Threadl'li TS Deneme:");
        for(int i=0; i<100; i++){
            TSThreading thread = new TSThreading();
            thread.start();
        }

    }
    
}
    