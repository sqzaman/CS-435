package sortroutines;

import runtime.Sorter;

public class BubbleSort2  extends Sorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
	       bubbleSort(arr); 
	        System.out.println("Sorted array"); 
	        printArray(arr); 

	}
	static void bubbleSort(int[] a) {
		int temp = 0;
		
		
		for(int i = 0 ; i < a.length ; i++) {
			boolean swap = false;
			for(int j = 0 ; j< a.length - i-1 ; j++) { 
				
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
					swap=true;
				}
			}
			if(!swap)
				break;
		}
	}
	
	static void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }

	int[] arr;
	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		this.arr = arr;
		bubbleSort(arr);
		return arr;
	}

}
