package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		String miReleaseDate = "20201022";
		SimpleDateFormat sdt = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdt2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdt.parse(miReleaseDate);
			System.out.println(sdt2.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
