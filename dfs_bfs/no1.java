package dfs_bfs;

public class no1 {
	static int answer = 0;
	public static void dfs(int[] numbers, int target, int value[], int cnt) {
		if(cnt == numbers.length) {
			int sum = 0;
			for(int i = 0 ; i < numbers.length ;i++) {
				sum+=value[i];
			}
			if(sum==target)answer++;
			return;
		}
		value[cnt] = numbers[cnt] * 1; 
		dfs(numbers, target, value , cnt+1);
		value[cnt] = numbers[cnt] * -1;
		dfs(numbers, target, value, cnt+1);
	}

	static public int solution(int[] numbers, int target) {
		// int answer = 0;
		int value[] = new int[numbers.length];
		dfs(numbers, target, value,0);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 1, 1, 1, 1, 1 };
		System.out.println(solution(numbers, 3));
	}

}
