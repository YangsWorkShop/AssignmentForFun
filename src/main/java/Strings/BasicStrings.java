package Strings;

import java.util.Collections;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2 + string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        return String.join("", Collections.nCopies(string.length(), " "));
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char[] chars = string.toCharArray();
        for(int idx = 0; idx < chars.length; idx++) {
            if(Character.isUpperCase(chars[idx])) {
                chars[idx] = Character.toLowerCase(chars[idx]);
            }else if (Character.isLowerCase(chars[idx])) {
                chars[idx] = Character.toUpperCase(chars[idx]);
            }
        }
        return new String(chars);
    }

    public String oneAtATime(String string1, String string2) {
        String res = new String();
        for(int idx = 0; idx < string1.length() && idx < string2.length(); idx++) {
            res += String.valueOf(string1.charAt(idx));
            res += String.valueOf(string2.charAt(idx));
        }
        if(string1.length() > string2.length()) {
            res += string1.substring(string2.length());
        }else if(string1.length() < string2.length()) {
            res += string2.substring(string1.length());
        }
        return res;
    }
}
