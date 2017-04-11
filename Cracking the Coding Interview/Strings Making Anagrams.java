import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
    Map<Character, Integer> h1 = new HashMap<Character, Integer>();
    Map<Character, Integer> h2 = new HashMap<Character, Integer>();
        // loading string1 into map
        for(int i = 0; i < first.length();i++){
            if(h1.containsKey(first.charAt(i))){
                h1.put(first.charAt(i),h1.get(first.charAt(i))+1);              
            }
            else{
                h1.put(first.charAt(i),1);
            }
        }
       
        // loading string2 into map
        for(int i = 0; i < second.length();i++){
            if(h2.containsKey(second.charAt(i))){
                h2.put(second.charAt(i),h2.get(second.charAt(i))+1);              
            }
            else{
                h2.put(second.charAt(i),1);
            }
        }
      
        int counter = 0;
       
        // checking map1 to map 2
       for(int i = 0;i < second.length();i++){
           if(!h1.containsKey(second.charAt(i))){
               counter++; 
               
           }
       }
        
       // checking map2 to map1
        for(int j = 0; j < first.length();j++){
            if(h2.containsKey(first.charAt(j))){
                int diff = h1.get(first.charAt(j)) - h2.get(first.charAt(j));
                if(diff<0){
                    diff = -diff;
                    h2.put(first.charAt(j),h1.get(first.charAt(j)));
                }
                else{
                    h2.put(first.charAt(j),h1.get(first.charAt(j)));
                }
                counter = counter + diff;    
            }
             
           if(!h2.containsKey(first.charAt(j))){
               counter++; 
               h1.put(first.charAt(j),h1.get(first.charAt(j)) - 1);
               if(h1.get(first.charAt(j)) == 0){
                   h1.remove(first.charAt(j));
                   }
               }
           }
       
        return counter;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
}