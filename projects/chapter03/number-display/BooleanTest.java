
/**
 * Just something to dick around with booleans.
 *
 * @author Olav Valle   
 * @version 0.1
 */
public class BooleanTest
{
    private boolean a;
    private boolean b;
    
    public BooleanTest()
    {
        this.a = true;
        this.b = true;
    }
    // either both True or both False evaluates to True
    public void both(boolean bothA, boolean bothB)
    {
        this.a = bothA;
        this.b = bothB;
        System.out.println(a == b);
    }
    
    // an exclusive-or. True when a and b are different
    public void xOr(boolean xorA, boolean xorB)
    {
        this.a = xorA;
        this.b = xorB;
        System.out.println(! (a == b));
    }

    // an expression that returns the same as "a && b" would, without using
    // the && operator
    public void noAnd(boolean a, boolean b)
    {
        this.a = a;
        this.b = b;
        System.out.println( !((a == false) || (b == false)));
    }
    
}