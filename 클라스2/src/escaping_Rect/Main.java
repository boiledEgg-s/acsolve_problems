package escaping_Rect;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		boolean xx = (w/2 > x)?true:false; //x축쪽인가
		boolean yy = (h/2 > y)?true:false; //y축쪽인가
		
		int rex = (xx)?x:w-x;
		int rey = (yy)?y:h-y;
		
		System.out.println((rex<rey)?rex:rey);	
	}
}
