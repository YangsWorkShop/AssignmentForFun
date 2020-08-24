package CollectionsTests;

import Collections.MapPractice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class MapPracticeTests {
    private MapPractice mapPractice;
    private Map map1;

    /* initialize test cases */
    @Before
    public void setup(){
        mapPractice = new MapPractice();
        map1 = new TreeMap<String, String>();
        map1.put("Margarine", "Spread");
        map1.put("Coca Cola", "Drink");
        map1.put("Peanut Butter", "Spread");
        map1.put("Pina Colada", "Drink");
        map1.put("Fanta Orange", "Drink");
        map1.put("Bob", "Human");
    }

    @Test
    public void findValueOfTest1(){
        // Given
        String key = "Peanut Butter";
        // When
        String expected = "Spread";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest2(){
        // Given
        String key = "Fanta Orange";
        // When
        String expected = "Drink";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest1(){
        // Given
        String value = "Human";
        // When
        Object[] expected = {"Bob"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest2(){
        // Given
        String value = "Fruit";
        // When
        Object[] expected = {};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest3(){
        // Given
        String value = "Drink";
        // When
        Object[] expected = {"Coca Cola", "Pina Colada"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest1(){
        // Given
        Integer upTo = 10;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        expected.put(6, 8);
        expected.put(7, 13);
        expected.put(8, 21);
        expected.put(9, 34);
        expected.put(10, 55);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest2(){
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
    public void fibonacciTreeTest3(){
        // Given
        Integer upTo = 2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest4(){
        // Given
        Integer upTo = 1;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest5(){
        // Given
        Integer upTo = 0;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest1(){
        // Given
        Integer upTo = 7;
        Integer first = 3;
        Integer second = 0;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 3);
        expected.put(2, 0);
        expected.put(3, 3);
        expected.put(4, 3);
        expected.put(5, 6);
        expected.put(6, 9);
        expected.put(7, 15);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest2(){
        // Given
        Integer upTo = 8;
        Integer first = 9;
        Integer second = -1;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 9);
        expected.put(2, -1);
        expected.put(3, 8);
        expected.put(4, 7);
        expected.put(5, 15);
        expected.put(6, 22);
        expected.put(7, 37);
        expected.put(8, 59);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest3(){
        // Given
        Integer upTo = 10;
        Integer first = -8;
        Integer second = -5;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, -8);
        expected.put(2, -5);
        expected.put(3, -13);
        expected.put(4, -18);
        expected.put(5, -31);
        expected.put(6, -49);
        expected.put(7, -80);
        expected.put(8, -129);
        expected.put(9, -209);
        expected.put(10, -338);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest4(){
        // Given
        Integer upTo = 1;
        Integer first = 56;
        Integer second = -4;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 56);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest5(){
        // Given
        Integer upTo = 0;
        Integer first = -1;
        Integer second = -2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }



}
