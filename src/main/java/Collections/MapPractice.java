package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<Object> res = new ArrayList<Object>();
        for(Object k: map.keySet()) {
            if(map.get(k) == value) {
                res.add(k);
            }
        }
        return res.toArray(new Object[0]);
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        for(int i = 0; i < size && i < 2; i++) {
            res.put(i + 1, 1);
        }
        int first = 1, second = 1;
        for(int i = 2; i< size; i++) {
            res.put(i + 1, first + second);
            int next = first + second;
            first = second;
            second = next;
        }
        return res;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        if(size >= 1) {
            res.put(1, first);
        }
        if(size >= 2) {
            res.put(2, second);
        }
        int next;
        for(int i = 2; i < size; i++) {
            next = first + second;
            res.put(i + 1, next);
            first = second;
            second = next;
        }
        return res;
    }
}
