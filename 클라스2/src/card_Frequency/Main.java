package card_Frequency;

import java.io.*;
import java.util.*;
public class Main {

	static int search(int[] a, int n) {
		int index = 0;
		int start = 0;
		while(index<a.length && a[index++] != n);
		if(index >= a.length) return 0;
		start = index;	//같은 곳의 시작
		while(index<a.length && a[index++] == n) ;
		return index - start;
		
	}
	
/*	
 	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split("\\s");
		int[] num = new int[n];
		for(int i = 0; i<n; i++) {
			num[i] = Integer.parseInt(str[i]);
		}		
		Arrays.sort(num);
		
		n = Integer.parseInt(br.readLine());
		str = br.readLine().split("\\s");
		for(int i = 0; i<n; i++) bw.write(search(num, Integer.parseInt(str[i]))+" ");
		
		bw.flush();
		bw.close();
		br.close();
	}
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		String[] str = br.readLine().split("\\s");
		int num = 0;
		for(String i:str) {
			num = Integer.parseInt(i);
			if(!map.containsKey(num)) map.put(num, 1);
			else map.replace(num, map.get(num)+1);
		}
		n = Integer.parseInt(br.readLine());
		str = br.readLine().split("\\s");
		for(int i = 0; i<n; i++) {
			num = Integer.parseInt(str[i]);
			if(!map.containsKey(num)) 
				bw.write("0 ");
			else
				bw.write(map.get(num)+" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
