import java.util.*;

public class MapPractice
{
    /*findValueOf given a Map and an Object representing a 
    key in the map, will retrieve the value assigned 
    to that key.*/
    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    /*findKeysOf given a Map and an Object representing a value
     in the map, will return an Object[] of all keys assigned 
     to that value.*/
    public Object[] findKeysOf(Map map, Object value) {
        Set<Object> keys = new HashSet<>();
        
        map.forEach((k,v) -> {
        if(v == value) keys.add(k);
    });
        return keys.toArray();
    }

    /*fibonacciTree should return a Map of the first size numbers in the Fibonacci sequence.
     The keys should represent the position in the sequence that the value is in the sequence. 
     Please refer to tests/Google for clarification.*/
     
    public static Map<Integer, Integer> fibonacciTree(int size) {
        int value = 0;
        int prevTwoNum = 0;
        int prevOneNum = 1;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);

        for (int position = 2; position < size; position++) {
            value = prevTwoNum + prevOneNum;
            map.put(position, value);
            prevTwoNum = prevOneNum;
            prevOneNum = value;
        }

        return map;
    }

    /*crazySpiral should return a Map of the first size numbers in a sequence starting with first and second. 
     The third number should be the sum of the first two, the fourth the sum of 2 and 3, etc. 
     The keys should represent the position in the sequence that the value is in in the sequence. 
     Please refer to tests/Google for clarification.*/
    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Integer current = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, first);
        map.put(2, second);
        
        for(int position = 3; position <= size; position++ ) {
            current = first + second;
            map.put(position, current);
            
            first = second;
            second = current;
        }
        return map;
    }
}
