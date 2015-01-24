public class C_Komputer extends C_Urzadzenie implements I_Komputer{
private int ilosc_rdzeni;
private int pamiec_ram;
private String model_procesora;
private double taktowanie_rdzenia;
private int pamiec_rom;
private String karta_grafiki;


public C_Komputer(){
	super();
	this.ilosc_rdzeni = 0;
	this.pamiec_ram = 0;
	this.model_procesora ="";
	this.taktowanie_rdzenia = 0.0;
	this.pamiec_rom = 0;
	this.karta_grafiki ="";
	}
	
public C_Komputer(String nr_seryjny,String data,String model,String producent ,
                                    int ilosc_rdzeni,int pamiec_ram,String model_procesora,double taktowanie_rdzenia,int pamiec_rom,String karta_grafiki){
	                                    
	super(nr_seryjny,data,model,producent);
	this.ilosc_rdzeni = ilosc_rdzeni;
	this.pamiec_ram = pamiec_ram;
	this.model_procesora = new String(model_procesora);
	this.taktowanie_rdzenia = taktowanie_rdzenia;
	this.pamiec_rom = pamiec_rom;
	this.karta_grafiki = new String(karta_grafiki);
	                                    
	                                    
	                                    }
	public int Moc_obliczeniowa(){
	return 10;
	}
	
	public String toString(){
	return super.toString() +"/Model procesora: " + this.model_procesora + "/Ilosc rdzeni: " + this.ilosc_rdzeni + 
	                            "/Taktowanie rdzenia: " + this.taktowanie_rdzenia + "/Pamiec RAM: "+this.pamiec_ram+"/Dysk: " + 
	                                                          this.pamiec_rom + "/Karta grafiki: "+this.karta_grafiki;
	}
}