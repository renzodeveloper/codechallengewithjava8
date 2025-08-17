package com.codechallengewithjava8.api.e2023;

import java.util.Arrays;

public class RotatePiece {

	public static int[][] rotatePiece(int[][] piece) {
		int height = piece.length;
		int width = piece[0].length;
		int[][] rotatedPiece = new int[width][height];

		for (int i = 0; i < width; i++) {
			for (int j = height - 1; j > -1; j--) {
				rotatedPiece[i][height - 1 - j] = piece[j][i];
			}
		}

		return rotatedPiece;
	}

	public static void main(String[] args) {
//		int[][] originalPiece = { { 1, 1, 1 }, { 0, 0, 1 } };
//		print(originalPiece);
//		int[][][] pieces = new int[4][][];
//		pieces[0] = originalPiece;
		// Print the rotated piece
//		for (int i = 1; i < pieces.length; i++) {		
//			pieces[i]=rotatePiece(pieces[i-1]);
//			print(pieces[i]);
//		}
		
		/*
		String[] strArr = {"L","3","4","4","5","6","2","0","6","5","3","6","6"};
		String[] numbers = Arrays.copyOfRange(strArr, 1, strArr.length);
		
        int[][] board = new int[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (12 - i <= Integer.parseInt(numbers[j])) 
                	board[i][j] = 1;
                else
                	board[i][j] = 0;
            }
        }
        */
        
		//System.out.println("First half of the array:: "+Arrays.toString(values));
        //print(board);
		String input = "001"; // Replace this with your input
        int result = getZeroesAfterLast1(input);
        System.out.println(result);
	}
	
    public static int getZeroesAfterLast1(String str) {
        return Integer.toString(Integer.parseInt(str)).replaceAll("1", "").length();
    }
    
	private static void print(int[][] rotatedPiece) {
		for (int[] row : rotatedPiece) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
