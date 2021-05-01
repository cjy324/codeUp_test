package algorithm_test;

public class Main {
	public static void main(String[] args) {
	}		
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int reserveButLostCount = 0;  //시나리오 1. 인원수 카운트
        int reserveSoRentCount = 0;		//시나리오 2. 인원수 카운트
        
        //1.여벌 옷을 갖고 있는 학생이 도난 당하면 더이상 빌려 줄 수 없도록 설정
        for(int i = 0; i < lost.length; i ++) {        //먼저 잃어버린 학생 수 만큼 반복
        	for(int k = 0; k < reserve.length; k ++) { //잃어버린 학생 수 만큼 반복하면서 여벌이 있는 학생 수 만큼 반복
        		if(lost[i] == reserve[k]) {        //만약, 잃어버린 학생 중 여분 학생 번호가 일치하면
        			reserveButLostCount++; 				//
        			lost[i] = -1;			//해당 학생의 번호를 -1로 설정
        			reserve[k] = -1;		//해당 학생의 번호를 -1로 설정
        		}
        	}
        }
        
        //2.옷을 빌려주고 -1로 만들어 뒤의 학생에게는 빌려줄 수 없도록 설정
        for(int i = 0; i < lost.length; i++) {
        	for(int k = 0; k < reserve.length; k++) {
        		if(lost[i] == reserve[k]-1 || lost[i] == reserve[k]+1) {
        			reserveSoRentCount++;
        			lost[i] = -1;
        			reserve[i] = -1;
        		}
        	}
        }

        //총 인원 수 계산 
        //전체 인원 수 - (잃어버린 인원 수 - (시나리오 1. 인원수 + 시나리오 2. 인원수))
        answer = n - (lost.length - (reserveButLostCount + reserveSoRentCount));

        return answer;
    }
}