import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static Scanner keyboard = new Scanner(System.in);
static boolean flag = true;
static int B;
static int H;

static {
    B = keyboard.nextInt();
    H = keyboard.nextInt();
    if (B <= 0 || H <= 0) {
        System.out.print("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    }
}public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
