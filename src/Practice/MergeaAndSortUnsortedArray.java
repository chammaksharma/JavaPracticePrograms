package Practice;

public class MergeaAndSortUnsortedArray {

	public static int[] mergeUnsortedArry(int a1[], int a2[]) {

		int tl = a1.length + a2.length;
		int[] ans = new int[tl];

		return ans;
	}

	public static void main(String args[]) {
		int[] a1 = { 2, 35, 3, 1 };
		int[] a2 = { 3, 1, 23 };
		int[] output = mergeUnsortedArry(a1, a2);
		System.out.println("Sorted Array is : ");
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
