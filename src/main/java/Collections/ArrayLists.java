package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer s: list2) {
        	list1.add(s);
        }
    	return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Integer sum = 0;
        for(Integer r: list1) {
        	sum += r;
        }
        for(Integer s: list2) {
        	sum += s;
        }
    	return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        for(Integer i = 0; i < original.size(); i ++) {
        	if(original.get(i) == toRemove) {
        		original.remove(i);
        		i --;
        	}
        }
    	return original;
    }

    public boolean happyList(ArrayList<String> original) {
    	boolean flag = false;
    	if(original.size() <= 1) {
    		flag = true;
    	}
    	if(original.size() == 2) {
    		for(int i = 0; i < original[0].length(); i ++) {
    			for(int j = 0; j < original[1].length(); j ++) {
    				if(original[0].charAt(i) == original[1].charAt(j)) {
    					flag = true;
    				}
    			}
    		}
    	}
    	if(original.size() >= 3) {
    		for(int p = 0, q = p + 1; p < original.size() - 1; p ++, q ++) {
    			for(int i = 0; i < original[p].length(); i ++) {
        			for(int j = 0; j < original[q].length(); j ++) {
        				if(original[p].charAt(i) == original[q].charAt(j)) {
        					flag = true;
        				}
        			}
        		}
    		}
    	}
        return flag;
    }
}
