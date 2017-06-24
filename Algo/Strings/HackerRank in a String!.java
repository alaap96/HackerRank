import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int track = 0;
            String S1 = "hackerrank";
            for(int i = 0 ; i < s.length();i++){
                if(S1.charAt(track) == s.charAt(i)){
                    track++;
                    if(track == 9){
                        break;
                    }
                }
            }
            if(track == 9){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
