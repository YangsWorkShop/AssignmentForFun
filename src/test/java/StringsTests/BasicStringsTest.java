package StringsTests;

import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Please rewrite the test part as the format I gave here.

public class BasicStringsTest {
    private BasicStrings basicStrings;

    @Before
    public void setup(){
        basicStrings = new BasicStrings();
    }

    @Test
    public void flipConcatTest1(){
        // Given
        String string1 = " Bunny";
        String string2 = "Bugs";
        String expected = "Bugs Bunny";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flipConcatTest2(){
        // Given
        String string1 = " Go";
        String string2 = "Let's";
        String expected = "Let's Go";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void flipConcatTest3(){
        // Given
        String string1 = "Mario!";
        String string2 = "It's a me! ";
        String expected = "It's a me! Mario!";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flipConcatTest4() {
        //Given
        String string1 = "A";

        //When
        String actual = basicStrings.flipConcat(string1, null);

        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void flipConcatTest5() {
        //Given
        String string1 = null;
        String string2 = "B";

        //When
        String actual = basicStrings.flipConcat(null, string2);

        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void getCharTest1(){
        // Given
        String string1 = "You can do this!";
        char expected = 'c';
        // When
        char actual = basicStrings.getChar(string1, 4);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest2(){
        // Given
        String string1 = "You can do this!";
        char expected = '!';
        // When
        char actual = basicStrings.getChar(string1, 15);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest3(){
        // Given
        String string1 = "A";
        // When
        char actual = basicStrings.getChar(string1, 15);
        // Then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void iCantSeeTest1(){
        // Given
        String string1 = "Haters";
        String expected = "      ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest2(){
        // Given
        String string1 = "I Can't Do It";
        String expected = "             ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest3(){
        // Given
        String string1 = "";
        String expected = "";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest4(){
        // Given
        String string1 = null;
        String expected = "";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest1(){
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest2(){
        // Given
        String string = "lEt mE hEaR yOu";
        String expected = "LET ME HEAR YOU";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest3(){
        // Given
        String expected = "";
        // When
        String actual = basicStrings.loudAndClear(null);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest1(){
        // Given
        String string = "lEt mE hEaR yOu";
        String expected = "LeT Me HeAr YoU";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest2(){
        // Given
        String string = "I love Y'ALL!";
        String expected = "i LOVE y'all!";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest3(){
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest4(){
        // Given
        String string = null;
        String expected = "";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest(){
        // Given
        String string1 = "";
        String string2 = "";
        String expected = "";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest2(){
        // Given
        String string1 = "W abs";
        String string2 = "ed et";
        String expected = "We da best";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest4(){
        // Given
        String string = "ABC";
        String expected = "ABC";
        // When
        String actual = basicStrings.oneAtATime(null, string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest5(){
        // Given
        String string1 = "ABC";
        String expected = "ABC";
        // When
        String actual = basicStrings.oneAtATime(string1, null);
        // Then
        Assert.assertEquals(expected, actual);
    }


}
