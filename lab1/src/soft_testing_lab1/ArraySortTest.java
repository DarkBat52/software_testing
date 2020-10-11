package soft_testing_lab1;

import static org.junit.Assert.*;

import org.junit.Test;

import static soft_testing_lab1.ArraySort.radixSort;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArraySortTest {
	
	private Queue<int []> arrayQueue = new ArrayDeque<>();
	private Queue<int []> numQueue = new ArrayDeque<>();
	
	private static ArraySortTest instance = null;
	
	
	public static ArraySortTest getInstance() {
		return instance;
	}
	
	public ArraySortTest() {
		assert (instance == null);
		instance = this;
	}

	int array[] = {253, 196, 713, 377, 840, 217, 867, 725, 291, 395, 508, 892, 335, 120, 542,
			629, 174, 217, 453, 695, 545, 342, 898, 736, 369, 909, 451, 379, 506, 953};
	
	int arraySnapshotOne[] = {840, 120, 291, 451, 892, 542, 342, 253, 713, 453, 953, 174, 725, 
			395, 335, 695, 545, 196, 736, 506, 377, 217, 867, 217, 508, 898, 629, 369, 909, 379};
	int arraySnapshotTwo[] = {506, 508, 909, 713, 217, 217, 120, 725, 629, 335, 736, 840, 542, 
			342, 545, 451, 253, 453, 953, 867, 369, 174, 377, 379, 291, 892, 395, 695, 196, 898};
	int arraySnapshotThree[] = {120, 174, 196, 217, 217, 253, 291, 335, 342, 369, 377, 379, 395,
			451, 453, 506, 508, 542, 545, 629, 695, 713, 725, 736, 840, 867, 892, 898, 909, 953};
	
	int numbersSnapshotOne[] = {2, 4, 7, 11, 12, 17, 20, 24, 26, 30};
	int numbersSnapshotTwo[] = {3, 6, 9, 11, 15, 19, 21, 24, 24, 30};
	int numbersSnapshotThree[] = {0, 3, 7, 13, 15, 19, 21, 24, 28, 30};
	
	@Test
	public void test() {
		radixSort(array);
		for (int i = 0; i < array.length; i++)
		System.out.print(array[i]+" ");
		assTrue();
		assertArrayEquals(numbersSnapshotOne, numQueue.remove());
		assertArrayEquals(numbersSnapshotTwo, numQueue.remove());
		assertArrayEquals(numbersSnapshotThree, numQueue.remove());
		assertArrayEquals(arraySnapshotOne, arrayQueue.remove());
		assertArrayEquals(arraySnapshotTwo, arrayQueue.remove());
		assertArrayEquals(arraySnapshotThree, arrayQueue.remove());
	}
	
	public void addToArrayQueue(int array[]) {
		int[] snap = new int[array.length];
		System.arraycopy(array,  0,  snap,  0,  array.length);
		arrayQueue.add(snap);
	}
	
	public void addToNumQueue(int array[]) {
		int[] snap = new int[array.length];
		System.arraycopy(array,  0,  snap,  0,  array.length);
		numQueue.add(snap);
	}
	
	void assTrue() {
		assertArrayEquals(arraySnapshotThree, array);
	}


}
