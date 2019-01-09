package javaprog;

public class ZubiGornjiLeviKvadrant {
	
	private String ime;
	private String prezime;

	// kvadrant gornji levi
	private String zub11;
	private String zub12;
	private String zub13;
	private String zub14;
	private String zub15;
	private String zub16;
	private String zub17;
	private String zub18;
	
	public ZubiGornjiLeviKvadrant() {
		
	}

	public ZubiGornjiLeviKvadrant(String ime, String prezime, String zub11, String zub12, String zub13, String zub14,
			String zub15, String zub16, String zub17, String zub18) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.zub11 = zub11;
		this.zub12 = zub12;
		this.zub13 = zub13;
		this.zub14 = zub14;
		this.zub15 = zub15;
		this.zub16 = zub16;
		this.zub17 = zub17;
		this.zub18 = zub18;
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

	public String getZub11() {
		return zub11;
	}

	public void setZub11(String zub11) {
		this.zub11 = zub11;
	}

	public String getZub12() {
		return zub12;
	}

	public void setZub12(String zub12) {
		this.zub12 = zub12;
	}

	public String getZub13() {
		return zub13;
	}

	public void setZub13(String zub13) {
		this.zub13 = zub13;
	}

	public String getZub14() {
		return zub14;
	}

	public void setZub14(String zub14) {
		this.zub14 = zub14;
	}

	public String getZub15() {
		return zub15;
	}

	public void setZub15(String zub15) {
		this.zub15 = zub15;
	}

	public String getZub16() {
		return zub16;
	}

	public void setZub16(String zub16) {
		this.zub16 = zub16;
	}

	public String getZub17() {
		return zub17;
	}

	public void setZub17(String zub17) {
		this.zub17 = zub17;
	}

	public String getZub18() {
		return zub18;
	}

	public void setZub18(String zub18) {
		this.zub18 = zub18;
	}

	@Override
	public String toString() {
		return String.format("%15s %15s %10s %10s %10s %10s %10s %10s %10s %10s",
				ime, prezime, zub11, zub12, zub13, zub14, zub15, zub16, zub17, zub18);
	}
	
	
	/*
	 * 	private String ime;
	private String prezime;

	// kvadrant gornji levi
	private String zub11;
	private String zub12;
	private String zub13;
	private String zub14;
	private String zub15;
	private String zub16;
	private String zub17;
	private String zub18;
	
	 * */
	
	
	
	
}
