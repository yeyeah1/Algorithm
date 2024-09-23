import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n);
        
        String[] arr = str.split("");
        
        for(String i : arr){
            answer += Integer.parseInt(i);
        }

        return answer;
    }
}