package allprogram.backup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringWordCount {
	
	public static void main(String args[])
	{
		int count=0;
		String s="I am in cts .and i will work in cts";
		/*String[] wordArray=s.split(" ");
		
		for(String word:wordArray){
			if(word.equalsIgnoreCase("cts")){
				count++;
				
			}
		}*/
		
		
		/*StringTokenizer stoken=new StringTokenizer(s);
		
		while(stoken.hasMoreTokens()){
			if(stoken.nextToken().equalsIgnoreCase("cts")){
				count++;
			}
			
		}*/
		
		String[] wordArray=s.split(" ");
		List<String> stringList = new ArrayList<String>(Arrays.asList(wordArray));
		for(String l:stringList)
		{
			if(l.equals("cts")){
				count++;
			}
				
		}
		System.out.println(count);
	}
}
