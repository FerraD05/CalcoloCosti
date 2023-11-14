package CalcoloCosti;

public class calcolatoreCosti {
	
	public calcolatoreCosti() {};

	/**
	 * 
	 * @param ACWP actual cost of work performed
	 * @param ETC estimate time to completion
	 * 
	 * @return EAC estimate at completion
	 */
	public float calcoloEAT(float ACWP, float ETC) {
		float EAT = ACWP + ETC;	//calcolo l'EAT tramite i valori dati
				
		return EAT;	//ritorno EAT
	}
	
	/**
	 * 
	 * @param BAC budget at completion
	 * @param BCWP budget cost of work performed
	 * 
	 * @return ETC estimate to completion
	 */
	public float calcoloETC(float BAC, float BCWP) {
		float ETC = BAC - BCWP;	//calcolo ETC in base ai valori dati
		
		return ETC;	//ritorno ETC
	}
	
	/**
	 * 
	 * @param BAC budget at completion
	 * @param BCWP budget cost of work performed
	 * @param CPI efficiency index
	 * 
	 * @return ETC estimate to completion
	 */
	public float calcoloETC(float BAC, float BCWP, float CPI) {
		float ETC = (BAC - BCWP) / CPI;	//calcolo ETC in base ai valori dati
		
		return ETC;	//ritorno ETC
	}
	
	/**
	 * 
	 * @param BAC budget at completion
	 * @param BCWP budget cost of work performed
	 * @param CPI efficiency index
	 * @param SPI performance index
	 * 
	 * @return ETC estimate to completion
	 */
	public float calcoloETC(float BAC, float BCWP, float CPI, float SPI) {
		float ETC = (BAC - BCWP) / (CPI * SPI);	//calcolo ETC in base ai valori dati
		
		return ETC;	//ritorno ETC
	}
}
