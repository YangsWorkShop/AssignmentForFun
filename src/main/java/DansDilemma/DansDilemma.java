
package DansDilemma;

import java.util.HashSet;

public class DansDilemma {
	

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Double sum = input1+input2;
        Double multiplication = input1*input2;
 
     
        Double division1 = input1/input2;
        Double division2 = input2/input1;
        Double subtraction1 = input1 - input2;
        Double subtraction2 = input2 - input1;
        HashSet<Double> values = new HashSet<>();
       
        values.add(sum);
        values.add(multiplication);
        if(input1 !=0d) values.add(division2);
        if(input2 != 0d) values.add(division1);
     
        values.add(subtraction1);
        values.add(subtraction2);
        return values.size();
        }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
    	HashSet<Double> values = new HashSet<>();
    	Double[] arr = new Double[3];
    	arr[0] = input1;
    	arr[1] = input2;
    	arr[2] = input3;
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i+1;j<arr.length;j++) {
    			values.add(arr[i]+arr[j]);
    			values.add(arr[i]*arr[j]);
    			values.add(arr[i]-arr[j]);
    			values.add(arr[j]-arr[i]);
    			if(arr[j]!= 0d) values.add(arr[i]/arr[j]);
    			if(arr[i]!= 0d) values.add(arr[j]/arr[i]);
    		}
    	}
        return values.size();
    }

    public Integer dilemmaOfN(Double... args){
    	HashSet<Double> values = new HashSet<>();
    	for(int i=0; i< args.length;i++) {
    		for(int j=i+1;j<args.length;j++) {
    			values.add(args[i]+args[j]);
    			values.add(args[i]*args[j]);
    			values.add(args[i]-args[j]);
    			values.add(args[j]-args[i]);
    			if(args[j]!= 0d) values.add(args[i]/args[j]);
    			if(args[i]!= 0d) values.add(args[j]/args[i]);
    		}
    	}
        return values.size();
    }
}
