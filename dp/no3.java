package dp;

public class no3 {
	public static int solution(int[][] triangle) {
		int answer = 0;
		int size = triangle.length;
		for(int i = triangle.length-1 ; i > 0;i--) {
			for(int j = 0 ; j < triangle[i].length-1;j++) {
				triangle[i-1][j] = Math.max(triangle[i-1][j]+triangle[i][j],triangle[i-1][j]+triangle[i][j+1]);
			}
		}
		answer = triangle[0][0];
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int triangle[][]= {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		System.out.println(solution(triangle));
	}

}
