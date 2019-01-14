package pacOrg;

public class Historiat {

	private int ID;
	private String imePacijenta;
	private String GornjiLeviZubi;
	private String GornjiDesniZubi;
	private String DonjiLeviZubi;
	private String DonjiDesniZubi;
	private String Datum;
	
	
	
	public String getDatum() {
		return Datum;
	}
	public void setDatum(String datum) {
		Datum = datum;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getImePacijenta() {
		return imePacijenta;
	}
	public void setImePacijenta(String imePacijenta) {
		this.imePacijenta = imePacijenta;
	}
	public String getGornjiLeviZubi() {
		return GornjiLeviZubi;
	}
	public void setGornjiLeviZubi(String gornjiLeviZubi) {
		GornjiLeviZubi = gornjiLeviZubi;
	}
	public String getGornjiDesniZubi() {
		return GornjiDesniZubi;
	}
	public void setGornjiDesniZubi(String gornjiDesniZubi) {
		GornjiDesniZubi = gornjiDesniZubi;
	}
	public String getDonjiLeviZubi() {
		return DonjiLeviZubi;
	}
	public void setDonjiLeviZubi(String donjiLeviZubi) {
		DonjiLeviZubi = donjiLeviZubi;
	}
	public String getDonjiDesniZubi() {
		return DonjiDesniZubi;
	}
	public void setDonjiDesniZubi(String donjiDesniZubi) {
		DonjiDesniZubi = donjiDesniZubi;
	}
	
	
	
	public Historiat() {
		
	}
	
	
	
	
	public Historiat(int iD, String imePacijenta, String gornjiLeviZubi, String gornjiDesniZubi, String donjiLeviZubi,
			String donjiDesniZubi) {
		super();
		ID = iD;
		this.imePacijenta = imePacijenta;
		GornjiLeviZubi = gornjiLeviZubi;
		GornjiDesniZubi = gornjiDesniZubi;
		DonjiLeviZubi = donjiLeviZubi;
		DonjiDesniZubi = donjiDesniZubi;
	}
	
	
	
	public Historiat(int iD, String imePacijenta, String gornjiLeviZubi, String gornjiDesniZubi, String donjiLeviZubi,
			String donjiDesniZubi, String datum) {
		super();
		ID = iD;
		this.imePacijenta = imePacijenta;
		GornjiLeviZubi = gornjiLeviZubi;
		GornjiDesniZubi = gornjiDesniZubi;
		DonjiLeviZubi = donjiLeviZubi;
		DonjiDesniZubi = donjiDesniZubi;
		Datum = datum;
	}
	@Override
	public String toString() {
		return String.format("%10s %25s %25s %25s %25s %25s %10s",
				ID, imePacijenta, GornjiLeviZubi, GornjiDesniZubi, DonjiLeviZubi, DonjiDesniZubi, Datum);
	}
	
	
}
