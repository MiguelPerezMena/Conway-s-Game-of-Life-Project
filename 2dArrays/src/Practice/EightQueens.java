package Practice;
	public class EightQueens
	{
	    public static void main(String [] args)
	    {
	    	int attempts=0;
	        char[][] board = new char[8][8];
	        initializeBoard(board);
	        generateBoard(board);
	        while(!isSolution(board))
	        {
	          initializeBoard(board);
	          generateBoard(board);
	          attempts++;
	        }
	        System.out.println("It took " + attempts + " attempts.");
	        outputBoard(board);
	    }
	    public static void initializeBoard(char[][] b)
	    {
	    	//Set all characters in 2D array to a hyphen '-'
	        for(int r=0; r < b.length; r++)
	            for(int c =0; c < b[0].length; c++)
	            {
	                b[r][c]='-';
	            }
	      
	    }
	     public static void generateBoard(char[][] b)
	    {
                
	    	 //8 times we want to place a queen on the board
	        for(int x=0; x< 8;x++)
	        {
	                int rr=(int)(Math.random()*8); //rr = random row
	                int rc=(int)(Math.random()*8); //rc = random column
	              //make sure you aren't placing a queen on top of another queen
	                while(b[rr][rc]=='Q') 
	                        {
	                            rr=(int)(Math.random()*8);
	                            rc=(int)(Math.random()*8);
	                        }
	                b[rr][rc]='Q';      
	        }   
	    }
	    public static boolean isSolution(char[][] b)
	    {
                 int counter=0;
	        //row checks - Go row by row and count the number of queens in each.  If it isn't 1, return false
	       if (b[0][0]=='Q') counter++;
               if (b[0][1]=='Q') counter++;
               if (b[0][2]=='Q') counter++;
               if (b[0][3]=='Q') counter++;
               if (b[0][4]=='Q') counter++;
               if (b[0][5]=='Q') counter++;
               if (b[0][6]=='Q') counter++;
               if (b[0][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[1][0]=='Q') counter++;
               if (b[1][1]=='Q') counter++;
               if (b[1][2]=='Q') counter++;
               if (b[1][3]=='Q') counter++;
               if (b[1][4]=='Q') counter++;
               if (b[1][5]=='Q') counter++;
               if (b[1][6]=='Q') counter++;
               if (b[1][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[2][0]=='Q') counter++;
               if (b[2][1]=='Q') counter++;
               if (b[2][2]=='Q') counter++;
               if (b[2][3]=='Q') counter++;
               if (b[2][4]=='Q') counter++;
               if (b[2][5]=='Q') counter++;
               if (b[2][6]=='Q') counter++;
               if (b[2][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[3][0]=='Q') counter++;
               if (b[3][1]=='Q') counter++;
               if (b[3][2]=='Q') counter++;
               if (b[3][3]=='Q') counter++;
               if (b[3][4]=='Q') counter++;
               if (b[3][5]=='Q') counter++;
               if (b[3][6]=='Q') counter++;
               if (b[3][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[4][0]=='Q') counter++;
               if (b[4][1]=='Q') counter++;
               if (b[4][2]=='Q') counter++;
               if (b[4][3]=='Q') counter++;
               if (b[4][4]=='Q') counter++;
               if (b[4][5]=='Q') counter++;
               if (b[4][6]=='Q') counter++;
               if (b[4][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[4][0]=='Q') counter++;
               if (b[4][1]=='Q') counter++;
               if (b[4][2]=='Q') counter++;
               if (b[4][3]=='Q') counter++;
               if (b[4][4]=='Q') counter++;
               if (b[4][5]=='Q') counter++;
               if (b[4][6]=='Q') counter++;
               if (b[4][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[5][0]=='Q') counter++;
               if (b[5][1]=='Q') counter++;
               if (b[5][2]=='Q') counter++;
               if (b[5][3]=='Q') counter++;
               if (b[5][4]=='Q') counter++;
               if (b[5][5]=='Q') counter++;
               if (b[5][6]=='Q') counter++;
               if (b[5][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[6][0]=='Q') counter++;
               if (b[6][1]=='Q') counter++;
               if (b[6][2]=='Q') counter++;
               if (b[6][3]=='Q') counter++;
               if (b[6][4]=='Q') counter++;
               if (b[6][5]=='Q') counter++;
               if (b[6][6]=='Q') counter++;
               if (b[6][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[7][0]=='Q') counter++;
               if (b[7][1]=='Q') counter++;
               if (b[7][2]=='Q') counter++;
               if (b[7][3]=='Q') counter++;
               if (b[7][4]=='Q') counter++;
               if (b[7][5]=='Q') counter++;
               if (b[7][6]=='Q') counter++;
               if (b[7][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
	        //column checks Go column by column and count the number of queens in each.  If it isn't 1, return false
	       if (b[0][0]=='Q') counter++;
               if (b[1][0]=='Q') counter++;
               if (b[2][0]=='Q') counter++;
               if (b[3][0]=='Q') counter++;
               if (b[4][0]=='Q') counter++;
               if (b[5][0]=='Q') counter++;
               if (b[6][0]=='Q') counter++;
               if (b[7][0]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[0][1]=='Q') counter++;
               if (b[1][1]=='Q') counter++;
               if (b[2][1]=='Q') counter++;
               if (b[3][1]=='Q') counter++;
               if (b[4][1]=='Q') counter++;
               if (b[5][1]=='Q') counter++;
               if (b[6][1]=='Q') counter++;
               if (b[7][1]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[0][2]=='Q') counter++;
               if (b[1][2]=='Q') counter++;
               if (b[2][2]=='Q') counter++;
               if (b[3][2]=='Q') counter++;
               if (b[4][2]=='Q') counter++;
               if (b[5][2]=='Q') counter++;
               if (b[6][2]=='Q') counter++;
               if (b[7][2]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[0][3]=='Q') counter++;
               if (b[1][3]=='Q') counter++;
               if (b[2][3]=='Q') counter++;
               if (b[3][3]=='Q') counter++;
               if (b[4][3]=='Q') counter++;
               if (b[5][3]=='Q') counter++;
               if (b[6][3]=='Q') counter++;
               if (b[7][3]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[0][4]=='Q') counter++;
               if (b[1][4]=='Q') counter++;
               if (b[2][4]=='Q') counter++;
               if (b[3][4]=='Q') counter++;
               if (b[4][4]=='Q') counter++;
               if (b[5][4]=='Q') counter++;
               if (b[6][4]=='Q') counter++;
               if (b[7][4]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[0][5]=='Q') counter++;
               if (b[1][5]=='Q') counter++;
               if (b[2][5]=='Q') counter++;
               if (b[3][5]=='Q') counter++;
               if (b[4][5]=='Q') counter++;
               if (b[5][5]=='Q') counter++;
               if (b[6][5]=='Q') counter++;
               if (b[7][5]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[0][6]=='Q') counter++;
               if (b[1][6]=='Q') counter++;
               if (b[2][6]=='Q') counter++;
               if (b[3][6]=='Q') counter++;
               if (b[4][6]=='Q') counter++;
               if (b[5][6]=='Q') counter++;
               if (b[6][6]=='Q') counter++;
               if (b[7][6]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
               if (b[0][7]=='Q') counter++;
               if (b[1][7]=='Q') counter++;
               if (b[2][7]=='Q') counter++;
               if (b[3][7]=='Q') counter++;
               if (b[4][7]=='Q') counter++;
               if (b[5][7]=='Q') counter++;
               if (b[6][7]=='Q') counter++;
               if (b[7][7]=='Q') counter++;
               if (counter>1)return false;
               counter=0;
	        //diagonal checks
	        //First find all 8 queens, then see if there are any other queens in any other diagonal direction.
	      
	        //if you got to here, you've checked all 8 queens and none of them were diagonal to one another.  It's a valid solution
	        return true;
	    }
	    public static boolean checkDiagonal(int r, int c, char[][]b)
	    {
	    	//Possible helper method
	    	
	    	//check down and to the right from position [r][c] in the board.  If you encounter a Q, return false
	    	
	    	//check down and to the left from position [r][c] in the board
	    	
	    	//check up and to the right from position [r][c] in the board
	    	
	    	//check up and to the left from position [r][c] in the board
	    	
	    	//make sure you don't go outside the edge of the array and only 
	    	//return true after you've verified that there are no queens diagonally in all four directions
	    	
	    	
	    	return true;
	    }
	    public static void outputBoard(char[][] b)
	    {
	 
	         for(int r=0; r < b.length; r++)
	         {
	            for(int c =0; c < b[0].length; c++)
	            {
	               System.out.print(b[r][c]+" ");
	            }      
	            System.out.println();
	         }
	      
	    }
	}
