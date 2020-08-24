import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class MapPracticeFindKeysOfTest
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
    Object[] expected = {1,5};
    
    Map<Object, Object> hm = new HashMap<>();
    hm.put(1,2);
    hm.put(5,2);
    hm.put(2,3);
    Object value = 2;
    
    //when
    Object[] actual = map.findKeysOf(hm, value);
    
    //then
    Assert.assertEquals(expected, actual);
    
    }
    
        @Test
    public void test2(){
    //given
    Object[] expected = {"gun", "helicopter"};
    
    Map<Object, Object> hm = new HashMap<>();
    hm.put("bomb",7);
    hm.put("gun",1);
    hm.put("helicopter",1);
    Object value = 1;
    
    //when
    Object[] actual = map.findKeysOf(hm, value);
    
    //then
    Assert.assertEquals(expected, actual);
    
    }
    
    
}
