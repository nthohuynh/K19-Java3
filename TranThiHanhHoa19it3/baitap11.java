package baitapchuong1;
import java.util.*;
public class baitap11 {

	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		    System.out.println(day+"/"+month+"/"+year);
		    }

}
