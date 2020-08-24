
package DansDilemmaTests;

import DansDilemma.DansDilemma;
import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Please rewrite the test part as the format I gave here.
public class DansDilemmaTests {

    private DansDilemma dansDilemma;

    @Before
    public void setup(){
        dansDilemma = new DansDilemma();
    }
    
    @Test
    public void dilemmaOfTwoDoubleOwnTest1() {
    	Double input1 = 5d;
    	Double input2 = 8d;
    	Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
    	Integer expected = 6;
    	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void dilemmaOfTwoDoubleOwnTest2() {
    	Double input1 = 3d;
    	Double input2 = 3d;
    	Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
    	Integer expected = 4;
    	Assert.assertEquals(expected, actual);
    }

   
    
    @Test
    public void dilemmaOfThreeDoubleOwnTest1(){
        // Given
        Double input1 = 2d;
        Double input2 = 3d;
        Double input3 = 4d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 14;
        Assert.assertEquals(expected, actual);
    }

    

    
    @Test
    public void dilemmaOfNOwnTest1(){
        // Given
        Double[] inputs = {2d, 4d, 6d, 10d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 27;
        Assert.assertEquals(expected, actual);
    }
   
   

}

