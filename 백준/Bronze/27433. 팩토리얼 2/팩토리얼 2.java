
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int res;

	public static void main(String[] args) throws IOException {
		// N!을 구하는 재귀함수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		System.out.println(fact(N));
	}//

	static long fact(int n) {
		// 기저
		if (n <= 1) {
			return 1;
		}

		// 재귀
		fact(n - 1);
		return n * fact(n - 1);

	}

}
