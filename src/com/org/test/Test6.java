package com.org.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;

public class Test6 {

	public static void main (String args[]){
		/*Date date = new Date(System.currentTimeMillis());
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	    String s = formatter.format(date);
	    System.out.println(s);*/
		
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		
		
			String value = null;
			int hour = date.getHours();
			value = Integer.toString(hour);
			int i = Integer.parseInt(value);
			i = i+1;
			System.out.println(i);
		
		
		
		
		
		//Calendar cal = Calendar.getInstance(cal.get);
		//String month = new SimpleDateFormat("MMMM").format(cal.getTime());
		//String Year = new SimpleDateFormat("YYYY").format(cal.getTime());
		//int date = Calendar.getInstance().get(Calendar.DATE);
		
		//String Date = Integer.toString(date);
		//System.out.println(Date.length());
		//if(!(Date.length()>1)){
			
			//Date = "0"+Integer.toString(date);
			//System.out.println(Date);
	//}
		
		//System.out.println("xyz = "+month+" "+Date+", "+Year+"");
		
		
		
	}
}
