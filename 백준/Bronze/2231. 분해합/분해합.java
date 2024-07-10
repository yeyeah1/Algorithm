
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int res = 0; //생성자가 없는 경우 0 출력

        for(int i = 1; i < N; i++){

            String num = i+"";

            char[] arr = new char[num.length()];

            int sum = 0;

            for(int j = 0; j < arr.length; j++){
                arr[j] = num.charAt(j);

                sum += arr[j]-'0';

            }

            if(sum + i == N){
                res = i;
                break;
            }

        }//for

        System.out.println(res);

    }//main
}
