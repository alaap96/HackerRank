import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
     Difference(int[] a){
         elements = a;
         maximumDifference = 0;
    }
   
    public void computeDifference()
    {
        
        int n = elements.length;
        for(int i = 0; i < n; i++){
            
            for(int j = i + 1; j < n; j++){
                
                int diff = elements[i] - elements[j];
                
                if(diff < 0)
                    diff = - diff;
                
                if(diff > maximumDifference){
                    maximumDifference = diff;
                }
            }
        }
    }
    } // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
