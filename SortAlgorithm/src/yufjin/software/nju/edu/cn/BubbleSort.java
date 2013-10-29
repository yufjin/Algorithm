package yufjin.software.nju.edu.cn;

public class BubbleSort implements SortArray {

	@Override
	public int[] sort(int[] b) {
		// TODO Auto-generated method stub
		for(int i = 0; i<b.length; i++) {
			for (int j = b.length-1; j > i; j--) {
				if (b[j] < b[j-1]) {
					int temp = b[j];
					b[j] = b[j-1];
					b[j-1] = temp;
				}
				
			}
		}
		return b;
	}

}
