package StringsTests;

import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class BasicStringsTest {

	    private BasicStrings basicStrings;

	    @Before
	    public void setup(){
	        basicStrings = new BasicStrings();
	    }
	    
	    @Test
	    public void flipConcatOwnTest1(){
	        // Given
	        String string1 = " Duck";
	        String string2 = "Daffy";
	        String expected = "Daffy Duck";
	        // When
	        String actual = basicStrings.flipConcat(string1, string2);
	        // Then
	        Assert.assertEquals(expected, actual);
	    }

	   
	    
	    @Test
	    public void getCharOwnTest1(){
	        // Given
	        String string1 = "Strings";
	        char expected = 's';
	        // When
	        char actual = basicStrings.getChar(string1, 6);
	        // Then
	        Assert.assertEquals(expected, actual);
	    }


	   
	    @Test
	    public void iCantSeeOwnTest1(){
	        // Given
	        String string1 = "Can you see me?";
	        String expected = "               ";
	        // When
	        String actual = basicStrings.iCantSee(string1);
	        // Then
	        Assert.assertEquals(expected, actual);
	    }


	   
	    
	    @Test
	    public void loudAndClearOwnTest1(){
	        // Given
	        String string = "are you ready!";
	        String expected = "ARE YOU READY!";
	        // When
	        String actual = basicStrings.loudAndClear(string);
	        // Then
	        Assert.assertEquals(expected, actual);
	    }

	    
	    
	    @Test
	    public void reverseCaseOwnTest1(){
	        // Given
	        String string = "ThAt's wHat i sAy";
	        String expected = "tHaT'S WhAT I SaY";
	        // When
	        String actual = basicStrings.reverseCase(string);
	        // Then
	        Assert.assertEquals(expected, actual);
	    }

	    
	    @Test
	    public void oneAtATimeOwnTest(){
	        // Given
	        String string1 = "Laiiy";
	        String string2 = "iblt";
	        String expected = "Liability";
	        // When
	        String actual = basicStrings.oneAtATime(string1, string2);
	        // Then
	        Assert.assertEquals(expected, actual);
	    }

	   

	}
	
