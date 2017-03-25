import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 2 && n <= 20){
            for(int i = 1; i <= 10; i++){
                System.out.println(n + " x "+ i + " = " + i * n);
            }
        }
        else{
            System.exit(0);
        }
    }
}
