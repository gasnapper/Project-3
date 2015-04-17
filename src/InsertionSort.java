
public class InsertionSort implements Runnable {

	Thread t;
	Integer[] Data;
	 public InsertionSort(Integer[] insertionArray) {
		// TODO Auto-generated constructor stub
		 Data=insertionArray;
	}

	public static <Integer extends Comparable<Integer>> 
		void insertionSort(Integer[] data)
{
  for (int index = 1; index < data.length; index++)
  {
      Integer key = data[index];
      int position = index;
			
      // shift larger values to the right 
      while (position > 0 && data[position-1].compareTo(key) > 0)
      {
          data[position] = data[position-1];
          position--;
      }
			
      data[position] = key;
      
  }
 
}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		insertionSort(Data);
	
	}

	
	
}
