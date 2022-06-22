package queue_Related;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> arr = new ArrayList<>();
		int n = Integer.parseInt(br.readLine()); //х╫╪Ж ют╥б
		String str = "";
		for(int i = 0; i<n; i++) {
			str = br.readLine();
			if(str.contains("push")) {
				arr.add(Integer.parseInt(str.split("\\s")[1]));
			}else if(str.equals("front")) {
				if(arr.isEmpty()) {
					bw.write("-1\n");
					continue;
				}
				bw.write(arr.get(0)+"\n");
			}else if(str.equals("back")) {
				if(arr.isEmpty()) {
					bw.write("-1\n");
					continue;
				}
				bw.write(arr.get(arr.size()-1)+"\n");
			}else if(str.equals("size")) {
				bw.write(arr.size()+"\n");
			}else if(str.equals("empty")) {
				if(arr.isEmpty()) bw.write("1\n");
				else bw.write("0\n");
			}else if(str.equals("pop")) {
				if(arr.isEmpty()) {
					bw.write("-1\n");
					continue;
				}
				bw.write(arr.remove(0)+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
