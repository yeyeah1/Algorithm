import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		String[][] score = new String[20][3];
		
		
		for(int i = 0; i < 20; i++) {
			st= new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				score[i][j] = st.nextToken();
			}
		} // 성적 정보 받아오기
		
		double[][] score2 = new double[20][2];
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0, k = 1; j < 2; j++,k++) {
//				score2[i][j] = Double.parseDouble(score[i][k]);
				
				switch(score[i][k]) {
				
				case "A+" : score2[i][j] = 4.5; break;
				case "A0" : score2[i][j] = 4.0; break;
				case "B+" : score2[i][j] = 3.5; break;
				case "B0" : score2[i][j] = 3.0; break;
				case "C+" : score2[i][j] = 2.5; break;
				case "C0" : score2[i][j] = 2.0; break;
				case "D+" : score2[i][j] = 1.5; break;
				case "D0" : score2[i][j] = 1.0; break;
				case "F" : score2[i][j] = 0.0; break;
				case "P" : score2[i][0] = 0.0; break;
				default : score2[i][j] = Double.parseDouble(score[i][k]);

				}
			}
		}
		
		double[][] res = new double[20][1];
		
		double sum = 0;
		
		for(int i = 0, k = 0; i < 20; i++) {
				res[i][k] = score2[i][0] * score2[i][1];
				sum += score2[i][0];
		} // 학점 x 과목평점
		
		double result = 0;
		
		for(int i = 0; i < 20; i++) {
			result += res[i][0];
		}
		
		result = result / sum;
		System.out.println(result);
		
	}

}
