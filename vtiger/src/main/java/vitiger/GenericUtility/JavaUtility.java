package vitiger.GenericUtility;

import java.util.Date;

public class JavaUtility {
public String generateSystemDateTime() {
	Date date=new  Date();
	return date.toString();
}
public static void main(String[]args) {
	JavaUtility j= new JavaUtility();
	j.generateSystemDateTime();
}
}
