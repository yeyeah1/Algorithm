import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> stack3 = new Stack<>();
		Stack<Integer> stack4 = new Stack<>();
		Stack<Integer> stack5 = new Stack<>();
		Stack<Integer> stack6 = new Stack<>();

		int cnt = 0;
		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine(), " ");

			int num = Integer.parseInt(st.nextToken());
			int fret = Integer.parseInt(st.nextToken());

			switch (num) {
			case 1:
				if (!stack1.isEmpty()) {
					// 누르고 있는 음 중에 가장 높은 음이 프렛보다 작다면 push
					if (stack1.peek() < fret) {
						stack1.push(fret);
						cnt++;
						// 프렛보다 크다면
					} else if (stack1.peek() > fret) {

						// 프렛보다 큰 동안 pop
						while (!stack1.isEmpty() && stack1.peek() > fret) {
							stack1.pop();
							cnt++;
						}

						if (!stack1.isEmpty() && stack1.peek() < fret || stack1.isEmpty()) {
							// 다하면 push
							stack1.push(fret);
							cnt++;
						} else
							break;
					} else
						break; // 같으면 넘어감

				} else {
					stack1.push(fret);
					cnt++;
				}

				break;

			case 2:
				if (!stack2.isEmpty()) {
					// 누르고 있는 음 중에 가장 높은 음이 프렛보다 작다면 push
					if (stack2.peek() < fret) {
						stack2.push(fret);
						cnt++;
						// 프렛보다 크다면
					} else if (stack2.peek() > fret) {

						// 프렛보다 큰 동안 pop
						while (!stack2.isEmpty() && stack2.peek() > fret) {
							stack2.pop();
							cnt++;
						}

						if (!stack2.isEmpty() && stack2.peek() < fret || stack2.isEmpty()) {
							// 다하면 push
							stack2.push(fret);
							cnt++;
						} else
							break;
					} else
						break; // 같으면 넘어감

				} else {
					stack2.push(fret);
					cnt++;
				}

				break;

			case 3:
				if (!stack3.isEmpty()) {
					// 누르고 있는 음 중에 가장 높은 음이 프렛보다 작다면 push
					if (stack3.peek() < fret) {
						stack3.push(fret);
						cnt++;
						// 프렛보다 크다면
					} else if (stack3.peek() > fret) {

						// 프렛보다 큰 동안 pop
						while (!stack3.isEmpty() && stack3.peek() > fret) {
							stack3.pop();
							cnt++;
						}

						if (!stack3.isEmpty() && stack3.peek() < fret || stack3.isEmpty()) {
							// 다하면 push
							stack3.push(fret);
							cnt++;
						} else
							break;
					} else
						break; // 같으면 넘어감

				} else {
					stack3.push(fret);
					cnt++;
				}

				break;

			case 4:
				if (!stack4.isEmpty()) {
					// 누르고 있는 음 중에 가장 높은 음이 프렛보다 작다면 push
					if (stack4.peek() < fret) {
						stack4.push(fret);
						cnt++;
						// 프렛보다 크다면
					} else if (stack4.peek() > fret) {

						// 프렛보다 큰 동안 pop
						while (!stack4.isEmpty() && stack4.peek() > fret) {
							stack4.pop();
							cnt++;
						}

						if (!stack4.isEmpty() && stack4.peek() < fret || stack4.isEmpty()) {
							// 다하면 push
							stack4.push(fret);
							cnt++;
						} else
							break;
					} else
						break; // 같으면 넘어감

				} else {
					stack4.push(fret);
					cnt++;
				}

				break;

			case 5:
				if (!stack5.isEmpty()) {
					// 누르고 있는 음 중에 가장 높은 음이 프렛보다 작다면 push
					if (stack5.peek() < fret) {
						stack5.push(fret);
						cnt++;
						// 프렛보다 크다면
					} else if (stack5.peek() > fret) {

						// 프렛보다 큰 동안 pop
						while (!stack5.isEmpty() && stack5.peek() > fret) {
							stack5.pop();
							cnt++;
						}

						if (!stack5.isEmpty() && stack5.peek() < fret || stack5.isEmpty()) {
							// 다하면 push
							stack5.push(fret);
							cnt++;
						} else
							break;
					} else
						break; // 같으면 넘어감

				} else {
					stack5.push(fret);
					cnt++;
				}

				break;
				
			case 6:
				if (!stack6.isEmpty()) {
					// 누르고 있는 음 중에 가장 높은 음이 프렛보다 작다면 push
					if (stack6.peek() < fret) {
						stack6.push(fret);
						cnt++;
						// 프렛보다 크다면
					} else if (stack6.peek() > fret) {

						// 프렛보다 큰 동안 pop
						while (!stack6.isEmpty() && stack6.peek() > fret) {
							stack6.pop();
							cnt++;
						}

						if (!stack6.isEmpty() && stack6.peek() < fret || stack6.isEmpty()) {
							// 다하면 push
							stack6.push(fret);
							cnt++;
						} else
							break;
					} else
						break; // 같으면 넘어감

				} else {
					stack6.push(fret);
					cnt++;
				}

				break;

			}// switch

		} // N개의 음

		System.out.println(cnt);
	}// main

}
