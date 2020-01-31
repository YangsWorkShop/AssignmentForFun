package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    private void calculateUniqueResult(Set<Double> set, Double input1, Double input2) {
        set.add(input1 + input2);
        set.add(input1 * input2);

        set.add(input1 - input2);
        set.add(input2 - input1);

        if (input2 != 0d) set.add(input1 / input2);
        if (input1 != 0d) set.add(input2 / input1);
    }

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> set = new HashSet<Double>();
        calculateUniqueResult(set, input1, input2);
        return set.size();
    }


    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> set = new HashSet<Double>();

        calculateUniqueResult(set, input1, input2);
        calculateUniqueResult(set, input2, input3);
        calculateUniqueResult(set, input1, input3);
        return set.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> set = new HashSet<Double>();
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {
                calculateUniqueResult(set, args[i], args[j]);
            }
        }

        return set.size();
    }
}
