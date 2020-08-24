import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class DansDilemmaOfNTest
{
    private DansDilemma dans;
    
    @Before
    public void setUp()
    { dans = new DansDilemma();
    }


    @Test
    public void test1(){
        //given
        int expected = 19;
        Double input1 = 3.0;
        Double input2 = 4.0;
        Double input3 = 5.0;
        Double input4 = 6.0;
       
        //when
        int actual = dans.dilemmaOfN(input1, input2, input3, input4);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
        @Test
    public void test2(){
        //given
        int expected = 6;
        Double input1 = 3.0;
        Double input2 = 4.0;
       
        //when
        int actual = dans.dilemmaOfN(input1, input2);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
     @Test
    public void test3(){
        //given
        int expected = -1;
        Double input1 = 3.0;
       
        //when
        int actual = dans.dilemmaOfN(input1);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
         @Test
    public void test4(){
        //given
        int expected = -1;
        Double input1 = 0.0;
        Double input2 = 0.0;
        Double input3 = 0.0;
       
        //when
        int actual = dans.dilemmaOfN(input1, input2, input3);
        
        //then
        Assert.assertEquals(expected, actual);
    }
}
