package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.addAll(list2);
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        for (int i=0; i < list1.size(); ++i) sum += list1.get(i);
        for (int i=0; i < list2.size(); ++i) sum += list2.get(i);
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        if (toRemove == null) return original;
        List<Integer> output = new ArrayList<Integer>();
        for (Integer i : original) {
            if (i != toRemove) {
                output.add(i);
            }
        };
        return output;
    }

    public boolean happyList(ArrayList<String> original) {
        int n = original.size();
        Boolean[][] counts = new Boolean[n][26];
        for (Boolean[] row: matrix) Arrays.fill(row, false);
        for (int i=0; i < n; ++i) {
            String s = original.get(i);
            for (j=0; j < s.length(); ++j) {
                char ch = s.charAt(j);
                int c = (int) ch - 'a';
                if (counts[i][c] == false)
                    counts[i][c] = true;
            }
        }

        for (i=0; i < counts.size(); ++i) {
            int points = 0;
            for (int j=0; j < 26; ++j) {
                /** consider indexes carefully to avoid out of bounds exceptions */
                if (i > 0) {
                    if (count[i-1][j] && count[i][j]) {
                        points++;
                        if (i == counts.size() - 1) break;
                    }
                }
                if (i < counts.size()-1) {
                    if (count[i+1][j] && count[i][j]) {
                        points++;
                        if (i == 0) break;
                    }
                }
                if (points == 2) break;
            }
            /** current string shares no chars with previous or next string*/
            if (points < 2) {
                if (i > 0 && i < counts.length-1)
                    return false;
            }
        }

        return true;
    }
}
