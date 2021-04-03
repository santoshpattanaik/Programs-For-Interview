package allprogram.backup;

public class Annagram {

	public static void main(String args[]){
		
		String s1="peek";
		String s2="kepi";
		int found=0,notfound=0;
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		/* Arrays.sort(c1);
		 Arrays.sort(c1);*/
		
		 if(c1.length == c2.length){
			 System.out.println("equallength");
			 
			 for(int i=0;i<=c1.length-1;i++)
			 {
				 found=0;
				 for(int k=0;k<=c2.length-1;k++){
					 
					 if(c1[i]==c2[k]){
						 found=1;
						 break;
					 }
				 }
				 
				 if(found==0){
					 notfound=1;
				 }
			 }
			 if(notfound==1){
				 System.out.println("not annagram");
			 }else{
				 System.out.println("annagram");
			 }
		 }else
		 {
			 System.out.println("Notequalstring");	 
		 }
			 
		/*ArrayList<String> l3=new ArrayList<String>();
		Set<String> s= new HashSet<String>();
		boolean b=true;
		for(String temp:l1){
			if(b==s.add(temp)){
				l3.add(l2.contains(temp)?"yes":"NO");
			
			}else{
				l3.add("NO");				
			}
			System.out.println(l3);					
		}*/
		
	}
	
}
