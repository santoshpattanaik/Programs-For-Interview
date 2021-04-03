package allprogram.backup;

class Threadodd extends Thread
{
	public void run(){
		
		for(int i=1;i<10;i++){
			int result=i%2;
			if(!(result==0)){
				System.out.println("odd"+i);
			}
			
			
		}
	}
}

class Threadeven extends Thread
{
public void run(){
		
		for(int i=1;i<10;i++){
			int result=i%2;
			if(result==0){
				System.out.println("even"+i);
			}
			
			
		}
	}
	
}
public class MycustomThread {
	
	public static void main(String args[]){
		Threadodd odd = new Threadodd();
		Threadeven even = new Threadeven();
		odd.start();
		even.start();
	}
	
	
}
