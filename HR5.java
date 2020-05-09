import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    

    static String checkMagazine(String[] magazine, String[] note) {
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        //int flag=0;
        for(int i=0;i<magazine.length;i++)
        {
            map.put(magazine[i],map.getOrDefault(magazine[i],0)+1);
        }
        for(int i=0;i<note.length;i++)
        {
            if(!map.containsKey(note[i]) || map.get(note[i]) <= 0)
                return "No";
            map.put(note[i],map.get(note[i])-1);
        }
        return "Yes";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        String a = checkMagazine(magazine, note);
        System.out.println(a);

        scanner.close();
    }
}
