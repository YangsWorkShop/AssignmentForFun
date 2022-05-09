package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum=0;
        for (int val: addShit(list1,list2)
             ) {
            sum+=val;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        original.remove(toRemove);
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.size()<2){
            return false;
        }
        for(int i=0;i<original.size()-1;i++){
            String str1=original.get(i);
            String str2=original.get(i+1);
            boolean hasMatch=false;
            for(int j=0;j<str1.length();j++){
                for(int k=0;k<str2.length();k++){
                    if(str1.charAt(j)==str2.charAt(k)){
                        hasMatch=true;
                        break;
                    }
                }
            }
            if(!hasMatch){
                return false;
            }
        }
        return true;
    }
}
