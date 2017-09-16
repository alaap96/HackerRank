import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
        // Complete this function
        int n = s.length();
        // Reverse String 
        String reverse = new StringBuffer(s).reverse().toString();
        for(int i = 1; i < n -1; i++){
            int ONE = (int)s.charAt(i) - (int)s.charAt(i - 1); 
            int TWO = (int)reverse.charAt(i) - (int)reverse.charAt(i - 1);
            if(ONE < 0)ONE = - ONE;
            if(TWO < 0)TWO = - TWO;
            if(ONE != TWO){
                return "Not Funny";
            }
        }
        return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
