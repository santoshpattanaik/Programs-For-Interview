package allprogram.backup;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

public class StringCompare {
	public static void main(String args[]) {
		
		String s= "stress";
		LinkedHashMap<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		
		char[] c=s.toCharArray();
		for(char c1: c){
			if(map.containsKey(c1)){
				map.put(c1, map.get(c1)+1);
				
			}else
				map.put(c1,1);
			
			
		}
//		get first character
		/*for (Entry<Character,Integer> entry : map.entrySet()) 
		{ 
				if (entry.getValue() == 1 ) {
					System.out.println(entry.getKey());
				break;
				
					}	
		
		}*/
		
//		get last nonrepaetig character
			Set s1=map.entrySet();
			ArrayList<Entry<Character,Integer>> list =new ArrayList<>(s1);
			ListIterator<Entry<Character,Integer>> li=list.listIterator(list.size());
			
			while(li.hasPrevious()){
				System.out.println(li.previous().getKey());
				System.out.println(li.previous().getValue());
				break;
				
			}
		
		/*for(Character key:map.keySet()){
			System.out.println(map.values());
		}*/

		/*for(Character key:map.keySet()){
			System.out.println(map.get(key));
		}*/
		
		
		
	}

}
