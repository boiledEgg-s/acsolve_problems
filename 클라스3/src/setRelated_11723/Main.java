package setRelated_11723;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		int total = 0;
		while((m--)>0) {
			String str = br.readLine();
			
			if(str.contains("add")) {
				String[] arr = str.split(" ");
				int x = (int)Math.pow(2, Double.parseDouble(arr[1])-1); //추가하는 수
				total = total | x; //or연산
			} else if(str.contains("remove")) {
				String[] arr = str.split(" ");
				int x = (int)Math.pow(2, Double.parseDouble(arr[1])-1); //제거하는 수
				total = total & (~x); //제거하는 수를 반전시킨 후 and연산
			} else if(str.contains("check")) {
				String[] arr = str.split(" ");
				int x = (int)Math.pow(2, Double.parseDouble(arr[1])-1); //확인하는 수
				if(x == (total&x)) bw.write("1\n");
				else bw.write("0\n");
			} else if(str.contains("toggle")) {
				String[] arr = str.split(" ");
				int x = (int)Math.pow(2, Double.parseDouble(arr[1])-1); //추가 혹은 제거하는 수
				if(x == (total&x)) //있을 경우
					total = total & (~x); //제거
				else 	//없을 경우
					total = total | x;	//추가
			} else if(str.contains("all")) {
				total = 0;
				for(int i = 0; i<20; i++)
					total += (int)Math.pow(2, i);	
			} else if(str.contains("empty")) {
				total = 0;
			} 
		}
		bw.flush();
	}
}
