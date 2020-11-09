package DansDilemma;
import java.util.*;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        double sum = input1+input2;
        double multiple = input1*input2;
        double sub1 = input1-input2;
        double sub2 = input2-input1;
        double div1 = sum,div2=sum;
        if(input1!=0) div1 = input2/input1;
        if(input2!=0) div2 = input1/input2;
        Set<Double> set = new HashSet<Double>();
        set.add(sum);
        set.add(multiple);
        set.add(sub1);
        set.add(sub2);
        set.add(div1);
        set.add(div2);
        return set.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> set = new HashSet<Double>();
        calculateTwo(input1,input2,set);
        calculateTwo(input2,input3,set);
        calculateTwo(input1,input3,set);
        return set.size();
    }

    public void calculateTwo(Double input1,Double input2,Set<Double> set){
        double sum = input1+input2;
        double multiple = input1*input2;
        double sub1 = input1-input2;
        double sub2 = input2-input1;
        double div1 = sum,div2=sum;
        if(input1!=0) div1 = input2/input1;
        if(input2!=0) div2 = input1/input2;
        set.add(sum);
        set.add(multiple);
        set.add(sub1);
        set.add(sub2);
        set.add(div1);
        set.add(div2);
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> set = new HashSet<Double>();
        int length = args.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                calculateTwo(args[i],args[j],set);
            }
        }
        return set.size();
    }
}
