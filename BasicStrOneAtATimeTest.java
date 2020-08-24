import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicStrOneAtATimeTest
{ 
    private BasicStrings basicString;

    @Before
    public void setUp()
    { basicString = new BasicStrings();
    }

    @Test
    public void test1(){
    //given
    String expected = "cdaotg";
    
    String string1 = "cat";
    String string2 = "dog";
    
    //when
    String actual = basicString.oneAtATime(string1, string2);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test2(){
    //given
    String expected = "abababbbb";
    
    String string1 = "aaa";
    String string2 = "bbbbbb";
    
    //when
    String actual = basicString.oneAtATime(string1, string2);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
        @Test
    public void test3(){
    //given
    String expected = "cyhaay  cohra  ncahya";
    
    String string1 = "cha cha cha";
    String string2 = "yay or nay";
    
    //when
    String actual = basicString.oneAtATime(string1, string2);
    
    //then
    Assert.assertEquals(expected, actual);
    }
}
