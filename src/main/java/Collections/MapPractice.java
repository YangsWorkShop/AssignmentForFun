package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> keys=new ArrayList<Object>();
        for(Object key: map.keySet()){
            if(map.get(key).equals(value)){
                keys.add(key);
            }
        }
        return keys.toArray(new Object[0]);
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer,Integer> fibMap=new HashMap<Integer, Integer>(size);
        if(size<1){
            return fibMap;
        }
        fibMap.put(1,1);
        if(size==1){
            return fibMap;
        }
        fibMap.put(2,1);
        for(int i=3;i<=size;i++){
            fibMap.put(i,fibMap.get(i-2)+fibMap.get(i-1));
        }
        return fibMap;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer,Integer> fibMap=new HashMap<Integer, Integer>();
        if(size<1){
            return fibMap;
        }
        fibMap.put(1,first);
        if(size==1){
            return fibMap;
        }
        fibMap.put(2,second);
        int sum=first+second;
        for(int i=3;i<=size;i++){
            fibMap.put(i,sum);
            sum=fibMap.get(i-1)+fibMap.get(i);
        }
        return fibMap;
    }
}
