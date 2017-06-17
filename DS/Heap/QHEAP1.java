import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int number,choice;
        PriorityQueue < Integer >  heap = new PriorityQueue < Integer > (n);
        for(int i = 0; i < n; i++){
            choice = scan.nextInt();
            if(choice == 1){
                number = scan.nextInt();
                heap.add(number);
            }
            else if(choice == 2){
                number = scan.nextInt();
                heap.remove(number);
            }
            else if(choice == 3){ 
                System.out.println(heap.peek());
            }
            
        }
    }
}
