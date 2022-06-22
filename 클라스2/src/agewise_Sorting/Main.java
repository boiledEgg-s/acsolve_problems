package agewise_Sorting;

import java.io.*;
import java.util.*;

public class Main {
	static class man{
		String name;
		int age;
		man(int age, String name){
			this.name = name;
			this.age = age;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayList<man> arr = new ArrayList<man>();
		String[] str = new String[2];
		for(int i = 0; i<n; i++) {
			str = br.readLine().split("\\s");
			arr.add(new man(Integer.parseInt(str[0]), str[1]));
		}
		Comparator<man> c = new Comparator<man>() {
			public int compare(man o1, man o2) {
				// TODO Auto-generated method stub
				if(o1.age > o2.age) return 1;
				else if(o1.age < o2.age) return -1;
				else return 0;
			}
		};
		Collections.sort(arr, c);
		for(man i:arr) 
			bw.write(i.age+ " "+ i.name+"\n");
		bw.flush();
	}
}
