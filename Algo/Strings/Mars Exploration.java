import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int ans = 0;
        int i = 0;
        while(i < S.length()){
            if(S.charAt(i) != 'S')
            {
                ans++;
            }
            if(S.charAt(i+1) != 'O'){
                ans++;
            }
             if(S.charAt(i+2) != 'S')
            {
                ans++;
            }
            i=i+3;
        }
        System.out.print(ans);
    }
}
