package Collections;

import com.sun.codemodel.internal.JForEach;
import java.util.*;


public class MapPractice {

    public Object findValueOf(Map map, Object key) {

        return map.get(key);
    }

    public Object[] findKeysOf(Map<Object, Object> map, Object value) {
        List<Object> res = new ArrayList<>();
        for (Map.Entry<Object,Object> entry : map.entrySet()) {
            if(entry.getValue().equals(value)) {
                res.add(entry.getKey());
            }
        }
        Object[] obj = res.toArray();
        return obj;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size+1; i++) {
            if(i == 1) map.put(1,1);
            if(i == 2) map.put(2,1);
            if(i >2){
                map.put(i, map.get(i-1) + map.get(i-2));
            }
        }
        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size+1; i++) {
            if(i == 1) map.put(i,first);
            if(i == 2) map.put(i,second);
            if(i >2){
                map.put(i, map.get(i-1) + map.get(i-2));
            }
        }
        return map;
    }
}
