package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {

        return string2.concat(string1);
    }

    public char getChar(String string, int index) {

        return string.charAt(index);
    }

    public String iCantSee(String string) {
        int l = string.length();
        StringBuilder nw = new StringBuilder();

        for(int i =0;i<l;i++){
            nw.append(" ");

        }
        return nw.toString();
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
//        char a = 97;
//        char z = 122;
//        char A = 65;
//        char Z = 90;
        StringBuilder nw_string = new StringBuilder(string.length());
        for(int i = 0; i < string.length(); i++){
            int b = (byte)string.charAt(i);
            if(b <= 122 & b >= 97){
//                char tmp = (char) (b-32);
                nw_string.append((char) (b-32));
            }else if( b >= 65 & b < 90 ){
                nw_string.append((char)(b + 32));
            }else{
                nw_string.append(string.charAt(i));
            }

        }
        return nw_string.toString();
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder zz = new StringBuilder(string1.length()+string2.length());
        int j = 0;
        for(int i = 0;i < (string1.length()+string2.length());i++){
            if(j < string1.length()){
                zz.append(string1.charAt(j));
            }
            if(j < string2.length()){
                zz.append(string2.charAt(j));
            }
            j++;

        }
//        System.out.println(zz.toString());
        return zz.toString();
    }
}
