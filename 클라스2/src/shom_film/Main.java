/*
 * 666이 들어가는 이름바 '종말의 숫자'의 오름차순 구하기
 */
package shom_film;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //숌의 n번째 영화제목
		sc.close();
		
		int num = 666;
		String str = "666";
		int count = 0;
		while(true) {
			str = Integer.toString(num);
			if(str.contains("666"))
				count++;
			if(count == n) {
				break;
			}
			num++;
		}
		System.out.println(num);
	}

}
