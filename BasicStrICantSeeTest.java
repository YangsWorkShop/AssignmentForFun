import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicStrICantSeeTest
{   private BasicStrings basicString;

    @Before
    public void setUp()
    { basicString = new BasicStrings();
    }

    @Test
    public void test1() {
    //given
    String expected = "___";
    
    String string = "cat";
    
    //when
    String actual = basicString.iCantSee(string);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test2() {
    //given
    String expected = "__________";
    
    String string = "Linh Huynh";
    
    //when
    String actual = basicString.iCantSee(string);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test3() {
    //given
    String expected = "___________";
    
    String string = "I CAN'T SEE";
    
    //when
    String actual = basicString.iCantSee(string);
    
    //then
    Assert.assertEquals(expected, actual);
    }
}
