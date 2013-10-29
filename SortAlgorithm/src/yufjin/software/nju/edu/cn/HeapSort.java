package yufjin.software.nju.edu.cn;

public class HeapSort implements SortArray {

	@Override
	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i = (a.length-1)/2; i >= 0; i--) {
			this.adjustHeap(a, i, a.length);
		}
		for (int j = a.length-1; j >= 1;j--) {
			   int temp = a[0];
			   a[0] = a[j];
			   a[j] = temp;
			   this.adjustHeap(a, 0, j-1);

		}
		return a;
	}
	
	
	
	public void adjustHeap(int [] a,int root, int nodeNum) {
		int root1 = root;
		int max = a[root];
		for(int j = 2*root1 + 1; j <= nodeNum-1; j = 2 *j + 1) {
			if(j < nodeNum-1 && a[j] < a[j+1]) {
				j = j + 1;
			}
			if( max > a[j]) {
				break;
			}
			a[root1] = a[j];
			root1 = j;
		}
		a[root1] = max;
	}

}
