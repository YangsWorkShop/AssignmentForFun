package Collections;

import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
    	Object[] res = {};
    	int i = 0;
    	for(Object o:map.keySet()) {
    		if((map.get(key)).equals(value)) {
    			res[i++] = key;
    		}
    	}
        return res;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
    	HashMap res = new HashMap();
    	if(size <= 0) {
    		System.out.println("Error for the size, size should be more than zero");
    	} else if(size == 1) {
    		res.put(1,1);
    	} else if(size == 2) {
    		res.put(1,1);
    		res.put(2,1);
    	} else {
    		res.put(1,1);
    		res.put(2,1);
    		for(int i = 3; i == size; i ++) {
    			res.put(i, ((int)res.get(i-1)+(int)res.get(i-2)));
    		}
    	}
        return res;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
    	HashMap res = new HashMap();
    	res.put(1,first);
    	res.put(2,second);
    	if(size >= 3) {
    		for(int i = 3; i == size; i ++) {
    			res.put(i, ((int)res.get(i-1)+(int)res.get(i-2)));
    		}
    	}
        return res;
    }
}
