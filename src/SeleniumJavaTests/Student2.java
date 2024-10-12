package SeleniumJavaTests;

public class Student2 {
	
	int add(int a,int b)
	{
		int c=a+b; //30
		
		return c;//30(int type value)
		
	}
	
	public static void main(String[] args)  {
		
		Student2 S = new Student2();
	
		int result = S.add(10,20);  //30
		
		System.out.println(result);
	}
}


