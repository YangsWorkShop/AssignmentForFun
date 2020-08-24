package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        HashSet<Double> set = new HashSet<>();
        set.add(input1*input2);
        set.add(input1+input2);
        set.add(input1-input2);
        set.add(input2-input1);
        if(input1 != 0)        set.add(input2/input1);
        if(input2 != 0)        set.add(input1/input2);

        return set.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        HashSet<Double> set = new HashSet<>();
        set.add(input1*input2);
        set.add(input1*input3);
        set.add(input3*input2);

        set.add(input1+input2);
        set.add(input1+input3);
        set.add(input2+input3);

        set.add(input1-input2);
        set.add(input2-input1);
        set.add(input1-input3);
        set.add(input3-input1);
        set.add(input3-input2);
        set.add(input2-input3);

        if(input1 != 0){
            set.add(input2/input1);
            set.add(input3/input1);

        }
        if(input2 != 0) {
            set.add(input1/input2);
            set.add(input3/input2);

        }
        if(input3 != 0) {
            set.add(input1/input3);
            set.add(input2/input3);
        }

        return set.size();
    }

    public Integer dilemmaOfN(Double... args){
        HashSet<Double> set = new HashSet<>();
        for(int i = 0; i < args.length; i++) {
            int loc = 0;
            while(loc!= args.length){
                if(loc != i) {
                    set.add(args[i]*args[loc]);
                    set.add(args[i]+args[loc]);
                    set.add(args[i]-args[loc]);
                    if(args[loc]!=0)    set.add(args[i]/args[loc]);
                }
                loc++;
            }
        }
        return set.size();
    }
}
