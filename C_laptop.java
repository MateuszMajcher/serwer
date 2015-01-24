public class C_laptop extends C_Komputer{
private double rozmiar_ekranu;
private double waga;
private double czas_pracy;
private String karta_sieciowa;

public C_laptop(){
	super();
	this.rozmiar_ekranu =0.0;
	this.waga=0.0;
	this.czas_pracy = 0.0;
	this.karta_sieciowa ="";
}

public C_laptop(String nr_seryjny,String data,String model,String producent ,
    int ilosc_rdzeni,int pamiec_ram,String model_procesora,double taktowanie_rdzenia,int pamiec_rom,String karta_grafiki,double rozmiar_ekranu,double waga,double czas_pracy,String karta_sieciowa){
	super(nr_seryjny,data,model,producent,ilosc_rdzeni,pamiec_ram,model_procesora,taktowanie_rdzenia,pamiec_rom,karta_grafiki);
	this.rozmiar_ekranu = rozmiar_ekranu;
	this.waga = waga;
	this.czas_pracy = czas_pracy;
	this.karta_sieciowa = new String(karta_sieciowa);
	}

public String toString(){
	 return "Laptop/"+super.toString() + "/Rozmiar ekranu: "+this.rozmiar_ekranu +"/Waga: "+this.waga+"/Czas pracy "+this.czas_pracy+"/Karta sieciowa: "+this.karta_sieciowa;
	}
}