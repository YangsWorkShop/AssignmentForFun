package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {

        return string2+string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        return string.replaceAll("[a-zA-Z']"," ");
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {

        String res = "";
        for(int i = 0 ; i < string.length();i++){
            int type = Character.getType(string.charAt(i));
            if(type == Character.LOWERCASE_LETTER){
                res+= Character.toUpperCase(string.charAt(i));
            }
            else
            {
                res+= Character.toLowerCase(string.charAt(i));
            }
        }
        return res;
    }

    public String oneAtATime(String string1, String string2) {

        String res = "";
        int len = string1.length() < string2.length()?string1.length():string2.length();
        for(int i = 0 ; i < len;i++){
            res+= string1.charAt(i);
            res+= string2.charAt(i);
        }
        res += string1.length() < string2.length()? string2.substring(len):string1.substring(len);
        return res;
    }
}
