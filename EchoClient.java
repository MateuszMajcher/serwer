import java.net.*;
import java.io.*;

public class EchoClient{
	public static void main(String[] args){
BufferedReader in = null;
PrintWriter out = null;

try {
	BufferedReader klawiatura = new BufferedReader(new InputStreamReader(System.in));
	Socket gniazdo = new Socket("localhost",7);
	in = new BufferedReader(new InputStreamReader(gniazdo.getInputStream()));
	out = new PrintWriter(gniazdo.getOutputStream());
	System.out.println("Nawi¹zano polaczenie z " + gniazdo.getInetAddress());
	
	 while(true){
		 System.out.print("> ");
		 String tekst = klawiatura.readLine();
		 out.println(tekst);
		 out.flush();
		 if (tekst.equals("END"))
		       break;
		  System.out.println("echo: "+in.readLine());
		 }
	 
	} catch(IOException e){
		 System.out.println(e);
		} finally {
			try{
				if (in != null) in.close();
				if (out != null) out.close();
				
				}catch(IOException e){}
			
			}

}
}