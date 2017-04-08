import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len1 = A.length();
        int len2 = B.length();
        System.out.println(len1 + len2);
        if(A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        // capitalize first char in a string
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);     
        System.out.println(A+ " " + B);
    }
}