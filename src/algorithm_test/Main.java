package algorithm_test;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	}		
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        //0. commands안에 들어있는 배열의 조건 꺼내오기..
        for(int i = 0; i < commands.length; i++) {
        	//commands[i][0] 자르기 시작점
        	//commands[i][1] 자르기 끝점
        	//commands[i][2] 찾을 값의 인덱스

            //1. array 자르기
        	//copyOfRange(자를 대상 배열, 시작점인덱스, 끝점인덱스)
        	//copyOfRange는 시작인덱스는 포함하고, 종료인덱스는 포함하지 않는다.
        	//따라서, 끝점인덱스의 값은 -1을 하면 안된다.
        	int[] tempArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        
        	//2. 정렬
        	//오름차순으로 정렬
        	Arrays.sort(tempArray);
        	
        	//3. 해당 인덱스의 값 출력	
        	answer[i] = tempArray[commands[i][2]-1]; 	
        }
       
        return answer;
    }
}