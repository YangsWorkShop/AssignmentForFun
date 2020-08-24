import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class DansDilemmaOfThreeTest
{
    private DansDilemma dans;
    
    @Before
    public void setUp()
    { dans = new DansDilemma();
    }


    @Test
    public void test1(){
        //given
        int expected = 16;
        Double input1 = 3.0;
        Double input2 = 4.0;
        Double input3 = 5.0;
       
        //when
        int actual = dans.dilemmaOfThree(input1, input2, input3);
        
        //then
        Assert.assertEquals(expected, actual);
    }
}
