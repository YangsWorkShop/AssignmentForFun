package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        if (string1 == null || string2 == null) return null;
        return string2 + string1;
    }

    public char getChar(String string, int index) {
        return (index >= 0 && index < string.length()) ? string.charAt(index) : 0;
    }

    public String iCantSee(String string) {
        if (string == null || string.equals("")) return "";
        else return String.format("%" + string.length() + "s", "");
    }

    public String loudAndClear(String string) {
        return string != null ? string.toUpperCase() : "";
    }

    public String reverseCase(String string) {
        if (string == null) return "";
        StringBuilder sb = new StringBuilder();

        for (char c : string.toCharArray()) {
            sb.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }

        return sb.toString();
    }

    public String oneAtATime(String string1, String string2) {
        if (string1 == null) return string2;
        else if (string2 == null) return string1;

        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0, len1 = string1.length(), len2 = string2.length();

        while (i < len1 && j < len2) {
            sb.append(string1.charAt(i++));
            sb.append(string2.charAt(j++));
        }

        if (j < len2) sb.append(string2.substring(j));
        else if (i < len1) sb.append(string1.substring(i));

        return sb.toString();
    }
}
