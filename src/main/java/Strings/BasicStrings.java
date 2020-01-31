package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        String s = string2 + string1 ;
        return s;
    }

    public char getChar(String string, int index) {
        char[] arr = string.toCharArray();
        return arr[index];
    }

    public String iCantSee(String string) {
        String s = "";
        for(int i = 0; i < string.length(); i++){
            s += " ";
        }
        return s;
    }

    public String loudAndClear(String string) {
        String s = string.toUpperCase();
        return s;
    }

    public String reverseCase(String string) {
        char[] arr = string.toCharArray();
        for(int  i = 0 ; i < arr.length; i++){
            if(Character.isLowerCase(arr[i]))
                arr[i] = Character.toUpperCase(arr[i]);
            else if(Character.isUpperCase(arr[i]))
                arr[i] = Character.toLowerCase(arr[i]);
        }
        String s = new String(arr);
        return s;
    }

    public String oneAtATime(String string1, String string2) {
        String s = "";
        char[] s1 = string1.toCharArray();
        char[] s2 = string2.toCharArray();
        int j=0;
        int l1 = string1.length();
        int l2 = string2.length();
        int l = 0;

        if(l1 < l2) l = l1;
        else l =l2;

        for(int i = 0; i < l; i++){
                s += s1[i];
                s += s2[i];
        }
        if(l1 < l2 ) {
            for(int i = l1; i < l2; i++){
                s += s2[i];
            }
        }
        else{
            for(int i = l2; i < l1; i++){
                s += s1[i];
            }
        }
        return s;
    }
}
