import java.util.*;

public class BasicStrings
{
    /*flipConcat should concatenate string1 to the end of string2.
       */
    public String flipConcat(String string1, String string2)
    {
        return string1.concat(string2);
    }
    
    /*getChar should get the index character of string.*/
    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    /*iCantSee should return a String of whitespace the same length 
      as string. Symbol "_" represents whitespace. */
    public String iCantSee(String string) {
        char[] charArray = string.toCharArray();
        List<Character> list = new ArrayList<Character>();
        
        for (char c : charArray) {
        list.add(c);
        }
        
        StringBuilder str = new StringBuilder();

        for (char c : charArray) {
            str.append("_");
        }

        String newStr = str.toString();
        
        return newStr;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char[] charArray = string.toCharArray();
        
        StringBuilder reverseCase = new StringBuilder();
        
        for (char c: charArray) {
            if (Character.isLowerCase(c)) { 
                String upperCase = Character.toString(c).toUpperCase();
                reverseCase.append(upperCase);
            } else {
                String lowerCase = Character.toString(c).toLowerCase();
                reverseCase.append(lowerCase);
            }
        }
        
        return reverseCase.toString();
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < string1.length() || i < string2.length(); i++) {
         if (i < string1.length()) str.append(string1.charAt(i));
         if (i < string2.length()) str.append(string2.charAt(i));
        }
        return str.toString();
    }
}
