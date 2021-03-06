public class C_pc extends C_Komputer {
	private String rodzaj_obudowy;
	private int moc_zasilacza;


	public C_pc() {
		super();
		this.rodzaj_obudowy = "";
		this.moc_zasilacza = 0;
	}

	public C_pc(String nr_seryjny, String data, String model, String producent,
	int ilosc_rdzeni, int pamiec_ram, String model_procesora, double taktowanie_rdzenia, int pamiec_rom, String karta_grafiki, String rodzaj_obudowy, int moc_zasilacza) {
		super(nr_seryjny, data, model, producent, ilosc_rdzeni, pamiec_ram, model_procesora, taktowanie_rdzenia, pamiec_rom, karta_grafiki);
		this.rodzaj_obudowy = new String(rodzaj_obudowy);
		this.moc_zasilacza = moc_zasilacza;
	}

	/*public C_pc(String dane){
	String[] d = dane.split(",");
	super(d[0],d[1],d[2],d[3],d[4],d[5],d[6],d[7],d[8],d[9]);
	this.rodzaj_obudowy = new String(d[0]);
	this.moc_zasilacza = Integer.parseInt(d[1]);
	}*/

	public String pobierzRodzaj_obudowy() {
		return this.rodzaj_obudowy;
	}
	public int pobierzMoc_zasilacza() {
		return this.moc_zasilacza;
	}

	public void ustawRodzaj_obudowy(String rodzaj_obudowy) {
		this.rodzaj_obudowy = rodzaj_obudowy;
	}
	public void ustawMoc_zasilacza(int moc_zasilacza) {
		this.moc_zasilacza = moc_zasilacza;
	}
	public String toString() {
		return "PC/" + super.toString() + "/Rodzaj obudowy: " + this.rodzaj_obudowy + "/Moc zasilacza " + this.moc_zasilacza;
	}

}