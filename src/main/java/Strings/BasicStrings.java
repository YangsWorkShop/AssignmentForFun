package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
    	int length = string.length();
    	String res = "";
    	for(int i = 0;i < length;i ++) {
    		res += " ";
    	}
        return res;
    }

    public String loudAndClear(String string) {
    	String res = string.toUpperCase();
        return res;
    }

    public String reverseCase(String string) {
    	char[] Array = new char[string.length()];
    	Array = string.toCharArray();
    	char[] res = new char[string.length()];
    	for(int i = 0; i < string.length(); i ++) {
    		if(Character.isLowerCase(Array[i])) {
    			res[i] = Character.toUpperCase(Array[i]);
    		} else if(Character.isUpperCase(Array[i])) {
    			res[i] = Character.toLowerCase(Array[i]);
    		} else {
    			res[i] = Array[i];
    		}
    	}
    	String str = new String(res);
        return str;
    }

    public String oneAtATime(String string1, String string2) {
    	int len1 = string1.length();
    	int len2 = string2.length();
    	char[] str1 = string1.toCharArray();
    	char[] str2 = string2.toCharArray();
    	char[] temp = new char[len1+len2];
    	String res = "";
    	if(len1 == len2) {
    		for(int i = 0; i < len1; i ++) {
    			res += str1[i];
    			res += str2[i];
    		}
    	} else if(len1 < len2) {
//    		for(int i = len1; i < len2; i ++) {
//    			string1 += " ";
//    		}
//    		for(int i = 0; i < len2; i ++) {
//    			res += string1[i];
//    			res += string2[i];
//    		}
    		for(int i = 0; i < len1; i ++) {
    			res += str1[i];
    			res += str2[i];
    		}
    		res = res.concat(string2.substring(len1,len2));
    	} else {
//    		for(int i = len2; i < len1; i ++) {
//    			string2 += " ";
//    		}
//    		for(int i = 0; i < len1; i ++) {
//    			res += string1[i];
//    			res += string2[i];
//    		}
    		for(int i = 0; i < len2; i ++) {
    			res += str1[i];
    			res += str2[i];
    		}
    		res = res.concat(string1.substring(len2,len1));
    	}
        return res;
    }
}
