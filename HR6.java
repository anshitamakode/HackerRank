import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class Solution 
{
	long repeatedString(String s, long n) {
		int q = (int) (n/s.length());
		int r = (int) (n%s.length());
		int cnt=0;
		//String repeated = new String(new char[q]).replace("\0", s);
		String repeated = new String(new char[q + 1]).replaceAll(".",s).substring(0, s.length() * q + r);
		System.out.println(repeated);
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<repeated.length();i++)
		{
			char ch = repeated.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		cnt = map.get('a');
		return cnt;
	}
    public static void main(String args[])
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long n = sc.nextLong();
        long no = s.repeatedString(str,n);
        System.out.println(no);
    }
}
