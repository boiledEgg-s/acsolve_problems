package balanced_World;

import java.io.*;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		Stack<Character> st = new Stack<>();
		while (!str.equals(".")) {
			int index = 0;
			char ch = 0;
			while ((ch = str.charAt(index++)) != '.') {
				switch (ch) {
				case '(':
					st.push(ch);
					break;
				case '[':
					st.push(ch);
					break;
				case ')':
					if (st.isEmpty() || st.peek() == '[') {
						st.push(ch);
						index = str.length()-2;
					}
					else if (st.peek() == ']' || st.peek() == ')')
						st.push(ch);
					else if (st.peek() == '(') {
						st.pop();
					}
					break;
				case ']':
					if (st.isEmpty() || st.peek() == '(') {
						st.push(ch);
						index = str.length()-2;
					}
					else if (st.peek() == ']' || st.peek() == ')')
						st.push(ch);
					else if (st.peek() == '[') 
						st.pop();
					break;
				default:
					break;
				}
			}
			if (st.isEmpty())
				bw.write("yes\n");
			else
				bw.write("no\n");
			st.clear();
			str = br.readLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
