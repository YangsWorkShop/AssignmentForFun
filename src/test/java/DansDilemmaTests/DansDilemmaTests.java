package DansDilemmaTests;

import DansDilemma.DansDilemma;
import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DansDilemmaTests {

    private DansDilemma dansDilemma;

    @Before
    public void setup(){
        dansDilemma = new DansDilemma();
    }

    @Test
    public void dilemmaOfTwoDoubleTest1(){
        // Given
        // Suffix d after number denotes double, suffix f denotes float.
        Double input1 = 7d;
        Double input2 = 8d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void dilemmaOfTwoDoubleTest2(){
        // Given
        Double input1 = 0d;
        Double input2 = 5d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfTwoDoubleTest3(){
        // Given
        Double input1 = 834397929d;
        Double input2 = 213.45;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfTwoDoubleTest4(){
        // Given
        Double input1 = 0d;
        Double input2 = 0d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest1(){
        // Given
        Double input1 = 1d;
        Double input2 = 2d;
        Double input3 = 3d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 12;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest2(){
        // Given
        Double input1 = 0d;
        Double input2 = 42d;
        Double input3 = 57d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 11;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest3(){
        // Given
        Double input1 = -1d;
        Double input2 = 0.5;
        Double input3 = 3d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 17;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest4(){
        // Given
        Double input1 = 0d;
        Double input2 = 0d;
        Double input3 = 0d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest1(){
        // Given
        Double[] inputs = {0d, -2d, 8d, 4d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 20;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest2(){
        // Given
        Double[] inputs = {4d, 10d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest3(){
        // Given
        Double[] inputs = {3d, 2d, 1d, 8d, 7d, 6d, 5d, 4d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 70;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest4(){
        // Given
        Double[] inputs = new Double[85];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = (double) i;
        }
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 6434;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest5(){
        // Given
        Double[] inputs = new Double[2500];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = (double) i;
        }
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 5280065;
        Assert.assertEquals(expected, actual);
    }

}
