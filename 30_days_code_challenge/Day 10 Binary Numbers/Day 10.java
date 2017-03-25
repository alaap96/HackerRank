import java.io.*;
import java.util.*;

public class Solution {
    public static int Convert_To_Binary(int n){
        // array
        int[] binary = new int[32];
        int i = 0;
        // keep track of count 
        int count = 0;
        // keep track of max consecutive 1's
        int max = 0;
        // converting into binary
        while(n > 0){
           if(n%2 == 0){
               n= n/2;
               binary[i] = 0;
               i++;
           } 
            else{
                n = (n-1)/2;
                binary[i] = 1;
                    i++;
            }
        }
        // checking for consecutive 1's
         for(int j = 0; j < 32; j++){
            if(binary[j] == 1){
                count += 1;
                if(count > max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        // returning max back
       return max;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // calling funnction
        int max = Convert_To_Binary(n);
        // printing max number of consecutive 1's
        System.out.print(max);
    }
}
