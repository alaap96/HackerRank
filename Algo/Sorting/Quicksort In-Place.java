import java.io.*;
import java.util.*;

public class Solution {
   static void print(int[] A,int a,int b){
        for(int i = a; i < b; i++){
            System.out.print(A[i]+" ");
        }
       System.out.println("");
    }
    static int Partition(int[] A,int p, int r){
        int x = A[r];
        int i = p - 1;
        for(int j = p; j < r; j++){
            if(A[j] <= x){
                i += 1;
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;   
            }
        }
        int temp1 = A[r];
        A[r] = A[i+1];
        A[i+1] = temp1;  
        print(A,0,A.length);
        return i + 1; 
        
    }
    
   static void QuickSort(int[] A, int p, int r){
        if(p < r){
            int q = Partition(A,p,r);
            QuickSort(A,p,q-1);
            QuickSort(A,q+1,r);
            
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int p = 0;
        int r = n-1;
        QuickSort(arr,p,r);
    }
}