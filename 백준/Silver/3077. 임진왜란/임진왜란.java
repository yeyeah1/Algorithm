
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {

            map.put(st.nextToken(), i); //해전 이름, 순서


        }//for

        int ans = 0; //정답 맞은 갯수

        st = new StringTokenizer((br.readLine()), " ");
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        } //비교할 답 배열에 넣어줌

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (map.get(arr[i]) < map.get(arr[j]))
                    ans++;
            }
        }

        System.out.println(ans + "/" + (N * (N - 1) / 2));

    }//main
}
