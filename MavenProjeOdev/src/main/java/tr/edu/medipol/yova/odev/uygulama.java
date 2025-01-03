package tr.edu.medipol.yova.odev;

import org.apache.commons.lang3.StringUtils;

public final class uygulama {

       public static String diziDegistirme(String orijinal, String eski, String yeni) {
	    
		return StringUtils.replace(orijinal, eski, yeni);
	}
	
   
}
