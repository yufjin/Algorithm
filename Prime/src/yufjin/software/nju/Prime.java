package yufjin.software.nju;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 100;
		int max = 200;
		ArrayList<Integer> primeList = new ArrayList<>();
		for(int a = min; a <= max; a++) {
			if(isPrime(a)) {
				primeList.add(a);
			}
		}
		System.out.println("The number of prime between "+min+"&"+max+" is "+primeList.size());
	}

	public static boolean isPrime(int num) {
		for(int i = 2; i <= (int)Math.sqrt(num); i++) {
			if (num%i ==0) {
				return false;
			}
		}
		return true;
	}
}
