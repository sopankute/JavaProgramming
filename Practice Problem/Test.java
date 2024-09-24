
import java.util.Date; 
import java.sql.*; 
import java.io.*;
//  class Test 
// { 
	//  Test(){
	// 	this(10);
	// }
	//  Test(int i){
	// 	this();
	// }

	// int p;
	// public static void main(String args[]){ 
 		// Test t = new Test();

 // 		int i=0;
 // 		int j = i++ + ++i + --i + i;
 // 		System.out.println(i);
	// System.out.println(" "+j); 	
	
		// Test k;
		// System.out.println(k.p);

		// try{
		// 	// System.exit(0);
		// 	return;
		// }finally{
		// 	System.out.println("hahaha");
		// }


		// String a, b,c;
		// c= new String("hum");
		// a= new String("tum");
		// b=a;
		// a= new String("dum");
		// c=b;
		// System.out.println(c);

		// RuntimeException Milka = null;
		// throw Milka;

		// char ch;
		// int i;
		// ch = 'a';
		// i = ch;
		// i++;
		// h=i;
		// ch++;
		// System.out.println(ch);
		// System.out.println(i);


		// int x=20;
		// String sup = (x<15)?"small":(x<22)?"tiny":"huge"; 
		// System.out.println(sup);


		// int x=100;
		// double y=100.1;
		// boolean b=(x=y);
		// System.out.println(b);
// 	}
// } 

// public class Test{	
// 	public static void main(String[] args) {
// 	// 	// int w = (int)888.88;
// 	// 	// byte x = (byte)100L;
// 	// 	// long y = (byte)129;
// 	// 	// float z = (float)100L;
// 	// 	// System.out.println(w);
// 	// 	// System.out.println(x);
// 	// 	// System.out.println(y);
// 	// 	// System.out.pryintln(z);

// 	// 	// int arr[] = new int [5];
// 	// 	//  System.out.print(arr);

// 	// 	// int x = 5;
// 	// 	// x *= 3+7;
// 	// 	// System.out.println(x);

// 	}
// }

// class MyArrayList extends java.util.ArrayList 
// { 
// 	public static void main(String args[]){ 
// 		System.out.println("A class main method is executed"); 
// 	} 
// } 

// class A 
// { 
// 	private final void meth(){ 
// 		System.out.println("A method is executed"); 
// 	} 
// } 
// public class Test  extends A
// { 
// 	public final void meth(){ 
// 		System.out.println("Test method is executed"); // ans
// 	} 
// 	public static void main(String args[]){ 
// 		new Test().meth();
// 	} 
// } 
// class C 
// { 
// public static void main(String args[]){ 

// } 
// } 
// class D 
// { 
// } 

// interface A 
// { 
// 	// public void meth(); 
// } 
//  class B implements A
// { 
// 	// public void meth(){ 
// 	// 	System.out.println("Test method is executed"); // ans
// 	// } 
// 	// public static void main(String args[]){ 
// 	// 	new Test().meth();
// 	// } 
// } 
// class Test extends B 
// { 
// public static void main(String args[]){ 
// // 	System.out.println("jhgdhb");
// // 	new Test().meth()
// } 
// } 

// class Test{
// 	public static void main(String[] args) {
// 		try
// 	{
// 		System.out.println("stmt-1");
// 		System.out.println("stmt-2");
// 		System.out.println("stmt-3");
// 			try
// 			{
// 				System.out.println("stmt-4");
// 				System.out.println("stmt-5");
// 				System.out.println("stmt-6");
// 			}
// 			catch (Exception e1)
// 			{
// 				System.out.println("stmt-7");
// 			}
// 			finally
// 			{
				
// 				System.out.println("stmt-8");
// 			}
// 			int div = 10/0;
// 		System.out.println("stmt-9");
// 	}
// 	catch (Exception e2)
// 	{
// 		System.out.println("stmt-10");
// 	}
// 	finally
// 	{
// 		System.out.println("stmt-11");
// 	}
// 		System.out.println("stmt-12");
// 	}
// }


// class MyThread extends Thread
// {
// public void start()
// {
// 	super.start();
// System.out.println("start method");
// }
// public void run()
// {
// System.out.println("run method");
// }
// }
// class Test
// {
// public static void main(String[] args)
// {
// MyThread t=new MyThread();
// t.start();
// System.out.println("main method");
// }
// }

// class Test
// {
// 	int i=10;
// 	static int j=20;
// 	public void methodOne()
// 	{
// 		int k=30;
// 		final int l=40;
// 		class Inner
// 		{
// 			public void methodTwo()
// 			{
// 				System.out.println(i);
// 				System.out.println(j); 
// 				System.out.println(k);
// 				System.out.println(l);
// 			}
// 		}
// 		Inner i=new Inner();
// 		i.methodTwo();
// 	}
// 	public static void main(String[] args)
// 	{
// 		new Test().methodOne();
// 	}
// }


