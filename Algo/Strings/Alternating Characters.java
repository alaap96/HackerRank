import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int alternatingCharacters(String s){
        // Complete this function
        int n = s.length();
        int count = 0;
        char Present_string = ' ';
        for(int i = 0; i < n; i++){
            if(Present_string == ' '){
                Present_string = s.charAt(i);
            }
            else{
                if(s.charAt(i) == Present_string) count++;
                else Present_string = s.charAt(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
