
package CollectionsTests;



import Collections.ArrayLists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

// Please rewrite the test part as the format I gave here.

public class ArrayListsTests {
    private ArrayLists arrayLists;

    @Before
    public void setup(){
        arrayLists = new ArrayLists();
    }
    
    @Test
    public void addShitOwnTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(6);
        original1.add(7);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(2);
        original2.add(3);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        original1.add(2);
        original1.add(3);
        // Then
        Assert.assertEquals(original1, actual);
    }

    

    @Test
    public void addShitTogetherOwnTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(4);
        original1.add(2);
        original1.add(3);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(1);
        original2.add(2);
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 12;
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    
    @Test
    public void removeAllOwnTest1(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(1);
        original.add(5);
        original.add(5);
        original.add(7);
        original.add(7);
        // When
        Integer toRemove = 5;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(1);
        original.remove(1);
        // Then
        Assert.assertEquals(original, actual);
    }


   
    @Test
    public void happyListOwnTest1(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("we");
        original.add("are");
        original.add("we");
        original.add("are");
        original.add("fine");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }


    
}
