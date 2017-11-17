package com.org.test;

import java.util.Random;

public class Test7 {
	public static void main(String args[]){
		/*String s1 ="Murugan";
		String s2 = "Muruganp";
		if(s2.contains(s1)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		int i=2;
		System.out.println("The value is: "+i+1+"");
		
		Random rn = new Random();
		System.out.println(rn.nextInt());*/
		int i;
		for (i=0; i<10;i++){
			
			for(int j=0;j<10;j++){
				if(i ==5){
					System.out.println("Meet: "+i+"");
					break;
				}
				System.out.println("inner loop");
			}
			System.out.println("outer loop");
		}
	}

}
