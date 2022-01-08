package BehaviouralPatterns;
/*
 * There are several operations and procedures in software engineering 
 * that are very similar to each other.
 * Subclasses will override the steps and decide the concrete behavioir of the 
 * mdodules.
 * Template pattern is based on inheritence usually.
 * ithe operates on class level which means it's static.
 */

abstract class Algorithm{
	protected int[] nums;

	public Algorithm(int[] nums) {
		this.nums = nums;
	}
	
	protected abstract void initialize();
	protected abstract void sorting();
	
	protected void showResults() {
		for(int num:nums)
			System.out.print(num+" ");
	}
	
	protected void swap(int i, int j) {
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	//template pattern
	public final void sort(){
		initialize();
		sorting();
		showResults();
	}
	
}

class SelectionSort extends Algorithm{

	public SelectionSort(int[] nums) {
		super(nums);
	}

	@Override
	protected void initialize() {
		System.out.println("Initializing selection sote algorithm");
		
	}

	@Override
	protected void sorting() {
		for(int i=0;i<nums.length;i++) {
			int index =i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j])
					index=j;
			}
			if(index!=i)
				swap(i, index);
		}
		
	}

	
}


class BubbleSort extends Algorithm{

	public BubbleSort(int[] nums) {
		super(nums);
	}

	@Override
	protected void initialize() {
		System.out.println("Initializing bubble sort algorithm");
		
	}

	@Override
	protected void sorting() {
		for(int i=0;i<nums.length-1;i++) 
			for(int j=0;j<nums.length-i-1;j++)
				if(nums[j]>nums[j+1])
					swap(j,j+1);
	}

	
}

public class TemplatePattern {
	public static void main(String[] args) {
		int nums[] = {1,5,3,-2,10,12,8,6};
		Algorithm algorithm = new SelectionSort(nums);
		algorithm.sort();
	}
}
