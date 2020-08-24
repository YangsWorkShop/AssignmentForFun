import java.util.*;

public class ArrayLists
{
   /*addShit should append the contents of list2 to the end 
    * of list1.*/
   public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
   
       list1.addAll(list2);
      return list1;
    }
    
   /*addShitTogether should sum up all of the values in 
    * list1 and list2 and return that value.*/
   public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer>list2){
       int sum = 0;
       
       list1.addAll(list2);
       
       for (int i =0; i < list1.size(); i++) {
        sum += list1.get(i);
        }
       
       return sum;
    }
    
   /*removeAll should remove all instances of toRemove from original 
   and return an ArrayList.*/
   public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
       original.removeAll(Collections.singleton(toRemove));
       return original;
    } 
    
   /*happyList determines if a ArrayList<String> that gets passed in is 
    happy or not. A list is happy if and only if all of it's elements 
    are happy. An element is happy if it shares a character with the 
    string behind it and if it shares a character with the string in 
    front of it. (Both conditions if applicable) The characters that it 
    shares with its neighbors do not have to be the same character as 
    the elements can be happy with everyone doing their own thing.*/
    
   public boolean happyList(ArrayList<String> original) {
       boolean isHappy = false;
       
       for (int i = 1; i < original.size(); i++) {
           String[] element = original.get(i).toLowerCase().split("");
           String[] prevElement = original.get(i-1).toLowerCase().split("");
           
           List<String> list1 = new ArrayList<>(Arrays.asList(element));
           List<String> list2 = new ArrayList<>(Arrays.asList(prevElement));
           
           if (!Collections.disjoint(list1, list2)) { 
           isHappy = true;
        } else {
            isHappy = false;
            break;}
    }
    return isHappy;
    }
}
