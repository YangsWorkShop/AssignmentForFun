package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int n : list2){
            list1.add(n);
        }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int total = 0;
        for(int n : list1){
            total += n;
        }
        for(int n : list2){
            total += n;
        }
        return total;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        original.remove(toRemove);
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.size() <= 1) return true;
        else{
            for(int i = 0; i < original.size()-1; i++){
                Set<Character> set1 = new HashSet<>();
                char[] c1 = (original.get(i)).toCharArray();
                char[] c = (original.get(i+1)).toCharArray();

                for(char ch: c1){
                     set1.add(ch);
                }

                int count1 = 0;
                for(char ch : c){
                    if(set1.contains(ch)) count1++;
                }
                if(count1 == 0) return false;
            }
            return true;
        }
    }
}
