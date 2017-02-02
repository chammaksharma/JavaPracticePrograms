import java.io.*;


public class Serialization implements Serializable{
	
	String name;
	int rid;
	static String contact;  // value will be null -- default value of string
	// use static or transient key word to avoid serialization of that field
//	static int contact; // value will be 0 -- default value of int
	
	Serialization(String name, int rid, String contact){
		this.name = name;
		this.rid = rid;
		this.contact = contact;
	}
	
	public static void main(String args[]) {

		try {
			Serialization student = new Serialization(
					"chamma", 1, "6345342");
			FileOutputStream fos = new FileOutputStream("student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			oos.close();
			fos.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	}

}
