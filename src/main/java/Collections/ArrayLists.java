package Collections;

import java.util.*;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        for(int i : list1){
            sum += i;
        }
        for(int j : list2){
            sum += j;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
	
        ArrayList<Integer> new = new ArrayList<Integer>();
        for (int n : original) {
            if (n != toRemove) 
		new.add(n);
        }
        return new;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.size() <= 1) 
	    return true;
        else{
            for(int i = 0; i < original.size()-1; i++){
                HashSet<Character> set = new HashSet<>();
                char[] c1 = (original.get(i)).toCharArray();
                char[] c = (original.get(i+1)).toCharArray();

                for(char ch: c1){
                     set.add(ch);
                }

                int count = 0;
                for(char ch : c){
                    if(set.contains(ch)) 	
			count++;
                }
                if(count == 0) 
			return false;
            }
            return true;
        }
    }
}
