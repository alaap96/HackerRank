import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();
        int count = 1;
        for(int i = 0; i < n; i++){
            if((65  <= (int)s.charAt(i ) && (int)s.charAt(i )  <=  90)){
                count++;
            }
        }
        System.out.println(count);
    }
}
