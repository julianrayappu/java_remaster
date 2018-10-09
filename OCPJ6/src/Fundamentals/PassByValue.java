package Fundamentals;

public class PassByValue
{
	private int m_number;
	private String m_string;

	public PassByValue(int num, String str)
	{
		this.m_number = num;
		this.m_string = str;
	}

	public String toString()
	{
		String s; // = new String();
		s = "[m_number=" + m_number +
			", m_string=" + m_string + "]";
		return s;
	}

	public void setString(String s)
	{
		this.m_string = s;
	}

	public void setNumber(int number)
	{
		this.m_number = number;
	}

	public String getString() {
		return this.m_string;	// return: pass by value
		// value is copied to new reference which is returned
	}

	public static void alterByAssignment(PassByValue v)
	{
		v = new PassByValue(5, "Five");
		System.out.println("alterByAssignment: v is " + v);
	}

	public static void alterByInvocation(PassByValue v)
	{
		v.setNumber(6);
		v.setString("Six");
		System.out.println("alterByInvocation: v is " + v);
	}


	public static void main(String[] args)
	{
		PassByValue v1 = new PassByValue(1, "One");
		PassByValue v2 = new PassByValue(2, "Two");

		alterByAssignment(v1); // v1 object is not modified, 
							   // only ref is changed in method
							   // this is not visible in 
		System.out.println("v1 is " + v1);

		alterByInvocation(v2); // v2 object is modified, this is visible in main()
		System.out.println("v2 is " + v2);

		System.out.println("Lets get the string in v2 " + v2.getString());

		String canIModify = v2.getString();
		canIModify = canIModify.toUpperCase();
		System.out.println("canIModify is " + canIModify);
		System.out.println("v2 is " + v2);


	}
}
