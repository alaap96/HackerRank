import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.  
    // instances of stack and queue
    Queue<Character> qu = new LinkedList<Character>();
    Stack<Character> st = new Stack<Character>();
    // pushing char into a stack
     void pushCharacter(char c){
        st.push(c);
    }
    // pushing a char into a queue
     void enqueueCharacter(char c){ 
        qu.add(c);
    }
    // tacking out a char from stack
    char popCharacter(){
        return (Character)st.pop();
    }
    // tacking out a char from a queue
    char dequeueCharacter(){
        return (Character)qu.remove();
    }
	
	   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}