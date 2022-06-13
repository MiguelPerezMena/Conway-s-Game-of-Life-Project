/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

/**
 *
 * @author 603612
 */
import java.util.Scanner;
public class GameOfLife 
{
    public static void main(String[] args) 
    {
        int counter=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int row = s.nextInt();
        int column = s.nextInt();
        char [] [] board = new char [row] [column]; 
        intitalizeBoard(board);
        System.out.println("Enter number of starting organisms: ");
        int organisms = s.nextInt();
        System.out.println("How many turns would you like your simulation to go? ");
        int turnNum = s.nextInt();
        place(organisms,board);
        outputBoard(row,column,board);
        boolean finished = false;
        int turns =0;
        while(!finished)
        {
            turns++;
            board = evolve(board);
            //evolve the board
            //check for the things that would end the simulation:
                //still life is reached
                //death is reached
                //max turns is reached
             System.out.println("Turn #"+turns);
             outputBoard(row,column,board);
             if (turns==turnNum)finished = true;
             if(isDeath(board))
             {
                 finished = true;
                 System.out.println("Finished in death");
             }
//             DOES NOT WORK (STILL LIFE)
//             else if (isStillLife(board)) 
//             {
//                 finished = true;
//                 System.out.println("Finished in Still life");
//             }
        }
        
        // Order, maybe of doing things
        // Rows, columns, starting organisms, turns
        // Place organisms in 2D array
        // First thing to get is rows and columns
        // Declare a 2D array based of previous decisions
        // Char array where "." is an empty cell and "O" is a living organism 
        // Initialize the array and fill the board in (in a method) 
        // Get # of starting organims from the user
        // Then place the organism on the board
        // To place use a while loop and then create a counter that has to reach the number of organims required
        // In loop get row and column that the organism is supposed to go in
        // check if data given is valid (maybe in a seperate method...)
        // To populate it use a for loop to match the coordinate and put the method after each coordinate wanted so that you only need one coordinate variable
        // Also don't let user place organism on top of other organisms (maybe using a method
        
        // Getting turns from user
        // For loop or maybe a while loop so that no break statements are used
        // after that output the board
        // check for stopping conditions:
        // *Still life
        // *Death
        // *Reached number of turn the user specified
        
        // Evolving the board (place or don't place
        // If statement to check when it will not spawn over when it will would probably make it easier 
        // method to count adjacencies method 
        // To check whether spot turns into an O or stays blank 
        // Specical conditions for left, right,bottom, and top as well as corners...
        // While evolving the board maybe create a new 2D array 
        
        // Extra credit:
        // detecting a repeater or oscillator 
        
        // optiontal (3D array)
        // when moving to check if a slot is an O use [column-1] to move the checking left,right,up, and down
        //declare new array same size as original
        // using nested for loops to chek every space in the board
        // special condition for top and below
        // num of row board,length
        // numb of columns board[0].length
        // check each cell individually and then add adjecencies counter to check if you should spawn a organism
    }
    public static void intitalizeBoard(char [] [] board)
    {
		for (int r = 0; r < board.length; r++)
			for (int c = 0; c < board[0].length; c++)
				board[r][c] = '.';
	 
    }
    public static void outputBoard(int r, int c,char [] [] board)
	{
	         for(int x=0; x < board.length; x++)
	         {
	            for(int y =0; y < board[0].length; y++)
	            {
	               System.out.print(board[x][y]+" ");
	            }      
	            System.out.println();
	         }
	}
    public static void place (int orgReq,char [] [] board)
        {
            Scanner s = new Scanner(System.in);
            int counter = 0;
            while(counter!=orgReq)
            {
     
                System.out.println("Place organism #"+(counter+1));
                int r =s.nextInt();
                int c = s.nextInt();
                if (isPlaceValid(r,c,board))
                {  
                    board[r][c]='O';
                    counter++;
                }
                else System.out.println("Invalid input try again");
                
                
            }
            
        }
    public static char [] []  evolve(char [] [] board)
    {
       //visit every cell in the board
        //count its adjacent living organisms and look at its current contents to determine
        //if this cell in the new array should be 'O' or '.'
        //if (c>0&&board[r][c-1]=='O') oCount++;
        //if r<board.length-1&&board[r+1][c]='o')oCount++;
       int oCount=0;
       //b is the new board
        char [] [] b=new char[board.length][board[0].length];
        for(int r=0; r<b.length;r++)
            for(int c=0;c<b[0].length;c++)
            {
                oCount=0;
                //8 IFs
                //left
                if (c>0&&board[r][c-1]=='O')oCount++;
                //right
                if (c<board[0].length-1&&board[r][c+1]=='O')oCount++;
                //up and right
                if (r> 0 && c<board[0].length-1&&board[r-1][c+1]=='O')oCount++;
                //up and left
                if (r> 0 && c>0&&board[r-1][c-1]=='O')oCount++;
                //up
                if (r> 0 && board[r-1][c]=='O')oCount++;
                //down
                if (r<board.length-1 && board[r+1][c]=='O')oCount++;
                //down and right
                if (r<board.length-1 && c<board[0].length-1 && board[r+1][c+1]=='O')oCount++;
                //down and left
                if (r<board.length-1 && c>0 && board[r+1][c-1]=='O')oCount++;
                
                //Do I spawn life here?
                if(oCount==3 && board[r][c]=='.') b[r][c]='O';
                else if((oCount==2||oCount==3)&&board[r][c]=='O')b[r][c]='O';
                else b[r][c]='.';
                
            }
        
        return b;
    }
    public static boolean isPlaceValid(int r, int c, char [] [] board)
    {
        if (r>=board.length||r<0)return false;
        if (c>=board[0].length||c<0)return false;
        if (board[r][c]=='O')return false;
        return true;
    }
    public static boolean isDeath(char [] [] board)
    {
        int dotCount=0;
        for (int r=0; r<board.length;r++)
            for(int c=0;c<board[0].length;c++)
            {
                if (board[r][c]=='.')dotCount++;
                if(dotCount==board.length*board[0].length)return true;
            }
        return false;
    }
public static boolean isStillLife(char [] [] board)
    {
        int oCount= 0;
        int o2Count= 0;
        char [] [] evolved=new char[board.length][board[0].length];
        evolved = evolve(board);
        for (int r = 0; r < board.length; r++) 
            for (int c = 0; c < board[0].length; c++) 
            {
                if (evolved[r][c]=='O') oCount++;
                if(board[r][c]=='O') o2Count++;
            }
        if(oCount==o2Count)return true;
        return false;
    }
}

