package card2;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 0; i<n; i++) {
			q.add(i+1);
		}
		while(q.size() > 1) {
			q.poll();
			q.add(q.poll());
		}
		bw.write(q.peek()+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
