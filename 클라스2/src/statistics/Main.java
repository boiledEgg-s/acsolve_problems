//최빈값은 배열을 이용하여 고정 인덱스를 사용한 빈도수 찾는 방식을 사용하였다.
package statistics;

import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int[] freq = new int[8001];
        int total = 0;
        int temp = 0;
        for(int i = 0; i<n; i++) {
        	temp = Integer.parseInt(br.readLine());
        	total += temp;
        	freq[temp+4000]++;
        	nums[i] = temp;
        }
        Arrays.sort(nums);
        bw.write(Math.round((double)total/n)+"\n"+nums[nums.length/2]+"\n");	//산술평균, 중앙값 범위(nums[nums.length-1] - nums[0])
        
        int first = freq.length-1, second = -1;
        for(int i = freq.length - 2; i>= 0 ; i--) {
        	if(freq[first] < freq[i]) {
        		first = i;
        		second = -1;
        	} else if(freq[first] == freq[i]) {
        		second = first;
        		first = i;
        	}
        }
        bw.write(((second == -1)?first-4000:second-4000)+"\n"+(nums[nums.length-1] - nums[0]));
        bw.flush();
    }
}
