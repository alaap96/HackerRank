import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int swaps = 0;
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n;i++){
            arr[i] = scan.nextInt(); 
        }
        
        for(int i = 0; i < n; i++){
            int swap_count = 0;
            for(int j = 0; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;
                    swap_count++;
                    swaps++;
                }
            }
            if(swap_count == 0){
                break;
            }
        }
        
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n-1]);
    }
}