package Practice;

public class ArrayOperations {

	public int[] MergeSortedArray(int[] int1, int int2[]) {

		int tl = int1.length + int2.length;
		int[] ans = new int[tl];
		int k = 0;
		int i, j;
		i = j = 0;
		for (k = 0; k < tl; k++) {
			if(i >= int1.length){
				ans[k] = int2[j];
				j++;
				continue;
			}		
			else if(j >= int2.length){
				ans[k] = int1[i];
				i++;
				continue;
			}
			else if (int1[i] < int2[j]) {
				ans[k] = int1[i];
				i++;
			} else {
				ans[k] = int2[j];
				j++;
			}
		}
		return ans;
	}

	public static void main(String args[]) {
		ArrayOperations AO = new ArrayOperations();
		int[] int1 = { 1, 2, 8, 10 };
		int[] int2 = { 6, 7, 8, 9 };
		System.out.print("Array is int1 : ");
		for (int i = 0; i < int1.length; i++) {
			System.out.print(int1[i] + ",");
		}
		System.out.println();
		System.out.print("Array is int2 : ");
		for (int i = 0; i < int2.length; i++) {
			System.out.print(int2[i] + ",");
		}
		System.out.println();
		int[] output = AO.MergeSortedArray(int1, int2);
		System.out.println("Sorted Array is : ");
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
