package exhaustive_search;

import java.util.StringTokenizer;

public class no1 {
	static int a[] = { 1, 2, 3, 4, 5 };
	static int b[] = { 2, 1, 2, 3, 2, 4, 2, 5 };
	static int c[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

	public static int[] solution(int[] answers) {
		int[] answer = new int[3];
		int result[] = {};
		
		for (int i = 0, j = 0, k = 0, l = 0; i < answers.length; i++, j++, k++, l++) {
			if (j == a.length)
				j = 0;
			if (k == b.length)
				k = 0;
			if (l == c.length)
				l = 0;
			if (answers[i] == a[j])
				++answer[0];
			if (answers[i] == b[k])
				++answer[1];
			if (answers[i] == c[l])
				++answer[2];
			System.out.println(answers[i]);
		}
		int max = 0;
		String line = "";
		for (int i = 0; i < 3; i++) {
			if (answer[i] != 0) {
				if (max == answer[i])
					line += (i + 1) + " ";
				else if (max < answer[i]) {
					max = answer[i];
					line = "";
					line += (i + 1) + " ";
				}
			}
		}
		StringTokenizer st = new StringTokenizer(line, " ");
		result = new int[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			result[i] = Integer.parseInt(st.nextToken());
			++i;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answers[] = { 1, 0, 2, 4, 2 };
		solution(answers);
	}

}
