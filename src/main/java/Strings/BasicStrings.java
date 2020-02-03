package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
    	String spaces="";
        for(int i=0;i<string.length();i++) {
        	spaces+=" ";
        }
        return spaces;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
    	String reverseCase="";
    	char[] arr= new char[string.length()];
        for(int i=0;i<string.length();i++) {
        	char rev = string.charAt(i);
        	if(Character.isUpperCase(rev)) {
        		arr[i]= Character.toLowerCase(rev);
        		
        	}
        	else arr[i]= Character.toUpperCase(rev);
        }
       reverseCase = String.copyValueOf(arr);
       return reverseCase;

    }

    public String oneAtATime(String string1, String string2) {
        char[] arr = new char[string1.length()+string2.length()];
        String smallest = "";
        String oneAtATime="";
        boolean s1 = true;
        if(string1.length()>string2.length()) {
        	smallest = string2;
        	s1 = false;
        }
        else smallest = string1;
       
        for(int i=0; i<smallest.length();i++) {
        	arr[2*i] = string1.charAt(i);
        	arr[2*i+1]= string2.charAt(i);
        }
        
        if(s1 ==true) {
        	for(int index=2*smallest.length();
        			index<string1.length()+string2.length();
        			index++) {
        		arr[index] = string2.charAt(index-smallest.length());
        	}
        }
        else {
        	for(int index=2*smallest.length();
        			index<string1.length()+string2.length();
        			index++) {
        		arr[index] = string1.charAt(index-smallest.length());
        	}
        }
        oneAtATime = String.copyValueOf(arr);
     return oneAtATime;
    }
}
