package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class no1 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>(); // String = key, Integer = value
		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1); //key 값이 없으면 value = 0+1, key 값이 있으면 value +=1 
		}
		for(String player : completion) hm.put(player, hm.get(player)-1);//key 값의 value -=1
		for(String key: hm.keySet()) {
			if(hm.get(key) != 0) answer = key; //key값의 value 가 0 이 아니면 완주하지 못한 사람
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예시
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "mislav", "stanko", "ana" };
		System.out.println(solution(participant, completion));
	}

}
