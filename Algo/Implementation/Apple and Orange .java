import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        // count of apple and orange 
        long apple_count = 0;
        long orange_count = 0;
        // distance between house and tree
        int min_Distance_bt_apptree_house = s - a;
        int max_Distance_bt_apptree_house = t - a;
        int min_Distance_bt_orgtree_house = b - t;
        int max_Distance_bt_orgtree_house = b - s;
        
        for(int i = 0; i < m; i++){
            if(apple[i] >= min_Distance_bt_apptree_house && apple[i] <= max_Distance_bt_apptree_house && apple[i] >= 0){
                apple_count += 1;
            }     
        }
        
        for(int i = 0; i < n; i++){
            if(orange[i] < 0){
                orange[i] = 0 - orange[i];
                if(orange[i] >= min_Distance_bt_orgtree_house && orange[i] <= max_Distance_bt_orgtree_house){
                    orange_count += 1;
                }     
            }
        }
        System.out.println(apple_count);
        System.out.println(orange_count);
    }
}