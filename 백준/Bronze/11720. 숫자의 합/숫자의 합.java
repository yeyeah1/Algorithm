
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        String[] arr2 = br.readLine().split("");

        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(arr2[i]);

            cnt += arr[i];
        }

        System.out.println(cnt);

    }
}
