package yufjin.software.nju.edu.cn;

public class QuickSort implements SortArray {

	@Override
	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int[] sort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high) {
			int mid = getMiddle(a, low, high);
			this.sort(a,low,mid-1);
			this.sort(a,mid+1,high);
		}
		return a;
	}
	
	public int getMiddle(int[] a,int low, int high){
		int temp = a[low];
		while(low < high) {
			while(low < high && a[high] > temp) {
				high--;
			}
			a[low] = a[high];
			while(low < high && a[low] < temp) {
				low++;
			}
			a[high] = a[low];
		}
		a[low] = temp;
		return low;
	}
}
