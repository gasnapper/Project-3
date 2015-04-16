import java.util.ArrayList;
import java.util.List;


public class RadixSort implements Runnable {

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
		  System.out.print("After \n");
		     for(int z=0;z<input.length;z++)
					
		   		System.out.print( input[z] + " , ");
		   		System.out.println();
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Integer[]data ={654,8,98,326,32,5,62,41,32,326,};
		 System.out.print("before \n");
	     for(int z=0;z<data.length;z++)
				
	   		System.out.print( data[z] + " , ");
	   		System.out.println();
		
		radixsort(data);
	}
}
