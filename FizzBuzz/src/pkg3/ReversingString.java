package pkg3;

public class ReversingString {

	public static void main(String[] args) {
		String str = "Hello World!!!";
		String reversedStrin=reversingStringUsingSB(str);
		System.out.println("The reversed String came as :: " + reversedStrin);
		String reversedStringWtSB = reversingStringWTSB(str);
		System.out.println("The reversed String with Manually :: " + reversedStringWtSB);

	}

	private static String reversingStringWTSB(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	private static String reversingStringUsingSB(String str) {
		return new StringBuilder(str).reverse().toString();
		
		
	}

}
