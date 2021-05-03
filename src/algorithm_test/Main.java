package algorithm_test;

public class Main {
	public static void main(String[] args) {
	}		
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //참가자 배열에서 완주자명 일치하는 사람은 '완주자'로 필터링
        for(int i = 0; i < completion.length; i++){
            for(int k = 0; k < participant.length; k++){
                if(completion[i].equals(participant[k])){
                	participant[k] = "완주자";
                    break;
                }
            }
        }
        
      //필터링된 참가자 배열에서 미완주자 뽑기
        for(int i = 0; i < participant.length; i++){
        	if(!participant[i].equals("완주자")) {
        		answer = participant[i];
        		break;
        	}
        }
        
        return answer;
    }
}