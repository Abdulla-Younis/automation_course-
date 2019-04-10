package automation_course;

import java.util.Random;

public class array_class {
	
	public static int[] ascend (int [] array) {

		

		for(int i = 0; i<array.length; i++) {

	      for (int j = i+1; j<array.length; j++) {

	         if(array[i] > array[j]) {

	            int y = array[i];

	            array[i] = array[j];

	            array[j] = y;	    
	         }
	      }	    
	   }
		return array;
	 }
	public static int max(int [] array) {

		      int max = 0;

		      for(int i=0; i<array.length; i++ ) {

		         if(array[i]>max) {

		        	 max = array[i];
		         }
		      }
		      return max;
		   }
public static int sum(int [] array) {

    int sum = 0;

    for(int i=0; i<array.length; i++ ) {
  
       sum= sum+array[i];
    }

    return sum;
 }

public static void main(String[] args) {

	int Array[] = new int[20];

	for (int i=0; i<20; i++) 

	{	

	Random rand = new Random(); 

	Array[i] = rand.nextInt(500);

	}

	int count = 0;

	while (count<Array.length) {

		System.out.print(Array[count]);

		if (count <Array.length) {

			System.out.print(" , ");
		}

		count++;
	}

	System.out.println();
	System.out.println("the maximum number in the array is : " + array_class.max(Array));

	System.out.println("the sumation of numbers in the array is : " + array_class.sum(Array));

	array_class.ascend(Array);

	for (int i = 0; i <Array.length; i++) {

       if (i > 0) {

          System.out.print(" , ");
       }
       System.out.print(Array[i]);
    }	
}

}



