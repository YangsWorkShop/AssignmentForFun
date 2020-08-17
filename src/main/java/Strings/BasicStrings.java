 

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        StringBuilder sb = new StringBuilder();
        sb.append(string2);
        sb.append(string1);
        return sb.toString();
    }

    public char getChar(String string, int index) {
        char[] arr = string.toCharArray();
        return arr[index];
    }

    public String iCantSee(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    public String loudAndClear(String string) {
        String str = string.toUpperCase();
        return str;
    }

    public String reverseCase(String string) {
        char[] ch = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                ch[i] = Character.toLowerCase(string.charAt(i));
            } else if (Character.isLowerCase(string.charAt(i))) {
                ch[i] = Character.toUpperCase(string.charAt(i));
            } else {
                ch[i] = string.charAt(i);
            }
        }
        return new String(ch);
    }

    public String oneAtATime(String string1, String string2) {
        char[] ch1 = string1.toCharArray();
        char[] ch2 = string2.toCharArray();
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (i < ch1.length && i < ch2.length) {
            result.append(ch1[i]);
            result.append(ch2[i]);
            i++;
        }
        if (i == ch1.length) {
            for (int j = i; j < string2.length(); j++) {
                result.append(ch2[j]);
            }
        }
        if (i == ch2.length) {
            for (int j = i; j < string1.length(); j++) {
                result.append(ch1[j]);
            }
        }
        return new String(result);
    }
}
