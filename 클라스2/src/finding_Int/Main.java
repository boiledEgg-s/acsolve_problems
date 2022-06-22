package finding_Int;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		sc.nextLine();
		int[] b = new int[m];
		int temp = 0, first = 0, end = m - 1, mid = 0;
		for (int i = 0; i < m; i++) {
			temp = sc.nextInt();
			while (true) {
				mid = (first + end) / 2;
				if (a[mid] == temp) {
					b[i] = 1;
					break;
				} else if (first >= end) {
					break;
				} else if (a[mid] > temp) {
					first = mid + 1;
					continue;
				} else {
					end = mid - 1;
				}
			}
		}

	}

}
