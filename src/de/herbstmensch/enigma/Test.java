
package de.herbstmensch.enigma;

import java.net.MalformedURLException;

import de.herbstmensch.enigma.api.EnigmaAPI;
import de.herbstmensch.enigma.api.exceptions.APIException;
import de.herbstmensch.enigma.api.exceptions.EnigmaException;
import de.herbstmensch.enigma.model.BouquetList;
import de.herbstmensch.enigma.model.MessageDuration;
import de.herbstmensch.enigma.model.MessageType;

public class Test {

	public static void main(String[] args) throws APIException, InterruptedException, MalformedURLException, EnigmaException {
		EnigmaAPI e = new EnigmaAPI.Builder().setUseHttps(false).setHost("home.timherbst.de").setPort(82).setUser("tim").setPass("dcx2.0dcx2.1").build();
//
//		
//		BouquetList bl = e.getAllServices();
//		System.out.println(bl);
//		System.out.println(e.getServices(bl.getBouquets().get(0)));
//		System.out.println(e.epgBouquet(bl.getBouquets().get(0), null));
//		System.out.println(e.epgNext(bl.getBouquets().get(0)));
//		System.out.println(e.message("Test", MessageType.INFO, MessageDuration.LONG));
		 System.out.println(e.getTimerlist());

		// System.out.println(e.getTimerlist());
	}

}
