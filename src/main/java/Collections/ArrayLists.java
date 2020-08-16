package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//import org.junit.Assert;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        ArrayList<Integer> bindList = addShit(list1, list2);
        for(int num: bindList) {
            sum += num;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int num: original) {
            if(toRemove == null || toRemove != num) {
                res.add(num);
            }
        }
        return res;
    }
    public boolean happyString(String s1, String s2) {
        Set<Character> chars = new HashSet<Character>();
        for(int idx =0; idx < s1.length(); idx++) {
            chars.add(s1.charAt(idx));
        }
        for(int idx = 0; idx < s2.length(); idx++) {
            if(!chars.add(s2.charAt(idx))) {
                return true;
            }
        }
        return false;
    }
    public boolean happyList(ArrayList<String> original) {
        for(int idx = 1; idx < original.size(); idx++) {
            if(!happyString(original.get(idx), original.get(idx - 1))) {
                return false;
            }
        }
        return true;
    }
}
