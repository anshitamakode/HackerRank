import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        if(ar.length == 0)
            return pairs;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int j=0;j<n;j++)
        {
            if(!set.contains(ar[j]))
                set.add(ar[j]);
            else{
                pairs++;
                set.remove(ar[j]);
            }

        }
        return pairs;

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int ar[] = new int[l];
        for(int i=0;i<l;i++)
            ar[i] = sc.nextInt();
        int no = sockMerchant(l,ar); 
        System.out.println(no);
    }
}
