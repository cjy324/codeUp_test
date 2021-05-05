package algorithm_test;

import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
	}		
}

// 내가 푼 방식
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        Integer[] nums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
       
        //1. 배열 값들을 오름차순으로 정렬
        Arrays.sort(nums, Collections.reverseOrder());        
        for(int i = 0; i < nums.length; i++){
            answer += Integer.toString(nums[i]);
        }
        //3. String으로 붙이기
        return answer;
    }
}