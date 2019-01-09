package javaprog;

public class ZubiGornjiDesniKvadrant {
	
	private String ime;
	private String prezime;
	
	private String zub21;
	private String zub22;
	private String zub23;
	private String zub24;
	private String zub25;
	private String zub26;
	private String zub27;
	private String zub28;
	
	public ZubiGornjiDesniKvadrant() {
		
	}

	public ZubiGornjiDesniKvadrant(String ime, String prezime, String zub21, String zub22, String zub23, String zub24,
			String zub25, String zub26, String zub27, String zub28) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.zub21 = zub21;
		this.zub22 = zub22;
		this.zub23 = zub23;
		this.zub24 = zub24;
		this.zub25 = zub25;
		this.zub26 = zub26;
		this.zub27 = zub27;
		this.zub28 = zub28;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getZub21() {
		return zub21;
	}

	public void setZub21(String zub21) {
		this.zub21 = zub21;
	}

	public String getZub22() {
		return zub22;
	}

	public void setZub22(String zub22) {
		this.zub22 = zub22;
	}

	public String getZub23() {
		return zub23;
	}

	public void setZub23(String zub23) {
		this.zub23 = zub23;
	}

	public String getZub24() {
		return zub24;
	}

	public void setZub24(String zub24) {
		this.zub24 = zub24;
	}

	public String getZub25() {
		return zub25;
	}

	public void setZub25(String zub25) {
		this.zub25 = zub25;
	}

	public String getZub26() {
		return zub26;
	}

	public void setZub26(String zub26) {
		this.zub26 = zub26;
	}

	public String getZub27() {
		return zub27;
	}

	public void setZub27(String zub27) {
		this.zub27 = zub27;
	}

	public String getZub28() {
		return zub28;
	}

	public void setZub28(String zub28) {
		this.zub28 = zub28;
	}

	@Override
	public String toString() {
		return String.format("%15s %15s %10s %10s %10s %10s %10s %10s %10s %10s",
				ime, prezime, zub21, zub22, zub23, zub24, zub25, zub26, zub27, zub28);
	}
	
	/* 
	 * private String ime;
	private String prezime;
	
	private String zub21;
	private String zub22;
	private String zub23;
	private String zub24;
	private String zub25;
	private String zub26;
	private String zub27;
	private String zub28;
	 * */
	
	

}
