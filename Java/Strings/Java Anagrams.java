import java.io.*;
import java.util.*;

public class Solution {    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        a = String.valueOf(A);
        b = String.valueOf(B);
      
        if(a.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }
	    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}