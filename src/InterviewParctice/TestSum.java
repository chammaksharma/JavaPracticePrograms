package InterviewParctice;

interface math {
	
void display(String s);
int sum(int a, int b);

}

public class TestSum implements math
{
    @ Override
	public
	void display(String s){
     System.out.println("wel come dear : " + s);
	}

	@Override
	public
    int sum(int a, int b){
     return a+b;
    }


    public static void main(String args[]){

    TestSum sum =  new TestSum();
    sum.display("chamma");
    System.out.println("Sum of 2 integers is : " + sum.sum(2,3));

    }

}