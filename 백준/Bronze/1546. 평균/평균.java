
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        long sum = 0;
        long max = -1;

        for(int i = 0; i < N; i++){

            int now = Integer.parseInt(arr[i]);

            max = Math.max(max, now);

            sum += now;

        }

        System.out.println(sum  * 100.0 / max / N);

    }
}
