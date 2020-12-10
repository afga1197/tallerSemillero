package com.clearminds.AFGA.bdd;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static String convertirFecha(){
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String fecha = simpleDateFormat.format(new Date());
		return fecha;
	}

}
