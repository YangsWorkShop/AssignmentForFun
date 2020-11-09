package Collections;

import java.util.*;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {

        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<Object> strs = new ArrayList<Object>();
        int length =0;
        Set<Map.Entry> entries = map.entrySet();
        for(Map.Entry entry:entries){
            if(entry.getValue().equals(value)){
                strs.add(entry.getKey());
            }
        }
        Object[] result = new Object[strs.size()];
        for(Object str : strs){
            result[length++] = str;
        }
        return result;
    }
    
    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer,Integer> fib = new HashMap();
        if(size<=0) return fib;
        if(size==1){
            fib.put(1,1);
            return fib;
        }
        fib.put(1,1);
        fib.put(2,1);
        for(int i=3;i<=size;i++)
            fib.put(i,fib.get(i-1)+fib.get(i-2));
        return fib;
    }    
    
    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer,Integer> map = new HashMap();
        if(size<=0) return map;
        if(size==1){
            map.put(1,first);
            return map;
        }  
        map.put(1,first);
        map.put(2,second);
        for(int i=3;i<=size;i++){
            map.put(i,map.get(i-1)+map.get(i-2));
        }
        return map;
    }
}
