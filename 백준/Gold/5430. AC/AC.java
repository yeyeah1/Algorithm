
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

        int T = Integer.parseInt(br.readLine());

        loop:
        for (int tc = 1; tc <= T; tc++) {

            String str = br.readLine();

            int comLen = str.length();

            Deque<Integer> deque = new LinkedList<>();

            String[] command = str.split("");

            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            for (int i = 0; i < N; i++) {
                deque.offer(Integer.parseInt(st.nextToken()));
            }

            boolean flag = false; // false -> first, true -> last

            for (int i = 0; i < comLen; i++) {

                String now = command[i];

                switch (now) {

                    case "R":
                        if (flag) {
                            flag = false;
                        } else {
                            flag = true;
                        }
                        break;

                    case "D":
                        if (deque.isEmpty()) {
                            sb.append("error").append("\n");
                            continue loop;
                        } else {
                            if (flag) {
                                deque.pollLast();
                            } else {
                                deque.pollFirst();
                            }
                        }

                        break;
                } // switch
            } // command

            // 출력

            sb.append("[");

            int size = deque.size();

            for(int i = 0; i < size; i++){

                if(!flag) {
                    sb.append(deque.pollFirst());
                } else {
                    sb.append(deque.pollLast());
                }

                if(i != size -1){
                    sb.append(",");
                }
            }

            sb.append("]").append("\n");

        } // tc

        System.out.println(sb.toString());

    } // main
}
