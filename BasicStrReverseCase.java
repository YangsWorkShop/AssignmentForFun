
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicStrReverseCase
{
    private BasicStrings basicString;

    @Before
    public void setUp()
    {
        basicString = new BasicStrings();
    }

    @Test
    public void test1(){
    //given
    String expected = "Hello";
    
    String string = "hELLO";
    
    //when
    String actual = basicString.reverseCase(string);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test2(){
    //given
    String expected = "I DON'T CARE.";
    
    String string = "i don't care.";
    
    //when
    String actual = basicString.reverseCase(string);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test3(){
    //given
    String expected = "see You later";
    
    String string = "SEE yOU LATER";
    
    //when
    String actual = basicString.reverseCase(string);
    
    //then
    Assert.assertEquals(expected, actual);
    }
}
