
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
        }
        for (int j = 0; j < list2.size(); j++) {
            sum += list2.get(j);
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        for (int i = 0; i < original.size(); i++) {
            if (original.get(i).equals(toRemove)) {
                original.remove(i);
            }
        }
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        if (original.size() == 0 || original.size() == 1 ) {
            return true;
        }
        boolean[] happy = new boolean[original.size() - 1];
        for (int i = 0; i < original.size() - 1; i++) {
            Set<Character> s = new HashSet<>();
            char[] one = original.get(i).toCharArray();
            for (int j = 0; j < one.length; j++) {
                s.add(one[j]);
            }
            char[] two = original.get(i + 1).toCharArray();
            for (int m = 0; m < two.length; m++) {
                if (s.contains(two[m])) {
                    happy[i] = true;
                }
            }
        }
        for (boolean h : happy) {
            if (h == false) {
                return false;
            }
        }
        return true;

    }
}