// class PopCorn
// {
// 	public void taste()
// 	{
// 	System.out.println("spicy");
// 	}
// }
// class Test 
// {
// public static void main(String[] args) 
// {
// 	PopCorn p=new PopCorn()
// 	{
// 		public void taste()
// 		{
// 			System.out.println("salty");
// 			methodOne();//valid call(internal purpose)
// 		}
// 		public void methodOne()
// 		{
// 			System.out.println("child specific method");
// 		}
// 	};
// //p.methodOne();//here we can not call(outside inner class)
// p.taste();//salty
// PopCorn p1=new PopCorn();
// p1.taste();//spicy
// }
// }

// public class Test{ 
// public static void main(String args[]){ 
// byte b=10;
// switch(b)
// {
// case 10:
// System.out.println("10");
// case 100:
// System.out.println("100");
// case 1000:
// System.out.println("1000");

// while(true)
// int x=10;

// 	do while(true)
// System.out.println("hello");
// while(true);


// int a=10,b=20;
// for(int i=0;a<b;i++){
// System.out.println("hello");
// }
// System.out.println("hi");
// }
// }
// class Test
// {
// public void methodOne(int i)
// {
// System.out.println("int-arg method");
// }
// public void methodOne(float f) //overloaded methods
// {
// System.out.println("float-arg method");
// }
// public static void main(String[] args)
// {
// Test t=new Test();
// t.methodOne('a');//int-arg method
// t.methodOne(10l);//float-arg method
// t.methodOne(10.5f);//C.E:cannot find symbol
// }
// }

// class Parent {

// 	public void math_2() {
// 	 	System.out.println("parent class math_2"); //overridden method
// 	 }

// 	 public static void methodOne() {
// 		 System.out.println("parent class");
// 	}
// }
// class Child extends Parent{
// 	public void math_3() { 
// 	 	System.out.println("child class math_3"); 
// 	}

// 	public static void methodOne(){
// 	 	System.out.println("child class");
// 	}
// }
// public class Test{
// 	public static void main(String[] args) {
// 		Parent p=new Parent();
// 		p.methodOne();//parent class

// 		Child c=new Child();
// 		c.methodOne();//child class

// 		Parent p1=new Child();
// 		p1.methodOne();//parent class

// 		 p.math_2();
// 		 // p.math_3();		// Error
// 	}
// }

//  class Parent { 
//  	 public void math_2() {
// 	 	System.out.println("parent class math_2"); //overridden method
// 	 }
// 	 public void marry() {
// 	 	System.out.println("parent class"); 
// 	 }
//  }
//  class Child extends Parent{ 
// 	 public void marry() { 
// 	 	System.out.println("child class"); //overriding method
// 	}
// 	public void math_3() { 
// 	 	System.out.println("child class math_3"); 
// 	}
// }
// class Test {
// 	public static void main(String[] args){
// 		 Parent p=new Parent();
// 		 p.marry();		//(parent method) 

// 		Child c=new Child();
// 		 c.marry();		//(child method)

// 		 Parent p1=new Child();
// 		 p1.marry();		//(child method)
// 		 p.math_2();
// 		 // p.math_3();		// Error
// 	 }
//  }

// class Test 
// {
// static Test t=new Test();
// {
// System.out.println("hello i can print");
// System.exit(0);
// }
// }

//  class Test
//  {
//  public static void main(String args[])
//  {
//  try
//  {
//  throw new NullPointerException ("Hello");
//  System.out.println("A");
//  }
//  catch(ArithmeticException e)
//  {
// System.out.print("B");
//  }
//  }
//  }

// abstract class MyClass { 
// abstract void f(); 
// 	final void g() {} 
// 	final void h() {} // (1) 
// 	protected static int i ; 
// 	private int j; 
// } 
// final class Test extends MyClass { 
// 	Test(int n) { m = n; } //(2) 
// 	public static void main (String[] args) { 
// 	// MyClass mc = new MyClass();
// 	} 
// void f() {} 
// // void h() {} 
// void k() 
// { i++ ; } //(3) 
// void l() 
// { j++ ; } //(4) 
// int m; 
// }


//  class shape 
// {
//  public int H; 
//  public int W; 
//  public shape(int h, int w) 
//  { 
//  	H = h;
//  	 W = w; 
//  } 
//  public double area() 
//  { return 0; } 
//  } 

//  class rectangle extends shape
//  { public rectangle(int p, int q) { 
//  	super(p, q);
//  } 
//  public double area() { 
//  		return H * W; 
//  	} 
//  } 

//  class triangle extends shape 
//  { 
//  	public triangle(int p, int q){ 
//  		super(p, q);	 
//  } 
 	 
//  	 public double area() { return (H * W)/2.0; } 
//  } 
 class Test 
 { 
 	// public static int a = 10;
 	// public static void main(String[] args) { 
 	// 	static int b = 10;
		// System.out.println(b);  
		// System.out.println(a); 
	 // } 
 } 
