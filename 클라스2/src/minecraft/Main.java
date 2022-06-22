// ���Ʈ���� ����
// ������ ���� ���� �̿��Ͽ� �� 0���� �ִ�������� �����ذ��� ���� �� �񱳸� �����ϴ� ���α׷�
package minecraft;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//����ũ����Ʈ ���� �Է�
		String[] str = br.readLine().split(" ");
		final int N = Integer.parseInt(str[0]); //������ ���� ����
		final int M = Integer.parseInt(str[1]); //������ ���� ����
		final int B = Integer.parseInt(str[2]); //�ʱ� �κ��丮�� ��� ����
		int[][] field = new int[N][M]; //����
		
		for(int i = 0; i<N; i++) {
			str = br.readLine().split(" ");
			for(int j = 0; j<M; j++) {
				field[i][j] = Integer.parseInt(str[j]);
			}
		}
		//���� �Է� �� (����: N / ����: M / �κ��丮 ���: B / ����(int[][]): field)
		
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
