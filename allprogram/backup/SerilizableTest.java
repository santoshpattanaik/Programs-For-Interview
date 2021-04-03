package allprogram.backup;// Java code for serialization and deserialization
// of a Java object
import java.io.*;
class superclass implements Serializable
{
	 int j;
	
	public superclass(){
		System.out.println("noargconst super");
	}
	public superclass(int j) {
		System.out.println("paramoargst Mine.Alfa.superclass");
		this.j = j;
	}

	
}
class SerilizableExample extends superclass
{
	
	int i;
	public SerilizableExample(){
		System.out.println("noarg const servizable");
	}

	public SerilizableExample(int j, int i) {
		super(j);
		this.i = i;
		System.out.println("parambaseclass const servizable");
	}
	
	
}

class SerilizableTest
{
	public static void main(String[] args)
	{ 
		
		SerilizableExample object = new SerilizableExample(1,2);
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


		SerilizableExample object1 = null;

		// Deserialization
		try
		{ 
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization of object
			object1 = (SerilizableExample)in.readObject();
			
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
