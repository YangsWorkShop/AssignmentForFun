
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MapPractice {

    public Object findValueOf(Map<String,String> map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map<String,String> map, Object value) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                list.add(entry.getKey());
            }
        }
        return list.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> map = new HashMap<>();
        if (size == 0) {
            return map;
        }
        map.put(1, 1);
        if (size == 1) {
            return map;
        }
        int[] fib = new int[size];
        fib[0] = 1;
        fib[1] = 1;
        map.put(2, 1);
        for (int i = 2; i < size; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
            map.put(i + 1, fib[i]);
        }
        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> map = new HashMap<>();
        if (size == 0) {
            return map;
        }
        if (size == 1) {
            map.put(1, first);
            return map;
        }
        int[] fib = new int[size];
        fib[0] = first;
        fib[1] = second;
        map.put(1, first);
        map.put(2, second);
        for (int i = 2; i < size; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
            map.put(i + 1, fib[i]);
        }
        return map;
    }
}
