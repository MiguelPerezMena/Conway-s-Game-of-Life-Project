public class MagicSquare {
    public static void main(String[] args) {
		
		int[][] magic = new int[3][3];
		int count = 0;
		while (!isMagic(magic)) 
		{
			count++;
			populatemagic(magic);
		}
	
		output(magic);
		System.out.println("It took " + count + " attempts to build a magic square.");
	}

	public static void populatemagic(int[][] magic) {
            boolean[] picked = new boolean[10];
		for (int r = 0; r < magic.length; r++) {
			for (int c = 0; c < magic[0].length; c++) {
                            //generate a random value 1 to 9
                          //while that number has been picked, keep picking a new value 1 to 9
                          //assign that random value to magic array
                          //set that value in the picked array to true
                          
                          int n = (int)(Math.random()*9) + 1;
                          while(picked[n]){
                              n = (int)(Math.random()*9) + 1;
                              
                          }
                          picked[n]=true;
                          magic[r][c] = n;
                        }
                }
		
		//Randomly fill in the 2D array with 9 distinct integer values (no repeats)
		//Use the picked array to help with having no repeated values
		
	}

	public static void output(int[][] board) {
		System.out.println();
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (col != 2)
					System.out.print(board[row][col] + "|");
				else
					System.out.print(board[row][col]);
			}
			System.out.println();
			if (row != 2)
				System.out.println("-----");
		}
		System.out.println();
	}

	public static boolean isMagic(int[][] magic) {
            if(magic[0][0] + magic[0][1] + magic[0][2]!=15){
                return false;
            }
            if(magic[1][0] + magic[1][1] + magic[1][2]!=15){
                return false;
            }
            if(magic[2][0] + magic[2][1] + magic[2][2]!=15){
                return false;
            }
            if(magic[0][0] + magic[1][0] + magic[2][0]!=15){
                return false;
            }
            if(magic[0][1] + magic[1][1] + magic[2][1]!=15){
                return false;
            }
            if(magic[0][2] + magic[1][2] + magic[2][2]!=15){
                return false;
            }
            if(magic[0][0] + magic[1][1] + magic[2][2]!=15){
                return false;
            }
            if(magic[0][2] + magic[1][1] + magic[2][0]!=15){
                return false;
            }
            return true;
            
                
            
        
	
	}

}

