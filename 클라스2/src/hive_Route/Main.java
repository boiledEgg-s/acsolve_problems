/*
 			****벌집에서의 최단거리****
 1. 가운데는 1이고, 이웃하는 방에 돌아가면서 방번호가 1씩 증가한다.
 2. 겉의 크기는 6의 배수로 는다.
    예) 가운데-1, 다음-7, 다음-19, 다음-28
  			-6-    -12-    -18-
 3. 따라서 1에서부터 더해서 단계를 비교 혹은 줄여가면서 비교 
 */
package hive_Route;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int i = 0;
		int begin = 1;
		int end = 1;
		while(true) {
			if(n >= begin && n <= end) {
				break;
			}
			begin = end+1;
			end += (++i)*6;
		}
		System.out.println(i+1);
	}
}
