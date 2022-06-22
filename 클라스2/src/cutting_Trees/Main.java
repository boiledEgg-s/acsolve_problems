package cutting_Trees;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("\\s");
		int n = Integer.parseInt(str[0]);	//나무의 개수
		long m = Long.parseLong(str[1]);	//필요한 나무 길이
		long[] trees = new long[n];
		str = br.readLine().split("\\s");
		for(int i = 0; i<n; i++) trees[i] = Long.parseLong(str[i]);
		Arrays.sort(trees);
		
		long max = trees[trees.length-1];
		long min = 0;
		long mid = (max+min)/2;;
		long total = 0;
		while(max >= min) {
			total = 0;
			for(long i: trees) {
				if(i>=mid) total+= i-mid;
			}
			if(total >= m) {
				min = mid + 1;
			} else if(total < m){
				max = mid - 1;
			}
			mid = (max+min)/2;
		}
		System.out.println(mid);
	}
}
