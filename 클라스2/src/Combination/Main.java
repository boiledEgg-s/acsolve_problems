package Combination;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int total = 1;
		int div = 1;
		for(int i = 0; i< k; i++) {
			total *= n-i;
			div *= (i+1);
		}
		System.out.println(total/div);
		
	}

}
