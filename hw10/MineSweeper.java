// Ask user to enter size of board
// Create N by N array of characters
// Ask user to enter number of mines to be placed on board
// place mines at random locations on board

import java.util.Scanner;
public class MineSweeper{
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        
        // make board
        System.out.println("Enter a board size, n, of integer 2 to 30.");
        int n = myScanner.nextInt();
        char [][] board = new char [n][n];
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
			    board[i][j] = '0';
			}
		}
		
        // place mines
        System.out.println("Enter number of mines of integer 1 to n*n.");
        int m = myScanner.nextInt();
        while (m>0 && m<=(n*n)){
            int x = (int)(Math.random()*n);
            int y = (int)(Math.random()*n);
            if (board[x][y] == '0'){
                board[x][y] = 'M';
                m--;    // decrease m each time a bomb placed
                for (int i=(x-1); i<=(x+1); i++){
                    for (int j=(y-1); j<=(y+1); j++){
                        try{
                            if (board[i][j]=='0'){
                                board[i][j]='1';
                            }
                            else if (board[i][j]=='1'){
                                board[i][j]='2';
                            }
                            else if (board[i][j]=='3'){
                                board[i][j]='4';
                            }
                            else if (board[i][j]=='4'){
                                board[i][j]='5';
                            }
                        }
                        catch (Exception e){
                            // blank, do nothing in exceptions
                        }
                    }
                }
            }
        }
        
        // print board
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}