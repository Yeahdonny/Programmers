package heap;

import java.util.PriorityQueue;

public class no1 {
	public static int solution(int[] scoville, int K) {
		int answer = 0; //섞어야 하는 최소 횟수
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < scoville.length; i++) {
			pq.add(scoville[i]);
		}
		while (!pq.isEmpty()) {
			int a = pq.poll(); //가장 맵지 않은 음식의 스코빌 지수
			if (a < K) {
				if (pq.size() == 0) {
					answer = -1; //모든 음식의 스코빌 지수를 K이상으로 만들 수 없는 경우
					break;
				}
				int b = pq.poll(); //두번쨰로 맵지 않는 음식의 스코빌 지수
				pq.add(a + (b * 2));
				answer++;
			} else
				break;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scoville[] = { 1 };
		int K = 2;
		System.out.println(solution(scoville, K));
	}

}
