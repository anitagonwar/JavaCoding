//6. Write a program to insert "tekarch" into vector then insert user inputed number(N) of Z's from 3rd position.delete N charactors from 6th position from vectorExample:if user input =5Then vector stores="tekZZZZZarch"
//Delete 5 character from 6th position so final string="tekZZZh"
package InsertStringSequence;

public class InsertString {
	
	//Function to prepare char sequence and returns as string
	public static String prepareCharSequence(int numOfChars, char charToPrepare) throws  java.lang.ArrayIndexOutOfBoundsException{
		char charSequence[] = new char[numOfChars];
		for (int i = 0; i < numOfChars; i++) {
			charSequence[i] = charToPrepare;
		}
		return new String(charSequence);
	}
	
	//Function to insert string
	public static String insertStringSequence(String originalString, String stringToBeInserted, int index) {
		// Create a new string
		String newString = new String();
		for (int i = 0; i < originalString.length(); i++) {
			// Insert the original string character
			// into the new string
			newString += originalString.charAt(i);
			if (i == index-1) {
				// Insert the string to be inserted
				// into the new string
				newString += stringToBeInserted;
			}
		}
		// return the modified String
		return newString;
	}

	// Function to trims the characters at given position and number of characters to trim
    public static String trimString( String originalString, int positionToDelete, int numOfCharsToDelete) {	
        // Create a new string
        String newString = originalString.substring(0, positionToDelete)
                           + originalString.substring(positionToDelete + numOfCharsToDelete);
        // return the modified String
        return newString;
    }
    
	public static void main(String[] args) {
		InsertString is = new InsertString();
		String charSeq = InsertString.prepareCharSequence(5, 'z');
		String replaceString = InsertString.insertStringSequence("tekarch",charSeq, 3);
		System.out.println(replaceString);
		String finalSubstitutedString = InsertString.trimString(replaceString, 6, 5);
		System.out.println(finalSubstitutedString);

	}
}