package valid_Parenthesis;
import java.io.*;
import java.util.*;

public class Main {

	static boolean checkVPS(String s) {
		Stack<Character> a = new Stack<Character>();
		for(char i:s.toCharArray()) {
			if(i =='(') a.add(i);
			else if(i == ')') {
				if(a.empty()||a.peek() == ')') a.add(i);
				else a.pop();
			}
		}
		if(a.empty()) return true;
		else return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String str = "";
		for(int i = 0; i<n; i++) {
			str = br.readLine();
			if(checkVPS(str)) bw.write("YES\n");
			else bw.write("NO\n");
		}
		bw.flush();
	}
}
