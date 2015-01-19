public class C_pc extends C_Komputer{
private String rodzaj_obudowy;
private int moc_zasilacza;


public C_pc(){
	super();
	this.rodzaj_obudowy="";
	this.moc_zasilacza=0;
}

public C_pc(String nr_seryjny,String data,String model,String producent ,
    int ilosc_rdzeni,int pamiec_ram,String model_procesora,double taktowanie_rdzenia,int pamiec_rom,String karta_grafiki,String rodzaj_obudowy,int moc_zasilacza){
	super(nr_seryjny,data,model,producent,ilosc_rdzeni,pamiec_ram,model_procesora,taktowanie_rdzenia,pamiec_rom,karta_grafiki);
	this.rodzaj_obudowy = new String(rodzaj_obudowy);
	this.moc_zasilacza = moc_zasilacza;
	}

public C_pc(String dane){
	String[] d = dane.split(",");
	
	this.rodzaj_obudowy = new String(d[0]);
	this.moc_zasilacza = Integer.parseInt(d[1]);
	}

	
	public String toString(){
	return super.toString() +" "+ this.rodzaj_obudowy + " " + this.moc_zasilacza;
	}

}