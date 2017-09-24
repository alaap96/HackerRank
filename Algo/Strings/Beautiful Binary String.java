import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String B){
        // Complete this function
        int count = 0;
        for(int i = 0; i < n - 2; i++){
            if(B.charAt(i) == '0'){
                String Sub_String = B.substring(i,i+3);
                if(Sub_String.equals("010")) {count++; i+=2;}
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
