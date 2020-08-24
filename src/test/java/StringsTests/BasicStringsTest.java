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
    public void myFlipConcatTest(){
        String string1 = "Martini";
        String string2 = "Vodka ";
        String expected = "Vodka Martini";

        String actual = basicStrings.flipConcat(string1,string2);
        Assert.assertEquals(actual,expected);
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
    public void myGetCharTest(){
        String string1 ="abc def ghi jkl";
        char expected =' ';

        char actual = basicStrings.getChar(string1,3);

        Assert.assertEquals(actual,expected);
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
    public void myICantSeeTest(){
        String string1 = "what is my test";
        String expected ="               ";


        String actual = basicStrings.iCantSee(string1);
        Assert.assertEquals(actual,expected);
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
    public void myLoudAndClearTest(){
        String string1 = "loud and clear sIr";
        String expected = "LOUD AND CLEAR SIR";

        String actual = basicStrings.loudAndClear(string1);

        Assert.assertEquals(actual,expected);
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
    public void myReverseCaseTest(){
        String string1 = "I love SHOES";
        String expected ="i LOVE shoes";

        String actual = basicStrings.reverseCase(string1);

        Assert.assertEquals(actual,expected);
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
    public void oneAtATimeTest3(){
        // Given
        String string1 = "Chr 9.0";
        String string2 = "oot";
        String expected = "Cohort 9.0";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myOneAtATimeTest(){
        String string1 = "aceg";
        String string2 = "bdfh";
        String expected ="abcdefgh";

        String actual = basicStrings.oneAtATime(string1,string2);
        Assert.assertEquals(actual,expected);
    }


}
