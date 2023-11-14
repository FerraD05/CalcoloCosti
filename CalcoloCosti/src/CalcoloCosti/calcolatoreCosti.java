package CalcoloCosti;

public class calcolatoreCosti {
	
	public calcolatoreCosti() {};

	
	public float calcoloEAT(float ACWP, float ETC) {
		float EAT = ACWP + ETC;	//calcolo l'EAT tramite i valori dati
				
		return EAT;	//ritorno EAT
	}
	
	public float calcoloETC(float BAC, float BCWP) {
		float ETC = BAC - BCWP;	//calcolo ETC in base ai valori dati
		
		return ETC;	//ritorno ETC
	}
	
	public float calcoloETC(float BAC, float BCWP, float CPI) {
		float ETC = (BAC - BCWP) / CPI;	//calcolo ETC in base ai valori dati
		
		return ETC;	//ritorno ETC
	}
	
	public float calcoloETC(float BAC, float BCWP, float CPI, float SPI) {
		float ETC = (BAC - BCWP) / (CPI * SPI);	//calcolo ETC in base ai valori dati
		
		return ETC;	//ritorno ETC
	}
}
