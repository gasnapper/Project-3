import java.util.Arrays;
public class BubbleSort {


//-------------------------------------------------
private static <Integer extends Comparable<Integer>>
		void swap(Integer[] data, int index1, int index2)
	{
		Integer temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}

//--------------------------------------------------
public static < Integer extends Comparable<Integer>>
			void bubbleSort(Integer[] data)
{
	int position, scan;
	Integer temp;

	for (position =  data.length - 1; position >= 0; position--)
		{
	    	for (scan = 0; scan <= position - 1; scan++)
	        	{
	            	if (data[scan].compareTo(data[scan+1]) > 0)
	                    swap(data, scan, scan + 1);
	            }
	        }
    	}
}
