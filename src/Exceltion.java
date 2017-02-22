
public class Exceltion {

		public static void throwit()
		{
		    throw new RuntimeException();
		}
		public static void main(String args[])
		{
		try
		    {
		        System.out.println("Hello world ");
		      //  System.exit(0);
		        throwit();

		        System.out.println("Done with try block ");
		}
        catch(RuntimeException e){
        	System.out.println("catch block");
        }
		finally
        {
            System.out.println("Finally executing ");
} }
}
