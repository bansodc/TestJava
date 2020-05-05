
public class Student {

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
		}
		

	}

}
