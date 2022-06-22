package finding_Num;

import java.io.*;
import java.util.*;

public class Main { 

	static boolean search(int[] a, int n) {
		int f = 0, l = a.length-1;
		int mid = 0;
		while(f<=l) {
			mid = (f+l)/2;
			if(a[mid] == n) return true;
			else if(a[mid]<n) f = mid+1;
			else l = mid-1;
		}
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] str = br.readLine().split("\\s");
		for(int i = 0; i<n; i++) 
			arr[i] = Integer.parseInt(str[i]);
		Arrays.sort(arr);
		
		n = Integer.parseInt(br.readLine());
		str = br.readLine().split("\\s");
		for(int i = 0; i<n; i++) {
			int a = Integer.parseInt(str[i]);
			if(search(arr, a)) 
				bw.write(1+"\n");
			else
				bw.write(0+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
