package algorithm_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	}		
}

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        //각 수포자들의 규칙을 배열에 담는다.
        int first[] = {1,2,3,4,5}; //규칙 반복(이하 동일)
        int second[] = {2,1,2,3,2,4,2,5};
        int third[] = {3,3,1,1,2,2,4,4,5,5};
        
        int score[] = new int[3]; //3명의 정답 수를 비교하기 위한 배열 생성
        
        //정답과 비교하여 맞은 것이 있다면 score[]의 값 ++
        for(int i = 0; i < answers.length; i++){ 
        	//i로 각 규칙배열의 길이 값의 나머지를 구하는 이유???
        	//문제에서 answers.length의 값이 최대 10,000으로 설정돼있음
        	//정확한 이유는 모르겠지만
        	//테스트 결과 각 규칙배열의 길이 값의 나머지는 자신의 길이값을 초과할 수 없었음
        	//즉, 각 규칙배열의 범위를 벗어날 일이 발생하지 않음
            if(answers[i] == first[i%first.length]){  
            	score[0]++; //1번의 정답 수 증가
            }
            if(answers[i] == second[i%second.length]){
            	score[1]++; //2번의 정답 수 증가
            }
            if(answers[i] == third[i%third.length]){
            	score[2]++; //3번의 정답 수 증가
            }
        }
        
        //가장 높은 정답 수를 갖은 수포자를 비교하기 위해  
        //List만들어주고 최대값 비교
        //max() 함수는 두 인자 값 중 큰 값을 리턴하는 함수
        //비교하는 두 인자 값이 같을 경우 그 값을 리턴
        List<Integer> clearPerson = new ArrayList<Integer>(); 
        int max = Math.max(Math.max(score[0], score[1]),score[2]);
     
        //ex) score[0],score[1],score[2] 값이 같을 경우 모두 최대값이되므로 
        //clearPerson 리스트에 모두 담아지게 됨
        if(max == score[0]){
        	clearPerson.add(1);
        }
        if(max == score[1]){
        	clearPerson.add(2);
        }
        if(max == score[2]){
        	clearPerson.add(3);
        }
        
        //가장 높은 점수를 받은 사람이 여러명일 경우 오름차순
        //list를 오름차순으로 정렬하기 위해
        //collection과 sort 사용
        Collections.sort(clearPerson); 
        
        
        //list를 다시 int배열로 담기
        answer = new int[clearPerson.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = clearPerson.get(i);
        }
                   
        return answer;
    }

}