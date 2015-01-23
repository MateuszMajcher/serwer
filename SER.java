import java.io.*;
import java.net.*;

public class SER{
	public static final int PORT = 7;
 public static void main(String[] args) throws IOException{
  ServerSocket gniazdoSerwera = new ServerSocket(PORT);
  System.out.println("uruchomiono serwer: "+gniazdoSerwera);
  C_plik plik = new C_plik();
  System.out.println(plik.znajdz());
  
  try{
	  System.out.println("Oczekiwanie na połaczenie...");
	  Socket gniazdo = gniazdoSerwera.accept();
	  BufferedReader in = null;
	  PrintWriter out = null;
	    try{
		    in = new BufferedReader(new InputStreamReader(gniazdo.getInputStream()));
		    out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(gniazdo.getOutputStream())),true);
		    System.out.println("Otwarto połaczenie "+gniazdo);
		    while(true){
			    String tekst =in.readLine();
			    if (tekst.equals("END")) break;
			    System.out.println("> "+tekst);
			    out.println(tekst);
			    }
		    } finally{
			    System.out.println("Zamykanie...");
			       try{
				       if(in!=null) in.close();
				       if(out!=null) out.close();
				       }catch(Exception e){}
				   gniazdo.close();
			    
			    }
	  } finally{
		  gniazdoSerwera.close();
		  }
  
  
 }


}