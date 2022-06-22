/*1654번 - 랜선 자르기 
성원이가 필요한 랜선의 개수 -> n
영식이가 가지고 있는 랜선의 개수 -> k

문제))
영식이가 가지고 있는 랜선들의 길이가 주어졌을 때, 성원이가 필요한 랜선의 개수만큼 영식이의 랜선들을 동일한 길이로 잘랐을 때, 랜선의 
길이의 최댓값


 */
package LAN_Cutting;

import java.io.*;
import java.util.Arrays;

public class Main {
	public static long binarySearch(long[] lan, int n) {
		long max = lan[lan.length-1];
		long min = 1;
		long mid = (max+min)/2;
		
		while(max >= min) {
			mid = (max+min)/2;
			int total = 0;
			for(long l:lan) 
				total += (int)l/mid;
			
			if(total >= n)
				min = mid + 1;
			else
				max = mid - 1;
		} 
		return max;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int k = Integer.parseInt(str[0]); //이미 가지고 있는 랜선 개수
		int n = Integer.parseInt(str[1]); //필요한 랜선 개수
		long[] lan = new long[k];
		for(int i = 0; i<k; i++) {
			lan[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(lan);
		
		System.out.println(binarySearch(lan, n));
	}
}