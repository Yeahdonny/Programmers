package stack_queue;

import java.util.Stack;

public class no1 {
	public static int solution(String arrangement) {
		int answer = 0;
		Stack stack = new Stack();
		for (int i = 0; i < arrangement.length()-1; i++) {
			char a = arrangement.charAt(i);
			if (a == '(') {
				stack.push(a);
			}
			if (arrangement.charAt(i + 1) == ')') {
				if (a == '(') { //레이저
					stack.pop();
					answer += stack.size();
				} else { //쇠막대기의 끝점
					answer += 1;
					stack.pop();
				}
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예시
		String arrangement = "()(((()())(())()))(())";
		System.out.println(solution(arrangement));

	}
}
