//----------------------------------------------------------------------------------------------------
//Program #4
//Demonstrates the REST Api application for storing and retrieving the info from the RestAPI using CoAP
//Server Program
//-----------------------------------------------------------------------------------------------------
//Created by Gururaj Koni on 16/11/2021
//support www.konigraphics.in
//----------------------------------------------------------------------------------------------------

package Program4.restapi;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class MyResource extends CoapResource{
	private int i=0;
	public MyResource(String name) {
		super(name);
	}
	public void handleGET(CoapExchange exchange) {
		exchange.respond("Hello"+i++);
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e2) {
			e2.printStackTrace();
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void main(String arg[]){
		CoapServer server=new CoapServer();
		server.add(new MyResource("Koni"));
		//server.add(new MyResource("Hello"));
		server.start();
		
	}
}
