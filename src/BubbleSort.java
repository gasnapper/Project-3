import java.util.Arrays;

import javax.swing.Timer;
public class BubbleSort implements Runnable {
	Integer[]data;
	Timer t;
	long passedTime;
	public BubbleSort(Integer[] bubbleArray) {
		// TODO Auto-generated constructor stub
	data= bubbleArray;
	}

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
//LISTEN HERE
	for (position =  data.length - 1; position >= 0; position--)
		{
//LISTEN HERE
	    	for (scan = 0; scan <= position - 1; scan++)
	        	{
//LISTEN HERE
	            	if (data[scan].compareTo(data[scan+1]) > 0)
	                    swap(data, scan, scan + 1);
	            }
	        }
//LISTEN HERE
    	}
public void setTime(long elapsedTime)
{
	  passedTime=elapsedTime;
}
public long getTime()
{
	return passedTime;
}
@Override
public void run() {
	// TODO Auto-generated method stub
	bubbleSort(data);t.start();
	long startTime= System.nanoTime();
	bubbleSort(data);
	t.stop();
	long elapsedTime=System.nanoTime() - startTime;
	setTime(elapsedTime);
}
}
