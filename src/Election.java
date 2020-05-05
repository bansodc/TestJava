
public class Election {

	public static void validate(int age)throws ArithmeticException
	{
		if(age<=18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("welcome");
		}
	}
	
	public static void main(String[] args) {
	
		try {
			validate(13);
		} catch (Exception e) {
			System.out.println("age not valid");
			e.printStackTrace();
		}
		

	}

	

}
