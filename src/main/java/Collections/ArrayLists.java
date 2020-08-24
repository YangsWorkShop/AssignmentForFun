package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(list1);
        merge.addAll(list2);
        return merge ;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        for(Integer num: list1) sum+=num;
        for(Integer num:list2) sum+=num;
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {

        if(original.size() == 0 ) return original;
        ArrayList<Integer> res = (ArrayList<Integer>)original.clone();
        for(int i = 0 ;i < res.size();i++){
            if(res.get(i)==toRemove){
                res.remove(i);
                i-=1;
            }
        }

        return res;
    }

    private boolean compareContains(String one, String two){
        for(int i = 0 ; i< one.length();i++){
            if(two.contains((Character.toString(one.charAt(i))))){
                return true;
            }
        }
        return false;
    }

    public boolean happyList(ArrayList<String> original) {
        int prev = -1;
        int front = 1;

        for(int i = 0 ; i<original.size();i++ ){
            if(prev >= 0){
                if(!compareContains(original.get(prev),original.get(i))) return false;
            }
            if(front<original.size()){
                if(!compareContains(original.get(i),original.get(front))) return false;
            }

            prev++;
            front++;
        }

        return true;
    }
}
