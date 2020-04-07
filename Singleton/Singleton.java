package singleton;

class LazyThreading extends Thread{
    @Override
    public void run() 
    {   
        try
            { 
                LazySingleton ls1 = LazySingleton.getLazyInstance();
                LazySingleton ls2 = LazySingleton.getLazyInstance();
                LazySingleton ls3 = LazySingleton.getLazyInstance();     
                ls1.context = "s1";
                ls1.log();
                ls2.log();
                ls3.log();   
                System.out.println(this.getName()+" Reset");
                
            } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    } 
}

class TSThreading extends Thread{
    @Override
    public void run()
    {
        try
            { 
                ThreadSafeSingleton ts1 = ThreadSafeSingleton.getTSInstance();
                ThreadSafeSingleton ts2 = ThreadSafeSingleton.getTSInstance();
                ThreadSafeSingleton ts3 = ThreadSafeSingleton.getTSInstance();
                ts1.context = "s1";
                ts1.log(this.getName());
                ts2.log(this.getName());
                ts3.log(this.getName());
                System.out.println(this.getName()+" Reset");

            } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    }
}

public class Singleton{
    public static void main(String[] args) {
        
        // NORMAL DENEME LAZY SINGLETON
        System.out.println("Lazy Deneme:");
        LazySingleton ls1 = LazySingleton.getLazyInstance();
        LazySingleton ls2 = LazySingleton.getLazyInstance();
        LazySingleton ls3 = LazySingleton.getLazyInstance();
        ls1.log();
        ls2.log();
        ls3.log();
        ls1.context = "s1";
        ls1.log();
        ls2.log();
        ls3.log();
        
       
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
       
        boolean isLazy = false;
        if (isLazy){
        // THREAD'LI LAZY SINGLETON DENEME
        System.out.println("");
        System.out.println("Thread'li Lazy Deneme:");
        for(int i=0; i<10; i++){
            LazyThreading thread = new LazyThreading();
            thread.start();
        }
        }else{
        // THREAD'LI TS SINGLETON DENEME
        System.out.println("");
        System.out.println("Thread'li TS Deneme:");
        for(int i=0; i<10; i++){
        TSThreading thread = new TSThreading();
        thread.start();
        }    
        }
        
        


    



        

    }
    
}
    