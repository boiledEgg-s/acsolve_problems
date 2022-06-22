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
				int x = (int)Math.pow(2, Double.parseDouble(arr[1])-1); //�߰��ϴ� ��
				total = total | x; //or����
			} else if(str.contains("remove")) {
				String[] arr = str.split(" ");
				int x = (int)Math.pow(2, Double.parseDouble(arr[1])-1); //�����ϴ� ��
				total = total & (~x); //�����ϴ� ���� ������Ų �� and����
			} else if(str.contains("check")) {
				String[] arr = str.split(" ");
				int x = (int)Math.pow(2, Double.parseDouble(arr[1])-1); //Ȯ���ϴ� ��
				if(x == (total&x)) bw.write("1\n");
				else bw.write("0\n");
			} else if(str.contains("toggle")) {
				String[] arr = str.split(" ");
				int x = (int)Math.pow(2, Double.parseDouble(arr[1])-1); //�߰� Ȥ�� �����ϴ� ��
				if(x == (total&x)) //���� ���
					total = total & (~x); //����
				else 	//���� ���
					total = total | x;	//�߰�
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
