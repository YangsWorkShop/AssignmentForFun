package Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class MapPracticeTest {
    private MapPractice pract;
    private Map map;
    @Before
    public void setup(){
        pract = new MapPractice();
        map = new HashMap<Integer, String>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cucumber");
        map.put(4,"Durian");
        map.put(5,"Fish");
    }

    @Test
    public void findValueOf() {
        String actual = (String) pract.findValueOf(map, 3);
        Assert.assertEquals("Cucumber", actual);

    }

    @Test
    public void findKeysOf() {
        Object[] expected = {1};
        Object[] actual = pract.findKeysOf(map, "Apple");
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void fibonacciTree() {
        Map<Integer, Integer> expected = new HashMap<Integer, Integer>();
        Map<Integer, Integer> actual = pract.fibonacciTree(-1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiral() {
        Map<Integer, Integer> expected = new HashMap<Integer, Integer>();
        Map<Integer, Integer> actual = pract.crazySpiral(5, 3, -1);
        Assert.assertEquals(expected, actual);
    }
}