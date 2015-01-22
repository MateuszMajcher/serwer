import java.io.*;
import java.net.*;

public class EchoServer{
	public static final int PORT = 7;
 public static void main(String[] args) throws IOException{
  ServerSocket gniazdoSerwera = new ServerSocket(PORT);
  System.out.println("uruchomiono serwer: "+gniazdoSerwera);
  
  try{
	  System.out.println("Oczekiwanie na po³aczenie...");
	  Socket gniazdo = gniazdoSerwera.accept();
	  BufferedReader in = null;
	  PrintWriter out = null;
	    try{
		    in = new BufferedReader(new InputStreamReader(gniazdo.getInputStream()));
		    out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(gniazdo.getOutputStream())),true);
		    System.out.println("Otwarto po³aczenie "+gniazdo);
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