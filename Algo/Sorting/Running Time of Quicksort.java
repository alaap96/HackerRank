import java.io.*;
import java.util.*;

public class Solution {
	// counts of each sort
    static int count = 0;
    static int count1 = 0; 
	// InsertionSort
    public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
        int j = i;
        int value = array[i];
        while (j >= 1 && array[j-1] > value) {
            array[j] = array[j-1];
            count1 += 1;
            j--;
        }
        array[j] = value;
    }
    }
    // QuickSort
     static int Partition(int[] A,int p, int r){
        int x = A[r];
        int i = p - 1;
        for(int j = p; j < r; j++){
            if(A[j] <= x){
                i += 1;
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;   
                count += 1;
            }
        }
        int temp1 = A[r];
        A[r] = A[i+1];
        A[i+1] = temp1;  
        count += 1; 
        return i + 1;  
    } 
   static void QuickSort(int[] A, int p, int r){
        if(p < r){
            int q = Partition(A,p,r);
            QuickSort(A,p,q-1);
            QuickSort(A,q+1,r);  
        }
    }
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = scan.nextInt();
            arr1[i] = arr[i];
        }
        insertionSort(arr);    
        QuickSort(arr1,0,n-1);   
        System.out.println(count1-count); 
    }
}