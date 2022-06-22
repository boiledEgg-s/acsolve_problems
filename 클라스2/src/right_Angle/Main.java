package right_Angle;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		int[] a = new int[3];
		while(true) {
			str = br.readLine();
			if(str.trim().equals("0 0 0")) {
				break;
			}
			String[] strr = str.split("\\s");
			int max = 0;
			for(int i = 0; i<3; i++) {
				a[i] = Integer.parseInt(strr[i]);
				if(a[max] < a[i]) {
					max = i;
				}
			}
			
			int sum = 0;
			for(int j = 0; j < 3; j++) {
				if(j == max) {
					continue;
				}
				sum += a[j]*a[j];
			}
			if(a[max]*a[max] == sum) {
				bw.write("right\n");
			}else {
				bw.write("wrong\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
