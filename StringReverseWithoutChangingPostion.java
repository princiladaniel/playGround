package demo;

public class StringReverseWithoutChangingPostion {

	public static void main(String[] args) {
		String str="Testleaf-Software=Great-Value";
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i>=0; i--) {
				System.out.print(ch[i]+" ");
			}
		
			
		}
}
