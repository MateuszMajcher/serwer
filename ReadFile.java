import java.io.*;
public class ReadFile {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("dane.txt"));
		/*FORMAT 
		|KOMPUTER| num_ser,data,model,producent  ,ilosc_rdzeni,pamiec_ram,model_procesora,taktowanie_rdzenia,pamiec_rom,karta_grafiki 
		|PC| rodzaj_obudowy,moc_zasilacza
		|LAPTOP|
		*/
		/*maks tablica */
		C_Komputer[] b = new C_Komputer[100];
		String s, s2 = new String();
		
		while ((s = in .readLine()) != null) {
			String[] d = s.split(",");
			
			if (d[0].equals("pc")) {
				C_pc a = new C_pc(d[1], d[2], d[3], d[4], Integer.parseInt(d[5]), Integer.parseInt(d[6]),
				                        d[7], Double.parseDouble(d[8]), Integer.parseInt(d[9]), d[10], d[11], Integer.parseInt(d[12]));
				System.out.println("PC : "+a);
			} else if (d[0].equals("laptop")) {
				C_laptop lap = new C_laptop(d[1], d[2], d[3], d[4], Integer.parseInt(d[5]), Integer.parseInt(d[6]),
				                     d[7], Double.parseDouble(d[8]), Integer.parseInt(d[9]), d[10],Double.parseDouble(d[11]),
				                                                        Double.parseDouble(d[12]),Double.parseDouble(d[13]),d[14]);
				System.out.println("Laptop : "+lap);
				}
             else if (d[0].equals("tablet")){
	            C_tablet tab = new C_tablet(d[1], d[2], d[3], d[4], Integer.parseInt(d[5]), Integer.parseInt(d[6]),
				                     d[7], Double.parseDouble(d[8]), Integer.parseInt(d[9]), d[10],Double.parseDouble(d[11]),
				                                                      Double.parseDouble(d[12]),Double.parseDouble(d[13]));
	             System.out.println("tablet : "+tab);
	             }
	             
	             
	             
		} in .close();
	}
}