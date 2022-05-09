package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    private void getDilemmaOfTwo(Double input1, Double input2, Set<Double> set){
        set.add(input1+input2);
        set.add(input1*input2);
        set.add(input1-input2);
        set.add(input2-input1);
        if(input2!=0){
            set.add(input1/input2);
        }
        if(input1!=0) {
            set.add(input2 / input1);
        }
    }

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> set=new HashSet<Double>();
        getDilemmaOfTwo(input1,input2,set);
        return set.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> set=new HashSet<Double>();
        getDilemmaOfTwo(input1, input2, set);
        getDilemmaOfTwo(input1,input3,set);
        getDilemmaOfTwo(input2,input3,set);
        return set.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> set=new HashSet<Double>(args.length*args.length);
        for(int i=0;i<args.length-1;i++){
            for(int j=i+1;j<args.length;j++){
                getDilemmaOfTwo(args[i],args[j],set);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        DansDilemma dansDilemma;
        dansDilemma = new DansDilemma();
        // Given
        Double[] inputs = new Double[4314];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = (double) i;
        }
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 15632976;

    }
}
