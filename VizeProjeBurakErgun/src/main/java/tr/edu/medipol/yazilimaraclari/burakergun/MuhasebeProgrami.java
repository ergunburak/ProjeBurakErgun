package tr.edu.medipol.yazilimaraclari.burakergun;

public class MuhasebeProgrami {

	

	public static String ucretHesapla(int calisilanSaat, int saatlikUcret) {
		return new Ucret(calisilanSaat, saatlikUcret).toString();
	}

	private static class Ucret {
		int calisilanSaat;
		int saatlikUcret;
		int ucret;

		public Ucret(int calisilanSaat, int saatlikUcret) {
			this.calisilanSaat = calisilanSaat;
			this.saatlikUcret = saatlikUcret;
			this.ucret = calisilanSaat * saatlikUcret;
		}

		
		public String toString() {
			return calisilanSaat + "*" + saatlikUcret + "=" + ucret;
		}
	}

}
