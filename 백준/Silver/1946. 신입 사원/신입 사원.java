
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			int N = Integer.parseInt(br.readLine());

			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {

				st = new StringTokenizer(br.readLine(), " ");

				int index = Integer.parseInt(st.nextToken());
				int value = Integer.parseInt(st.nextToken());

				arr[index - 1] = value;

			} // 등수 입력

			int set = arr[0]; // 서류전형 1등한 사람의 면접 등수
			int cnt = 1;

			for (int i = 1; i < N; i++) {

				if (arr[i] < set) {
					cnt++;
					set = arr[i];
				}

			}
			System.out.println(cnt);
		} // tc

	}// main

}
