package acmHotel;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //테스트 수
		int h = 0, w = 0, n = 0;
		String[] res = new String[t];
		for(int i= 0; i<t; i++) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			
			int test = 1;
			int j = 1, k = 1;
			loop1: for(; j<=w; j++) {
				for(; k <= h; k++) {
					if(test == n) {
						break loop1;
					}
					test++;
				}
				k = 1;
			}
			res[i] = Integer.toString(k);
			if(j >=10) {
				res[i] += j;
			} else {
				res[i] += "0"+j;
			}
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(res[i]);
		}
		sc.close();
	}
}
