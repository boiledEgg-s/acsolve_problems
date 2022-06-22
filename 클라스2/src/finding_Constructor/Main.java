package finding_Constructor;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String nstr = Integer.toString(num);
		int s = nstr.length()*9;
		int temp = 0;
		
		int i = 0;
		for(i = num - s; i<num; i++) {
			temp = i;
			nstr = Integer.toString(i);
			for(int j = 0; j<nstr.length(); j++) {
				temp += (int)nstr.charAt(j) - '0'; 
			}
			if(temp == num)
				break;
			if(i == num-1) {
				i = 0;
				break;
			}
		}
		System.out.println(i);
		sc.close();
	}
}
