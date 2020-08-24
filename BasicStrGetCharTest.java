import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicStrGetCharTest
{
    private BasicStrings basicString;
    
    @Before
    public void setUp()
    { 
        basicString = new BasicStrings();
    }

    @Test
    public void test1() {
        //given
        char expected = 'v';
        
        String string= "developer";
        int index = 2;
        
        //when
        char actual = basicString.getChar(string, index);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test2() {
    //given
    char expected = 'r';
    
    String string = "eat read love";
    int index = 4;
    
    //when
    char actual = basicString.getChar(string, index);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
        @Test
    public void test3() {
    //given
    char expected = 'L';
    
    String string = "Love";
    int index = 0;
    
    //when
    char actual = basicString.getChar(string, index);
    
    //then
    Assert.assertEquals(expected, actual);
    }

}
