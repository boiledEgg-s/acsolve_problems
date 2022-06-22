package factorialZERO_1676;

import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger total = new BigInteger("1");
		while(n>0) {
			BigInteger temp = new BigInteger(Integer.toString(n--));
			total = new BigInteger(total.multiply(temp).toString());
		}
		String str = total.toString();
		int i = str.length() -1;
		for(; i>=0; i--) {
			if(str.charAt(i) != '0') break;
		}
		System.out.println(str.length() - i - 1);
	}
}
