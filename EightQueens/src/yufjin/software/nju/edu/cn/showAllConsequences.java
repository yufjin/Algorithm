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
		System.out.println("end!!!");
	}
	
	public static void severalQueens(int num) {//queen k is in line k, column chessboard[k]
		int[] chessboard = new int[num];
		int k = 0;
		//int loopnum = 0;
		while(k >=0) {
			while(chessboard[k]<= num-1 && !isSafe(chessboard, k)) {
				chessboard[k]++;//move the queen of line k to the next column
			}
			if(chessboard[k]<= num-1 && k == num - 1) {//hit one solution and move queen k to the next column
				printCon(chessboard);
				if(k >= 0) {
					chessboard[k]++;
				}
			}
			else if (chessboard[k]<= num-1 && k < num - 1) {//place queen k+1
				k++;
			}
			else {//no more answer for the location of current k queens, so go back to queen k-1 and move it to the next column
				chessboard[k] = 0;
				k--;
				if(k >= 0) {
					chessboard[k]++;
				}
			}
			
		}
	}
	
	public static boolean isSafe(int[] chessboard, int k) {
		for(int i = 0;i<k;i++) {
			if(chessboard[i] == chessboard[k] || (chessboard[k] - chessboard[i]) == (k-i) || (chessboard[k] - chessboard[i]) == (i-k)){
				return false;
			}
		}
		return true;
	}
	
	public static void printCon(int[] chessboard) {
		int lineNum = chessboard.length;
		System.out.println("current number is "+(++answerNum));
		System.out.println("===============");
		for(int i=0;i<lineNum;i++) {
			for(int j=0;j<lineNum;j++) {
				if(j == chessboard[i]) {
					System.out.print("@ ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		System.out.println("===============");
		
	}
}
