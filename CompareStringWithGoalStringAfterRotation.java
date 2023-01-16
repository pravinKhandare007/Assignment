package daily.string;

public class CompareStringWithGoalStringAfterRotation {
	
	public String rotateString(String s) {
		char[] charArrayOfString = s.toCharArray();
		char intermidiate = charArrayOfString[s.length() -1];
		charArrayOfString[s.length() -1] = charArrayOfString[0];
		charArrayOfString[0] = intermidiate;
		String rotatedString = new String(charArrayOfString);
		return rotatedString;
	}

	public static void main(String[] args) {
		String taget = "cdeab";
		String input = "abcde";
		
		CompareStringWithGoalStringAfterRotation cs = new CompareStringWithGoalStringAfterRotation();
		String rotatedString = cs.rotateString(input);
		if()

	}

}
