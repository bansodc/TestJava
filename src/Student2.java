
public class Student2 {

	public static void main(String[] args) {
		int a=0;
		
		try {
			int c=50/a;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not divisible by zero");
		}finally
		{
			System.out.println("finally always executed");
			System.out.println("Complete");
		}
		

	}

}
