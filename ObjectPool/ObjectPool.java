package objectpool;

import java.util.Enumeration;
import java.util.LinkedList;

public class ObjectPool {
    // TODO THREADSAFE SINGLETON
    private long expirationTime;
    private long w8Time;
    LinkedList<Object> list;
    private static ObjectPool instance;
    private static int size;
    private String name;
    private Long now;
    
    private ObjectPool(){
        expirationTime = 1000;
        w8Time = 2000;
        size = 2;
        list  = new LinkedList<>(); 
    }
    synchronized public static ObjectPool getInstance(){
        if(instance==null)
            instance = new ObjectPool();    
        return instance;
    }
    
    public synchronized Object getObject(String name) throws InterruptedException{
        now = System.currentTimeMillis();
        Object obj;
        this.name = name;
        if(list.size() >= size){
            System.out.println("Pool ("+list.size()+"/"+size+") used");
            System.out.println("Retireving from pool");
            obj = getFromPool(name);
        }else{
            System.out.println("Pool ("+list.size()+"/"+size+") used");
            System.out.println("Creating a new object");
            obj = createNewObj();
        }
        return obj;
    }
    
    public Object getFromPool(String name) throws InterruptedException{
        long objNow = list.get(0).getNow();
        if((now - objNow) > expirationTime ){
            System.out.println(list.get(0)+" has expired, popped");
            Object obj;
            obj = list.pop();
            return obj;
        }else{
            System.out.println(list.get(0) +" hasnt expired yet, "+(now-objNow)+" milliseconds left to expire");
            System.out.println(name+" on list "+w8Time+" milliseconds left");
            Thread.sleep(w8Time);
            Object obj;
            obj = list.pop();
            return obj;
        }
    }
    
    public Object createNewObj(){
        Object obj = new Object();
        list.add(obj);
        return obj;
    }
    
    
    
}


