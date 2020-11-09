package Collections;

import java.util.*;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if(list2==null||list2.size()==0) return list1;
        for(int num:list2){
            list1.add(num);
        }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        if(list1!=null)
            for(int i:list1) sum+=i;
        if(list2!=null)
            for(int i:list2) sum+=i;
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        if (toRemove==null) return original;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i:original){
            if(i!=toRemove)
                result.add(i);
        }
        return result;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original==null||original.size()<=1) return true;
        for(int i=1;i<original.size();i++){
            String before = original.get(i-1);
            String now = original.get(i);
            boolean isHappy = false;
            for(int j=0;j<before.length();j++){
                for(int k=0;k<now.length();k++){
                    if(before.charAt(j)==now.charAt(k)) isHappy = true;
                }
            }
            if(!isHappy) return false;
        }
        return true;
    }
}
