import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
         
        boolean[] array = new boolean[26];
        for(int i = 0; i < 26; i++){
            array[i] = false; 
        }
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(Character.isLowerCase(S.charAt(i))){
                int temp = (int)S.charAt(i) - 97;
                if(array[temp] != true){
                    array[temp] = true;
                    count++;
                    if(count == 26){
                        break;
                    }
                }
            }
            else if(Character.isUpperCase(S.charAt(i))){
                int temp = (int)S.charAt(i) - 65;  
                if(array[temp] != true){
                    array[temp] = true;
                    count++;
                    if(count == 26){
                        break;
                    }
                }
            }
        }
        if(count == 26){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
        
}

