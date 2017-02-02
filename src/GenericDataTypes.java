import java.util.ArrayList;


public class GenericDataTypes {

	public static void main(String args[]){
	//	ArrayList a1 = new ArrayList<>();
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("chamma");
		a1.add("1");
		for (String temp : a1) {
			System.out.println(temp);
		//	for (int i = 0; i < a1.size(); i++) {
		//	System.out.println(a1.get(i));

		}
	}
}
