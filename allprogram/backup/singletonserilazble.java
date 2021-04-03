package allprogram.backup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

class Customer implements Serializable {
 
    // serialVersionUID
    private static final long serialVersionUID = 1L;
 
    // to always, return same instance
    private volatile static Customer CUSTOMER = new Customer();
 
    // private constructor
    private Customer() {
        // private constructor
    }
 
    // create static method to get same instance every time
    public static Customer getInstance(){
        return CUSTOMER;
    }
 
    // readResolve method
   private Object readResolve()throws ObjectStreamException 
   {
	   return CUSTOMER;
   }
    // other methods and details of this class
}
public class singletonserilazble {
	public static void main(String[] args) {
		 
        // create an customer object 
        Customer serializeCustomer = Customer.getInstance();
        String filename = "E:/javakdkjre/demo.txt";
 
        // creating output stream variables
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
 
        // creating input stream variables
        FileInputStream fis = null;
        ObjectInputStream ois = null;
 
        // creating customer object reference 
        // to hold values after de-serialization 
        Customer deSerializeCustomer = null;
 
        try {
            // for writing or saving binary data
            fos = new FileOutputStream(filename);
 
            // converting java-object to binary-format 
            oos = new ObjectOutputStream(fos);
 
            // writing or saving customer object's value to stream
            oos.writeObject(serializeCustomer);
            oos.flush();
            oos.close();
 
            System.out.println("Serialization: "
                    + "Mine.Alfa.Customer object saved to Mine.Alfa.Customer.ser file\n");
 
            // reading binary data
            fis = new FileInputStream(filename);
 
            // converting binary-data to java-object
            ois = new ObjectInputStream(fis);
 
            // reading object's value and casting to Mine.Alfa.Customer class
            deSerializeCustomer = (Customer) ois.readObject();
            ois.close();
 
            System.out.println("De-Serialization: Mine.Alfa.Customer object "
                    + "de-serialized from Mine.Alfa.Customer.ser file\n");
        } 
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }
 
        // printing hash code of serialize customer object
        System.out.println("Hash code of the serialized "
                + "Mine.Alfa.Customer object is " + serializeCustomer.hashCode());
 
        // printing hash code of de-serialize customer object
        System.out.println("\nHash code of the de-serialized "
                + "Mine.Alfa.Customer object is " + deSerializeCustomer.hashCode());
    }

}
