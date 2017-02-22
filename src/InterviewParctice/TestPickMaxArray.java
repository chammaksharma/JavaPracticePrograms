package InterviewParctice;

public class TestPickMaxArray {

	int sortNumber(int[] a1) {
		int temp1;
		temp1 = a1[0];
		for (int i = 0; i < a1.length; i++) {
			if (temp1 < a1[i]) {
				temp1 = a1[i];
			}
		}
		return temp1;
	}

	public static void main(String args[]) {

		int[] a1 = { 1, 7, 3, 4, 6 };

		TestPickMaxArray tPMA = new TestPickMaxArray();
		int a = tPMA.sortNumber(a1);
		System.out.println("The sorted max no is : " + a);
	}
}
