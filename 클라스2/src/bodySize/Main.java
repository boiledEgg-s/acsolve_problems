package bodySize;

import java.io.*;
import java.util.*;

public class Main {
	static class Man implements Comparable<Man>{
		int weight;
		int height;
		int level;
		Man(String weight, String height){
			this.weight = Integer.parseInt(weight);
			this.height = Integer.parseInt(height);
			level = 1;
		}
		public int compareTo(Man o) {
			if(this.weight < o.weight) {
				if(this.height < o.height)
					return 1;
			} else if(this.weight > o.weight){
				if(this.height > o.height) {
					return -1;
				}
			}
			return 0;
		}
	}
	
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Man> arr = new ArrayList<>();
		String[] str = new String[2];
		for(int i = 0; i<n; i++) {
			str = br.readLine().split(" ");
			Man m = new Man(str[0], str[1]);
			for(int j = 0; j < arr.size(); j++) {
				int isSmaller = m.compareTo(arr.get(j));
				if(isSmaller > 0) m.level++;
				else if(isSmaller < 0) arr.get(j).level++;
			}
			arr.add(m);
		}
		for(Man i:arr) System.out.print(i.level+ " ");
	}
}
