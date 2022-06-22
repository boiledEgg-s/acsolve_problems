// 올바른 체스판이랑 선택한 범위의 체스판을 비교하여 틀린부분의 개수를 파악하여 서로 비교하는 방식이다.
package chess_Coloring;

import java.util.*;
import java.io.*;
public class Main {
	static final char[][] BLACK = {
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'}
	};
	static final char[][] WHITE = {
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'}
	};
	
	public static int check(char[][] chess,int n, int m) {
		int countB = 0, countW = 0;
		for(int i = 0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				if(chess[n+i][m+j] != BLACK[i][j]) {
					countB++;
				}
				if(chess[n+i][m+j] != WHITE[i][j]) {
					countW++;
				}
			}
		}
		return (countW<countB)?countW:countB;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		char[][] chess = new char[n][m];
		int count = 32;
		
		for(int i = 0; i<n; i++) {
			String str = sc.nextLine();
			chess[i] = str.toCharArray();
		}
		for(int i = 0; i<n-7; i++) {
			for(int j = 0; j<m-7; j++) {
				int temp = check(chess, i, j);
				if(temp == 0) {
					count = temp;
					break;
				}
				count = (count>temp)?temp:count;
			}
		}
		System.out.println(count);
	}
	/*public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("String.txt"));
		
		String s = sc.nextLine();
		String[] nm = s.split("\\s");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		char[][] chess = new char[n][m];
		int k =0;
		while(sc.hasNextLine()) {
			s = sc.nextLine();
			chess[k++] = s.toCharArray();
		}
		int count = 32;
		for(int i = 0; i<n-7; i++) {
			for(int j = 0; j<m-7; j++) {
				int temp = check(chess, i, j);
				if(temp == 0) {
					count = temp;
					break;
				}
				count = (count>temp)?temp:count;
			}
		}
		System.out.println(count);
	}*/
}
