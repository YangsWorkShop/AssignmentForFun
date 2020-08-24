

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BasicStrLoudAndClearTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BasicStrLoudAndClearTest
{
    private BasicStrings basicString;
    
    @Before
    public void setUp()
    { basicString = new BasicStrings();
    }

    @Test
    public void test1(){
        //given
        String expected = "GO AWAY";
        String string = "go away";
        
        //when
        String actual = basicString.loudAndClear(string);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
    
    @Test
    public void test2(){
        //given
        String expected = "IT'S NOT LOUD ENOUGH.";
        String string = "It's not loud enough.";
        
        //when
        String actual = basicString.loudAndClear(string);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test3(){
        //given
        String expected = "I'M NOT DEAF.";
        String string = "i'm not deaf.";
        
        //when
        String actual = basicString.loudAndClear(string);
        
        //then
        Assert.assertEquals(expected, actual);
    }

}
