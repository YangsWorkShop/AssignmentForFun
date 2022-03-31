package Collections;

import java.util.*;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int res = 0;
        for(int i : list1){
            res += i;
        }
        for(int i : list2){
            res+= i;
        }

        return res;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        for (int i = 0; i < original.size(); i++) {
            if(original.get(i).equals(toRemove)){
                original.remove(i);
            }
        }

        return original;
    }

    public boolean happyList(ArrayList<String> original) {

        if(original.size()==1) return true;

        for(int i = 0; i<original.size(); i++) {
            String s1 = original.get(i);
            Set<Character> stringSet = new HashSet<Character>();
            for (int j = 0; j < s1.length(); j++) {
                stringSet.add(s1.charAt(j));
            }
            Set<Character> prevStringSet = new HashSet<Character>();
            if(i != 0) {
                String prev;
                prev = original.get(i - 1);
                for (int z = 0; z < prev.length(); z++) {
                    prevStringSet.add(prev.charAt(z));
                }
            }
            Set<Character> nextStringSet = new HashSet<Character>();
            if(i != original.size()-1){
                String next = original.get(i + 1);
                for (int x = 0; x < next.length(); x++) {
                    nextStringSet.add(next.charAt(x));
                }
            }

            if (i == 0) {
                if(!happyElement(stringSet, nextStringSet)) return false;
            }
            else if(i == original.size()-1){
                if(!happyElement(stringSet, prevStringSet)) return false;
            }
            else {
                if(!happyElement(prevStringSet, stringSet, nextStringSet)) return false;
            }
        }

        return true;
    }
    public boolean happyElement(Set<Character> set1, Set<Character>set2){
        return !Collections.disjoint(set1, set2);
    }
    public boolean happyElement(Set<Character> set1, Set<Character>set2,Set<Character>set3 ){
        return !Collections.disjoint(set1, set2) || !Collections.disjoint(set2, set3);
    }

}
