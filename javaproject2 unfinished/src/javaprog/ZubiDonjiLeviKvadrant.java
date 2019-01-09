package javaprog;

public class ZubiDonjiLeviKvadrant {
	
	private String ime;
	private String prezime;
	
	private String zub41;
	private String zub42;
	private String zub43;
	private String zub44;
	private String zub45;
	private String zub46;
	private String zub47;
	private String zub48;
	
	public ZubiDonjiLeviKvadrant() {
		
	}

	public ZubiDonjiLeviKvadrant(String ime, String prezime, String zub41, String zub42, String zub43, String zub44,
			String zub45, String zub46, String zub47, String zub48) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.zub41 = zub41;
		this.zub42 = zub42;
		this.zub43 = zub43;
		this.zub44 = zub44;
		this.zub45 = zub45;
		this.zub46 = zub46;
		this.zub47 = zub47;
		this.zub48 = zub48;
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

	public String getZub41() {
		return zub41;
	}

	public void setZub41(String zub41) {
		this.zub41 = zub41;
	}

	public String getZub42() {
		return zub42;
	}

	public void setZub42(String zub42) {
		this.zub42 = zub42;
	}

	public String getZub43() {
		return zub43;
	}

	public void setZub43(String zub43) {
		this.zub43 = zub43;
	}

	public String getZub44() {
		return zub44;
	}

	public void setZub44(String zub44) {
		this.zub44 = zub44;
	}

	public String getZub45() {
		return zub45;
	}

	public void setZub45(String zub45) {
		this.zub45 = zub45;
	}

	public String getZub46() {
		return zub46;
	}

	public void setZub46(String zub46) {
		this.zub46 = zub46;
	}

	public String getZub47() {
		return zub47;
	}

	public void setZub47(String zub47) {
		this.zub47 = zub47;
	}

	public String getZub48() {
		return zub48;
	}

	public void setZub48(String zub48) {
		this.zub48 = zub48;
	}

	@Override
	public String toString() {
		return String.format("%15s %15s %10s %10s %10s %10s %10s %10s %10s %10s",
				ime, prezime, zub41, zub42, zub43, zub44, zub45, zub46, zub47, zub48);
	}
	
	

}
