import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Scanning input 
        Scanner scan = new Scanner(System.in);
        //counter to keep track of number of pairs
        int counter = 0;
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        //HashMap to store all the integers 
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            map.put(arr[i],1);
        }
        // check if the number is present in HashMap
        for(int i = 0; i < n; i++){
            int temp = arr[i] - x;
            if(map.containsKey(temp)){
                counter++; 
            }
        }
        System.out.println(counter);
    }
}
