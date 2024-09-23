class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int length = arr.length;
        
        for(int i : arr){
            answer += i;
        }
        
        answer = answer / length;
        
        return answer;
    }
}