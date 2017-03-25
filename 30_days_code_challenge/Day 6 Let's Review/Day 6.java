import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        // if we found an integer we ignore that and move to next line
        while(scan.hasNextInt()){
            scan.nextLine();
        }
        // If we find an String then we will print them in certain pattern
        while(scan.hasNextLine()){
        
            // reading string from scan object
            String text =  scan.nextLine();
            // printing out even letters from text
            for(int i = 0; i < text.length(); i = i+ 2)
            System.out.print(text.charAt(i));
            // Giving gap between even and odd letters
            System.out.print(" ");
            // printing odd letters in the string
            for(int i = 1; i < text.length(); i = i+ 2)
            System.out.print(text.charAt(i));
            // printing new line at the end 
           System.out.println("");
        }
    }
}
