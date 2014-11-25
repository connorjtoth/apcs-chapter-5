package Chapter_5;
public abstract class Compare3
{
	private int value;
	
	//-----------------------------
	//	CONSTRUCTOR
	//-----------------------------
	public Compare3 (int update)
	{
		value = update;
	}

	//-------------------------------
	//	largest()
	//returns the largest object from three parameters
	//-------------------------------
	public static Comparable largest(Comparable a, Comparable b, Comparable c)
	{
		Comparable bestsofar = a;
		if (bestsofar.compareTo(b) < 0)
		{
			bestsofar = b;
		}
		if (bestsofar.compareTo(c) < 0)
		{
			bestsofar = c;
		}
		return bestsofar;
	}
}
