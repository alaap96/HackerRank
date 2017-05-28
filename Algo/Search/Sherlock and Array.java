import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
  
        int n = a.length;
        int sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        // filling left array with sums of all elements for that element
        for(int i = 1;i < n;i++){
            left[0] = a[0];
            left[i] = left[i - 1] + a[i];    
        }   
        // filling right array with sums of all elements for that element
        for(int i = n - 2;i >= 0;i--){
            right[n - 1] = a[ n - 1];
            right[i] = right[i + 1] + a[i];       
        }   
        // at any point it both are equal then YES else NO
        for(int i = 0;i < n;i++){
            if(left[i] == right[i]){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
