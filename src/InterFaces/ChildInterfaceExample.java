package InterFaces;

public class ChildInterfaceExample extends ParentTestInheritance implements Interface1, Interface2 {

	@Override
	public void displayA() {
		// TODO Auto-generated method stub
		System.out.println("Test Interface1");
	}

	@Override
	public void displayB() {
		// TODO Auto-generated method stub
		System.out.println("Test Interface2");
	}

	public void displayIE() {
		// TODO Auto-generated method stub
		System.out.println("Test InterfaceExample");
	}

	public static void main(String args[]) {
		ChildInterfaceExample ie1 = new ChildInterfaceExample();
		ie1.displayA();
		ie1.displayB();
		ie1.displayIE();
		ie1.displayC();
		
		ParentTestInheritance ie2 = new ChildInterfaceExample();
		ie2.displayC();
		((ChildInterfaceExample) ie2).displayA();
		
		ParentTestInheritance ie3 = new ParentTestInheritance();
		ie3.displayC();
		
		ParentTestInheritance ie5 = (ParentTestInheritance) new ChildInterfaceExample();
		((ChildInterfaceExample) ie5).displayA();
		
		//***********Compile error
		// ChildInterfaceExample ie4 = new ParentTestInheritance();
		
		
		//***********Run time error
		//cast exception - cant cast parent to a child
		//((ChildInterfaceExample) ie3).displayA();
		
		//ParentTestInheritance ie6 = new ParentTestInheritance();
		//((ChildInterfaceExample) ie6).displayA();
		
		//ChildInterfaceExample ie4 = (ChildInterfaceExample) new ParentTestInheritance();

	}

}
