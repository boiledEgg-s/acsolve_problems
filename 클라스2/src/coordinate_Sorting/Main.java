package coordinate_Sorting;

import java.io.*;
import java.util.*;

public class Main {

	static class Point{
		int x;
		int y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return x+ " " +y;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); //х╫╪Ж ют╥б
		ArrayList<Point> arr = new ArrayList<>();
		String str = "";
		for(int i = 0; i<n; i++) {
			str = br.readLine();
			arr.add(new Point(Integer.parseInt(str.split("\\s")[0]), Integer.parseInt(str.split("\\s")[1])));
		}
		Comparator<Point> c = new Comparator<>() {
			public int compare(Point o1, Point o2) {
				if(o1.x > o2.x) return 1;
				else if(o1.x < o2.x) return -1;
				else {
					if(o1.y > o2.y) return 1;
					else return -1;
				}
			}
		};
		Collections.sort(arr, c);
		for(Point x:arr) bw.write(x+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
