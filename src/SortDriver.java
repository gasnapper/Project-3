import java.util.Random;


public class SortDriver {
	//create array of random numbers here
			//numbers range from 0-10
			int number;
			Integer randomArray[];
			Integer bubbleArray[];
			Integer quickArray[];
			Integer radixArray[];
			Integer mergeArray[];
	
	
	public SortDriver(){
		arrayLoad();
	
	
		
		
		
		Random rand = new Random();
		Window w = new Window();
		 number = w.getNumber();
		 randomArray = new Integer [number];
		 bubbleArray = new Integer[number];
		 quickArray = new Integer[number];
		 radixArray = new Integer[number];
		 mergeArray = new Integer[number];
		
		// test print out the captured number in range 10,000 - 1,000,000
		System.out.println("How many random numbers?: "+number);
		System.out.println("How big is array?:"+randomArray.length);
		
		for (int i=0; i<randomArray.length; i++)
		{
			int num = rand.nextInt(10)+1;
			randomArray[i]=num;
		}
	
		MergeSort m = new MergeSort();
		System.out.println("\n\n");
		m.mergeSort(randomArray);
	
	}
	public void ArrayCreate(){
		
		
	}
	public void arrayLoad()
	{
		for (int loader = 0; loader < randomArray.length; loader++)
		{
			bubbleArray[loader] = randomArray[loader];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	System.out.println(randomArray[2]);
		InsertionSort R1= new InsertionSort();
		R1.begin();
		
		RadixSort R2=new RadixSort();
		R2.run();
	*/
}
}