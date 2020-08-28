package Collections;

import java.util.*;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
       return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<Object> list = new ArrayList<Object>();
        for (Object o : map.keySet()) {
            if (map.get(o).equals(value))
                list.add(o);
        }
        return list.toArray();

    }

    public Map<Integer, Integer> fibonacciTree(int size) {
          Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    	  int n1 = 1;
          int n2 = 1;
          int total = 2;
          if(size<=0)
        	  return map;
          map.put(1,1);
          if(size == 1) 
        	  return map;
          map.put(2,1);
          if(size == 2) 
        	  return map;
          
          for(int i=3;i<=size;i++){
              total = n1+n2;
              map.put(i,total);
              n1 = n2;
              n2 = total;
          }
          return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer,Integer> spiral = new HashMap<Integer, Integer>();

        if(size <= 0) 
        	return spiral;
        spiral.put(1,first);
        if(size == 1)  
        	return spiral;
        spiral.put(2,second);
        if(size == 2) 
        	return spiral;

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
