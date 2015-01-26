import java.util.*;
import java.io.*;
import java.net.*;
public class C_plik {
	private BufferedReader infile = null;
	private C_Urzadzenie komputery[];
	List < C_Urzadzenie > lista = new ArrayList < C_Urzadzenie > ();
	public C_plik() {
		try {
			infile = new BufferedReader(new FileReader("dane.txt"));
			komputery = new C_Urzadzenie[17];
			String s, s2 = new String();
			int i = 0;
			while ((s = infile.readLine()) != null) {
				String[] d = s.split(",");
				if (d[0].equals("pc")) {
					komputery[i] = new C_pc(d[1], d[2], d[3], d[4], Integer.parseInt(d[5]), Integer.parseInt(d[6]), d[7], Double.parseDouble(d[8]), Integer.parseInt(d[9]), d[10], d[11], Integer.parseInt(d[12]));
					lista.add(new C_pc(d[1], d[2], d[3], d[4], Integer.parseInt(d[5]), Integer.parseInt(d[6]), d[7], Double.parseDouble(d[8]), Integer.parseInt(d[9]), d[10], d[11], Integer.parseInt(d[12])));
				} else if (d[0].equals("laptop")) {
					komputery[i] = new C_laptop(d[1], d[2], d[3], d[4], Integer.parseInt(d[5]), Integer.parseInt(d[6]), d[7], Double.parseDouble(d[8]), Integer.parseInt(d[9]), d[10], Double.parseDouble(d[11]), Double.parseDouble(d[12]), Double.parseDouble(d[13]), d[14]);
					lista.add(new C_laptop(d[1], d[2], d[3], d[4], Integer.parseInt(d[5]), Integer.parseInt(d[6]), d[7], Double.parseDouble(d[8]), Integer.parseInt(d[9]), d[10], Double.parseDouble(d[11]), Double.parseDouble(d[12]), Double.parseDouble(d[13]), d[14]));
				} else if (d[0].equals("tablet")) {
					komputery[i] = new C_tablet(d[1], d[2], d[3], d[4], Integer.parseInt(d[5]), Integer.parseInt(d[6]), d[7], Double.parseDouble(d[8]), Integer.parseInt(d[9]), d[10], Double.parseDouble(d[11]), Double.parseDouble(d[12]), Double.parseDouble(d[13]));
					lista.add(new C_tablet(d[1], d[2], d[3], d[4], Integer.parseInt(d[5]), Integer.parseInt(d[6]), d[7], Double.parseDouble(d[8]), Integer.parseInt(d[9]), d[10], Double.parseDouble(d[11]), Double.parseDouble(d[12]), Double.parseDouble(d[13])));
				}
				i++;
			}
			infile.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String znajdz_lista(String tekst) {
		String w = "";
		for (C_Urzadzenie item: lista) {
			if (item.pobierzProducent().equals(tekst) || item.pobierzModel().equals(tekst)) {
				w += "/----------------------------------------/";
				w += item.toString();
			}
		}
		if (w.equals("")) {
			w = "Nic nie znaleziono";
		}
		return w;
	}
	public String znajdz_tablica(String tekst) {
		String s = "";
		for (C_Urzadzenie x: komputery) {
			if (x.pobierzProducent().equals(tekst) || x.pobierzModel().equals(tekst)) {
				s += "/----------------------------------------/";
				s += x.toString();
			}
		}
		if (s.equals("")) {
			s = "Nic nie znaleziono";
		}
		return s;
	}
}