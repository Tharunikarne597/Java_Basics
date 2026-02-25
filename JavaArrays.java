public class JavaArrays {
      //Arrays are used to store multiple values in a single variable 
	//instead of declaring separate variables for each value
	//declaration of array
	
	public static void main(String args[]) {
	String[] cars = {"Volvo","bmw","ford","Mazda"};
	int[] mynum = {10,20,30,40,50,60};
	
	System.out.println(cars[0]);
	System.out.println(mynum[2]);
	System.out.println(cars[1]);
	System.out.println(mynum[3]);
	String[] carss = {"Volvo","BMW","Ford","Mazada"};
	carss[0] = "Opel";
	System.out.println(carss[0]);
	
	//array length
	// to find out how many elements in array ,use the length property:
    System.out.println(cars.length);
    System.out.println(mynum.length);
    
    //Loop through an Array
 /* you can loop the array elements with the for loop,and use the length property to specify how many times the loop should run 
  */
    String[] carsss = {"Volvo","bmw","ford","mazada"};
    for(int i=0; i<carsss.length; i++) {
    	System.out.println(carsss[i]);
    }
    	//example
    	int [] numbers = {1,3,5,8,0};
    	int sum =0;
    	for(int j=0; j <numbers.length; j++) {
    		sum += numbers[j];
    	}
    		System.out.println("The sum is:" +sum);
    	
    // Real life Example 
    // to demonstarte a practical example of using arrays ,lets create a program that calculates the average of different ages
    int ages[] = {20,22,18,35,48,87,70};
    float avg, sum1 = 0; 
    int length = ages.length;
    //loop through the elements of the array
    for(int age:ages) {
    	sum += age;
    }
    //calculate the average by dividing the sum by the length
    avg = sum /length;
     System.out.println("the average age is:"+avg);
    	
     //Example
     int[] numbers2 = {45,12,98,33,27};
     int max = numbers2[0];
     int min = numbers2[0];
     for (int n:numbers2) {
    	 if(n> max) {
    		 max = n;
    		 }
    	 if(n<min) {
    		 min = n;
    	 }
     }
     System.out.println("Max:"+max);
     System.out.println("Min:"+min);
    
     //example 3
     String [] seats = {"Jenny","Liam","Angie","bo"};
     for(int i = 0; i<seats.length;i++) {
    	 System.out.println("Seat number "+" "+i+" "+"is taken by "+ seats[i]);
     }

    }
}
