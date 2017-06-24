import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        String s = in.next();
        int n = in.nextInt();
        int temp[] = new int[s.length()];
        int track = 0;
        for(int i = 0; i < s.length();i++){
                if(i != 0 && s.charAt(i) == s.charAt(i-1)){
                  temp[i] = temp[i-1] + (int)s.charAt(i) - 96;
                  m.put(temp[i],1);
                }
                else{
                    temp[i] = (int)s.charAt(i) - 96;
                    m.put(temp[i],1);
                }
            }
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
                if(m.containsKey(x)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            
        }
    }
}
