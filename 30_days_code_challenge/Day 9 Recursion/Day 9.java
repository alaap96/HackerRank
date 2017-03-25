import java.io.*;
import java.util.*;

public class Solution {
      public static int factorial(int n){
            if(n <= 0){
                return 1;
            }
            else{
               return n * factorial(n - 1);    
            } 
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = factorial(n);
        System.out.print(sum);
    }
}
