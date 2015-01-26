public class C_Komputer extends C_Urzadzenie implements I_Komputer {
	private int ilosc_rdzeni;
	private int pamiec_ram;
	private String model_procesora;
	private double taktowanie_rdzenia;
	private int pamiec_rom;
	private String karta_grafiki;


	public C_Komputer() {
		super();
		this.ilosc_rdzeni = 0;
		this.pamiec_ram = 0;
		this.model_procesora = "";
		this.taktowanie_rdzenia = 0.0;
		this.pamiec_rom = 0;
		this.karta_grafiki = "";
	}

	public C_Komputer(String nr_seryjny, String data, String model, String producent,
	int ilosc_rdzeni, int pamiec_ram, String model_procesora, double taktowanie_rdzenia, int pamiec_rom, String karta_grafiki) {

		super(nr_seryjny, data, model, producent);
		this.ilosc_rdzeni = ilosc_rdzeni;
		this.pamiec_ram = pamiec_ram;
		this.model_procesora = new String(model_procesora);
		this.taktowanie_rdzenia = taktowanie_rdzenia;
		this.pamiec_rom = pamiec_rom;
		this.karta_grafiki = new String(karta_grafiki);


	}
	public double Moc_obliczeniowa() {
		return this.ilosc_rdzeni * this.taktowanie_rdzenia;
	}

	public int pobierzIlosc_rdzeni() {
		return this.ilosc_rdzeni;
	}

	public int pobierzPamiec_ram() {
		return this.pamiec_ram;
	}

	public String pobierzModel_procesora() {
		return this.model_procesora;
	}

	public double pobierzTaktowanie_rdzenia() {
		return this.taktowanie_rdzenia;
	}

	public int pobierzPamiec_rom() {
		return this.pamiec_rom;
	}

	public String pobierzKarta_grafiki() {
		return this.karta_grafiki;
	}

	public void ustawIlosc_rdzeni(int ilosc_rdzeni) {
		this.ilosc_rdzeni = ilosc_rdzeni;
	}

	public void ustawPamiec_ram(int pamiec_ram) {
		this.pamiec_ram = pamiec_ram;
	}

	public void ustawModel_procesora(String Model_procesora) {
		this.model_procesora = model_procesora;
	}

	public void ustawTaktowanie_rdzenia(double taktowanie_rdzenia) {
		this.taktowanie_rdzenia = taktowanie_rdzenia;
	}

	public void ustawPamiec_rom(int pamiec_rom) {
		this.pamiec_rom = pamiec_rom;
	}

	public void ustawKarta_grafiki(String karta_grafiki) {
		this.karta_grafiki = karta_grafiki;
	}

	public String toString() {
		return super.toString() + "/Model procesora: " + this.model_procesora + "/Ilosc rdzeni: " + this.ilosc_rdzeni +
			"/Taktowanie rdzenia: " + this.taktowanie_rdzenia + "/Pamiec RAM: " + this.pamiec_ram + "/Dysk: " + this.pamiec_rom + "/Karta grafiki: " + this.karta_grafiki;
	}
}