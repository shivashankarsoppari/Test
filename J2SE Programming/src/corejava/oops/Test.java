
package corejava.oops;
class A{
	A()
	{
		System.out.println("A");
	}
}
class B extends A {
	B()
	{
		
	}
}
public class Test extends B{
	
	Test()
	{
		
		System.out.println("Test"); 
	}
	public static void main(String []a)
	{
	
		Test t = new Test();
	
	}
}