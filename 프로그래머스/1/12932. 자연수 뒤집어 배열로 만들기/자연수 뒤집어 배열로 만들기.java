class Solution {
    public int[] solution(long n) {
        
        String[] arr = String.valueOf(n).split(""); // [1,2,3,4,5]
        
        int len = arr.length;
        
        int[] answer = new int[len]; 
        
        for(int i = 1; i < len; i++){
            answer[len-i] = Integer.parseInt(arr[i-1]);
        }
        answer[0] = Integer.parseInt(arr[len-1]);
        
        return answer;
    }
}