public class Serwer{
	public static void main(String[] args){
		C_pc komp = new C_pc("ax0","11-12-2010","galaxy","samsung",4,1024,"Intel",2.4,16,"NVidia","tower",500);
		C_laptop lap = new C_laptop("az25f0","1-02-2014","inspirion","dell",8,2048,"amd",2.8,16,"GForce",15.6,2.4,8,"intel realtek");
		C_tablet tab = new C_tablet("ee0ff45","1-02-2013","ipad","apple",2,1024,"a8",2.8,16,"aplle",10.1,2450,5.0);
		System.out.println(tab);
		C_Urzadzenie a = new C_Urzadzenie();
		a.ustawDate("11-02-1992");
		System.out.println(a);
		}
	
	}