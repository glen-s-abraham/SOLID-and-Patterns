package StructuralPatterns;
/*
 * Facade patterns can provide a relativeley simple interface to a rather
 * complicated system.
 * It has limited functionality but this is exactly the main advantage.
 */

interface Algorithm{
	public void sort();
}

class BubbleSort implements Algorithm{
	@Override
	public void sort() {
		System.out.println("Using bubble sort");	
	}	
}

class MergeSort implements Algorithm{
	@Override
	public void sort() {
		System.out.println("Using merge sort");	
	}	
}

class QuickSort implements Algorithm{
	@Override
	public void sort() {
		System.out.println("Using quick sort");	
	}	
}

class SortingManager{
	private Algorithm bubbleSort;
	private Algorithm mergeSort;
	private Algorithm quickSort;
	public SortingManager() {
		this.bubbleSort = new BubbleSort();
		this.mergeSort = new MergeSort();
		this.quickSort = new QuickSort();
	}
	public void doBubbleSort() {
		bubbleSort.sort();
	}
	public void doQuickSort() {
		quickSort.sort();
	}
	public void doMergeSort() {
		mergeSort.sort();
	}
	
}

public class FacadePattern {
	public static void main(String[] args) {
		SortingManager sortingManager = new SortingManager();
		sortingManager.doBubbleSort();
		sortingManager.doMergeSort();
	}
}
