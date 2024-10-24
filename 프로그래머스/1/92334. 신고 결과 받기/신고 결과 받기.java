import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // map에 유저 정보 넣기 (id를 idx로 매핑)
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++){
            map.put(id_list[i], i);
        } 
        
        
        // 각 유저가 신고한 유저를 저장하는 map (중복 방지를 위한 Set) -> 동일한 유저에 대한 ~~
        Map<String, Set<String>> reportMap = new HashMap<>();
        for (String user : id_list) {
            reportMap.put(user, new HashSet<>()); // 각 유저의 신고 목록
        }
        
        
        // 신고 처리
        Map<String, Integer> reportCountMap = new HashMap<>(); // 각 유저가 신고 당한 횟수를 저장할 map
        
        for(String rep : report){
            StringTokenizer st = new StringTokenizer(rep, " ");
            
            String from = st.nextToken(); // 신고한 유저
            String to = st.nextToken(); // 신고당한 유저
            
            
            // 신고한 유저가 중복 신고하지 않았다면 처리
            if (reportMap.get(from).add(to)) {
                reportCountMap.put(to, reportCountMap.getOrDefault(to, 0) + 1);
            }
        }
        
        
        // 정지된 유저 목록
        Set<String> bannedList = new HashSet<>();
        for (String user : reportCountMap.keySet()) {
            if (reportCountMap.get(user) >= k) {
                bannedList.add(user);
            }
        }
        
        
        // 결과 메일 수 카운트
        for (String user : id_list) {
            
            Set<String> reportedUsers = reportMap.get(user); // 유저가 신고한 유저들
            
            for (String reportedUser : reportedUsers) {
                
                if (bannedList.contains(reportedUser)) {
                    answer[map.get(user)]++; // 메일 받는 횟수 증가
                }
            }
        }
        
        
        return answer;
    }
}