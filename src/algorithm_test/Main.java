package algorithm_test;

public class Main {
	public static void main(String[] args) {
	}		
}

// 내가 푼 정답
class Solution1 {
    public String solution(String s) {
        String answer = "";
        
        //String 길이가 짝수인 경우
        if(s.length()%2 == 0) {
        	answer = s.substring(s.length()/2-1, s.length()/2+1);
        }
        //String 길이가 홀수인 경우
        if(s.length()%2 != 0) {
        	int index = (int) Math.floor(s.length()/2);
        	answer = s.substring(index,index+1);
        }
        
        return answer;
    }
}

// 더 간결한 정답
class Solution2 {
    public String solution(String s) {
        String answer = "";
        //나는 소수점 걱정을 했는데 substring()함수에 들어가는 index는 
        //기본적으로 정수로 치환이 되는건가??
        answer = s.substring((s.length()-1)/2, (s.length()/2)+1);
        
        return answer;
    }
}