package DansDilemma;

import java.util.*;


public class DansDilemma {

    public Set<Double> getTwo(Double input1, Double input2) {
        Set<Double> set = new HashSet<>();
        set.add(input1 + input2);
        set.add(input1 - input2);
        set.add(input2 - input1);
        set.add(input2 * input1);
        if (input2!=0d) set.add(input1 / input2);
        if (input1!=0d) set.add(input2 / input1);

        return set;
    }

    public Integer dilemmaOfTwo(Double input1, Double input2) {

        return getTwo(input1,input2).size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> set = new HashSet<>();
        set.addAll(getTwo(input1, input2));
        set.addAll(getTwo(input1, input3));
        set.addAll(getTwo(input2, input3));
        return set.size();
    }

    public Integer dilemmaOfN(Double... args){

        Set<Double> set = new HashSet<>();
        for(int i = 0; i<args.length; i++){
            for(int j = i+1; j<args.length; j++){
                set.addAll(getTwo(args[i],args[j]));
            }
        }
        return set.size();
    }
}
