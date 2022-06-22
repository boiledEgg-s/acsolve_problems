package joseputh_Solution;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int n = Integer.parseInt(str.split("\\s")[0]);
		int k = Integer.parseInt(str.split("\\s")[1]);

		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= n; i++)
			arr.add(i);
		
		int index = k-1;
		bw.write("<");
		while(arr.size() >= 1) {
			while(index >= arr.size()) index = index - arr.size();				
			bw.write(arr.remove(index)+ "");
			index = (index-1) + k;
			if(arr.size()>=1) bw.write(", ");
		}
		bw.write(">");
		bw.flush();
		bw.close();
		br.close();
	}
}
