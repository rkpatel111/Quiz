package com.lambdaexpression.test2;

interface Test {

	public void printName();
	default String describeName() {

		return "Hi Ranjit Its a defult method";
	}
}
interface Test1{
	
	public String getName();
}

interface Test3{
	public int add(int a);
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = () -> System.out.println("Hi This is printname method");
		t.printName();
		System.out.println(t.describeName());
		
		Test1 t1 = () -> {
			return "Ranjit Kumar Patel";
		};
		System.out.println(t1.getName());
		
		Test3 t3=(a)-> a;
		
		System.out.println(t3.add(10));
	}

}
