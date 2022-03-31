package Strings;

import java.util.Arrays;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }

    public char getChar(String string, int index) {

        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            res += " ";
        }
        return res;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char[] s1 = string.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if (Character.isLowerCase(s1[i])) {
                s1[i] = Character.toUpperCase(s1[i]);
            } else {
                s1[i] = Character.toLowerCase(s1[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s1.length; i++) {
            sb.append(s1[i]);
        }
        String res = sb.toString();
        return res;
    }

    public String oneAtATime(String string1, String string2) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string1.length() || i < string2.length(); i++) {
            if (i < string1.length()) {
                sb.append(string1.charAt(i));
            }
            if (i < string2.length()) {
                sb.append(string2.charAt(i));
            }
        }
        String res = sb.toString();
        return res;
    }
}