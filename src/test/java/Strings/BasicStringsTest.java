package Strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicStringsTest {
    private BasicStrings s;

    @Before
    public void setup(){
        s = new BasicStrings();
    }
    @Test
    public void flipConcat() {
        String actual = s.flipConcat(" world", "hello");
        String expected = "hello world";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChar() {
        char actual = s.getChar("Hello World", 0);
        Assert.assertEquals('H', actual);
    }

    @Test
    public void iCantSee() {
        String i = "    ";
        String actual = s.iCantSee("null");
        Assert.assertEquals(i, actual);
    }

    @Test
    public void loudAndClear() {
        String actual = s.loudAndClear("OH MAH GOD");
        Assert.assertEquals("OH MAH GOD", actual);
    }

    @Test
    public void reverseCase() {
        String actual = s.reverseCase("OH MAH GOD");
        Assert.assertEquals("oh mah god", actual);
    }

    @Test
    public void oneAtATime() {
        String actual = s.oneAtATime("o a o","hmhgd");
        Assert.assertEquals("oh mah god", actual);
    }
}