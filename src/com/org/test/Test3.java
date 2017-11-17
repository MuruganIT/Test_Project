package com.org.test;

import org.openqa.selenium.Cookie;


public class Test3 {
	public static void main(String args[]){
		String s1 = "murugan(dfs";
		System.out.println(s1.replace("(", ""));
		
		Cookie ck=new Cookie("user","sonoo jaiswal");//creating cookie object  
		//response.addCookie(ck);
	}

}
