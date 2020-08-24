import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class ArrayListsHappyListTest
{
    private ArrayLists arrayList;

    @Before
    public void setUp()
    {
        arrayList = new ArrayLists();
    }

    @Test
    public void test1() {
        //given
        boolean expected = true;
        
        ArrayList<String> original = new ArrayList<>(Arrays.asList("eat", "time", "map", "pie"));
                
        //when
        boolean actual = arrayList.happyList(original);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test2() {
        //given
        boolean expected = false;
        
        ArrayList<String> original = new ArrayList<>(Arrays.asList("eat", "time", "cook", "pie"));
                
        //when
        boolean actual = arrayList.happyList(original);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test3() {
        //given
        boolean expected = false;
        
        ArrayList<String> original = new ArrayList<>(Arrays.asList("eat", "time", "LAMB", "pie"));
                
        //when
        boolean actual = arrayList.happyList(original);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
        @Test
    public void test4() {
        //given
        boolean expected = true;
        
        ArrayList<String> original = new ArrayList<>(Arrays.asList("Tree", "time", "Bee", "pie"));
                
        //when
        boolean actual = arrayList.happyList(original);
        
        //then
        Assert.assertEquals(expected, actual);
    }
}
