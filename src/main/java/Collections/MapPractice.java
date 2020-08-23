package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {

        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList keys = new ArrayList<Object>();
        for(Object i: map.keySet()){
            if(map.get(i).equals(value)){
                keys.add(i);
            }
        }

        return keys.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map m = new HashMap();
        int x;
        int prv_v = 0;
        int cur_v = 1;
        m.put(1, 0);
        if(size == 1){return m;};
        m.put(2,1);
        if(size == 2){return m;};
        //0,1, 1 , 2, 3
        for(int i = 3; i<= size; i++ ){
            int tmp = cur_v;
            cur_v+=prv_v;
            prv_v = tmp;
            m.put(i, cur_v);
        }
        return m;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        if (size == 0) return null;
        Map m = new HashMap();
        int x;
        int prv_v = first;
        int cur_v = second;
        m.put(1, first);
        if(size == 1){return m;};
        m.put(2,second);
        if(size == 2){return m;};
        for(int i = 3; i<= size; i++ ){
            int tmp = cur_v;
            cur_v+=prv_v;
            prv_v = tmp;
            m.put(i, cur_v);
        }
        return m;

    }
}
