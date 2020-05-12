import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Solution {
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int count=0,count1=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i) > b.get(i))
				count++;
			else if(a.get(i) < b.get(i))
				count1++;
	    }
		List<Integer> l = new ArrayList<Integer>();
		l.add(count);
		l.add(count1);
		return l;
    
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        int no=sc.nextInt();
        for(int i=0;i<no;i++)
        	list.add(sc.nextInt());
        for(int j=0;j<no;j++)
        	list1.add(sc.nextInt());
        List<Integer> l = compareTriplets(list, list1);
        for(int i=0;i<l.size();i++)
        	System.out.println(l.get(i));
    }
    
}