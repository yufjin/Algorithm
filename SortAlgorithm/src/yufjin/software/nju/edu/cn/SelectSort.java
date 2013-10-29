package yufjin.software.nju.edu.cn;

public class SelectSort implements SortArray{

	@Override
	public int[] sort(int[] b) {
		// TODO Auto-generated method stub
		for(int i = 0; i < b.length;i++) {
			int min = b[i];
			int pos = i;
			for(int j = i+1; j < b.length;j++) {
				if(b[j] < min) {
					min = b[j];
					pos= j;
				}
			}
			if (min != b[i]) {
				b[pos] = b[i];
				b[i] = min;
			}
		}
		return b;
	}

}
