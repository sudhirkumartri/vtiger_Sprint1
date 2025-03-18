package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

 public int getRandomNumber() {
		 
		 Random random=new Random();
		 
		int ranDomNumber= random.nextInt(5000);
		 
		 return ranDomNumber;
	 }
	 
	 
	 
	 public String getSystemDateYYYYDDMM() {
		 Date dateObj= new Date();
		 SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		String date=sdf.format(dateObj);
		
		return date;
	 }
	 
	 public String getRequiredDateYYYYDDMM(int days) {
		 
			SimpleDateFormat sim=new SimpleDateFormat("yyy-MM-dd");
			
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH,  days);
			String reqDate = sim.format(cal.getTime());
		return reqDate;
	 }
}
