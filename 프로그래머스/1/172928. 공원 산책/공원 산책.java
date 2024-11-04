class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int r = park.length;
        int c = park[0].length();
        
        // 지도 만들기
        char[][] map = new char[r][c]; 
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                map[i][j] = park[i].charAt(j);
            }
        }
        
        // 시작 위치 찾기
        int startX = 0;
        int startY = 0;
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(map[i][j] == 'S'){
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }
        
        // 산책
        int x = startX;
        int y = startY;
        
        for(String route : routes){
            String[] navi = route.split(" ");
            
            String dir = navi[0]; // 방향
            int dis = Integer.parseInt(navi[1]); // 거리
            
            // 명령어 수행 전 위치
            int nowX = x;
            int nowY = y;
            
            for(int d = 0; d < dis; d++){
                
                // 방향이동 먼저 하고
                if (dir.equals("N")) nowX--; // 북
                    else if (dir.equals("S")) nowX++; // 남
                    else if (dir.equals("W")) nowY--; //서
                    else if (dir.equals("E")) nowY++; // 동
                
                // 지도 밖으로 나가거나 장애물 만나면 돌아가기
                if(nowX < 0 || nowX >= r || nowY < 0 || nowY >= c || map[nowX][nowY] == 'X'){
                    nowX = x;
                    nowY = y;
                    break;
                }
            }
            
            // 명령 수행했으면 시작위치 바꾸기
            x = nowX;
            y = nowY;
        }
        
        int[] answer = {x,y};
        
        return answer;
    }
}