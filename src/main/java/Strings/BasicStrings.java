package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String output = "";
        for (int i=0; i < ; ++i) {
            output += " ";
        }
        return output;
    }

    public String loudAndClear(String string) {
        String output = "";
        for (int i=0; i < string.length(); ++i) {
            output += Character.toString(string.charAt(i).toUpperCase());
        }
        return output;
    }

    public String reverseCase(String string) {
        String output = "";
        for (int i=0; i < string.length(); ++i) {
            char ch = string.charAt(i);
            if (Character.isUpperCase(ch)) output += Character.toString(ch.toLowerCase());
            else if (Character.isLowerCase(ch)) output += Character.toString(ch.toUpperCase());
        }
        return output;
    }

    public String oneAtATime(String string1, String string2) {
        int i=0;
        int j=0;
        String output = "";
        while (i < string1.length() && j < string2.length()) {
            output += Character.toString(string1.charAt(i));
            ++i;
            output += Character.toString(string2.charAt(j));
            ++j;
        }
        /** if string1's length exceeds string2's*/
        while (i < string1.length()) {
            output += Character.toString(string1.charAt(i));;
            ++i;
        }
        /** if string2's length exceeds string1's*/
        while (j < string1.length()) {
            output += Character.toString(string2.charAt(j));;
            ++j;
        }
        return output;
    }
}
