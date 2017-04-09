import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split("[\\s]");
        List<String> list = new ArrayList<>();

        for (String s : str) {
            for (String e : s.split("[\\?\\.,'!_@]"))
                if (!e.matches(""))
                    list.add(e);
        }
        System.out.println(list.size());
        for (String e : list)
            System.out.println(e);
    }
}