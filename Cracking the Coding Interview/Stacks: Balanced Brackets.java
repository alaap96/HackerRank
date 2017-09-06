import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String s) {
        // Complete this function
        int t = s.length();
        // new character stack 
        Stack<Character> st = new Stack<Character>();
        // for chars in string
        for(int i  = 0; i < t;i++){
            char value = s.charAt(i);
            // if opening braces push in to stack
            if(value == '{' || value == '(' || value == '['){
                st.push(value);
            }
            // if closing braces pop if mactches with top char
            else if((value == '}' || value == ')' || value == ']') && !st.isEmpty()){
                
                char Top_char = (char)st.peek();
                if(Top_char == '{' && value == '}'){
                    st.pop();
                }
                else if(Top_char == '(' && value == ')'){
                    st.pop();
                }
                else if(Top_char == '[' && value == ']'){
                    st.pop();
                } 
           }
            // else return no
            else{
                return false;          
            }
        }
        // by end if stack is empty return yes else no
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
