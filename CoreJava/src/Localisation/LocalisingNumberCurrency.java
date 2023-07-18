package Localisation;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalisingNumberCurrency {
	
	public static void main(String[] args) {
		double d= 1799.000;
		String d1 = NumberFormat.getInstance().format(d);
		System.out.println("default:"+d1);
		System.out.println("Italy number"+NumberFormat.getInstance(Locale.ITALY).format(d));
		System.out.println("Italian:"+NumberFormat.getCurrencyInstance(Locale.ITALY).format(d));
		System.out.println("Japanese:" +NumberFormat.getCurrencyInstance(Locale.JAPANESE).format(d));
	}
	
	

}
