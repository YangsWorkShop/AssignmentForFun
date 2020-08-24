import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicStrFlipConcatTest
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
        String expected = "TrekStar";
        
        String string1 = "Star";
        String string2 = "Trek";
        
        //when
        String actual = basicString.flipConcat(string2, string1);
        
        //then
        Assert.assertEquals(expected, actual);
        
    }
    
    @Test
    public void test2() {
        //given
        String expected = "EnenenenMinimini";
        
        String string1 = "Minimini";
        String string2 = "Enenenen";
        
        //when
        String actual = basicString.flipConcat(string2, string1);
        
        //then
        Assert.assertEquals(expected, actual);
        
    }
    
        @Test
    public void test3() {
        //given
        String expected = "KittyDoggo";
        
        String string1 = "Doggo";
        String string2 = "Kitty";
        
        //when
        String actual = basicString.flipConcat(string2, string1);
        
        //then
        Assert.assertEquals(expected, actual);
        
    }
    
}
