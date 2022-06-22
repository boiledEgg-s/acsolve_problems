package ascending_Sorting;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] count = new int[10001];
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		for(; i<n; i++) 
			count[Integer.parseInt(br.readLine())]++;
		
		for(i = 1; i<10001; i++) {
			for(int j = 0; j<count[i]; j++) {
				System.out.println(i);
			}
		}
		
	}
}
