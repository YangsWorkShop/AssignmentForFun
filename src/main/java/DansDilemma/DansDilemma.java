package DansDilemma;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        /**  given any two numbers, calculate number of different possible sums, differences, products, and quotients of those two numbers */
        Set<Double> numSet = new HashSet<>();
        if (!numSet.has(i*j)) numSet.add(i*j);
        if (!numSet.has(i+j)) numSet.add(i+j);
        if (!numSet.has(i/j)) numSet.add(i/j);
        if (!numSet.has(j/i)) numSet.add(j/i);
        if (!numSet.has(i-j)) numSet.add(i-j);
        if (!numSet.has(j-i)) numSet.add(j-i);
        }
        return numSet.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Double[] inputs = {input1, input2, input3};
        int n = args.length;
        /**  given any three numbers, calculate number of different possible sums, differences, products, and quotients of those three numbers */
        Set<Double> numSet = new HashSet<>();
        for (int i=0; i < n; ++i) {
            for (int j=0; j < n; ++j) {
                if (i != j) {
                    if (!numSet.has(inputs[i] * inputs[j])) numSet.add(inputs[i] * inputs[j]);
                    if (!numSet.has(inputs[i] + inputs[j])) numSet.add(inputs[i] + inputs[j]);
                    if (!numSet.has(inputs[i] / inputs[j]) numSet.add(inputs[i] / inputs[j]);
                    if (!numSet.has(inputs[j] / inputs[i])) numSet.add(inputs[j] / inputs[i]);
                    if (!numSet.has(inputs[i] - inputs[j])) numSet.add(inputs[i] - inputs[j]);
                    if (!numSet.has(inputs[j] - inputs[i])) numSet.add(inputs[j] - inputs[i]);
                }
            }
        }
        return numSet.size();
    }

    public Integer dilemmaOfN(Double ...args){
        /**  given any N numbers, calculate number of different possible sums, differences, products, and quotients of those N numbers */
        int n = args.length;
        Set<Double> numSet = new HashSet<>();
        for (int i=0; i < n; ++i) {
            for (int j=0; j < n; ++j) {
                if (i != j) {
                    if (!numSet.has(args[i] * (args[j])) numSet.add(args[i] * args[j]);
                    if (!numSet.has(args[i] + (args[j])) numSet.add(args[i] + args[j]);
                    if (!numSet.has(args[i] / (args[j]) numSet.add(args[i] / args[j]);
                    if (!numSet.has(args[j] / (args[i])) numSet.add(args[j] / args[i]);
                    if (!numSet.has(args[i] - (args[j])) numSet.add(args[i] - args[j]);
                    if (!numSet.has(args[j] - (args[i])) numSet.add(args[j] - args[i]);
                }
            }
        };
        return numSet.size();
    }
}
