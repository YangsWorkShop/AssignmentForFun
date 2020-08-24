import java.util.*;

public class DansDilemma
{
       public Integer dilemmaOfTwo(Double input1, Double input2) {
        if(input1.equals(input2) && input1==0.0) return -1;
        
        Set<Double> set = new HashSet<>();
        set.add(input1+input2);
        set.add(input1-input2);
        set.add(input1*input2);
        set.add(input1/input2);
        set.add(input2-input1);
        set.add(input2/input1);
        return set.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        if(input1.equals(input2) && input2.equals(input3) && input1==0.0 ) return -1;
        List<Double> list = new ArrayList<>(Arrays.asList(input1, input2, input3));
        Set<Double> set = new HashSet<>();

        for (int i = 0; i < list.size()-1; i++) {
            set.add(list.get(i) + list.get(i+1));
            set.add(list.get(i) - list.get(i+1));
            set.add(list.get(i) * list.get(i+1));
            set.add(list.get(i) / list.get(i+1));
        }

        for (int i = list.size()-1; i > 0; i--) {
            set.add(list.get(i) - list.get(i-1));
            set.add(list.get(i) / list.get(i-1));
        }

        set.add(input1+input3);
        set.add(input1-input3);
        set.add(input1/input3);
        set.add(input1*input3);
        set.add(input3-input1);
        set.add(input3/input1);

        return set.size();
    }

        public Integer dilemmaOfN(Double ...args) {
        List<Double> list = new ArrayList<>();
        for (Double arg : args) list.add(arg);
        
        if (list.size() < 2 || list.containsAll(new ArrayList<>(Arrays.asList(0.0)))) return -1;
        
        Set<Double> set = new HashSet<>();

        if(list.size() > 2) {
        for (int i = 0; i < list.size()-1; i++) {
            set.add(list.get(i) + list.get(i+1));
            set.add(list.get(i) - list.get(i+1));
            set.add(list.get(i) * list.get(i+1));
            set.add(list.get(i) / list.get(i+1));
        }

        for (int i = list.size()-1; i > 0; i--) {
            set.add(list.get(i) - list.get(i-1));
            set.add(list.get(i) / list.get(i-1));
        }
    }

        set.add(list.get(0)+list.get(list.size()-1));
        set.add(list.get(0)-list.get(list.size()-1));
        set.add(list.get(0)*list.get(list.size()-1));
        set.add(list.get(0)/list.get(list.size()-1));
        set.add(list.get(list.size()-1)-list.get(0));
        set.add(list.get(list.size()-1)/list.get(0));

        return set.size();
    }
}
