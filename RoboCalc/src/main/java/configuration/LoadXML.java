/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package configuration;

/**
 *
 * @author Mejia
 * 
 * Esta clase va a leer la lista de web services y los parametros para ejecutar las pruebas cada prueba se cargara a un arreglo de pruebas
 * uno por cada tipo (REST SOAP) para luego en el main realizar las pruebas.
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.net.*;
import org.jdom2.Document;  // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder; // |
public class LoadXML {
	
	
	private List<Test> testREST = new ArrayList<Test>();
	private List<Test> testSOAP = new ArrayList<Test>();
	
    public  LoadXML(){
    //Se crea un SAXBuilder para poder parsear el archivo
    SAXBuilder builder = new SAXBuilder();
   
     File xmlFile = new File( "src/main/java/configuration/calc.xml" );
    
    try
    {
        //Se crea el documento a traves del archivo
    	
        Document document = (Document) builder.build(xmlFile);
 
        //Se obtiene la raiz 'webservices
        
        Element rootNode = document.getRootElement();
 
        //Se obtiene la lista de hijos de la raiz 'URLS'
        
        List list = rootNode.getChildren( "webservice" );
 
        //Se recorre la lista de hijos de 'webservice'
        
        for ( int i = 0; i < list.size(); i++ )
        {
            //Se obtiene el elemento 'webservice'
        	
            Element webService = (Element) list.get(i);
 
            //Se obtiene el atributo 'name' que esta en el tag 'webservice'
            
             String urlName = webService.getAttributeValue("name");
 
                switch(urlName){
                     case("REST"):
                     Test test = new Test();// se crea la prueba para insertarla en el arreglo
                     test.setType( webService.getChildTextTrim(urlName));
                     test.setHost( webService.getChildTextTrim("url")); 
                     test.setMethod( webService.getChildTextTrim("method"));
                     test.setP1(webService.getChildTextTrim("p1"));
                     test.setP2(webService.getChildTextTrim("p2"));
                     test.setResult(webService.getChildTextTrim("result"));
                     testREST.add(test); // se inserta en el arreglo
                     break;
                     case("SOAP"):
                     Test test1 = new Test();// se crea la prueba para insertarla en el arreglo
                     test1.setType( webService.getChildTextTrim(urlName));
                     test1.setHost( webService.getChildTextTrim("url")); 
                     test1.setMethod( webService.getChildTextTrim("method"));
                     test1.setP1(webService.getChildTextTrim("p1"));
                     test1.setP2(webService.getChildTextTrim("p2"));
                     test1.setResult(webService.getChildTextTrim("result"));
                     testSOAP.add(test1); // se inserta en el arreglo
                     break;
                }
      
           
 
         
               
 
               
               
 
                
            
        }
        
    }catch ( IOException io ) {
        System.out.println( io.getMessage() );
    }catch ( JDOMException jdomex ) {
        System.out.println( jdomex.getMessage() );
    
    }
}

	public List<Test> getTestREST() {
		return testREST;
	}

	public void setTestREST(List<Test> testREST) {
		this.testREST = testREST;
	}

	public List<Test> getTestSOAP() {
		return testSOAP;
	}

	public void setTestSOAP(List<Test> testSOAP) {
		this.testSOAP = testSOAP;
	}

    
    
    
}
