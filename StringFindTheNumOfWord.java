package demo;



public class StringFindTheNumOfWord {

	public static void main(String[] args) {
		String str="Hello testleaf is you are awesome";
		int count=0;
		
		 String [] split=str.split(" ");
	      for(int i=0;i<split.length;i++){
				count++;
			System.out.println(split[i]);
				
		}
	      System.out.print(count);
	}

}
