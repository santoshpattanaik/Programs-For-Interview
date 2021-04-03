package allprogram.backup;

import java.io.*;
class Car implements Externalizable {
    int age;
    String name;
    int year;
 
    public Car()
    {
        System.out.println("Default Constructor called");
    }
 
    Car(String n, int y)
    {
        name = n;
        year = y;
        age = 10;
        System.out.println("param Constructor called");
    }
    public void writeExternal(ObjectOutput out) 
                              throws IOException
    {
        out.writeObject(name);
        out.writeInt(age);
        out.writeInt(year);
        System.out.println("write external called");
    }
    public void readExternal(ObjectInput in) 
       throws IOException, ClassNotFoundException
    {
        name = (String)in.readObject();
        age = in.readInt();
        year = in.readInt();
        
        System.out.println("read external called");
    }
    public String toString()
    {
        return ("Name: " + name + "\n" + 
               "Year: " + year + "\n" + 
               "Age: " + age);
    }
}
 
public class ExternExample {
    public static void main(String[] args)
    {
        Car car = new Car("Shubham", 1995);
        Car newcar = null;
        String filename = "E:/javakdkjre/demo.txt";
 
        // Serialize the car
        try {
            FileOutputStream fo = new FileOutputStream(filename);
            ObjectOutputStream so = new ObjectOutputStream(fo);
            so.writeObject(car);
            so.flush();
            System.out.println("Object has been serialized");
        }
        catch (Exception e) {
            System.out.println(e);
        }
 
        // Deserializa the car
        try {
            FileInputStream fi = new FileInputStream(filename);
            ObjectInputStream si = new ObjectInputStream(fi);
            newcar = (Car)si.readObject();
            System.out.println("Object has been deserialized");
        }
        catch (Exception e) {
            System.out.println(e);
        }
 
        System.out.println("The original car is:\n" + car);
        System.out.println("The new car is:\n" + newcar);
    }
}