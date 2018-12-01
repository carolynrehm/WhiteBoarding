package com.revature;

public class TicTacToe {

	public static boolean evaluate(char[][] board) {
		if(board == null) {
			return false;
		}
		if(board.length != 3) {
			return false;
		}
		if (board[0].length !=3 || board[1].length !=3 ||board[2].length !=3) {
			return false;
		}
		//check horizontal rows
		for(int i = 0; i<3; i++) {
			if(board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
				return true;
			}
		}
		//check vertical rows
		for(int i = 0; i<3; i++) {
			if(board[0][i]==board[1][i] && board[1][i]==board[2][i]) {
				return true;
			}
		}
		//check diagonal rows
		if(board[0][0]==board[1][1] && board[1][1]== board[2][2]) {
			return true;
		}
		if(board[0][2]==board[1][1] && board[1][1]== board[2][0]) {
			return true;
		}
			
		return false;	
	}


	public static void main(String[] args) {
		char[][] board1 = {
				{'o','x','o'},
				{'x','x','o'},
				{'o','o','x'}
			};
		System.out.println(evaluate(board1));
		char[][] board2 = {
				{'o','x','o'},
				{'x','o','o'},
				{'o','o','x'}
			};
		System.out.println(evaluate(board2));
		char[][] board3 = {
				{'o','o','o'},
				{'x','x','o'},
				{'o','o','x'}
			};
		System.out.println(evaluate(board3));
	}

}
