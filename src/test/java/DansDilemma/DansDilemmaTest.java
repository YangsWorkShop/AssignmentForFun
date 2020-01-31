package DansDilemma;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DansDilemmaTest {
    private DansDilemma d;

    @Before
    public void setup(){
        d = new DansDilemma();
    }

    @Test
    public void dilemmaOfTwo() {
        Integer actual = d.dilemmaOfTwo(3.0, 0.0);
        Integer expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThree() {
        Integer actual = d.dilemmaOfThree(3.0, 0.0, 3.0);
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfN() {
        Double[] in = {2.0,3.0,0.0,2.0,3.0};
        Integer actual = d.dilemmaOfN(in);
        Integer expected = 13;
        Assert.assertEquals(expected, actual);
    }
}