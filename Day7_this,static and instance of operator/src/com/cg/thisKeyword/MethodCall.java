package com.cg.thisKeyword;
//3.this keyword can be passed as an argument in method call
class B
{
	void print(B B)
	{
		System.out.println("Function 1 is invoked");
	}
	void display()
	{
		print(this);
	}
}

public class MethodCall {

	public static void main(String[] args) {
		B b=new B();
		b.display();

	}

}
