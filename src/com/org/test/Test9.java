package com.org.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test9 {

	public static void main(String args[]){
		 Date date = new Date();
	     String strDateFormat = "M";
	     SimpleDateFormat simple = new SimpleDateFormat(strDateFormat);
	     String currentMonth = simple.format(date);
	     int monthInt = Integer.parseInt(currentMonth);
	     monthInt = monthInt+1;
	     String month = Integer.toString(monthInt);
	     
	     
	     String day = "dd";
	     SimpleDateFormat simple1 = new SimpleDateFormat(day);
	     String currentDay= simple1.format(date);
	     
	     String strYear = "yyyy";
	     SimpleDateFormat simple3 = new SimpleDateFormat(strYear);
	     String currentYear = simple3.format(date);
	     String Year = currentYear;
	     if(monthInt==12){
	    	 monthInt = 1;
	    	 
		     int YearInt = Integer.parseInt(currentYear);
	    	 YearInt = YearInt+1;
	       	 Year = Integer.toString(monthInt);
	     }
	     
	     String formatedDate = month+"/"+currentDay+"/"+Year;
	     
	     System.out.println("formatedDate______"+formatedDate);
	    // System.out.println("Current Month in M format : " + sdf.format(date));
	     
	}
}
