public class Inheritance2 extends Inheritance1 {

//	public static void method1(int a) {
//		System.out.println("the vaue of integer in Inheritance2 is " + a);
//	}

	@Override
	public void method2(int a) {
		System.out.println("the vaue of integer Inheritance2 is " + a);
	}
	
	public static void main(String args[]){
		Inheritance2 i1 = new Inheritance2();
		i1.method1(1);
		i1.method2(2);
	}
}
