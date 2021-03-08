package com.test.sp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static final SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat("yyyyMMdd");
	private static final SimpleDateFormat HH_MM_SS = new SimpleDateFormat("HHmmss");
	
	public static String getDate() {
		Date date = new Date();
		return YYYY_MM_DD.format(date);
	}
	public static String getTime() {
		Date date = new Date();
		return HH_MM_SS.format(date);
	}
}
