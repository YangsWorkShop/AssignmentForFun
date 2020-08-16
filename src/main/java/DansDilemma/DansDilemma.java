package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {
    
    public void helper(Set<Double> nums, Double d1, Double d2) {
        nums.add(d1 + d2);
        nums.add(d1 * d2);
        if(d1 != 0) {nums.add(d2 / d1);}
        if(d2 != 0) {nums.add(d1 / d2);}        
        nums.add(d1 - d2);
        nums.add(d2 - d1);
    }
    
    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> nums = new HashSet<Double>();
        helper(nums, input1, input2);
        return nums.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> nums = new HashSet<Double>();
        helper(nums, input1, input2);
        helper(nums, input1, input3);
        helper(nums, input2, input3);
        return nums.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> nums = new HashSet<Double>();
        for(int idx1 = 0; idx1 < args.length - 1; idx1++) {
            for(int idx2 = idx1 + 1; idx2 < args.length; idx2++) {
                helper(nums, args[idx1], args[idx2]);
            }
        }
        return nums.size();
    }
 
}
