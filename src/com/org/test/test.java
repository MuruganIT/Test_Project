package com.org.test;

import java.io.IOException;
import java.util.Scanner;

public class test {

	static String findNumber(int[] arr, int k) {
        int count=0;
        String a=null;
      for(int i=0;i<arr.length;i++){
    	  if(arr[i]==k){
              count=1;
          }   	  
      }
    	   if(count==1){
    	        return "Yes";
    	   }else {
    		   return "No";
	        }          
    }
	
	public static void main(String[] args) throws IOException{
       System.out.println("Enter Array Size");
       
       Scanner in = new Scanner(System.in);
       String res;
       int _arr_size = 0;
       _arr_size = Integer.parseInt(in.nextLine().trim());
       int[] _arr = new int[_arr_size];
       int _arr_item;
       for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
           _arr_item = Integer.parseInt(in.nextLine().trim());
           _arr[_arr_i] = _arr_item;
       }    
       int _k;
       System.out.println("Enter Find Num");
       _k = Integer.parseInt(in.nextLine().trim());
       
       System.out.println( findNumber(_arr, _k));
         
    }
    }
