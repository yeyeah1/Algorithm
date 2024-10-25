import java.io.*;
import java.util.*;

class Solution {
    public int solution(String s) {
        
        String[] arr = s.split("");
        
        Queue queue = new LinkedList<>();
        String tmp = "";
        
        loop : for(String st : arr){
            
            switch(st){
                    
                case "1","2","3","4","5","6","7","8","9","0" : // 숫자는 stack add
                    queue.add(st);
                    continue;
                    
                default :
                    tmp += st;
                    
                    switch(tmp){
                        case "zero" :
                            queue.add("0");
                            tmp = "";
                            continue loop;
                            
                        case "one" :
                            queue.add("1");
                            tmp = "";
                            continue loop;
                            
                        case "two" :
                            queue.add("2");
                            tmp = "";
                            continue loop;
                            
                        case "three" :
                            queue.add("3");
                            tmp = "";
                            continue loop;
                            
                        case "four" :
                            queue.add("4");
                            tmp = "";
                            continue loop;
                            
                        case "five" :
                            queue.add("5");
                            tmp = "";
                            continue loop;
                            
                        case "six" :
                            queue.add("6");
                            tmp = "";
                            continue loop;
                            
                        case "seven" :
                            queue.add("7");
                            tmp = "";
                            continue loop;
                            
                        case "eight" :
                            queue.add("8");
                            tmp = "";
                            continue loop;
                            
                        case "nine" :
                            queue.add("9");
                            tmp = "";
                            continue loop;
                    }
            } // switch
        } // for
        
        tmp = "";
        while(!queue.isEmpty()){
            tmp += queue.poll();
        }
        
        int answer = Integer.parseInt(tmp);
        
        return answer;
    }
}