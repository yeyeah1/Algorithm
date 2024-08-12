import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();

        int command = Integer.parseInt(br.readLine());

        for (int i = 0; i < command; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            String now = st.nextToken();

            switch (now) {

                case "push_front":
                    int x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                    break;

                case "push_back":
                    int y = Integer.parseInt(st.nextToken());
                    deque.addLast(y);
                    break;

                case "pop_front":
                    if (deque.size() != 0) {
                        int first = deque.pollFirst();
                        sb.append(first).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;

                case "pop_back":
                    if (deque.size() != 0) {
                        int last = deque.pollLast();
                        sb.append(last).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;

                case "size":
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;

            } // switch

        }

        System.out.println(sb.toString());
    } // main
}
