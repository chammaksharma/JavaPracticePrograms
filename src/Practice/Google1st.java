package Practice;

import java.util.ArrayList;

public class Google1st {

	public static String result(ArrayList a1, int x) {

		for (int i = 0; i < a1.size(); i++) {
			if((int) a1.get(i) > x){
				System.out.println(a1.get(i));
				continue;
			}
			
			int y = x - (int) a1.get(i);
			System.out.print(a1.get(i));
			for (int j = i+1; j < a1.size(); j++) {
				System.out.println(a1.get(j));
				if (a1.get(j).equals(y)) {
					String op = ("yes " + a1.get(i) + " and " + a1.get(j));
					return op;
				}
			}
		}
		return "  no";
	}

	public static void main(String args[]) {
		int x = 5;
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(-4);
		a1.add(27);
		a1.add(3);
		a1.add(9);
		a1.add(24);
		a1.add(2);
		a1.add(8);
		
		System.out.println("");
		System.out.println(result(a1, x));
	}
}
