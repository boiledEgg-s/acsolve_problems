package lcm_hcf;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int smaller = (a<b)?a:b;
		
		int lcm = a;
		int hcf = 1;
		int i = 1;
		
		while(true) {
			lcm = a * i++;
			if(lcm%b == 0) {
				break;
			}
		}
		i = 2;
		int aa = a;
		int bb = b;
		int small = (a<b)?a:b;
		while(true) {
			if(aa%small == 0&&bb%small ==0) {
				hcf = small;
				break;
			}
			if(i > aa/2 || i > bb/2) {
				break;
			}
			if(a%i == 0 && b%i == 0) {
				a = a/i;
				b = b/i;
				hcf = hcf*i;
			} else {
				i++;
			}
		}
		System.out.println(hcf);
		System.out.println(lcm);
	}
}
