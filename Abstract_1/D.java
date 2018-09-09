
class A{
	 
	
	void print()
	{
				System.out.println(" ");
	}
	void print(int i)
	{
				System.out.println(i);
	}
	void print(double f)
	{
				System.out.println(f);
	}
}
public class D{
		public static void main(String x[])
		{
			A a=new A();
			a.print();
			a.print(2);
			a.print(2.52);
		
		}
		
}
