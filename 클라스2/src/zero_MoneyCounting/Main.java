package zero_MoneyCounting;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int num = 0;
		int total = 0;
		Stack<Integer> st = new Stack<>();
		for(int i =0; i<k; i++) {
			num = Integer.parseInt(br.readLine());
			if(num == 0 && !st.isEmpty()) st.pop();
			else st.push(num);
		}
		
		while(!st.empty()) total += st.pop();
		System.out.println(total);
	}
}
