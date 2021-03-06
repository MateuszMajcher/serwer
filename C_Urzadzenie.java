public abstract class  C_Urzadzenie{
	private String nr_seryjny;
	private CData data;
	private String model;
	private String producent;



	public C_Urzadzenie() {
		this.nr_seryjny = "";
		this.data = new CData("1-1-2000");
		this.model = "";
		this.producent = "";
	}

	public C_Urzadzenie(String nr_seryjny, String data, String model, String producent) {
		this.nr_seryjny = new String(nr_seryjny);
		this.data = new CData(data);
		this.model = new String(model);
		this.producent = new String(producent);
	}


	public C_Urzadzenie(String dane) {
		String[] d = dane.split(",");
		this.nr_seryjny = new String(d[0]);
		this.data = new CData(d[1]);
		this.model = new String(d[2]);
		this.producent = new String(d[3]);
	}

	public String pobierzNrSeryjny() {
		return this.nr_seryjny;
	}
	public CData pobierzDate() {
		return this.data;
	}
	public String pobierzModel() {
		return this.model;
	}
	public String pobierzProducent() {
		return this.producent;
	}
	public void ustawNrSeryjny(String nr_seryjny) {
		this.nr_seryjny = nr_seryjny;
	}
	public void ustawDate(String data) {
		this.data = new CData(data);
	}
	public void ustawModel(String model) {
		this.model = model;
	}
	public void ustawProducent(String data) {
		this.producent = producent;
	}

	public String toString() {
		return  "Producent: "+ this.producent + "/Model: "+this.model + "/Nr seryjny: "+this.nr_seryjny+"/data produkcji: " ;
	}

	


}