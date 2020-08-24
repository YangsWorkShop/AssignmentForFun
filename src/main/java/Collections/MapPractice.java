package Collections;

import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
    	ArrayList<Object> list = new ArrayList<>();
    	Set<Object> keys = map.keySet();
    	Iterator it  = keys.iterator();
    	while(it.hasNext()) {
    		Object key = it.next();
    		if(map.get(key) == value)
    			list.add(key);
    	}
    	Object[] arr = new Object[list.size()];
    	for(int i=0;i<arr.length;i++) {
    		arr[i]= list.get(i);
    	}
        return arr;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        int first = 1;
        int second = 1;
        int fib=0;
        HashMap<Integer,Integer> fibonacci = new HashMap<>();
        if(size == 0) return fibonacci;
        fibonacci.put(1,first);
        if(size == 1) return fibonacci;
        fibonacci.put(2,second);
        if(size == 2) return fibonacci;
        for(int i=2; i<size; i++) {
        	 fib = first+second;
        	 fibonacci.put(i+1,fib);
        	 first = second;
        	 second = fib;
        }
        return fibonacci;
        }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
    
         int fib =0;
         HashMap<Integer,Integer> fibonacci = new HashMap<>();
         if(size == 0) return fibonacci;
         fibonacci.put(1,first);
         if(size == 1) return fibonacci;
         fibonacci.put(2,second);
         if(size == 2) return fibonacci;
         for(int i=2; i<size; i++) {
         	 fib = first+second;
         	 fibonacci.put(i+1,fib);
         	 first = second;
         	 second = fib;
         }
         return fibonacci;
       
    }
}
