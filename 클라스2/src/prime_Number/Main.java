package prime_Number;

import java.io.*;

public class Main {

	static boolean checkPrime(int n) {
		if(n == 1) return false;
		int div = 2;
		while(div <= n/2) {
			if(n%div == 0) return false;
			div++;
		}
		return true;	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int num = 0;
		String[] str = br.readLine().split("\\s");
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(str[i]);
			if(checkPrime(arr[i])) num++;
		}
		bw.write(Integer.toString(num));
		bw.flush();
	}
}
