/*
 			****���������� �ִܰŸ�****
 1. ����� 1�̰�, �̿��ϴ� �濡 ���ư��鼭 ���ȣ�� 1�� �����Ѵ�.
 2. ���� ũ��� 6�� ����� �´�.
    ��) ���-1, ����-7, ����-19, ����-28
  			-6-    -12-    -18-
 3. ���� 1�������� ���ؼ� �ܰ踦 �� Ȥ�� �ٿ����鼭 �� 
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
