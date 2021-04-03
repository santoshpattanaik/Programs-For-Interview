package allprogram.backup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A
{
	int j;
	
	public A(){
		System.out.println("noargconst super");
	}
	public A(int j) {
		System.out.println("paramoargst Mine.Alfa.superclass");
		this.j = j;
	}

	
}
class B extends A implements Serializable
{
	
	int i;
//	public Mine.Alfa.B(){
//		System.out.println("noarg const servizable");
//	}

	public B(int j, int i) {
		super(j);
		this.i = i;
		System.out.println("parambaseclass const servizable");
	}
	
	
}

public class InheritedSerization {
	public static void main(String[] args)
	{ 
		
		B object = new B(1,2);
		String filename = "E:/javakdkjre/demo.txt";
		
		// Serialization 
		try
		{ 
			//Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Method for serialization of object
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");

		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}


		B object1 = null;

		// Deserialization
		try
		{ 
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization of object
			object1 = (B)in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.i);
			System.out.println("b = " + object1.j);
			
		}
		
	catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}

	}

}
