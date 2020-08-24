package DansDilemma;
import java.util.*;
public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        HashSet<Double> set=new HashSet<Double>();
    	twoNumbersAtOnce(set,input1,input2);
        return set.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        HashSet<Double> set = new HashSet<Double>();
    	twoNumbersAtOnce(set,input1,input2);
    	twoNumbersAtOnce(set,input2,input3);
    	twoNumbersAtOnce(set,input1,input3);
        return set.size();
    }

    public Integer dilemmaOfN(Double... args){
        HashSet<Double> set = new HashSet<Double>();
    	int l=args.length;
        for (int i=0;i<l-1;i++) {
            for (int j=i+1;j<l;j++) {
            	twoNumbersAtOnce(set,args[i],args[j]);
            }
        }
        return set.size();
    }
	
    public void twoNumbersAtOnce(HashSet<Double> set, Double input1, Double input2) {
        set.add(input1 + input2);
        set.add(input1 * input2);
        set.add(input1 - input2);
        set.add(input2 - input1);
        if (input2 != 0d) 
        	set.add(input1 / input2);
        if (input1 != 0d) 
        	set.add(input2 / input1);
    }
}
