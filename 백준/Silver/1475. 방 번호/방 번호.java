

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] set = new int[9]; // 0 ~ 8

        ArrayList<Integer> number = new ArrayList<>();

        while (N > 0) {
            number.add(N % 10);
            N /= 10;
        }

        for (int i = 0; i < number.size(); i++) {

            switch (number.get(i)) {

                case 0:
                    set[0]++;
                    break;

                case 1:
                    set[1]++;
                    break;

                case 2:
                    set[2]++;
                    break;

                case 3:
                    set[3]++;
                    break;

                case 4:
                    set[4]++;
                    break;

                case 5:
                    set[5]++;
                    break;

                case 6:
                    set[6]++;
                    break;

                case 7:
                    set[7]++;
                    break;

                case 8:
                    set[8]++;
                    break;

                case 9:
                    set[6]++;
                    break;


            } // switch

        }

        if (set[6] % 2 != 0) {
            set[6] = set[6] / 2 + 1;
        } else {
            set[6] = set[6] / 2;
        }

        int ans = 0;
        for (int i = 0; i < 9; i++) {
            ans = Math.max(ans, set[i]);
        }

        System.out.println(ans);

    }
}
