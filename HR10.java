import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Solution {
	public static int diagonalDifference(List<List<Integer>> arr) {
		int right=0,left=0;
		for(int i=0;i<arr.get(0).size();i++)
        	for(int j=0;j<arr.get(0).size();j++)
        	{
        		if(i == j)
        			right = arr.get(i).get(j) + right;
        		if(i+j == arr.get(0).size()-1)
        			left = arr.get(i).get(j) + left;
        	}
		return Math.abs(right - left);
	    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        	for(int j=0;j<n;j++)
        	{
        		list.add(new ArrayList<Integer>());
        		list.get(i).add(j,sc.nextInt());
        	}
        int diff = diagonalDifference(list);
        System.out.println(diff);
    }
    
}