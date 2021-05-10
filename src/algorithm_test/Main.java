package algorithm_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	}
}

//나의 풀이
class Solution {
	public int[] solution(int[] answers) {
        int[] answer = {};
		int[] f = {1,2,3,4,5};
		int[] s = {2,1,2,3,2,4,2,5};
		int[] t = {3,3,1,1,2,2,4,4,5,5};
		
		//맞힌 갯수 
		int[] score = {0,0,0}; 
	
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == f[i%f.length]) {
				score[0]++;
			}
			if(answers[i] == s[i%s.length]) {
				score[1]++;
			}
			if(answers[i] == t[i%t.length]) {
				score[2]++;
			}
		}
		
		int topScore = Math.max(Math.max(score[0], score[1]), score[2]);
		
		List<Integer> topScores = new ArrayList<>(); 
		
		if(score[0] == topScore) {
			topScores.add(1);
		}
		if(score[1] == topScore) {
			topScores.add(2);
		}
		if(score[2] == topScore) {
			topScores.add(3);
		}
		
		answer = new int[topScores.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = topScores.get(i);
		}
		Arrays.sort(answer);
        
		return answer;
	}
}

