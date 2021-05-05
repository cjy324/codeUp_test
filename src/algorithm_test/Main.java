package algorithm_test;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	}
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
   
        //예산 내에서 최대 지원가능하게
        //1. 가장 적은 요청순으로 배열을 정렬
        Arrays.sort(d);
        //2. 반복문을 돌리며 예산-요청 진행
        for(int i = 0; i < d.length; i++) {
        	if(d[i] <= budget) {
        		budget = budget - d[i];
        		answer++;
        	}
        	else {
        		break;
        	}
        }
        
        
        return answer;
    }
}