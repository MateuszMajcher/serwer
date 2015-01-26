public class CData {
private int dzien;
private int miesiac;
private int rok;
public CData(){ ustawDate(1,1,2000); }
public CData(int d, int m, int r){ ustawDate(d,m,r); }
public CData(String data){
	String[] d = data.split("-");
	this.dzien = Integer.parseInt(d[0]);
	this.miesiac = Integer.parseInt(d[1]);
	this.rok = Integer.parseInt(d[2]);
	}
public void ustawDate(int d, int m, int r) {
	this.dzien = d;
	this.miesiac = m;
	this.rok =r;
	}

public String toString() { return dzien + "/" + miesiac + "/" + rok; }
}