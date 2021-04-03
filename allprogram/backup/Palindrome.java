package allprogram.backup;

public class Palindrome {
	
	
	public static void main(String args[]){
		String s1="dad";
		String[] wordArray=s1.split("");
		String reverse ="";
		int lenth=wordArray.length;
		
		for(int i=lenth-1;i>=0;i--){
			reverse=reverse + s1.charAt(i);
		}
		if(s1.equals(reverse)){
			System.out.println("palindrome");
		}
		
	}
	

}
