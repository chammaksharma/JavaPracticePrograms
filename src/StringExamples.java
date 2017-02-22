public class StringExamples {

	public static void main(String[] args) {
		String s = "GeeksforGeeks";
		// or String s= new String ("GeeksforGeeks");

		// Returns the number of characters in the String.
		System.out.println("String length = " + s.length());

		// Returns the character at ith index.
		System.out.println("Character at 3rd position = " + s.charAt(3));

		// Return the substring from the ith index character
		// to end of string
		System.out.println("Substring " + s.substring(3));

		// Returns the substring from i to j-1 index.
		System.out.println("Substring  = " + s.substring(2, 5));

		// Concatenates string2 to the end of string1.
		String s1 = "Geeks";
		String s2 = "forGeeks";
		System.out.println("Concatenated string  = " + s1.concat(s2));

		// Returns the index within the string
		// of the first occurrence of the specified string.
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " + s4.indexOf("Share"));

		// Returns the index within the string of the
		// first occurrence of the specified string,
		// starting at the specified index.
		System.out.println("Index of a  = " + s4.indexOf('a', 3));

		// Checking equality of Strings
		Boolean out = "Geeks".equals("geeks");
		System.out.println("Checking Equality  " + out);
		out = "Geeks".equals("Geeks");
		System.out.println("Checking Equality  " + out);

		out = "Geeks".equalsIgnoreCase("gEeks ");
		System.out.println("Checking Equality " + out);

		int out1 = s1.compareTo(s2);
		System.out.println("If s1 = s2 : " + out1);
		
		// Converting cases
		String word1 = "GeeKyMe";
		System.out.println("Changing to lower Case " + word1.toLowerCase());

		// Converting cases
		String word2 = "GeekyME";
		System.out.println("Changing to UPPER Case " + word1.toUpperCase());

		// Trimming the word
		String word4 = " Learn Share Learn ";
		System.out.println("Trim the word " + word4.trim());

		// Replacing characters
		String str1 = "feeksforfeeks";
		System.out.println("Original String " + str1);
		String str2 = "feeksforfeeks".replace('f', 'g');
		System.out.println("Replaced f with g -> " + str2);
		
		int decimalExample = Integer.parseInt("20");
		System.out.println(decimalExample);
        int signedPositiveExample = Integer.parseInt("+20");
        System.out.println(signedPositiveExample);
        int signedNegativeExample = Integer.parseInt("-20");
        System.out.println(signedNegativeExample);
        int radixExample = Integer.parseInt("20",16);
        System.out.println(radixExample);
        int stringExample = Integer.parseInt("geeks",29);
        System.out.println(stringExample);
        
        // Uncomment the following code to check
        // NumberFormatException
 
        //   String invalidArguments = "";
        //   int emptyString = Integer.parseInt(invalidArguments);
        //   int outOfRangeOfInteger = Integer.parseInt("geeksforgeeks",29);
        //   int domainOfNumberSystem = Integer.parseInt("geeks",28);

        int decimalExample1 = Integer.valueOf("20");
        System.out.println(decimalExample1);
        int signedPositiveExample1 = Integer.valueOf("+20");
        System.out.println(signedPositiveExample1);
        int signedNegativeExample1 = Integer.valueOf("-20");
        System.out.println(signedNegativeExample1);
        int radixExample1 = Integer.valueOf("20",16);
        System.out.println(radixExample1);
        int stringExample1 = Integer.valueOf("geeks",29);
        System.out.println(stringExample1);
      
/*        Similarly, we can convert the string to any other primitive data types:
        parseLong() – parses the string to Long
        parseDouble() – parses the string to Double*/
	
        String s11 = "Ram";
        String s22 = "Ram";
        String s33 = new String("Ram");
        String s44 = new String("Ram");
        String s55 = "Shyam";
        String nulls1 = null;
        String nulls2 = null;
 
        System.out.println(" Comparing strings with equals:");
        System.out.println(s1.equals(s22));
        System.out.println(s1.equals(s33));
        System.out.println(s1.equals(s55));
 
        System.out.println(" Comparing strings with ==:");
        System.out.println(s11==s22);
        System.out.println(s11==s33);
        System.out.println(s33==s44);
 
        System.out.println(" Comparing strings with compareto:");
        System.out.println(s11.compareTo(s33));
        System.out.println(s11.compareTo(s44));
        System.out.println(s11.compareTo(s22));
        System.out.println(s11.compareTo(s55));
        
	}
}
