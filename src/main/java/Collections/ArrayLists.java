package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    	ArrayList<Integer> adder = new ArrayList<>();
    	Iterator it = list2.iterator();
    	Iterator it1 =list1.iterator();
    	while(it1.hasNext()) {
    		adder.add((Integer)it1.next());
    	}
    	while(it.hasNext()) {
    		adder.add((Integer)it.next());
    	}
    	return adder;
        
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    	int sum =0;
    	Iterator it1 = list1.iterator();
    	Iterator it2 = list2.iterator();
    	while(it1.hasNext()) {
    		sum+= (Integer)it1.next();
    	}
    	while(it2.hasNext()) {
    		sum+= (Integer)it2.next();
    	}
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
    	boolean contains = true;
    	while(contains) {
    	contains=original.remove(toRemove);
    	}

        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        boolean happy = true;
        if(original.size()==1) return happy;
        else  {
       
        for(int i=0; i< original.size()-1;i++) {
        	String current = original.get(i);
        	String next = original.get(i+1);
        	boolean condition = false;
        	for(int j=0; j<next.length();j++) {
        		String character =next.substring(j,j+1);
        		if(current.contains(character)) condition= true;
        	 }
        	if(condition== false) return false;
        }
        return true;
        }
        
    
    }
}
