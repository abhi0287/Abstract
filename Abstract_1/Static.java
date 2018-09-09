import java.util.*;
class A{
		static int i;
		int j;
		static{
			i=15;
			System.out.println("static block called");
								}
	}
public class Static{
			public static void main(String x[])
	{
		System.out.println(A.i);
	}
}
		
