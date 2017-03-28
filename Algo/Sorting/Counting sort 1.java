import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i < n;i++){
            arr[i] = scan.nextInt();
        }
            int i=0;
            while(i <=99){
                for(int j = 0 ; j < n; j++){
                    if(i == arr[j]){
                        count += 1;
                    }
                }
                i++;
                System.out.print(count +" ");
                count = 0;
            }  
    }
}