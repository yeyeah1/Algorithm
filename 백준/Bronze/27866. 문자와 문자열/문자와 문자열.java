
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] arr = str.split("");
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(arr[n-1]);
		
	}
}
