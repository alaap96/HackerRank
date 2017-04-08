import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = in.nextInt();
        List<String> substrs = new ArrayList<>();

        for (int i = 0; i < str.length() - n + 1; i++)
            substrs.add(str.substring(i, i + n));
        
        Collections.sort(substrs);
        
        System.out.println(substrs.get(0) + "\n" + substrs.get(substrs.size() - 1));
    }
}