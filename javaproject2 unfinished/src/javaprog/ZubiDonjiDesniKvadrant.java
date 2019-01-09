package javaprog;

public class ZubiDonjiDesniKvadrant {
	
	private String ime;
	private String prezime;
	
	private String zub31;
	private String zub32;
	private String zub33;
	private String zub34;
	private String zub35;
	private String zub36;
	private String zub37;
	private String zub38;
	
	public ZubiDonjiDesniKvadrant() {
		
	}

	public ZubiDonjiDesniKvadrant(String ime, String prezime, String zub31, String zub32, String zub33, String zub34,
			String zub35, String zub36, String zub37, String zub38) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.zub31 = zub31;
		this.zub32 = zub32;
		this.zub33 = zub33;
		this.zub34 = zub34;
		this.zub35 = zub35;
		this.zub36 = zub36;
		this.zub37 = zub37;
		this.zub38 = zub38;
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

	public String getZub31() {
		return zub31;
	}

	public void setZub31(String zub31) {
		this.zub31 = zub31;
	}

	public String getZub32() {
		return zub32;
	}

	public void setZub32(String zub32) {
		this.zub32 = zub32;
	}

	public String getZub33() {
		return zub33;
	}

	public void setZub33(String zub33) {
		this.zub33 = zub33;
	}

	public String getZub34() {
		return zub34;
	}

	public void setZub34(String zub34) {
		this.zub34 = zub34;
	}

	public String getZub35() {
		return zub35;
	}

	public void setZub35(String zub35) {
		this.zub35 = zub35;
	}

	public String getZub36() {
		return zub36;
	}

	public void setZub36(String zub36) {
		this.zub36 = zub36;
	}

	public String getZub37() {
		return zub37;
	}

	public void setZub37(String zub37) {
		this.zub37 = zub37;
	}

	public String getZub38() {
		return zub38;
	}

	public void setZub38(String zub38) {
		this.zub38 = zub38;
	}

	@Override
	public String toString() {
		return String.format("%15s %15s %10s %10s %10s %10s %10s %10s %10s %10s",
				ime, prezime, zub31, zub32, zub33, zub34, zub35, zub36, zub37, zub38);
	}
	
	

}
