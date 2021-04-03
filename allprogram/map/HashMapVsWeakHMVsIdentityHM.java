package allprogram.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapVsWeakHMVsIdentityHM {
    public static void main(String[] args) throws InterruptedException {
      // Map<Demo,String> map = new WeakHashMap<>();
        Map<Demo,String> map = new HashMap<>();
       Demo d  =new Demo();
       map.put(d,"Hi");
       System.out.println(map);
       d=null;
       System.gc();
       Thread.sleep(4000);
       System.out.println(map);
    }
}

class Demo {
    public String toString(){
        return "demo";
    }
    public void finalize(){
        System.out.println("Finalize: ");
    }
}


// o/p
/*

        HashMap
        {demo=Hi}
        {demo=Hi}



        WeakHashMap
        {demo=Hi}
        Finalize:
        {}

         */
