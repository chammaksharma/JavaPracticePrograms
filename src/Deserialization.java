import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class Deserialization {
	public static void main(String[] args)
	 {
		Serialization si=null ;
	  try  
	  {
	   FileInputStream fis = new FileInputStream("student.ser");
	   ObjectInputStream ois = new ObjectInputStream(fis);
	   si = (Serialization)ois.readObject();
	  } 
	  catch (Exception e)
	   { e.printStackTrace(); }
	  System.out.println(si.name);
	  System.out. println(si.rid);
	  System.out.println(si.contact);
	 }
	
	
}
