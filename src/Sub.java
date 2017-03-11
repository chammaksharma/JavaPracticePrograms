class Super {
    public Integer getLength()
    {
        return new Integer(4);
    }
}
public class Sub extends Super
{
    public Long getLength(int a, int b)
    {
        return new Long(5);
    }
    
    public Integer getLength()
    {
        return new Integer(5);
    }
    
    public static void main(String[] args)
    {
        Super sooper = new Super();
        Sub sub = new Sub();
        System.out.println(
                sooper.getLength().toString() + "," + sub.getLength().toString() );
        System.out.println(
                sooper.getLength().toString() + "," + sub.getLength(1,2).toString() );
         }
    
        }