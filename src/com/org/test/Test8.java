package com.org.test;

import java.util.Scanner;

public class Test8 {

	public static String findType(String sTerm, String sContent){
		int counter=0;
		String count = Integer.toString(0);
		if(!sTerm.contains(" ") && (sTerm.length()>1)){
				
			String content[] = sContent.split(" ");
			for(int i =0;i<content.length;i++){
				
				if(sTerm.equals(content[i])){
					counter =counter+1;
					count = Integer.toString(counter);
				}
			}
		}else if(sTerm.length()<=1){
			
			
			char charArray[] = sContent.toCharArray();
			for(int i=0;i<charArray.length;i++){
				
				char m = charArray[i];
				char n = sTerm.charAt(0);
				if(n==m){
					counter =counter+1;
					count = Integer.toString(counter);
				}
			}
			
		}else{
			
			String content1[] = sContent.split(sTerm);
			counter = content1.length;
			count = Integer.toString(counter);
		}
		return count;
	}
		
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search Term:");
		String sterm = sc.nextLine();
		int lenth = sterm.length();
		System.out.println("Enter Search Content:");
		String scontent = sc.nextLine();
		
		System.out.println(Test8.findType(sterm, scontent));
		
	}
}
