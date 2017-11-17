package com.org.test;

import java.util.Scanner;

class D{
	public int add(int a, int b, int c, int d, int e){
		int total = a +b+c+d+e;
		return total;
	}
}

class A{
	public void print(){
		System.out.println("Class Name: A");
		System.out.println("First Rank");
	}
}
class B extends A{
	public void print(){
		System.out.println("Class Name: B");
		System.out.println("Second Rank");
	}
	public void avg(int tot){
		int avg = tot/5;
		System.out.println("Average Mark= '"+avg+"'");
	}
}

class C extends B{
	public void print(){
		System.out.println("Class Name: C");
		System.out.println("Fail");
	}
	public void avg(){		
		
		System.out.println("Need Improvments");
	}
}
public  class Sample {
	
	public static void main(String args[]){
		
		C c1 = new C();
		B b1 = new B();
		A a1 = new A();
		
		D d1 =new D();
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject 1 Mark:");
		int m = sc.nextInt();
		System.out.println("Enter Subject 2 Mark:");
		int n = sc.nextInt();
		System.out.println("Enter Subject 3 Mark:");
		int o = sc.nextInt();
		System.out.println("Enter Subject 4 Mark:");
		int p = sc.nextInt();
		System.out.println("Enter Subject 5 Mark:");
		int q = sc.nextInt();
	
		int totalmark = d1.add(m, n, o, p, q);
		System.out.println("Total mark: "+totalmark+"");
		
		if(totalmark>450){
			a1.print();
			
		}else if(totalmark>350){
			b1.print();
			b1.avg(totalmark);
		}else{
			c1.print();
			c1.avg(totalmark);
			c1.avg();
		}
		
	}

}
