//소수를 찾을 땐, 절반이 아니라 루트값으로 찾는다.
package finding_Prime;

import java.io.*;

public class Main {

	static boolean checkPrime(int n) {
		if(n <= 1) return false;
		for(int div = 2; div <= Math.sqrt(n); div++) {
			if((n%div) == 0) return false;
		}
		return true;	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("\\s");
		int l = Integer.parseInt(str[0]);
		int r = Integer.parseInt(str[1]);
		for(int i = l; i<=r; i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
