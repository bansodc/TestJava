
public class TestThrow {
	public static void validate(int age)
	{
		if(age<=18)
		{
			throw new ArithmeticException ("age under 18");
			
		}else
		{
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {
	
		 validate(19);
		System.out.println("rest of code");
	}

}
