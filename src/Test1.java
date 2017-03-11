class Test3
{
    int a;
    int b;
 
    //Default constructor
    Test3()
    {
        a = 10;
        b = 20;
    }
     
    //Method that returns current class instance
    Test3 get()
    {
        return this;
    }
     
    //Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }
 
    public static void main(String[] args)
    {
        Test3 object = new Test3();
        object.get().display();
        
        Test2 object2 = new Test2();
        object2.get();
    }
}

//Java code for using 'this' 
//keyword as method parameter
class Test2
{
int a;
int b;

//Default constructor
Test2()
{
   a = 30;
   b = 40;
}

//Method that receives 'this' keyword as parameter
void display(Test2 obj)
{
   System.out.println("a = " + a + "  b = " + b);
}

//Method that returns current class instance
void get()
{
   display(this);
}
}