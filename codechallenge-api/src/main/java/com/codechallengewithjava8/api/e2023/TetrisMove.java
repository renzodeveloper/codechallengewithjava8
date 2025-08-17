package com.codechallengewithjava8.api.e2023;

import java.util.Arrays;

public class TetrisMove {

	public static void main(String[] args) {
		String[] strArr1 = { "L", "3", "4", "4", "5", "6", "2", "0", "6", "5", "3", "6", "6" };
		String[] strArr2 = { "I", "2", "4", "3", "4", "5", "2", "0", "2", "2", "3", "3", "3" };
		String[] strArr3 = { "M", "4", "3", "2", "3", "5", "1", "0", "1", "2", "4", "3", "4" };
		System.out.println(TetrisMove(strArr1));
		System.out.println(TetrisMove(strArr2));
		System.out.println(TetrisMove(strArr3));
	}

	public static int[][] getPieceShape(String piece) {
		int[][] result = new int[][] {};
		switch (piece) {
		case "I":
			result = new int[][] { { 1, 1, 1, 1 } };
			break;
		case "J":
			result = new int[][] { { 1, 1, 1 }, { 0, 0, 1 } };
			break;
		case "L":
			result = new int[][] { { 1, 1, 1 }, { 1, 0, 0 } };
			break;
		case "O":
			result = new int[][] { { 1, 1 }, { 1, 1 } };
			break;
		case "S":
			result = new int[][] { { 0, 1, 1 }, { 1, 1, 0 } };
			break;
		case "T":
			result = new int[][] { { 1, 1, 1 }, { 0, 1, 0 } };
			break;
		case "Z":
			result = new int[][] { { 1, 1, 0 }, { 0, 1, 1 } };
			break;
		}
		return result;
	}

	public static int TetrisMove(String[] strArr) {
		int maxLines = 0;
		int[][] piece = getPieceShape(strArr[0]);
		if (piece.length == 0)
			return 0;

		// creating array of pieces with the 4 positions of the piece
		int[][][] arrayPiece = new int[4][][];
		arrayPiece[0] = piece;// adding piece
		for (int i = 1; i < arrayPiece.length; i++) {
			arrayPiece[i] = rotatePiece(arrayPiece[i - 1]);// adding rotated piece
		}
		
		// creating the board and sets the state from user input
		String[] fillLevels = Arrays.copyOfRange(strArr, 1, strArr.length);
		int[][] board = new int[12][12];
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (12 - i <= Integer.parseInt(fillLevels[j]))
					board[i][j] = 1;
				else
					board[i][j] = 0;
			}
		}

		for (int[][] p : arrayPiece) {
			for (int i = 0; i <= 12 - p.length; i++) {
				for (int j = 0; j <= 12 - p[0].length; j++) {
					if (isValid(board, p, i, j)) {
						int lines = getCompletedLines(board, p, i, j);
						if (lines > maxLines)
							maxLines = lines;
					}
				}
			}
		}

		return maxLines;
	}

	// Function to rotate a piece
	public static int[][] rotatePiece(int[][] piece) {
		int numRows = piece.length;
		int numCols = piece[0].length;
		int[][] rotatedPiece = new int[numCols][numRows];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				rotatedPiece[j][numRows - i - 1] = piece[i][j];
			}
		}
		return rotatedPiece;
	}

	// Function to check if a piece placement is legal
	public static boolean isValid(int[][] board, int[][] piece, int x, int y) {
		int width = piece[0].length;
		int height = piece.length;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((board[i + x][j + y] == 1) && (piece[i][j] == 1))
					return false;
			}
		}
		return true;
	}

	// Function to get the score of a piece placement
	public static int getCompletedLines(int[][] board, int[][] piece, int x, int y) {
		int rows = 0;
		int height = piece.length;
		for (int i = 0; i < height; i++) {
			String boardrow = getStringFromRow(board[i + x]);
			String piecerow = getStringFromRow(piece[i]);
			int postOffset = piecerow.length() - getZerosAfterFirst1(piecerow);
			int preOffset = piecerow.indexOf("1");
			piecerow = piecerow.replaceAll("0", "");
			String row = boardrow.substring(0, y + preOffset) + "-" + piecerow + "-"
					+ boardrow.substring(y + postOffset);
			if (row.indexOf("0") < 0)
				rows++;
		}
		return rows;
	}

	private static String getStringFromRow(int[] row) {
		String result = "";
		for (int number : row)
			result += number;
		return result;
	}

	// Helper function to get the number of zeros after the first '1'
	private static int getZerosAfterFirst1(String cad) {
		return Integer.toString(Integer.parseInt(cad)).replaceAll("1", "").length();
	}
}
