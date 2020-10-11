package soft_testing_lab1;

import org.junit.Test;

public class ArraySort {

	public static void radixSort(int array[]) {
		//find the largest number
		int largest = 0;
		int new_array[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) largest = array[i];
		}
		//determine the order of the largest number
		int order = 0;
		while (largest != 0) {
			largest = largest/10;
			order++;
		}
		int tens = 1; 
		//for each order do the following
		for (int i = 1; i <= order; i++) {
			int numbers[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			for (int j = 0; j < array.length; j++) {
				numbers[(array[j]/tens%10)]++;
			}
			for (int j = 1; j < 10; j++) {
				numbers[j] += numbers[j-1];
			}
			
			//capture numbers snapshot if test instance is created
			if (ArraySortTest.getInstance() != null) {
				ArraySortTest.getInstance().addToNumQueue(numbers);
			}
			
			for (int j = array.length - 1; j >= 0; j--) {
				numbers[(array[j]/tens%10)]--;
				new_array[numbers[(array[j]/tens%10)]] = array[j];
			}
			System.arraycopy(new_array, 0, array, 0, array.length);	
			tens *= 10;
			
			//capture array snapshot if test instance is created
			if (ArraySortTest.getInstance() != null) {
				ArraySortTest.getInstance().addToArrayQueue(array);
			}
			
			
		}
	}	
}
