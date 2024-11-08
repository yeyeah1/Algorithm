import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        String answer = "";
        
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        Map<Character, Integer> map = new HashMap<>(); 

        //성격 유형마다 점수 0으로 설정
        for (int i = 0; i < type.length; i++) {
            map.put(type[i], 0);
        }

        // survey 순회
        for (int i = 0; i < survey.length; i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);

            if (choices[i] == 4) { // 선택지가 4인 경우 넘어가기
                continue;
                
            } else if (choices[i] < 4) {
                map.put(left, map.get(left) + (4 - choices[i]));
                
            } else {
                map.put(right, map.get(right) + (choices[i] - 4));
            }
        }

        // 점수를 비교해서 answer 문자열에 추가
        for (int i = 0; i < type.length; i += 2) {
            char left = type[i];
            char right = type[i + 1];

            // 왼쪽 선택지의 점수가 더 크거나 같으면 왼쪽 성격 유형 추가
            if (map.get(left) >= map.get(right)) {
                answer += left;
            } else {
                answer += right;
            }
        }

        return answer;
    }
}
