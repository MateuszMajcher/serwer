import java.io.*;
public class ReadFile{
	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new FileReader("dane.txt"));
		/*FORMAT 
		|KOMPUTER| num_ser,data,model,producent  ,ilosc_rdzeni,pamiec_ram,model_procesora,taktowanie_rdzenia,pamiec_rom,karta_grafiki 
		|PC| rodzaj_obudowy,moc_zasilacza
		|LAPTOP|
		*/
		C_Komputer[] b = new C_Komputer[5]; 
		String s,s2 = new String();
		while((s = in.readLine()) != null){
		 String[] d = s.split(",");
		 
		C_Komputer a = new C_Komputer(d[0],d[1],d[2],d[3],Integer.parseInt(d[4]),Integer.parseInt(d[5]),d[6],Double.parseDouble(d[7]),Integer.parseInt(d[8]),d[9]);
System.out.println(a);
		}
	in.close();
	}
}