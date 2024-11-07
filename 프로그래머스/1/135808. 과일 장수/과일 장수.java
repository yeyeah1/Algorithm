import java.io.*;
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int s : score){
            pq.add(s);
        }
        
        // 나올 수 있는 박스 갯수
        int loop = score.length / m;
        
        for(int i = 0; i < loop; i++){
            
            // 들어간 사과 갯수
            int check = 0;
            while(check < m){
                if(!pq.isEmpty()){
                    check++;
                    int now = pq.poll();
                
                    if(check == m) answer += now * m;
                }
            }
            
        }

        return answer;
    }
}