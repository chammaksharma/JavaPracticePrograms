package InterviewParctice;

import java.util.ArrayList;
import java.util.List;

public class TestArraylistMin {

	int sortNumber(ArrayList<Integer> a1) {
		int temp1;
		temp1 = a1.get(0);

		/*
		 * for (int i = 0; i < a1.size(); i++) { if (temp1 < a1.get(i)) { temp1
		 * = a1.get(i); } }
		 */

		for (int a2 : a1) {
			if (a2 < temp1) {
				temp1 = a2;
			}
		}

		return temp1;
	}

	public static void main(String args[]) {

		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(3);
		a1.add(2);
		a1.add(4);
		a1.add(6);

		TestArraylistMin tALM = new TestArraylistMin();
		int a = tALM.sortNumber((ArrayList<Integer>) a1);
		System.out.println("The sorted max no is : " + a);

	}
}
