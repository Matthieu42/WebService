package appSOAP;
import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {

		Endpoint.publish("http://0.0.0.0:2000/Chambre", new Chambre());
		Endpoint.publish("http://0.0.0.0:2000/Hotel", new Hotel());
	}
}