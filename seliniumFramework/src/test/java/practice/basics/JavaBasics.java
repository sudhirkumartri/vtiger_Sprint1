package practice.basics;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

public class JavaBasics {

	public static void main(String[] args) {
		
		Date dateObj=new Date();
		System.out.println(dateObj.toString());

		SimpleDateFormat sim=new SimpleDateFormat("yyy-MM-dd");
		String actDate=sim.format(dateObj);
		System.out.println(actDate);
		
		SimpleDateFormat sim1=new SimpleDateFormat("yyy-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -30);
		String dateRequire = sim1.format(cal.getTime());
		
		System.out.println(dateRequire );    
		
		
		
		
	}

}
