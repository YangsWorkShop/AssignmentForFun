package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
//    	final double Threshold = 0.001;
//    	int res = 0;
//    	if((input1 != 0d)&&(input2 != 0d)) {
//    		if(input1 != input2) {
//    			res = 6; 
//    		} else if(Math.abs(input1 - input2) < Threshold) {
//    			res = 4;
//    		}
//    	} else if(((input1 == 0d)&&(input2 != 0d))||((input1 == 0d)&&(input2 != 0d))) {
//    		res = 5;
//    	} else {
//    		res = 1;
//    	}
//    	Integer result = new Integer(res);
//    	System.out.println(result);
//        return result;
    	
    	//double number could not be compared
    	Double[] input = {input1, input2};
    	Set<Double> count = new HashSet<Double>();
    	for(int i = 0; i < input.length - 1; i ++) {
    		for(int j = i + 1; j < input.length; j ++) {
    			count.add(input[i]+input[j]);
    			count.add(input[i]*input[j]);
    		}
    	}
    	for(int i = 0; i < input.length - 1; i ++) {
    		for(int j = i + 1; j < input.length; j ++) {
    			count.add(input[i]-input[j]);
    			count.add(input[j]-input[i]);
    		}
    	}
    	for(int i = 0; i < input.length - 1; i ++) {
    		for(int j = i + 1; j < input.length; j ++) {
    			if(input[j] != 0) {
    				count.add(input[i]/input[j]);
    			}
    			if(input[i] != 0) {
    				count.add(input[j]/input[i]);
    			}
    		}
    	}
    	Integer res = new Integer(count.size());
        return res;
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
//    	if((input1 == 0d)&&(input2 == 0d)&&(input3 == 0d)) {
//    		res = 1;
//    	} else if (((input1 == 0)&&(input2 == 0)&&(input3!=0))||((input1 == 0)&&(input3 == 0)&&(input2!=0))||((input3 == 0)&&(input2 == 0)&&(input1!=0))) {
//    		res = 6;
//    	} else if (((input1 == 0)&&(input2 != 0)&&(input3!=0)&&(input2 == input3))||((input2 == 0)&&(input1 != 0)&&(input3!=0)&&(input1 == input3))||((input3 == 0)&&(input2 != 0)&&(input1!=0))&&(input2 == input1)) {
//    		res = 6;
//    	} 
    	Double[] input = {input1, input2, input3};
    	Set<Double> count = new HashSet<Double>();
    	for(int i = 0; i < input.length - 1; i ++) {
    		for(int j = i + 1; j < input.length; j ++) {
    			count.add(input[i]+input[j]);
    			count.add(input[i]*input[j]);
    		}
    	}
    	for(int i = 0; i < input.length - 1; i ++) {
    		for(int j = i + 1; j < input.length; j ++) {
    			count.add(input[i]-input[j]);
    			count.add(input[j]-input[i]);
    		}
    	}
    	for(int i = 0; i < input.length - 1; i ++) {
    		for(int j = i + 1; j < input.length; j ++) {
    			if(input[j] != 0) {
    				count.add(input[i]/input[j]);
    			}
    			if(input[i] != 0) {
    				count.add(input[j]/input[i]);
    			}
    		}
    	}
    	Integer res = new Integer(count.size());
        return res;
    }

    public Integer dilemmaOfN(Double... args){
    	Double[] input = args;
    	Set<Double> count = new HashSet<Double>();
    	for(int i = 0; i < input.length - 1; i ++) {
    		for(int j = i + 1; j < input.length; j ++) {
    			count.add(input[i]+input[j]);
    			count.add(input[i]*input[j]);
    		}
    	}
    	for(int i = 0; i < input.length - 1; i ++) {
    		for(int j = i + 1; j < input.length; j ++) {
    			count.add(input[i]-input[j]);
    			count.add(input[j]-input[i]);
    		}
    	}
    	for(int i = 0; i < input.length - 1; i ++) {
    		for(int j = i + 1; j < input.length; j ++) {
    			if(input[j] != 0) {
    				count.add(input[i]/input[j]);
    			}
    			if(input[i] != 0) {
    				count.add(input[j]/input[i]);
    			}
    		}
    	}
    	Integer res = new Integer(count.size());
        return res;
    }
}
