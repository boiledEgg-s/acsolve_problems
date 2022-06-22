// 브루트포스 문제
// 범위가 낮은 것을 이용하여 걍 0부터 최대범위까지 대입해가며 연산 후 비교를 수행하는 프로그램
package minecraft;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//마인크래프트 정보 입력
		String[] str = br.readLine().split(" ");
		final int N = Integer.parseInt(str[0]); //집터의 세로 길이
		final int M = Integer.parseInt(str[1]); //집터의 가로 길이
		final int B = Integer.parseInt(str[2]); //초기 인벤토리의 블록 개수
		int[][] field = new int[N][M]; //집터
		
		for(int i = 0; i<N; i++) {
			str = br.readLine().split(" ");
			for(int j = 0; j<M; j++) {
				field[i][j] = Integer.parseInt(str[j]);
			}
		}
		//정보 입력 끝 (세로: N / 가로: M / 인벤토리 블록: B / 집터(int[][]): field)
		
		int max = 0;
		int minTime = Integer.MAX_VALUE;
		for(int f = 0; f<=256; f++) {
			int time = 0;
			int block = B;
			
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<M; j++) {
					int diff = field[i][j] - f;
					block += diff;
					if(diff > 0) {
						time += diff*2;
					}else {
						time += diff*(-1);
					}
				}
			}
			if(block < 0) {
				continue;
			} else {
				if(time < minTime) {
					minTime = time;
					max = f;
				} else if(time == minTime) {
					max = (f > max)?f:max;
				}
			}
		}
		System.out.println(minTime+" "+max);
	}
}
