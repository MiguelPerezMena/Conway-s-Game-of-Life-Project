public class MyArrays 
{
     //This method will simply sum all the elements in the 2D array and return that sum
	public int sum2DArray(int[][] matrix)
	{
            int sum = 0;
            for(int r=0;r<matrix.length;r++)
             for(int c=0;c<matrix[0].length;c++)
             {
                 sum+=matrix [r][c];
             }
		return sum;
	}
        //This method will find the largest value in the 2D array and return that value
            public int findLargest(int[][] matrix)
	{
            int biggest = 0;
	    for (int r = 0; r < matrix.length; r++) 
             for (int c = 0; c < matrix[0].length; c++) 
             {
                 if (matrix[r][c]>biggest) biggest=matrix[r][c];                       
             }
		return biggest;
	}

        //This method receives two identically sized integer arrays.  It will build and return a new
        //array of the same size.  Each element in the new array will hold the sum of the corresponding
        //values from the two received arrays
        public int[][] sumArrays(int[][] a, int[][] b)
	{
              int [] [] summed=new int[a.length][a[0].length];
              for(int r=0;r<a.length;r++)
                for(int c=0;c<a[0].length;c++)
                {
                   summed [r][c]=a[r][c]+b[r][c];
                }
		
		return summed;
	}
        //Return a new array of integers where every even integer has been changed to 0
        public int[][] eraseEvens(int[][]a)
        {
             for(int r=0;r<a.length;r++)
                 for(int c=0;c<a[0].length;c++)
                 {
                     if(a[r][c]%2==0) a[r][c]=0;
                 }
            return a;
        }
        
        
        //You receive an 8x8 2D array of characters.  It consists of either 'N' meaning empty, 'K' for King or 'Q' for Queen
        //Your method should return true if there is no valid movement for the king (checkmate).  A king can move in any adjacent square.
        //A Queen can move vertically, horizontally or diagonally in any direction.  A king cannot move into check
        //If there is a "safe" adjacent space for the king, the method should return false.
       public  boolean isCheckmate(char[][]board)
       {
            for(int r=0;r<board.length;r++)
                for(int c=0;c<board[0].length;c++)     
                {
                    
                } 
            return true;
       }
}