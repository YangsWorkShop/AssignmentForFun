package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
    	
    	Object[] temp = new Object[map.size()];
    	int i = 0;
    	int len = 0;
    	for(Object o:map.keySet()) {
    		if((map.get(o)).equals(value)) {
    			temp[i++] = o;
    			len ++;
    		}
    	}
    	Object[] res = new Object[len];
    	for(i = 0; i < len; i ++) {
    		res[i] = temp[i];
    	}
        return res;
    }

    public Map<Integer, Integer> fibonacciTree(Integer size) {
    	HashMap res = new HashMap();
    	if(size.intValue() == 1) {
    		res.put(new Integer(1),new Integer(1));
    	} else if(size.intValue() == 2) {
    		res.put(new Integer(1),new Integer(1));
    		res.put(new Integer(2),new Integer(1));
    	} else if(size.intValue() > 2){
    		res.put(new Integer(1),new Integer(1));
    		res.put(new Integer(2),new Integer(1));
    		for(int i = 3; i < size.intValue()+1; i ++) {
    			res.put(new Integer(i), new Integer((int)res.get(i-1)+(int)res.get(i-2)));
    		}
    	}
    	
        return res;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
    	HashMap res = new HashMap();
    	if(size.intValue() == 1) {
    		res.put(new Integer(1),first);
    		
    	} else if(size.intValue() == 2) {
    		res.put(new Integer(1),first);
    		res.put(new Integer(2),second);
    		
    	} else if(size.intValue() >= 3) {
    		for(int i = 3; i < size.intValue() + 1; i ++) {
    			res.put(new Integer(1),first);
        		res.put(new Integer(2),second);
    			res.put(new Integer(i), new Integer((int)res.get(i-1)+(int)res.get(i-2)));
    			
    		}
    		
    	}
        return res;
    }
}
