package Localisation;

import java.util.Locale;

public class LocalisationTest {
	public static void main(String[] args) {
		Locale locale= new Locale("en");
		System.out.println(locale);
		Locale deafaultlocale= Locale.getDefault();
		System.out.println("deafaultlocale-"+deafaultlocale);
		Locale locale3= new Locale("FR","France");
		Locale locale4= Locale.FRANCE;
		System.out.println("locale3-"+locale3);
		System.out.println(locale3.getDisplayLanguage());
		System.out.println("country"+locale3.getDisplayCountry());
		System.out.println(locale4.getDisplayLanguage());
		System.out.println("country"+locale4.getDisplayCountry());
	}
	
	

}
