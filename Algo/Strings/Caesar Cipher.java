import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String S = scan.next();
        int Key = scan.nextInt();
        String S1;
        char[] charArray = S.toCharArray();
        for(int i = 0; i < S.length(); i++){
            if(Character.isUpperCase(charArray[i])){
                int temp =  65 + ((int)charArray[i] -65 + Key) %26;
                charArray[i] = (char)temp;
            }
            else if(Character.isLowerCase(charArray[i])){
                int temp =  97 + ((int)charArray[i] -97 + Key)%26;         
                charArray[i] = (char)temp;
            }
        }
        System.out.print(new String(charArray));
    }
}
