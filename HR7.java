import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
class Solution {
	 public static List<Integer> freqQuery(List<List<Integer>> queries) {
		 List<Integer> list1 = new ArrayList<Integer>();
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i=0;i<queries.size();i++)
	        {
	            int op = queries.get(i).get(0);
	            int val = queries.get(i).get(1);
	            if(op == 1)
	                map.put(val, map.getOrDefault(val, 0)+1);
	            else if(op == 2)
	            {
	                if(map.containsKey(val) && map.get(val)>1)
	                    map.put(val, map.get(val)-1);
	                else
	                    map.remove(val);
	            }
	            else if(op == 3)
	            {
	                if(map.containsValue(val))
	                    list1.add(1);
	                else
	                    list1.add(0);
	            }
	             
	        }
	        return list1;
	 }
	 public static void main(String args[])
	 {
		 List<Integer> list = new ArrayList<Integer>();
		 List<Integer> list1 = new ArrayList<Integer>();
		 List<List<Integer>> queries = new ArrayList<List<Integer>>();
		 Scanner sc = new Scanner(System.in);
		 int no = sc.nextInt();
		 for(int i=0;i<no;i++)
		 {
			 list1.add(sc.nextInt());
			 queries.add(list1);
		 }
			 
		 System.out.println(queries);
		 list = freqQuery(queries);
		 System.out.println(list);
	 }

}