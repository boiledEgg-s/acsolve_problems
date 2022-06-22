/*
 ****테이블 형식 데이터에서 덧셈****


 */

package president_Wannabe;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str = "";
		
		for(int i = 0; i<t; i++) {
			int k = sc.nextInt(); //층
			int n = sc.nextInt(); //호수
			int[] temp = new int[n];
			for(int index = 0; index <n; index++) {
				temp[index] = index+1;
			}
			for(int j = 1; j<=k; j++) {
				for(int l = 1; l<n; l++) {
					temp[l] = temp[l-1]+temp[l];
				}
			}
			str += temp[n-1]+"\n";
		}
		System.out.println(str);
		sc.close();
	}
}
