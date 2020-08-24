package Collections;

import java.util.*;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> ls = new ArrayList<Object>();
        Object[] keys = map.keySet().toArray();
        Object[] values = map.values().toArray();

        for(int i = 0; i< keys.length;i++){
            if(values[i].equals(value)) ls.add(keys[i]);
        }

        return ls.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer,Integer> fib = new TreeMap<Integer, Integer>();

        if(size<=0)return fib;
        fib.put(1,1);
        if(size == 1) return fib;
        fib.put(2,1);
        if(size == 2) return fib;

        int prev = 1;
        int cur = 1;
        int total = 2;

        for(int i = 3; i<=size;i++ ){
            total = prev+cur;
            fib.put(i,total);
            prev = cur;
            cur = total;
        }


        return fib;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {


        Map<Integer,Integer> spiral = new TreeMap<Integer, Integer>();

        if(size <= 0) return spiral;
        spiral.put(1,first);
        if(size == 1)  return spiral;
        spiral.put(2,second);
        if(size == 2) return spiral;

        int total = first+second;
        for(int i = 3; i <= size;i++){
            total = first+second;
            spiral.put(i,total);
            first = second;
            second = total;

        }
        return spiral;
    }
}
