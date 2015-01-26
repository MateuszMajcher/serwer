public class C_tablet extends C_Komputer {
	private double rozmiar_ekranu;
	private double akumulator;
	private double rozdz_aparatu;

	public C_tablet() {
		this.rozmiar_ekranu = 0.0;
		this.akumulator = 0.0;
		this.rozdz_aparatu = 0.0;
	}

	public C_tablet(String nr_seryjny, String data, String model, String producent, int ilosc_rdzeni, int pamiec_ram,
	String model_procesora, double taktowanie_rdzenia, int pamiec_rom, String karta_grafiki, double rozmiar_ekranu,
	double akumulator, double rozdz_aparatu) {
		super(nr_seryjny, data, model, producent, ilosc_rdzeni, pamiec_ram, model_procesora, taktowanie_rdzenia, pamiec_rom, karta_grafiki);
		this.rozmiar_ekranu = rozmiar_ekranu;
		this.akumulator = akumulator;
		this.rozdz_aparatu = rozdz_aparatu;
	}

	public double pobierzRozmiar_ekranu() {
		return this.rozmiar_ekranu;
	}
	public double pobierzAkumulator() {
		return this.akumulator;
	}
	public double pobierzRozdz_aparatu() {
		return this.rozdz_aparatu;
	}

	public void ustawRozmiar_ekranu(double rozmiar_ekranu) {
		this.rozmiar_ekranu = rozmiar_ekranu;
	}
	public void ustawAkumulator(double akumulator) {
		this.akumulator = akumulator;
	}
	public void ustawRozdz_aparatu(double rozdz_aparatu) {
		this.rozdz_aparatu = rozdz_aparatu;
	}

	public String toString() {
		return "Tablet/" + super.toString() + "/Rozmiar ekranu: " + this.rozmiar_ekranu + "/Akumulator: " + this.akumulator + "/Rozdzielczosc aparatu: " + this.rozdz_aparatu;
	}

}