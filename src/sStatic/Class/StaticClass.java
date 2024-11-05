package sStatic.Class;


class InnerClass{
//	public int nonStaticVar;
	//public static int staticVar;
	
	static class StaticInnerClass{
		int innerNonStaticVar =10;
		static int innerStaticVar =50;
		
		static String helo="Hello world";
	}
}

public class StaticClass {

	public static void main(String[] args) {

		System.out.println(InnerClass.StaticInnerClass.innerStaticVar);
		System.out.println(InnerClass.StaticInnerClass.helo);
	}

}

