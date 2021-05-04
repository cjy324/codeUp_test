package algorithm_test;

public class Main {
	public static void main(String[] args) {
	}		
}

// 내가 푼 방식(정확성 X/효율성 X) - 일부 케이스는 통과
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String baseStr = "";
        String otherStr = "";
        
        //1. 기준 문자열 자르기
        for(int i = 0; i < phone_book.length; i++){
            baseStr = phone_book[i].substring(0);
            //2. 기준 문자열 길이만큼 다른 문자열 자르기
            for(int k = i+1; k < phone_book.length; k++){
                otherStr = phone_book[k].substring(0, baseStr.length());
                //3. 포함했는지 여부 확인
                for(int l = i+1; l < phone_book.length; l++){
                    if(otherStr.equals(baseStr)){
                        return false;
                    }
                }
            }  
        }

        return answer;
    }
}

// 다른 사람 푼 방식(정확성 O/효율성 X)
class Solution2 {
    public boolean solution(String[] phoneBook) {
       for(int i=0; i<phoneBook.length; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
    }
}