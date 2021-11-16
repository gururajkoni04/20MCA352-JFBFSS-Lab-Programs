//----------------------------------------------------------------------------------------------------
//Program #4
//Demonstrates the REST Api application for storing and retrieving the info from the RestAPI using CoAP
//Client Program
//-----------------------------------------------------------------------------------------------------
//Created by Gururaj Koni on 16/11/2021
//support www.konigraphics.in
//----------------------------------------------------------------------------------------------------

package Program4.restapi;
import java.io.IOException;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.elements.exception.ConnectorException;
public class ClientCoap {
	public static void main(String arg[]) throws IOException {
		
		CoapClient c1=new CoapClient("coap://127.0.0.1/Koni");
//		CoapClient c2=new CoapClient("coap://172.16.34.132/resource");
		try {
//			String text=c2.get().getResponseText();
			for(int ie=0;ie<5;ie++) {
				String text=c1.get().getResponseText();
				System.out.println(text);
			}
		}
		catch(ConnectorException e1) {
			e1.printStackTrace();
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		try {
			System.out.println("Client Ended");
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}
