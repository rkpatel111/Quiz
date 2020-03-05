package com.lambdaexpression.test1;
@FunctionalInterface
interface A{
	public int m1(int a,int b);
}
public class Test1 {	
	public static void main(String[] args) {	
		
		A a=(int a1,int b1)->{return(a1+b1);};
		int res=a.m1(10,20);
		System.out.println(res);
		
	}

}
