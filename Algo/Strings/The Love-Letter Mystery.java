import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int theLoveLetterMystery(String s){
        // Complete this function
        int n = s.length();
        int count = 0;
        for(int i = 0;i < n/2;i++){
            if((s.charAt(i) != s.charAt(n-1-i))){
                count += Math.abs((int)s.charAt(i) - (int)s.charAt(n-1-i));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
