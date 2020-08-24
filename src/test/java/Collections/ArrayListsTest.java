package Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListsTest {
    private ArrayLists arrayLists;

    @Before
    public void setup(){
        arrayLists = new ArrayLists();
    }

    @Test
    public void addShit() {
        // Given
        ArrayList<Integer> given = new ArrayList<>();
        given.add(5);
        given.add(3);
        given.add(3);
        given.add(0);
        given.add(5);
        given.add(1);

        ArrayList<Integer> addthis = new ArrayList<>();
        addthis.add(9);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(given, addthis);
        // Then
        Assert.assertEquals(given, actual);
    }

    @Test
    public void addShitTogether() {
        // Given
        ArrayList<Integer> given = new ArrayList<>();
        given.add(5);
        given.add(3);
        given.add(3);
        given.add(0);
        given.add(5);
        given.add(1);

        ArrayList<Integer> addthis = new ArrayList<>();
        addthis.add(9);
        // When
        Integer actual = arrayLists.addShitTogether(given, addthis);
        Integer expected = 26;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAll() {
        //Given
        ArrayList<Integer> given = new ArrayList<>();
        given.add(5);
        given.add(3);
        given.add(3);
        given.add(0);
        given.add(5);
        given.add(1);
        //When
        ArrayList<Integer> actual = arrayLists.removeAll(given, 5);
        // Then
        given.remove(0);
        given.remove(3);

        Assert.assertEquals(given, actual);
    }

    @Test
    public void happyList() {
        // Given
        ArrayList<String> given = new ArrayList<String>();
        given.add("I");
        given.add("Dont");
        given.add("Know");
        // When
        boolean actual = arrayLists.happyList(given);
        // Then
        Assert.assertFalse(actual);
    }
}