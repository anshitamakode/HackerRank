import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Map<Long,Long> rightMap = new HashMap<Long,Long>();
        Map<Long,Long> leftMap = new HashMap<Long,Long>();
        for(long num:arr)
            rightMap.put(num,rightMap.getOrDefault(num,0L)+1);
        long count=0;
        for(int i=0;i<arr.size();i++)
        {
            long mid = arr.get(i);
            long c1=0,c2=0;
            rightMap.put(mid,rightMap.getOrDefault(mid,0L)-1);
            if(leftMap.containsKey(mid/r) && mid%r == 0)
                c1 = leftMap.get(mid/r);
            if(rightMap.containsKey(mid*r))
                c2 = rightMap.get(mid*r);
            count = count + (c1*c2);
            leftMap.put(mid,leftMap.getOrDefault(mid,0L)+1);
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
