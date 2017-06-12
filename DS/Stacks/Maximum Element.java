import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        int[] track = new int[N];
        int a = 0;
        track[0] = 0; 
        int top = -1;
        for(int i = 0; i < N; i++){
            int temp = scan.nextInt();
            int max = 0;
            if(temp == 1){
                top++; 
                array[top] = scan.nextInt();
                if(track[a] > array[top]){
                    a++;
                    track[a] = array[top];
                }
            }         
            else if(temp == 2){
                if(array[top] == track[a]){
                    a--;
                }
                top--;
                
            }
            else if(temp == 3){
               
                System.out.println(track[a]);
            }
        }
    }
}
