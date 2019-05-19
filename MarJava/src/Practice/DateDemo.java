package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date d=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sd.format(new Date()));
		
	}

}
