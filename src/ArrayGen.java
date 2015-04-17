import java.util.Arrays;
import java.util.Random;


public class ArrayGen {
	//create array of random numbers here
	//numbers range from 0-10
	int number;
	Integer randomArray[];
	Integer bubbleArray[];
	Integer quickArray[];
	Integer radixArray[];
	Integer mergeArray[];
	Integer insertionArray[];
	Random rand;

	public ArrayGen(Integer number)
	{
		this.number = number;
		rand = new Random();
		randomArray = new Integer [number];
		bubbleArray = new Integer[number];
		quickArray = new Integer[number];
		radixArray = new Integer[number];
		mergeArray = new Integer[number];
		insertionArray = new Integer[number];
		arrayLoad();
	}

	 
	


		// test print out the captured number in range 10,000 - 1,000,000
	public void arrayLoad()
	{
	
		for (int i=0; i<randomArray.length; i++)
		{
			int num = rand.nextInt(10)+1;
			randomArray[i]=num;
		}
		for (int loader = 0; loader < randomArray.length; loader++)
		{
			bubbleArray[loader] = randomArray[loader];
			mergeArray[loader] = randomArray[loader];
			quickArray[loader] = randomArray[loader];
			radixArray[loader] = randomArray[loader];
			insertionArray[loader] = randomArray[loader];
		}
		
	}
	public Integer[] getMergeArray()
	{
		return mergeArray;
	}
	public Integer[] getRadixArray()
	{
		return radixArray;
	}
	public Integer[] getBubbleArray()
	{
		return bubbleArray;
	}
	public Integer[] getQuickArray()
	{
		return quickArray;
	}
	public Integer[] getInsertionArray()
	{
		return insertionArray;
	}
	public int randomArrayLength()
	{
		return randomArray.length;
	}
	// this doesnt work
	public String getRandomArrayInt()
	{
		String array = Arrays.toString(randomArray);
		return array;
	}
}
