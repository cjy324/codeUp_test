package algorithm_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	}		
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> rss = new ArrayList<>();
        
        //1. 각 인덱스에서 뽑아 더하기
        for(int i = 0; i < numbers.length; i++){
        	//동일한 배열을 재료로 이중반복을 돌리는 것이므로
        	//두번째 반복문의 시작점은 첫번째 반복문의 시작점보다 1이 커야 함
            for(int k = i+1; k < numbers.length; k++){
                int x = numbers[i]+numbers[k];
                //2. 더한값 중 같은 값은 거르기
                // indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환
                // 만약 일치값을 찾지 못했을 경우 "-1"을 반환
                // 따라서 rss에 기존 일치값이 없는 경우 새로 추가하는 방식
                if(rss.indexOf(x) < 0){
                    rss.add(x);   
                }
            }
        }
    
        //3. 모든 값을 배열에 담기(오름차순)
        answer = new int[rss.size()];
        
        for(int l = 0; l < answer.length; l++){
            answer[l] = rss.get(l);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}