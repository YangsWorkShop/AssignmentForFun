import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;


public class MapPracticeCrazySpiralTest
{
private MapPractice map;
    
    @Before
    public void setUp()
    {
        map = new MapPractice();
    }

    @Test
    public void test1(){
        //given
        Map<Integer, Integer> expected = new HashMap<Integer, Integer>(){{
        put(1,2);
        put(2,4);
        put(3,6);
        put(4,10);
        put(5,16);
        put(6,26);    
        }};
        
        int first = 2;
        int second = 4;
        int size = 6;
           
        //when
        Map<Integer, Integer> actual = map.crazySpiral(first, second, size);
        
        //then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test2(){
        //given
        Map<Integer, Integer> expected = new HashMap<Integer, Integer>(){{
        put(1,10);
        put(2,3);
        put(3,13);
        put(4,16);
        put(5,29);   
        }};
        
        int first = 10;
        int second = 3;
        int size = 5;
           
        //when
        Map<Integer, Integer> actual = map.crazySpiral(first, second, size);
        
        //then
        Assert.assertEquals(expected, actual);
    }
}
