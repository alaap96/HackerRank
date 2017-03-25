import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // initilazing map
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // inserting name and phoone number here
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // if phoneBook has the name field it prints out the number
            if(phoneBook.get(s) != null)
                System.out.println(s + "="  +phoneBook.get(s));
            // if not prints Not Found
            else
                System.out.println("Not found");
        } 
        in.close();
    }
}
