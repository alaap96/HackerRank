import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = scan.nextInt();
        int count = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(n);
        for(int i = 0; i < n; i++){
            heap.add(scan.nextInt());
        }
        // performs only when min element is not as we want 
        while((heap.peek() < min)){
            // if heap size is not 2 we cannot perform the operation!
            if(heap.size() >= 2){
                int a = heap.poll();
                int b = heap.poll();
                int new_number = a + 2 * b;
                heap.add(new_number); 
                count++;
            }
            // if not 2 then count = -1 and get out of the loop
            else{
                count = -1;
                break;
            } 
        }
        System.out.print(count);
    }
}
