import java.util.Scanner;

public class Complement {

	static String getBinary(int no) {
		int res = no;
		String s = "";

		if (no == 1) {
			s = "0";
			return s;
		}

		int rem = 0;
		while (res != 1) {
			rem = res % 2;
			res = res / 2;
			s = String.valueOf(rem) + s;
		}

		if (res % 2 == 0) {
			s = "0" + s;
		} else {
			s = "1" + s;
		}
		return s;
	}

	static String getComplementNumber(String s) {
		String sComplement = null;
		s = s.replaceAll("0", "a");
		s = s.replace("1", "0");
		s = s.replace("a", "1");
		sComplement = s;
		return sComplement;
	}

	static int getComplementEquivalentNo(String s) {
		String sComplement = s;
		int no = 0, count=0;
		String temp;
		String[] stemp = sComplement.split("");
		for (int i = stemp.length-1; i > 1; i--) {
			temp = stemp[i];
			if(Integer.parseInt(temp)==1){
				no = no + (int)Math.pow(2, count);	
			}	
			count++;
		}
		return no;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int inputNumber = scanner.nextInt();

		String binaryNumber = getBinary(inputNumber);
		System.out.println("Binary Number: " + binaryNumber);

		String complementNumber = getComplementNumber(binaryNumber);
		System.out.println("Complement of Binary: " + complementNumber);
		
		int ComplementEquivalentNo = getComplementEquivalentNo(complementNumber);
		System.out.println("Complement Equivalent Number: " + ComplementEquivalentNo);
	}

}
