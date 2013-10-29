package yufjin.software.nju.edu.cn;





public class BinSearch {
	public static int BSearch(int[] a, int num) {
		int low = 0;
		int high = a.length-1;
		while(low < high) {
			int mid = (low + high)/2;
			if(a[mid] == num) {
				return mid;
			}else if(a[mid] < num) {
				low = mid + 1;
			}else {
				high = mid -1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] unsort = {562,43,37,5,14,1,9,111,6,12};
		System.out.println("the index of the number looking for is " + BSearch(unsort, 444));
	}
}
