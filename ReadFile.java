import java.io.*;
public class ReadFile{
	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new FileReader("dane.txt"));
		/*FORMAT 
		|KOMPUTER| num_ser,data,model,producent,ilosc_rdzeni,pamiec_ram,model_procesora,taktowanie_rdzenia,pamiec_rom,karta_grafiki 
		|PC| rodzaj_obudowy,moc_zasilacza
		|LAPTOP|
		*/
		String s,s2 = new String();
		while((s = in.readLine()) != null){
		 String[] d = s.split(",");
		for(int i = 0; i < d.length; i++) System.out.println("b[" + i + "]=" + d[i]); 
}
	in.close();
	}
}