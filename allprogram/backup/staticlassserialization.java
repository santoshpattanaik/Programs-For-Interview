package allprogram.backup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class D implements Serializable 
{
	
	public int i;

	public D(int i) {
		
		this.i = i;
		System.out.println("parambaseclass const servizable");
	}
	
	
}

public class staticlassserialization {
	public static void main(String args[])
	{
		D d=new D(2);
		String filename = "E:/javakdkjre/demo.txt";
		
		try{
			FileOutputStream fo=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(fo);
			out.writeObject(d);	
			fo.close();
			out.close();
		}catch(Exception e){
			
		}
		
		D d1=null;
		try{
			FileInputStream fi=new FileInputStream(filename);
			ObjectInputStream in= new ObjectInputStream(fi);
			
			d1=(D)in.readObject();
		}catch(Exception e){
			
		}
		System.out.println(d1.i);		
		
	}

}
