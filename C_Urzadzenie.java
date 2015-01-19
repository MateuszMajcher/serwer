public class C_Urzadzenie{
private String nr_seryjny;
private String data;
private String model; 
private String producent;



public C_Urzadzenie(){
  this.nr_seryjny = "";
  this.data = "";
  this.model = "";
  this.producent = "";
}

public C_Urzadzenie(String nr_seryjny,String data,String model,String producent){
  this.nr_seryjny = new String(nr_seryjny);
  this.data = new String(data);
  this.model = new String(model);
  this.producent = new String(producent);
}
  

public C_Urzadzenie(String dane){
	String[] d = dane.split(",");
	this.nr_seryjny = new String(d[0]);
	this.data = new String(d[1]);
    this.model = new String(d[2]);
    this.producent = new String(d[3]);
}

public String pobierzNrSeryjny() { return this.nr_seryjny; } 
public String pobierzDate() {return this.data; }
public String pobierzModel() { return this.model; } 
public String pobierzProducent() {return this.producent; } 
void ustawNrSeryjny(String nr_seryjny) { this.nr_seryjny = nr_seryjny; } 
void ustawDate(String data) { this.data = data; } 
void ustawModel(String model) { this.model = model; } 
void ustawProducent(String data) { this.producent = producent; }

public String toString(){
	return this.nr_seryjny + " " + this.data + " " + this.model + " " + this.producent;
	}
	


}