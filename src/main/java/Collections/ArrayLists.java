package Collections;

import javax.print.attribute.standard.JobStateReasons;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        addShit(list1, list2);
        int sum = 0;
        for(Object e: list1){
            sum += (int)e;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
//        toRemove = (int)toRemove;
        for(Integer s: original){
            if(s.equals(toRemove)){
                original.remove(s);
            }
        }

        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.size() < 2){
            return true;
        }
        // now 2 or more strings here:
        HashSet prv = new HashSet();

        for(int i = 0; i < original.size();i++){
            if(i == 0) {
                for (int j = 0; j < original.get(i).length(); j++) {
                    prv.add(original.get(i).charAt(j));
                }
            }
                HashSet cur = new HashSet();
                for(int j = 0; j< original.get(i).length(); j++){
                    cur.add(original.get(i).charAt(j));
                }
                boolean flag = false;
                for(Object c:cur){
                    if (prv.contains(c)){
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    return false;
                }

                prv = cur;
            }
        return true;
        }

    }

