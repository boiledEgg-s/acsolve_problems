//������ Ÿ���� �����ؾ� �Ѵ�.
//���̰� ��������� long���� ����Ұ�
package hashing_Tasks;

import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long l = sc.nextInt();
		String str = sc.next();
		BigInteger M = new BigInteger("1234567891");
		BigInteger R = new BigInteger("31");
		BigInteger h = new BigInteger("0");
	
		for(int i = 0; i<l; i++) {
			BigInteger temp = BigInteger.valueOf(str.charAt(i)-'a'+1);
			h = h.add(R.pow(i).multiply(temp));
		}
		System.out.println(h.mod(M));
	}
}
