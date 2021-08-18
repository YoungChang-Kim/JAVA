package lab.itank.packageclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarAndDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.AM_PM));//0:오전, 1:오후
				
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		
		if(calendar.get(Calendar.AM_PM)==Calendar.AM) {
			System.out.println("오전입니다.");
		}else {
			System.out.println("오후입니다.");
		}
		
		System.out.print(calendar.get(Calendar.HOUR)+" : ");
		System.out.print(calendar.get(Calendar.MINUTE)+" : ");
		System.out.println(calendar.get(Calendar.SECOND));
		
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd | a HH:mm:ss");
		
		Date date = gregorianCalendar.getTime();
		System.out.println(date);
		
		String today = simpleDateFormat.format(date);
		System.out.println(today);
		
	}
}
