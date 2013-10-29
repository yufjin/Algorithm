package yufjin.software.nju.edu.cn;

import java.util.ArrayList;


public class SortTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsort = {562,43,37,5,14,1,9,111,6,12};
		ArrayList<SortArray> sortarray = new ArrayList<SortArray>();
		
		sortarray.add(new InsertSort());
		sortarray.add(new BubbleSort());
		sortarray.add(new SelectSort());
		sortarray.add(new ShellSort());
		sortarray.add(new HeapSort());
		
		for(SortArray sortlogic: sortarray) {
			int[] sorted = sortlogic.sort(unsort.clone());
			System.out.print(sortlogic.getClass().toString()+": ");
			for(int i:sorted) {
				System.out.print(i + " ");
			}
			System.out.println(";");
		}
		
		//different parameter list
		QuickSort arr = new QuickSort();
		int[] sorted = arr.sort(unsort.clone(),0,unsort.length-1);
		System.out.print(arr.getClass().toString()+": ");
		for(int i:sorted) {
			System.out.print(i + " ");
		}
		System.out.println(";");
		
		System.out.print("the unsorted array of number is: ");
		for (int i:unsort) {
			System.out.print(i+" ");
		}
		System.out.println(";");
	}

}
