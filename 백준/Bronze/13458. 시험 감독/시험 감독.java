import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 시험장의 수

		int[] student = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			student[i] = Integer.parseInt(st.nextToken());
		} // 학생들 교실에 담아주기

		st = new StringTokenizer(br.readLine(), " ");
		int supervisor1 = Integer.parseInt(st.nextToken()); // 총감독관이 감시할 학생 수
		int supervisor2 = Integer.parseInt(st.nextToken()); // 부감독관이 감시할 학생 수

		long res = N; // 최종적으로 필요한 감독관의 수

		int i = 0;
		while (i < N) {

			if (student[i] > 0) {
				
				student[i] -= supervisor1;
				
				if(student[i] < 0) continue;

				res += student[i] / supervisor2;

				if (student[i] % supervisor2 != 0) {
					res++;
				}


			}
			i++;
		}

		System.out.println(res);

	}// main

}
