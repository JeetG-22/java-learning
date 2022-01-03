package chapter6;

public class RouteCipher {

	/**
	 * A two-dimensional array of single-character strings, instantiated in the
	 * constructor
	 */
	private String[][] letterBlock;

	/** The number of rows of letterBlock, set by the constructor */
	private int numRows;

	/** The number of columns of letterBlock, set by the constructor */
	private int numCols;

	// Intializes numRows and numCols data metembers.
	public RouteCipher(int r, int c) {
		numRows = r;
		numCols = c;
		letterBlock = new String[numRows][numCols];
	}

	/**
	 * Places a string into letterBlock in row-major order.
	 * 
	 * @param str the string to be processed Postcondition: if str.length() <
	 *            numRows * numCols, "A" is placed in each unfilled cell if
	 *            str.length() > numRows * numCols, trailing characters are ignored
	 */
	private void fillBlock(String str) { /* to be implemented in part (a) */
		int i = 0;
		for (int row = 0; row < letterBlock.length; row++) {
			for (int col = 0; col < letterBlock[row].length; col++) {
				if (i == str.length()) {
					letterBlock[row][col] = "A";
				} else {
					letterBlock[row][col] = str.substring(i, i + 1);
					i++;
				}
			}
		}
	}

	/**
	 * Extracts encrypted string from letterBlock in column-major order.
	 * Precondition: letterBlock has been filled
	 * 
	 * @return the encrypted string from letterBlock
	 */
	private String encryptBlock() { /* implementation not shown */
		String message = "";
		for (int col = 0; col < letterBlock[0].length; col++) {
			for (int row = 0; row < letterBlock.length; row++) {
				message += letterBlock[row][col];
			}
		}
		return message; // change this return statement
	}

	/**
	 * Encrypts a message.
	 * 
	 * @param message the string to be encrypted
	 * @return the encrypted message; if message is the empty string, returns the
	 *         empty string
	 */
	public String encryptMessage(String message) { /* to be implemented in part (b) */
		if (message.equals("")) {
			return "";
		}
		String encryptMsg = "";
		int i = message.length() / (numRows * numCols);
		int count = 0;
		while (count < i) {
			fillBlock(message.substring(0, (numRows * numCols)));
			encryptMsg += encryptBlock();
			message = message.replace(message.substring(0, (numRows * numCols)), "");
			count++;
		}
		if (message.length() != 0) {
			fillBlock(message.substring(0));
			encryptMsg += encryptBlock();
		}
		return encryptMsg; 
	}

	// This method accepts String to be decrypted, number of row and
	// and number of columns for the letterBlock.
	public String decryptMessage(String message, int nRow, int nCol) {
		letterBlock = new String[nRow][nCol];
		if (message.equals("")) {
			return "";
		}
		String decryptMsg = "";
		int i = (int) (Math.ceil(message.length() / (nRow * nCol)));
		int count = 0;
		int k = 0;
		while (count < i) {
			for (int col = 0; col < letterBlock[0].length; col++) {
				for (int row = 0; row < letterBlock.length; row++) {
					letterBlock[row][col] = message.substring(k, k + 1);
					k++;
				}
			}
			for (int row = 0; row < letterBlock.length; row++) {
				for (int col = 0; col < letterBlock[row].length; col++) {
					decryptMsg += letterBlock[row][col];
				}
			}
			count++;
		}
		return decryptMsg.replaceAll("A", "");
	}

	/* returns the letter block in row X column format as a string */
	public String toString() {
		String letterBlockOutput = "";
		for (int row = 0; row < letterBlock.length; row++) {
			for (int col = 0; col < letterBlock[row].length; col++) {
				letterBlockOutput += letterBlock[row][col] + "\t";
			}
			letterBlockOutput += "\n";
		}
		return letterBlockOutput;
	}

}
