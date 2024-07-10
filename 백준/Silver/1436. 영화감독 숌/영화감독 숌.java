
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int N = Integer.parseInt(br.readLine());
        int num = 665;

        while (cnt != N){

            num++;

            String check = num+"";

            if(check.contains("666")){
                cnt++;
            }

        }

        if (cnt == N)
            System.out.println(num);

    }
}
