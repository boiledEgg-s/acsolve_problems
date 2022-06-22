package sugar_Delivery;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = -1;	
		if(n%5 == 0) {
			res = n/5;
		} else {
			int x = 0;	
			for(int i = n/5; i>=0; i--) {
				x = n - i*5;
				if(x%3 == 0) {
					res = i+ x/3;
					break;
				}
			}
		}
		System.out.println(res);
	}
}
