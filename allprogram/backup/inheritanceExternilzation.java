package allprogram.backup;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person {
String name="default";
String nationality;
public Person()
{
  System.out.println("Mine.Alfa.Person:Constructor");
}
 
public Person(String name, String nationality) {
  super();
  this.name = name;
  this.nationality = nationality;
}
public String getName() {
  return name;
}
 
public void setName(String name) {
  this.name = name;
}
 
public String getNationality() {
  return nationality;
}
 
public void setNationality(String nationality) {
  this.nationality = nationality;
}
 
}
 
 
  
 class Employee extends Person implements Externalizable{ 
  
  int employeeId;
  String department;
  
  public Employee()
  {
   
  }
  public Employee(int employeeId,String name,String department,String nationality)
  {
   super(name,nationality);
   this.employeeId=employeeId;
   this.department=department;
   System.out.println("Mine.Alfa.Employee:Constructor");
  }
  
  public int getEmployeeId() {
   return employeeId;
  }
  public void setEmployeeId(int employeeId) {
   this.employeeId = employeeId;
  }
  
  public String getDepartment() {
   return department;
  }
  public void setDepartment(String department) {
   this.department = department;
  }
  
   
 @Override
 public void writeExternal(ObjectOutput out) throws IOException {
  
  /*since Mine.Alfa.superclass does not implement externalizable, you need to serialize super class field in this class itself*/
  //Mine.Alfa.superclass fields
  out.writeObject(name);
  out.writeObject(nationality);
  
  // its own fields
  out.writeInt(employeeId);
  out.writeObject(department);
 }
  
 @Override
 public void readExternal(ObjectInput in) throws IOException,
   ClassNotFoundException {
  /*since Mine.Alfa.superclass does not implement externalizable, you need to deserialize super class field in this class itself*/
  //Mine.Alfa.superclass fields
  name=(String) in.readObject();
  nationality=(String) in.readObject();
  
  // its own fields
  employeeId=in.readInt();
  department=(String) in.readObject();
  
 }
 }
public class inheritanceExternilzation {
	
	public static void main(String[] args) {
		 
		  //Serialize
	    String filename = "E:/javakdkjre/demo.txt";
		  Employee emp = new Employee(101,"Arpit","CS","Indian");
		  System.out.println("Before serializing");
		  System.out.println("Emp id: " + emp.getEmployeeId());
		  System.out.println("Name: " + emp.getName());
		  System.out.println("Department: " + emp.getDepartment());
		  System.out.println("Nationality: " + emp.getNationality());
		  System.out.println("************");
		  System.out.println("Serializing");
		  try
		  {
		   FileOutputStream fileOut = new FileOutputStream(filename);
		   ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		   outStream.writeObject(emp);
		   outStream.close();
		   fileOut.close();
		  }catch(IOException i)
		  {
		   i.printStackTrace();
		  }
		 
		  //Deserialize
		  System.out.println("************");
		  System.out.println("Deserializing");
		  emp = null;
		  try
		  {
		   FileInputStream fileIn =new FileInputStream(filename);
		   ObjectInputStream in = new ObjectInputStream(fileIn);
		   emp = (Employee) in.readObject();
		   in.close();
		   fileIn.close();
		  }catch(IOException i)
		  {
		   i.printStackTrace();
		   return;
		  }catch(ClassNotFoundException c)
		  {
		   System.out.println("Mine.Alfa.Employee class not found");
		   c.printStackTrace();
		   return;
		  }
		  System.out.println("After serializing");
		  System.out.println("Emp id: " + emp.getEmployeeId());
		  System.out.println("Name: " + emp.getName());
		  System.out.println("Department: " + emp.getDepartment());
		  System.out.println("Nationality: " + emp.getNationality());
		 }

}
