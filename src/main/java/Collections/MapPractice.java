package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return key != null ? map.get(key) : null;
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<Object> list = new ArrayList<Object>();
        for (Object obj : map.keySet()) {
            if (map.get(obj).equals(value))
                list.add(obj);
        }

        return list.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> fiboMap = new HashMap<Integer, Integer>();
        if (size <= 0) return fiboMap;

        fiboMap.put(1, 1);
        if (size == 1) return fiboMap;

        fiboMap.put(2, 1);
        if (size == 2) return fiboMap;

        for (int i = 3; i <= size; i++)
            fiboMap.put(i, fiboMap.get(i - 1) + fiboMap.get(i - 2));

        return fiboMap;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> spiralMap = new HashMap<Integer, Integer>();
        if (first == null || second == null || size == null || size <= 0) return spiralMap;

        spiralMap.put(1, first);
        if (size == 1) return spiralMap;

        spiralMap.put(2, second);
        if (size == 2) return spiralMap;

        for (int i = 3; i <= size; i++)
            spiralMap.put(i, spiralMap.get(i - 1) + spiralMap.get(i - 2));

        return spiralMap;
    }
}
