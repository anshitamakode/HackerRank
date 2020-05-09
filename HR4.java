import java.io.*;
import java.util.Scanner;


public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int cnt = -1;
        for(int i=0;i<c.length;i++,cnt++)
        {
            if(i+2<c.length && c[i+2] == 0)
                i++;
        }
        return cnt;
    }

   

    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       Solution s = new Solution();
       int n = sc.nextInt();
       int c[] = new int[n];
       for(int j=0;j<n;j++)
       {
           c[j] = sc.nextInt();
       }
       int no = s.jumpingOnClouds(c);
       System.out.println(no);
    }
}
