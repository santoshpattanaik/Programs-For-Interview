package allprogram.backup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareArray {

	private static final boolean String = false;


	public static void main(String args[]){
	
		List<String> l1= new ArrayList<String>();
		l1.add("M");
		l1.add("Mine.Alfa.A");
		l1.add("R");
		l1.add("Y");
		l1.add("Mine.Alfa.A");
		
		
		List<String> l2= new ArrayList<String>();
		l2.add("Mine.Alfa.A");
		l2.add("R");
		l2.add("M");
		l2.add("Y");
		
		ArrayList<String> l3=new ArrayList<String>();
		Set<String> s= new HashSet<String>();
		boolean b=true;
		for(String temp:l1){
			if(b==s.add(temp)){
				l3.add(l2.contains(temp)?"yes":"NO");
			
			}else{
				l3.add("NO");
				
				
			}
			System.out.println(l3);
			
			
		}
		
	}
	
	
}
