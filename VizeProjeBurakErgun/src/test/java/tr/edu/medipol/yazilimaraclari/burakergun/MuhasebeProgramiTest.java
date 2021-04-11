package tr.edu.medipol.yazilimaraclari.burakergun;

import org.junit.Assert;
import org.junit.Test;

public class MuhasebeProgramiTest {

	@Test
	public void testUcretPozitif() {

		Assert.assertEquals("5*25=125", MuhasebeProgrami.ucretHesapla(5, 25));
		Assert.assertEquals("25*5=125", MuhasebeProgrami.ucretHesapla(25, 5));

	}

	@Test
	public void testUcretNegatif() {
		Assert.assertEquals("-5*25=-125", MuhasebeProgrami.ucretHesapla(-5, 25));
		Assert.assertEquals("5*-25=-125", MuhasebeProgrami.ucretHesapla(5, -25));
		Assert.assertEquals("-5*-25=125", MuhasebeProgrami.ucretHesapla(-5, -25));
		Assert.assertEquals("-5*-25=125", MuhasebeProgrami.ucretHesapla(-5, -25));
		
	}

	@Test
	public void testUcretSifir() {
		Assert.assertEquals("0*25=0", MuhasebeProgrami.ucretHesapla(0, 25));
		Assert.assertEquals("5*0=0", MuhasebeProgrami.ucretHesapla(5, 0));
	}

	
	

}
