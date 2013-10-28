package yufjin.software.nju.edu.cn;

public class showAllConsequences {
	private static int answerNum = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int queenNum = 8;
		severalQueens(queenNum);
	}
	
	public static void severalQueens(int num) {
		int[][] chessboard = new int[num][num];
		int queenCounter = 0;
		
	}

	
	public static void printCon(int[][] answer) {
		int lineNum = answer.length;
		System.out.println(++answerNum);
		System.out.println("===============");
		for(int i=0;i<lineNum;i++) {
			for(int j=0;j<lineNum;j++) {
				System.out.println(answer[i][j] + " ");
			}
		}
		System.out.println("===============");
		
	}
}
