
public class DerivedClass extends BaseClass{

	public static void m2(){
		System.out.println("m2 output");
	}
	
	public static void main(String args[]){
		DerivedClass.m2();
		
		BaseClass bc = new DerivedClass();
		BaseClass.m1();
		((DerivedClass) bc).m1();	
		bc.m1();
		((DerivedClass) bc).m2();
		
		//gives compile time error without casting
		// DerivedClass dc = new BaseClass();
		
		//gives classcastexception
		//DerivedClass dc = (DerivedClass) new BaseClass();
		

	}
	
}
	