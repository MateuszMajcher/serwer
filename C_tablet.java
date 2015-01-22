public class C_tablet extends C_Komputer{
private double rozmiar_ekranu;
private double akumulator;
private double rozdz_aparatu;

public C_tablet(){
	this.rozmiar_ekranu = 0.0;
	this.akumulator =0.0;
	this.rozdz_aparatu = 0.0;
	}
	
public C_tablet(String nr_seryjny,String data,String model,String producent,int ilosc_rdzeni,int pamiec_ram,
                    String model_procesora,double taktowanie_rdzenia,int pamiec_rom,String karta_grafiki,double rozmiar_ekranu,
                           double akumulator,double rozdz_ekranu){
	super(nr_seryjny,data,model,producent,ilosc_rdzeni,pamiec_ram,model_procesora,taktowanie_rdzenia,pamiec_rom,karta_grafiki);
	this.rozmiar_ekranu = rozmiar_ekranu;
	this.akumulator = akumulator;
	this.rozdz_aparatu =0.0;
	}
	
public String toString(){
	return super.toString() + " "+this.rozmiar_ekranu+" "+this.akumulator+" "+this.rozdz_aparatu;
	}

}