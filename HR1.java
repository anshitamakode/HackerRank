import java.util.HashSet;
import java.util.Scanner;
class Solution {
	static String twoStrings(String s1, String s2) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			set.add(c);
		}
		for(int i=0;i<s2.length();i++)
		{
			char c = s2.charAt(i);
			if(set.contains(c))
				return "YES";
		}
		return "NO";
   
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	String s1 = sc.next();
        	String s2 = sc.next();
        	String s = twoStrings(s1, s2);
        	System.out.println(s);
        }
        
    }
}