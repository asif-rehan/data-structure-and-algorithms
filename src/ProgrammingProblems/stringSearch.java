package practiceJava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class stringSearch {

	public static boolean exist(char[][] board, String word) {
		boolean exists = false;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				exists = search(i, j, word.substring(1));

			}
		}

		return exists;
	}
	private static boolean search(int i, int j, String word) {
		//
		
		return true;
	}

}
