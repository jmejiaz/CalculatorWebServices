package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;
import configuration.LoadXML;
import configuration.Test;

public class Application {

	public static void main(String args[]) {

		LoadXML load = new LoadXML(); // se cargan las pruebas desde el xml

		// cargo las pruebas indipendientemente
		List<Test> testREST = load.getTestREST();
		List<Test> testSOAP = load.getTestSOAP();

		
		//estos foreach ehecutan cada una de las pruebas 
		for (Test test : testREST) {
			RestTemplate restTemplate = new RestTemplate();
			
			Operation op = restTemplate.getForObject(test.getHost()+"?first="+ test.getP1() + "&second=" + test.getP2()+ "&operator=" + test.getMethod(), Operation.class);
			System.out.println("Primer operador " + op.getFirst());
			System.out.println("Segundo operador " + op.getSecond());
			System.out.println("Operador " + op.getOperator());
			System.out.println("Resultado " + op.getResult());
			System.out.println("Resultado esperado " + test.getResult());
			if (test.getResult().equals(op.getResult())) {
				System.out.println("prueba exitosa");
			} else {
				System.out.println("fallo");
			}
		}

		//aun no se como hacer el robot para SOAP
		/*
		for (Test test : testSOAP) {
			RestTemplate restTemplate = new RestTemplate();
			Operation op = restTemplate.getForObject(test.getHost()	+ "?+first=" + test.getP1() + "&second=" + test.getP2()	+ "&operator=" + test.getMethod(), Operation.class);
			System.out.println("Primer operador " + op.getFirst());
			System.out.println("Segundo operador " + op.getSecond());
			System.out.println("Operador " + op.getOperator());
			System.out.println("Resultado " + op.getResult());
			System.out.println("Resultado esperado " + test.getResult());
			if (test.getResult().equals(op.getResult())) {
				System.out.println("prueba exitosa");
			} else {
				System.out.println("fallo");
			}
		}
		*/

	}

}