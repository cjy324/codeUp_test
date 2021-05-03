package algorithm_test;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	}		
}


//두 배열을 정렬했을 때 완주 못하는 사람이 participant배열의 마지막에 있을 경우, 
//for문의 if문은 실행되지 않아요. 
//이 경우 리턴해야 할 건participant[마지막]이라서 for문 이후에 리턴해주는거에요
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int i;
        
        //sort 함수로 오름차순 정렬(효율성 증대)
        Arrays.sort(participant);//[a,a,b,c,d,e]
        Arrays.sort(completion);///[a,b,c,d,e]
        
        for(i = 0; i < completion.length; i++) {
        	//i=1일 경우
        	if(!completion[i].equals(participant[i])) {
        		//b != a
        		return answer = participant[i];
        		//answer = participant[1] 즉, a가 리턴됨 끝....
        		//답인데 이해가 안됨...
        	}
        }
        
        answer = participant[i];
        return answer;
    }
}