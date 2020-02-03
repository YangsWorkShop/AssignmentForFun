
package CollectionsTests;

import Collections.MapPractice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

// Please rewrite the test part as the format I gave here.

public class MapPracticeTests {
    private MapPractice mapPractice;
    private Map map1;

    @Before
    public void setup(){
        mapPractice = new MapPractice();
        map1 = new TreeMap<String, String>();
        map1.put("Mario", "Mario Bros.");
        map1.put("Donkey Kong", "Donkey Kong");
        map1.put("Link", "Legend of Zelda");
        map1.put("Samus Aran", "Metroid");
        map1.put("Yoshi", "Yoshi's World");
        map1.put("Kirby", "Kirby");
        map1.put("Fox McCloud", "Star Fox");
        map1.put("Pikachu", "Pokemon");
        map1.put("Luigi", "Mario Bros.");
        map1.put("Captain Falcon", "F-Zero");
        map1.put("Ness", "EarthBound");
        map1.put("Jigglypuff", "Pokemon");
    }
    
    @Test
    public void findValueOfOwnTest1(){
        // Given
        String key = "Pikachu";
        // When
        String expected = "Pokemon";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

   
    @Test
    public void findKeysOfOwnTest1(){
        // Given
        String value = "Pokemon";
        // When
        Object[] expected = {"Jigglypuff" ,"Pikachu"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

   

    @Test
    public void fibonacciTreeOwnTest1(){
        // Given
        Integer upTo = 7;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        expected.put(6, 8);
        expected.put(7, 13);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }
    
  
    
    @Test
    public void crazySpiralOwnTest1(){
        // Given
        Integer upTo = 10;
        Integer first = 5;
        Integer second = 6;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 5);
        expected.put(2, 6);
        expected.put(3, 11);
        expected.put(4, 17);
        expected.put(5, 28);
        expected.put(6, 45);
        expected.put(7, 73);
        expected.put(8, 118);
        expected.put(9, 191);
        expected.put(10, 309);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

   

}
