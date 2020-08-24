import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class MapPracticeFibonacciTreeTest
{private MapPractice map;
    
    @Before
    public void setUp()
    {
        map = new MapPractice();
    }

    @Test
    public void test1(){
    //given
    Map<Integer, Integer> expected = new HashMap<Integer, Integer>(){{
    put(0,0);
    put(1,1);
    put(2,1);
    put(3,2);
    put(4,3);
    put(5,5);    
    }};
    
    int size = 6;
    
    //when
    Map<Integer, Integer> actual = map.fibonacciTree(size);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
        @Test
    public void test2(){
    //given
    Map<Integer, Integer> expected = new HashMap<Integer, Integer>(){{
    put(0,0);
    put(1,1);
    put(2,1);
    put(3,2);
    put(4,3);
    put(5,5);
    put(6,8);
    put(7,13);
    put(8,21);
    put(9,34);
    put(10,55);
    put(11,89);
    put(12,144);
    }};
    
    int size = 13;
    
    //when
    Map<Integer, Integer> actual = map.fibonacciTree(size);
    
    //then
    Assert.assertEquals(expected, actual);
    }
}
