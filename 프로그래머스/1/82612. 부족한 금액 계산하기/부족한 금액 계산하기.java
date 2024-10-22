class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long check = 0;
        int i = 1;
        while(i <= count) {
            check += price * i;
            i++;
        }
        
        if(check > money){
            answer = check - money;
        }

        return answer;
    }
}