package yufjin.software.nju.edu.cn;

public class BrackerMatcher {
	public static int counter = 0;

	public static void main(String[] args) {// 1 means left bracket, -1 means right bracket
		// TODO Auto-generated method stub
		long starttime = System.currentTimeMillis();
		int n = 12;
		int[] bracket= new int[2*n];
		bracketMatch(n,0,bracket);
		long endtime = System.currentTimeMillis();
		System.out.println("the function runs " + (endtime-starttime) + "ms");
	}
	
	
	
	public static void bracketMatch(int n, int i, int[] bracket) {
		if(n<=0) {
			return;
		}
		if(i == 2*n) {
			if(isSafe(bracket,i)){
				printBrakcet(bracket);
			}
		}
		else {
			bracket[i] = 1;
			if(isSafe(bracket,i)){
				bracketMatch(n, i+1, bracket.clone());
			}
			
			bracket[i] = -1;
			if(isSafe(bracket,i)){
				bracketMatch(n, i+1, bracket.clone());
			}
			
		}
		
	}
	
	public static boolean isSafe(int[] bracket,int i) {
		int left = leftBracketSum(bracket,i);
		int right = rightBracketSum(bracket,i);
		if(left > (bracket.length)/2) {
			return false;
		}
		if(right > (bracket.length)/2) {
			return false;
		}
		if ((left-right) <0) {//left bracket is less than right bracket
			return false;
		}else {
			return true;
		}
	}
	
	public static int leftBracketSum(int[] bracket,int i) {
		int sum = 0;
		for(int l=0;l<i;l++) {
			if(bracket[l]==1){
				sum++;
			}
			
		}
		return sum;
	}
	
	public static int rightBracketSum(int[] bracket,int i) {
		int sum = 0;
		for(int n:bracket) {
			if(n==-1){
				sum++;
			}
		}
		return sum;
	}

	public static void printBrakcet(int [] bracket) {
		System.out.println((++counter) + ". ");
		for (int n:bracket) {
			if (n == 1) {
				System.out.print("(");
			}else {
				System.out.print(")");		
			}
		}
		System.out.println("");
	}
}
