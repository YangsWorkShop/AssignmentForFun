package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
         return string2.trim()+" "+string1.trim();
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        StringBuilder stringBuilder=new StringBuilder(string.length());
        for(int i=0;i<string.length();i++){
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        StringBuilder stringBuilder=new StringBuilder(string.length());
        String upStr=string.toUpperCase();
        for(int i=0;i<string.length();i++){
            if(upStr.charAt(i)==string.charAt(i)){
                stringBuilder.append(Character.toLowerCase(string.charAt(i)));
            }else{
                stringBuilder.append(upStr.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder stringBuilder=new StringBuilder(string1.length()+string2.length());
        int cur1=0;
        int cur2=0;
        while(cur1!=string1.length()||cur2!=string2.length()){
            if(cur1!=string1.length()){
                stringBuilder.append(string1.charAt(cur1));
                cur1+=1;
            }
            if(cur2!=string2.length()){
                stringBuilder.append(string2.charAt(cur2));
                cur2+=1;
            }
        }
        return stringBuilder.toString();
    }
}
