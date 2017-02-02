package InterFaces;

public class interfaces {

	// : c08:MultiInterfaces.java
	// Two ways that a class can implement multiple interfaces.
	// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
	// www.BruceEckel.com. See copyright notice in CopyRight.txt.

	interface A {
		void displayA();
	}

	interface B {
		void displayB();
	}

	public class X implements A, B {
		@Override
		public void displayA() {
			System.out.println("Display A  class X");

		}

		@Override
		public void displayB() {
			// TODO Auto-generated method stub
			System.out.println("Display B class X");
		}
	}

	class Y implements A {
		public void displayA() {
			System.out.println("Display B  class Y");
		}

		B makeB() {
			// Anonymous inner class:
			return new B() {

				@Override
				public void displayB() {
					// TODO Auto-generated method stub
					System.out.println("DisplayB  class Y");

				}
			};
		}
	}

}
