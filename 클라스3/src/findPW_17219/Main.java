package findPW_17219;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		Map<String, String> passwords = new HashMap<String, String>();

		while((n--)>0) {
			str = br.readLine().split(" ");
			passwords.put(str[0], str[1]);
		}
		while((m--)>0) {
			bw.write(passwords.get(br.readLine()) + "\n");
		}
		bw.flush();
	}
}
