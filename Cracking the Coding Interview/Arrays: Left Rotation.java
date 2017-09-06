import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int temp = 0;
        // Do the rotation how many time you want
        for(int i = 0; i < k ;i++) {
            //store  first element in temp then later assign to last index
            temp = a[0];
            for(int j = 0; j < n-1; j++){
                // shift one index forward at a time
                a[j] = a[j+1];            
            }
            // finally store temp in last index
            a[n-1] = temp;
        }
        for(int a_i=0; a_i < n; a_i++){
            System.out.print(a[a_i] + " ");
        }
    }
}
