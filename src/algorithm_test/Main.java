package algorithm_test;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
	}
}

//내가 푼 정답
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length/2;
   
        HashSet<Integer> newNums = new HashSet<>();
        
        //1.배열 내 중복 제거 후 HashSet으로 담기
        for(int i = 0; i < nums.length; i++) {
        	newNums.add(nums[i]);
        }
        
        //2.1번 배열의 길이 = 종류 최댓값
        //예외) 최대 선택 가능한 값을 초과할 순 없음
        if(newNums.size() > count) {
        	answer = count;
        }
        else {
        	answer = newNums.size();
        }
        
        return answer;
    }
}