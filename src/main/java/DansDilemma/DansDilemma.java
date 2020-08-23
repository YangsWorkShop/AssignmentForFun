package DansDilemma;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
// why don't Dan & Emma just relax and watch a movie//

public class DansDilemma {
    
    
    public Set each_two(Double input1, Double input2){
        Set x = new HashSet();
        x.add(input1 + input2);
        x.add(input1 - input2);
        x.add(input2 - input1);
        x.add(input1/input2);
        x.add(input2/input1);
        x.add(input1 *input2);
        return x;
    }
    public ArrayList generate_combination(Double[] inputs) {
//        Double [] inputs = {0d,3d,5d,5d};

        TreeSet inputss = new TreeSet();
        ArrayList rslt = new ArrayList();

        for(Double i: inputs){
            inputss.add(i);
        }
        ArrayList inputsss = new ArrayList(inputss.size());
        for(Object i: inputss){
            inputsss.add((Double)i);
        }
        for(int i=0;i<inputsss.size();i++){
            if (i == inputsss.size() - 1){
                break;
            }
            for (int j = i+1;j<inputsss.size();j++) {
                ArrayList tmp = new ArrayList(2);
                tmp.add(null);
                tmp.add(null);
//                System.out.println(tmp.size());
                tmp.set(0,inputsss.get(i));
                tmp.set(1,inputsss.get(j));
                rslt.add(tmp);

            }

        }
        return rslt;

        }

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        if(input1.equals(input2) && input1 == 0d){
            return 1;
        }
        Set x = each_two(input1, input2);

        return x.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set x = new HashSet();

        return null;
    }

    public Integer dilemmaOfN(Double[] inputs){
        HashSet rslt = new HashSet();
        ArrayList list = generate_combination(inputs);

        for(Object cmbs: list){
            rslt.addAll(each_two(((double) ((ArrayList) cmbs).get(0)),((double) ((ArrayList) cmbs).get(1))));
        }

        return rslt.size();
    }
}
