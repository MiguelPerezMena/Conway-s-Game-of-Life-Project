import java.util.Scanner;
//Player goes first and plays 'X'.  Computer plays 'O'
public class TicTacToeAI {
		static int move = 0;  //keeps track of which move it is in the game.
	public static void main(String[] args) 
	{
		char [] [] ttt = new char [3][3];
		int wins = 0;
		int losses =0;
		int ties = 0;
		int gameCount = 0;
		while (gameCount < 1000)  //1000 games played automatically.
			{	
				//start a new game by initializing variables and resetting counters.
				gameCount++;
				System.out.println("##### Game "+ gameCount + " #####");
				move=0;
				initializeBoard(ttt);  //sets all spaces on board to a space ' '
				while(true) //play game until it hits a break command (see below)
					{
						
						playerMove(ttt);
						if(checkPlayerWin(ttt))
							{
								wins++;
//								gameCount=1000;  //I used this to exit the loop to test when the computer lost
								break;	//leave the inner while loops because game is over
							}	
						if(checkCatsGame(ttt))
							{
								ties++;
								break;
							}
						computerMove(ttt);
						
						if(checkComputerWin(ttt))
							{
								losses++;
								break;
							}
					}
		
				}
			outputResults(wins, losses, ties);
	}
	public static boolean checkPlayerWin(char[][] board)
	{
                if(board[0][0]=='X' && board[0][1]== 'X' && board[0][2]=='X'){
                    System.out.println("Player wins!");
                    return true;
                }
                if(board[1][0]=='X' && board[1][1]== 'X' && board[1][2]=='X'){
                    System.out.println("Player wins!");
                    return true;
                }
                if(board[2][0]=='X' && board[2][1]== 'X' && board[2][2]=='X'){
                    System.out.println("Player wins!");
                    return true;
                }
                if(board[0][0]=='X' && board[1][0]== 'X' && board[2][0]=='X'){
                    System.out.println("Player wins!");
                    return true;
                }
                if(board[0][1]=='X' && board[1][1]== 'X' && board[2][1]=='X'){
                    System.out.println("Player wins!");
                    return true;
                }
                if(board[0][2]=='X' && board[1][2]== 'X' && board[2][2]=='X'){
                    System.out.println("Player wins!");
                    return true;
                }
                if(board[0][0]=='X' && board[1][1]== 'X' && board[2][2]=='X'){
                    System.out.println("Player wins!");
                    return true;
                }
                if(board[0][2]=='X' && board[1][1]== 'X' && board[2][0]=='X'){
                    System.out.println("Player wins!");
                    return true;
                }
                return false;
		
		//Returns true if the player wins, false if he didn't win on his turn
		//Check all 8 ways
		//Remember that the player is using 'X'
		//Also output a message stating that the player has won, if indeed he does win
	}
	public static boolean checkComputerWin(char[][] board)
	{
            if(board[0][0]=='O' && board[0][1]== 'O' && board[0][2]=='O'){
                    System.out.println("computer wins!");
                    return true;
                }
                if(board[1][0]=='O' && board[1][1]== 'O' && board[1][2]=='O'){
                  System.out.println("computer wins!");
                    return true;
                }
                if(board[2][0]=='O' && board[2][1]== 'O' && board[2][2]=='O'){
                    System.out.println("computer wins!");
                    return true;
                }
                if(board[0][0]=='O' && board[1][0]== 'O' && board[2][0]=='O'){
                    System.out.println("computer wins!");
                    return true;
                }
                if(board[0][1]=='O' && board[1][1]== 'O' && board[2][1]=='O'){
                  System.out.println("computer wins!");
                    return true;
                }
                if(board[0][2]=='O' && board[1][2]== 'O' && board[2][2]=='O'){
                   System.out.println("computer wins!");
                    return true;
                }
                if(board[0][0]=='O' && board[1][1]== 'O' && board[2][2]=='O'){
                    System.out.println("computer wins!");
                    return true;
                }
                if(board[0][2]=='O' && board[1][1]== 'O' && board[2][0]=='O'){
                    System.out.println("computer wins!");
                    return true;
                }
                
		return false;
		//Returns true if the computer wins, false if he didn't win on his turn
		//Check all 8 ways
		//Remember that the computer is using 'O'
		//Also output a message stating that the player has won, if indeed he does win
		//Identical to checkPlayerWin except for the character checked and the output message.
	}
	public static void initializeBoard( char [] [] board)
	{
		for (int y = 0; y < 3; y++)
			for (int x = 0; x < 3; x++)
				board[x][y] = ' ';
	}
	public static void playerMove(char [] []  board)  //player will always randomly pick an open spot on the board
	{
		int x = (int)(Math.random() * 3);
		int y = (int)(Math.random() * 3);
		while(board[x][y] != ' ')
			{
				 x = (int)(Math.random() * 3);
				 y = (int)(Math.random() * 3);
			}
		board[x][y] = 'X';	
		outputBoard(board);
	}
	public static void outputBoard(char [] [] board)
	{
		//System.out.println("-------------------");
		for (int y = 0; y < 3; y++)
		{	
			for (int x = 0; x < 3; x++)
			{
				if (x!=1)System.out.print("  " + board[x][y]+ "  ");
				else System.out.print("|  " + board[x][y]+ "  |");
			}
			if (y!=2) System.out.println("\n-----------------");
		}
		System.out.println();
		System.out.println();
	}
	public static boolean checkCatsGame(char [] [] board)
	{
		//Since the player goes first, he will also go last, due to there being an odd number of 
		//spaces on the board.  Basically, if there are no spaces left on the board, it's a cat's game
		//since we check for the player win first and there are no more moves for the computer.
		//Be sure to output a message that it is a tie before you return true.
		for (int y = 0; y < 3; y++)
		{
			for (int x = 0; x < 3; x++)
			{
				if (board[x][y]==' ') return false; //if there's a space that's not filled in, it's not a cat's game
			}
		}
		System.out.println("Cat's game.  It's a tie.");
		return true;
	}
        public static boolean tryToWin(char [] []  board){
            //row 1
            
                if(board[0][0]=='O' && board[0][1]== 'O' && board[0][2]==' '){
                    board[0][2] = 'O';
                    return true;
                }
                if(board[0][0]=='O' && board[0][1]== ' ' && board[0][2]=='O'){
                  board[0][1] = 'O';
                    return true;
                }
                if(board[0][0]==' ' && board[0][1]== 'O' && board[0][2]=='O'){
                  board[0][0] = 'O';
                    return true;
                }
                //row 2
                if(board[1][0]==' ' && board[1][1]== 'O' && board[1][2]=='O'){
                  board[1][0] = 'O';
                    return true;
                }
                if(board[1][0]=='O' && board[1][1]== ' ' && board[1][2]=='O'){
                  board[1][1] = 'O';
                    return true;
                }
                if(board[1][0]=='O' && board[1][1]== 'O' && board[1][2]==' '){
                  board[1][2] = 'O';
                    return true;
                }
                //row 3
                if(board[2][0]==' ' && board[2][1]== 'O' && board[2][2]=='O'){
                    board[2][0] = 'O';
                    return true;
                }
                if(board[2][0]=='O' && board[2][1]== ' ' && board[2][2]=='O'){
                    board[2][1] = 'O';
                    return true;
                }
                if(board[2][0]=='O' && board[2][1]== 'O' && board[2][2]==' '){
                    board[2][2] = 'O';
                    return true;
                }
                //column 1
                if(board[0][0]==' ' && board[1][0]== 'O' && board[2][0]=='O'){
                    board[0][0] = 'O';
                    return true;
                }
                if(board[0][0]=='O' && board[1][0]== ' ' && board[2][0]=='O'){
                    board[1][0] = 'O';
                    return true;
                }
                if(board[0][0]=='O' && board[1][0]== 'O' && board[2][0]==' '){
                    board[2][0] = 'O';
                    return true;
                }
                //column 2
                if(board[0][1]==' ' && board[1][1]== 'O' && board[2][1]=='O'){
                 board[0][1] = 'O';
                    return true;
                }
                
                if(board[0][1]=='O' && board[1][1]== ' ' && board[2][1]=='O'){
                  board[1][1] = 'O';
                    return true;
                }
                if(board[0][1]=='O' && board[1][1]== 'O' && board[2][1]==' '){
                    board[2][1] = 'O';
                    return true;
                }
                //column 3
                if(board[0][2]==' ' && board[1][2]== 'O' && board[2][2]=='O'){
                   board[0][2] = 'O';
                   return true;
                }
                if(board[0][2]=='O' && board[1][2]== 'O' && board[2][2]=='O'){
                   board[1][2] = 'O';
                   return true;
                }
                if(board[0][2]=='O' && board[1][2]== 'O' && board[2][2]==' '){
                   board[2][2] = 'O';
                   return true;
                }
                //diagonal left-right
                if(board[0][0]==' ' && board[1][1]== 'O' && board[2][2]=='O'){
                    board[0][0] = 'O';
                    return true;
                }
                if(board[0][0]=='O' && board[1][1]== ' ' && board[2][2]=='O'){
                    board[1][1] = 'O';
                    return true;
                }
                if(board[0][0]=='O' && board[1][1]== 'O' && board[2][2]==' '){
                    board[2][2] = 'O';
                    return true;
                }
                //diagonal right-left
                if(board[0][2]==' ' && board[1][1]== 'O' && board[2][0]=='O'){
                     board[0][2] = 'O';
                    return true;
                }
                if(board[0][2]=='O' && board[1][1]== ' ' && board[2][0]=='O'){
                     board[1][1] = 'O';
                    return true;
                }
                if(board[0][2]=='O' && board[1][1]== 'O' && board[2][0]==' '){
                     board[2][0] = 'O';
                    return true;
                }
            return false;
        }
         public static boolean tryToBlock(char [] []  board){
            if(board[0][0]=='X' && board[0][1]== 'X' && board[0][2]==' '){
                    board[0][2] = 'O';
                    return true;
                }
                if(board[0][0]=='X' && board[0][1]== ' ' && board[0][2]=='X'){
                  board[0][1] = 'O';
                    return true;
                }
                if(board[0][0]==' ' && board[0][1]== 'X' && board[0][2]=='X'){
                  board[0][0] = 'O';
                    return true;
                }
                //row 2
                if(board[1][0]==' ' && board[1][1]== 'X' && board[1][2]=='X'){
                  board[1][0] = 'O';
                    return true;
                }
                if(board[1][0]=='X' && board[1][1]== ' ' && board[1][2]=='X'){
                  board[1][1] = 'O';
                    return true;
                }
                if(board[1][0]=='X' && board[1][1]== 'X' && board[1][2]==' '){
                  board[1][2] = 'O';
                    return true;
                }
                //row 3
                if(board[2][0]==' ' && board[2][1]== 'X' && board[2][2]=='X'){
                    board[2][0] = 'O';
                    return true;
                }
                if(board[2][0]=='X' && board[2][1]== ' ' && board[2][2]=='X'){
                    board[2][1] = 'O';
                    return true;
                }
                if(board[2][0]=='X' && board[2][1]== 'X' && board[2][2]==' '){
                    board[2][2] = 'O';
                    return true;
                }
                //column 1
                if(board[0][0]==' ' && board[1][0]== 'X' && board[2][0]=='X'){
                    board[0][0] = 'O';
                    return true;
                }
                if(board[0][0]=='X' && board[1][0]== ' ' && board[2][0]=='X'){
                    board[1][0] = 'O';
                    return true;
                }
                if(board[0][0]=='X' && board[1][0]== 'X' && board[2][0]==' '){
                    board[2][0] = 'O';
                    return true;
                }
                //column 2
                if(board[0][1]==' ' && board[1][1]== 'X' && board[2][1]=='X'){
                 board[0][1] = 'O';
                    return true;
                }
                
                if(board[0][1]=='X' && board[1][1]== ' ' && board[2][1]=='X'){
                  board[1][1] = 'O';
                    return true;
                }
                if(board[0][1]=='X' && board[1][1]== 'X' && board[2][1]==' '){
                    board[2][1] = 'O';
                    return true;
                }
                //column 3
                if(board[0][2]==' ' && board[1][2]== 'X' && board[2][2]=='X'){
                   board[0][2] = 'O';
                   return true;
                }
                if(board[0][2]=='X' && board[1][2]== 'X' && board[2][2]=='X'){
                   board[1][2] = 'O';
                   return true;
                }
                if(board[0][2]=='X' && board[1][2]== 'X' && board[2][2]==' '){
                   board[2][2] = 'O';
                   return true;
                }
                //diagonal left-right
                if(board[0][0]==' ' && board[1][1]== 'X' && board[2][2]=='X'){
                    board[0][0] = 'O';
                    return true;
                }
                if(board[0][0]=='X' && board[1][1]== ' ' && board[2][2]=='X'){
                    board[1][1] = 'O';
                    return true;
                }
                if(board[0][0]=='X' && board[1][1]== 'X' && board[2][2]==' '){
                    board[2][2] = 'O';
                    return true;
                }
                //diagonal right-left
                if(board[0][2]==' ' && board[1][1]== 'X' && board[2][0]=='X'){
                     board[0][2] = 'O';
                    return true;
                }
                if(board[0][2]=='X' && board[1][1]== ' ' && board[2][0]=='X'){
                     board[1][1] = 'O';
                    return true;
                }
                if(board[0][2]=='X' && board[1][1]== 'X' && board[2][0]==' '){
                     board[2][0] = 'O';
                    return true;
                }
            return false;
        }
	public static void computerMove(char [] []  board)
	{
		//Create a priority of actions for the computer during its turn.
		//Each action can call a boolean method which returns true if it is used
		//Last action would be to pick a random available spot on the board.
		//Replace the random code with more strategic code.
            
            
                if(tryToWin(board)){
                    
                }
                else if(tryToBlock(board)){
                    
                }
                else if(board[1][1]==' '){
                    board[1][1] = 'O';
                }
                 else if(board[1][1]==' '){
                    board[1][1] = 'O';
                }
                else if(board[0][0]==' '){
                    board[0][0] = 'O';
                }
                else if(board[2][0]==' '){
                    board[2][0] = 'O';
                }
                else if(board[0][2]==' '){
                    board[0][2] = 'O';
                }
                else if(board[2][2]==' '){
                    board[2][2] = 'O';
                }
                else if(board[2][0]=='X'&&board[2][2]=='X'&&board[2][1]==' '){
                    board[2][1] = 'O';
                }
                else{
			
			int x = (int)(Math.random() * 3);
			int y = (int)(Math.random() * 3);
			while(board[x][y] != ' ')
				{
					 x = (int)(Math.random() * 3);
					 y = (int)(Math.random() * 3);
				}
			board[x][y] = 'O';		
			outputBoard(board);
                }
//output the board after the computer makes its move
	}

	public static boolean again()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Would you like to play again? (y/n)");
		String answer = s.next();
		if (answer.equals("y")) return true;
		else 
			{
				System.out.println("See ya");
				return false;
			}
		}
	public static void outputResults(int w, int l, int t)
	{
		double winpercent = (double) w / (w+l+t) * 100;
		System.out.println();
		System.out.println("Results so far....");
		System.out.println("Games played = " + (w+l+t));
		System.out.println("Player wins = " + w);
		System.out.println("Computer wins = " + l);
		System.out.println("Cat's Games (Ties) = " + t);
		System.out.printf("Player win percentage = %.2f%%", winpercent);
		System.out.println();
	}
}



