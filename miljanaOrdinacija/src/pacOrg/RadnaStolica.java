package pacOrg;

public class RadnaStolica {
	
	
	private int brojstolice;
	private String imedoktora;
	private String vremePocetno;
	private String vremeKrajno;
	private String gornjiLevi;
	private String gornjiDesni;
	private String donjiLevi;
	private String donjiDesni;
	
	public RadnaStolica() {
		
	}

	public RadnaStolica(String nazivStolice, String vremePocetno, String vremeKrajno, String gornjiLevi,
			String gornjiDesni, String donjiLevi, String donjiDesni) {
		super();
		this.imedoktora = nazivStolice;
		this.vremePocetno = vremePocetno;
		this.vremeKrajno = vremeKrajno;
		this.gornjiLevi = gornjiLevi;
		this.gornjiDesni = gornjiDesni;
		this.donjiLevi = donjiLevi;
		this.donjiDesni = donjiDesni;
	}
	
	

	public RadnaStolica(int brojstolice, String imedoktora, String vremePocetno, String vremeKrajno, String gornjiLevi,
			String gornjiDesni, String donjiLevi, String donjiDesni) {
		super();
		this.brojstolice = brojstolice;
		this.imedoktora = imedoktora;
		this.vremePocetno = vremePocetno;
		this.vremeKrajno = vremeKrajno;
		this.gornjiLevi = gornjiLevi;
		this.gornjiDesni = gornjiDesni;
		this.donjiLevi = donjiLevi;
		this.donjiDesni = donjiDesni;
	}
	
	

	public int getBrojstolice() {
		return brojstolice;
	}

	public void setBrojstolice(int brojstolice) {
		this.brojstolice = brojstolice;
	}

	public String getImedoktora() {
		return imedoktora;
	}

	public void setImedoktora(String imedoktora) {
		this.imedoktora = imedoktora;
	}

	public String getNazivStolice() {
		return imedoktora;
	}

	public void setNazivStolice(String nazivStolice) {
		this.imedoktora = nazivStolice;
	}

	public String getVremePocetno() {
		return vremePocetno;
	}

	public void setVremePocetno(String vremePocetno) {
		this.vremePocetno = vremePocetno;
	}

	public String getVremeKrajno() {
		return vremeKrajno;
	}

	public void setVremeKrajno(String vremeKrajno) {
		this.vremeKrajno = vremeKrajno;
	}

	public String getGornjiLevi() {
		return gornjiLevi;
	}

	public void setGornjiLevi(String gornjiLevi) {
		this.gornjiLevi = gornjiLevi;
	}

	public String getGornjiDesni() {
		return gornjiDesni;
	}

	public void setGornjiDesni(String gornjiDesni) {
		this.gornjiDesni = gornjiDesni;
	}

	public String getDonjiLevi() {
		return donjiLevi;
	}

	public void setDonjiLevi(String donjiLevi) {
		this.donjiLevi = donjiLevi;
	}

	public String getDonjiDesni() {
		return donjiDesni;
	}

	public void setDonjiDesni(String donjiDesni) {
		this.donjiDesni = donjiDesni;
	}

	@Override
	public String toString() {
		return String.format("%5s %15s %15s %15s %25s %25s %25s %25s ", brojstolice,
				imedoktora, vremePocetno, vremeKrajno, gornjiLevi, gornjiDesni,
				donjiLevi, donjiDesni);
	}

	
	
	

}
