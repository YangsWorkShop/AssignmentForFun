import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class DansDilemmaOfTwoTest
{
    private DansDilemma dans;
    
    @Before
    public void setUp()
    { dans = new DansDilemma();
    }

    @Test
    public void test1(){
        //given
        int expected = 5;
        Double input1 = 4.0;
        Double input2 = 2.0;
       
        //when
        int actual = dans.dilemmaOfTwo(input1, input2);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
        @Test
    public void test2(){
        //given
        int expected = 6;
        Double input1 = 1.1;
        Double input2 = 2.5;
       
        //when
        int actual = dans.dilemmaOfTwo(input1, input2);
        
        //then
        Assert.assertEquals(expected, actual);
    }
}
