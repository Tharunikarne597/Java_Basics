class Demo {

	             public static void main(String[] args) {
	//Multidimensional arrays
	//	A multidimensional array that contains other Arrays.class
		/*A You use it to store data in a table with rows and columns
		to create a two dimensional array write each row inside its own curly brace*/
		        int [][] mynumbers = { {1,4,2} ,{8,9,5} };
		//here ,mynumbers has two arrays (two rows);
		// frist row :{1,4,2}
		// Second row :{3,4,8}
		// access elements
		      int [][] mynumberss = {{1,4,2},{3,4,6}};
              System.out.println(mynumberss[0][1]);
        
	 //change element values
     //you can overwrite an existing element using the same two index notation
          int[][] mynum = {{1,4,2},{3,6,8}};
          mynum[1][2] = 9;
          System.out.println(mynum[1][2]);
          
       //Rows and columns (length)
      /* you can use length to get the number of rows ,and myNumbers[row].length for the numbers[row].length
         for the number of columns in a given row*/
        int [][] mynum1 = {{1,4,2},{3,6,8,5,2}};
        System.out.println("Rows:"+ mynum1.length);
        System.out.println("cols in row 0:" + mynum1[0].length);
       System.out.println("cols in row 1:" + mynum1[1].length);
       
      //Java Arrays Code challenge 
       int[] n = {1,3,2,4,5};
       System.out.println(n[0]);
       System.out.println(n[1]);
       System.out.println(n[2]);
       System.out.println(n[3]);
       System.out.println(n[4]); 
	             }
}
