/*1654�� - ���� �ڸ��� 
�����̰� �ʿ��� ������ ���� -> n
�����̰� ������ �ִ� ������ ���� -> k

����))
�����̰� ������ �ִ� �������� ���̰� �־����� ��, �����̰� �ʿ��� ������ ������ŭ �������� �������� ������ ���̷� �߶��� ��, ������ 
������ �ִ�


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
		int k = Integer.parseInt(str[0]); //�̹� ������ �ִ� ���� ����
		int n = Integer.parseInt(str[1]); //�ʿ��� ���� ����
		long[] lan = new long[k];
		for(int i = 0; i<k; i++) {
			lan[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(lan);
		
		System.out.println(binarySearch(lan, n));
	}
}