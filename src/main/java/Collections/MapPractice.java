package Collections;

import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        if (map.containsKey(key)) return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<String,String> list = new ArrayList<>(map.entrySet());
        for (Map<String,String> e : list) {
            if (e.getValue() == value) list.add(e);
        }
        int m = list.size();
        String[] a = new String[m];
        return list.toArray(a);
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> tree = new TreeMap<>();
        if (size== 0) return tree;
        if (size== 1) {
            tree.put(1,1);
            return tree;
        }
        if (size == 2) {
            tree.put(1,1);
            tree.put(2,1);
            return tree;
        }
        tree.put(1,1);
        tree.put(2,1);
        int tmp;
        for (int i=3; i <= size; ++i) {
            tmp = b;
            b += a;
            tree.put(i, b);
            a = tmp;
        }
        return tree;

    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer,Integer> tree = new TreeMap<>();
        if (size == 0) {
            return tree;
        }
        if (size == 1) {
            tree.put(1, first);
            return tree;
        }
        if (size == 2) {
            tree.put(1, first);
            tree.put(2, second);
            return tree;
        }
        tree.put(1, first);
        tree.put(2, second);
        int tmp;
        for (int i=3; i <= size; ++i) {
            Map<Integer,Integer> tree = new TreeMap<>();
            tmp = second;
            second += first;
            tree.put(i, second);
            first = tmp;
            return tree;
        }

    }
}
