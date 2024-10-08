import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int T = commands.length;
        
        for(int tc = 0; tc < T; tc++){
            
            int start = commands[tc][0];
            int end = commands[tc][1];
            int k = commands[tc][2];
            
            int length = end - start + 1;
            
            int[] cut = new int[length];
            
            
            for(int i = 0; i < length; i++){
                
                cut[i] = array[start - 1];
                
                start++;
                    
            }
            
            
            Arrays.sort(cut);
            
            answer[tc] = cut[k-1];
            
        } // tc
        
        
        
        return answer;
    }
}