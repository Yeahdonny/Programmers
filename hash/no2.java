package hash;

import java.util.Arrays;
import java.util.HashMap;

public class no2 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0 ; i < phone_book.length-1 ; i++) {
        	for(int j = i+1 ; j < phone_book.length ;j++) {
        		if(phone_book[j].startsWith(phone_book[i]))return false;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"12", "123","1235","567","88"};
	//	String[] phone_book = {"123","456","789"};
		System.out.println(solution(phone_book));
	}

}
