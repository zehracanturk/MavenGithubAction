package tr.edu.medipol.yova.odev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class uygulamaTest {

	@Test
	public void diziDegistirme_metniDogruDegistirmeKontrol() {
	        
		String orijinal = "Merhaba Dünya";
	    String eski = "Dünya";
	    String yeni = "Java";
	    String sonuc = uygulama.diziDegistirme(orijinal, eski, yeni);
	     
	    assertEquals("Merhaba Java", sonuc);
	        
      }
}