import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // create two stacks
        Stack st1 = new Stack();
        Stack st2 = new Stack();
        
        for(int i = 0; i < n;i++){
            int choice = scan.nextInt();
            if(choice == 1){
                int number = scan.nextInt();
                // always push into stack 1
                st1.push(number);
            }
            else if(choice == 2){
                // if stack 2 is empty, push all stack 1 to stack 2
                if (st2.isEmpty()) {
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
            }
                // else just pop first element in stack 2
                st2.pop();
            }
            else if(choice == 3){
                if (st2.isEmpty()) {
                while (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
            }
            System.out.println(st2.peek());
            }
        }
    }
}
