package dfs_bfs;
//단어변환
public class no3 {
	public static boolean check[];
	public static int MIN = 9999999;
	public static void searching(String word, String target, int cnt,String[] words) {
		if(target.equals(word)) {
			MIN = Math.min(cnt, MIN);
		
			return;
		}
		
		for(int i = 0 ;i < check.length;i++ ) {
			int length = 0;
			if(check[i])continue;
			for(int j = 0 ; j < word.length() ; j++) {
				if(word.charAt(j)==words[i].charAt(j))
					length++;
			}
			if(length==word.length()-1) {
				//System.out.println(words[i]);
				check[i] = true;
				searching(words[i], target, cnt+1, words);
				check[i] = false;
			}		
		}
		return;
	}
	 public static int solution(String begin, String target, String[] words) {
	        int answer = 0;
	        check = new boolean[words.length];
	      
	        searching(begin, target, 0, words);
	        if(MIN!=9999999)
	        	answer = MIN;	       	   
	        return answer;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"hot","dot", "dog", "log", "lot"};
		System.out.println(solution("hit", "cog", words));
	}

}
