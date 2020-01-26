package com.arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] board = new int[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = i + j;
            }
        }
        for (int[] a : board) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
	}

}
