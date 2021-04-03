package allprogram.backup;

public class substringcalculator {
	
	public  static void calculateSubstring(String s){
	int length=s.length();
	for(int i=0;i<length-1;i++){
		
		for(int j=1;j<=length-i;j++){
			System.out.println(s.substring(i,j+i)+" "+i+" "+j);
			
		}
		
	}
		
		
	}
	public static void main(String args[]){
		String s="sudipta";
		calculateSubstring(s);
		
	}

}
