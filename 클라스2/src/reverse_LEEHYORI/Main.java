package reverse_LEEHYORI;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		
		while(true){
			str = br.readLine();
			if(str.equals("0")) {
				break;
			}
			char[] temp = new char[str.length()];
			int i = str.length()-1, j = 0;
			for(; j<str.length(); i--, j++) {
				temp[j] = str.charAt(i);
			}
			String t = new String(temp);
			if(str.equals(t)) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
