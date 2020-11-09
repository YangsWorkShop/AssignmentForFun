package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2+string1;
    }

    public char getChar(String string, int index) {
        if(string==null||string.length()==0||string.length()<=index) return ' ';
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        if(string==null||string.length()==0) return "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<string.length();i++) sb.append(" ");
        return sb.toString();
    }

    public String loudAndClear(String string) {
        if(string==null||string.length()==0) return "";
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        if(string==null||string.length()==0) return "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<string.length();i++){
            char c;
            if(Character.isLowerCase(string.charAt(i)))
                c= Character.toUpperCase(string.charAt(i));
            else if(Character.isUpperCase(string.charAt(i)))
                c = Character.toLowerCase(string.charAt(i));
            else
                c = string.charAt(i);

            sb.append(c);
        }
        return sb.toString();
    }

    public String oneAtATime(String string1, String string2) {
        if(string1==null) return string2;
        if(string2==null) return string1;
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<string1.length()&&i<string2.length()){
            sb.append(string1.charAt(i));
            sb.append(string2.charAt(i));
            i++;
        }
        while(i<string1.length()){
            sb.append(string1.charAt(i));
            i++;
        }
        while(i<string2.length()){
            sb.append(string2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
