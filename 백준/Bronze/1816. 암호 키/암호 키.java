
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= N; tc++){

            long x = Long.parseLong(br.readLine());

            for(long i = 2; i <= 1000000; i++) {
                if (x % i == 0) {
                    System.out.println("NO");
                    break;
                } else if (i == 1000000) {
                    System.out.println("YES");
                }
            }

        }//tc


    }

}
