import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;


public class RadixSort implements Runnable {
<<<<<<< HEAD
		Integer[] Data;
		Timer t;
		long passedTime;
	 public RadixSort(Integer[] radixArray) {
		// TODO Auto-generated constructor stub
		 t = new Timer(0, null);
		 Data=radixArray;
=======
	Integer[]data;
	Timer t;
	long passedTime;
	 public RadixSort(Integer[] radixArray) {
		// TODO Auto-generated constructor stub
		 
		 data=radixArray;
>>>>>>> origin/Group
	}

	public void radixsort(Integer[] input) {
		  final int RADIX = 10;
		  // declare and initialize bucket[]
		  List<Integer>[] bucket = new ArrayList[RADIX];
		  for (int i = 0; i < bucket.length; i++) {
		    bucket[i] = new ArrayList<Integer>();
		  }
		 
		  // sort
		  boolean maxLength = false;
		  int tmp = -1, placement = 1;
		  while (!maxLength) {
		    maxLength = true;
		    // split input between lists
		    for (Integer i : input) {
		      tmp = i / placement;
		      bucket[tmp % RADIX].add(i);
		      if (maxLength && tmp > 0) {
		        maxLength = false;
		      }
		    }
		    // empty lists into input array
		    int a = 0;
		    for (int b = 0; b < RADIX; b++) {
		      for (Integer i : bucket[b]) {
		        input[a++] = i;
		      }
		      bucket[b].clear();
		    }
		    // move to next digit
		    placement *= RADIX;
		  }
		 
		}
	public void setTime(long elapsedTime)
	{
		  passedTime=elapsedTime;
	}
	public long getTime()
	{
		return passedTime;
	}
<<<<<<< HEAD
	public String filePrint()
	{
		String output = "MergeSort" + getTime();
		return output;
	}

=======
>>>>>>> origin/Group
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.start();
		long startTime= System.nanoTime();
<<<<<<< HEAD
		radixsort(Data);
=======
		radixSort(data);
>>>>>>> origin/Group
		t.stop();
		long elapsedTime=System.nanoTime() - startTime;
		setTime(elapsedTime);
		
<<<<<<< HEAD
=======
		
>>>>>>> origin/Group
	}
}
