package com.org.test;

public class Test2 {
	 public int reverse(int str) 
     {    
         System.out.println(str);
      if(str>=50)
         {
         return str;
         
         }
     
      	//String s1 = str.substring(1);
      	//char s2 = str.charAt(0);
      	
         return reverse(str+1);
     }
     public static void main(String[] args) 
     {
         Test2 obj=new Test2();
      
         System.out.println(obj.reverse(10));    
     }    
}
