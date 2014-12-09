package Chapter_5;
// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//          
// ****************************************************************
public class MathUtils
{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException
    {
	int fac = 1;
	if (n < 0)
	{
		throw new IllegalArgumentException("Cannot find factorial of negative numbers");
	}
	else if (n > 16)
	{
		throw new IllegalArgumentException("Arithmetic overflow (values only valid under 17)");
	}
	for (int i=n; i>0; i--)
	    fac *= i;
	return fac;
    }
}