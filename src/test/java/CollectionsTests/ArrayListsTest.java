package CollectionsTests;

import Collections.ArrayLists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListsTest {
    private ArrayLists arrayLists;

    @Before
    public void setup(){
        arrayLists = new ArrayLists();
    }

    @Test
    public void addShitTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(-1);
        original1.add(0);
        original1.add(99999);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(-99999);
        original2.add(7);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        original1.add(-99999);
        original1.add(7);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTest2(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(-3);
        original2.add(5);
        original2.add(17);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        // Then
        Assert.assertEquals(original2, actual);
    }

    @Test
    public void addShitTest3(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTogetherTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(80);
        original1.add(-5);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(6);
        original2.add(7);
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 93;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShitTogetherTest2(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(17);
        // when
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 17;
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeAllTest1(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(6);
        original.add(5);
        original.add(5);
        original.add(7);
        original.add(7);
        // When
        Integer toRemove = 5;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(1);
        original.remove(0);
        original.remove(0);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest2(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(5);
        original.add(7);
        original.add(6);
        original.add(8);
        original.add(11);
        // When
        Integer toRemove = 10;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest3(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(5);
        original.add(6);
        original.add(7);
        original.add(8);
        // When
        Integer toRemove = null;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void happyListTest1(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Downtown");
        original.add("Abbey");
        original.add("rules");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void happyListTest2(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("loud");
        original.add("rumbles");
        original.add("in");
        original.add("the");
        original.add("afternoon");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void happyListTest3(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest4(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("tadpole");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest5(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("flights");
        original.add("of");
        original.add("fancy");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

}
