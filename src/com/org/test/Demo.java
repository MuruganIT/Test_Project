package com.org.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
public static void main(String args[]){
	//int year = Calendar.getInstance().get(Calendar.YEAR);
	int sysMonth, sysDate, sysYear;
	String sysMonth1, sysDate1, sysYear1;
		
	sysMonth = Calendar.getInstance().MONTH;
	
	//sysMonth1 = Integer.toString(sysMonth);
	System.out.println(sysMonth);
	
	Calendar c = Calendar.getInstance();
	 Date date = new Date();
	 System.out.println(date.getMonth());
	 
	 String month = new SimpleDateFormat("MMM").format(c.getTime());
	System.out.println(month.toUpperCase());	
	
		
	 
	  //String[] namesOfDays =  {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
   	 // int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

	//System.out.println("Day := "+namesOfDays[day-1]);
	 
	sysDate = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	System.out.println("sysDate--"+sysDate);
	sysDate1 = Integer.toString(sysDate);
	System.out.println(sysDate1);
	
	/*sysYear = Calendar.getInstance().get(Calendar.YEAR);
	sysYear = sysYear +1;
	sysYear1 = Integer.toString(sysYear);
	System.out.println(sysYear1);
	
	String value = sysMonth1+"/"+sysDate1+"/"+sysYear1;
	System.out.println(value);*/
}
}
