package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {


    private int countCombination(Double[]input){

        int size = input.length;
        Set<Double> unique = new HashSet<Double>();
        double total = 0.00 ;


        for(int i = 0 ; i < size;i++){
            for(int j = 0 ; j < size;j++){
                if(i==j) continue;

                unique.add(input[i]+input[j]);
                unique.add(input[i]-input[j]);
                unique.add(input[i]*input[j]);

                if(input[j] != 0)
                    unique.add(input[i]/input[j]);
            }
        }

        return unique.size();
    }


    public Integer dilemmaOfTwo(Double input1, Double input2) {

        Double[] input ={input1,input2};
        return countCombination(input);
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Double[] input ={input1,input2,input3};
        return countCombination(input);
    }

    public Integer dilemmaOfN(Double... args){
        return countCombination(args);
    }
}
