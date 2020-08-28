package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2 + string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String s="";
        for(int i=0;i<string.length();i++){
            s+=" ";
        }
        return s;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char[] arr = string.toCharArray();
        for(int  i=0;i<arr.length;i++){
            if(Character.isLowerCase(arr[i]))
                arr[i]=Character.toUpperCase(arr[i]);
            else if(Character.isUpperCase(arr[i]))
                arr[i]=Character.toLowerCase(arr[i]);
        }
        String s = new String(arr);
        return s;
    }

    public String oneAtATime(String string1, String string2) {
        String s="";
        int length = string1.length()<string2.length() ? string1.length() : string2.length();
        for(int i=0;i<length;i++){
            s+=string1.charAt(i);
            s+=string2.charAt(i);
        }
        s+=string1.length()<string2.length() ? string2.substring(length) : string1.substring(length);
        return s;
    }
}
