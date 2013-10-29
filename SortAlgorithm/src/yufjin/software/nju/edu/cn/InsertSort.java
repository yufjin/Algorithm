package yufjin.software.nju.edu.cn;

public class InsertSort implements SortArray{

	@Override
	public int[] sort(int[] b) {
		// TODO Auto-generated method stub
		for (int i=1;i<b.length;i++) {
			int temp = b[i];
			int j = i;
			
			while (b[j-1]>temp) {
				b[j] = b[j-1];
				j--;
				if(j<=0){
					break;
				}
			}
			b[j] = temp;
		}
		return b;
	}
	
}
