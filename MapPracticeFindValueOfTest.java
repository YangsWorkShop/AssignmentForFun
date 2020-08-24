import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class MapPracticeFindValueOfTest
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
    Object expected = 4;
    
    Map<Object, Object> hm = new HashMap<>();
    hm.put(1,2);
    hm.put(5,4);
    hm.put(2,3);
    Object key = 5;
    
    //when
    Object actual = map.findValueOf(hm, key);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test2(){
    //given
    Object expected = "rice";
    
    Map<Object, Object> hm = new HashMap<>();
    hm.put(1,"I");
    hm.put(2,"eat");
    hm.put(3,"rice");
    Object key = 3;
    
    //when
    Object actual = map.findValueOf(hm, key);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
        @Test
    public void test3(){
    //given
    Object expected = 1.5;
    
    Map<Object, Object> hm = new HashMap<>();
    hm.put(11,1.2);
    hm.put(22,1.3);
    hm.put(33,1.5);
    Object key = 33;
    
    //when
    Object actual = map.findValueOf(hm, key);
    
    //then
    Assert.assertEquals(expected, actual);
    }
}
