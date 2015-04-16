
public class InsertionSort implements Runnable {

	Thread t;
	
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
  System.out.print("After \n");
  for(int z=0;z<data.length;z++)
			
		System.out.print( data[z] + " , ");
		System.out.println();
}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Integer[]data ={464,666,96,165,5,2651,999,326};
		
		 System.out.print("before \n");
		  for(int z=0;z<data.length;z++)
					
				System.out.print( data[z] + " , ");
				System.out.println();
		insertionSort(data);
	
	}

	
	public void begin(){
		
		System.out.println("Starting");
		
		if (t==null){
			
			t = new Thread(this);
			t.start();
		
		}
	}
}
