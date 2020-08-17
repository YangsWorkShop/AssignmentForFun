import java.util.*;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> result = new HashSet<>();
        helper(result, input1, input2);
        return result.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> result = new HashSet<>();
        helper(result, input1, input2, input3);
        return result.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> result = new HashSet<>();
        helper(result, args);
        return result.size();
    }

    private void helper(Set<Double> result, Double... args) {
        Double value;

        for (int i = 0; i < args.length; i++) {
            value = args[i];
            for (int j = 0; j < args.length; j++) {
                if (i != j) {
                    Double temp = value;
                    value += args[j];
                    result.add(value);
                    value = temp;
                }
            }
            for (int j = 0; j < args.length; j++) {
                if (i != j) {
                    Double temp = value;
                    value -= args[j];
                    result.add(value);
                    value = temp;
                }
            }
            for (int j = 0; j < args.length; j++) {
                if (i != j) {
                    Double temp = value;
                    value *= args[j];
                    result.add(value);
                    value = temp;
                }
            }
            for (int j = 0; j < args.length; j++) {
                if (i != j) {
                    Double temp = value;
                    if (args[j] != 0d) {
                        value /= args[j];
                        result.add(value);
                        value = temp;
                    }

                }
            }
        }
    }
}
