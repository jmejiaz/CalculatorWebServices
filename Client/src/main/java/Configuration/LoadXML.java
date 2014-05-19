/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Configuration;

/**
 *
 * @author Mejia
 */
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.net.*;
import org.jdom2.Document;  // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder; // |
public class LoadXML {
    private String mulsumServerREST;
    private String divrestServerREST;
    private String mulsumServerSOAP;
    private String divrestServerSOAP;
    public  LoadXML(){
    //Se crea un SAXBuilder para poder parsear el archivo
    SAXBuilder builder = new SAXBuilder();
    //SAXBuilder parser = new SAXBuilder();
   // Document doc = parser.build("http://localhost:8084/calcserver.xml");
    
    try
    {
        //Se crea el documento a traves del archivo
        Document document = (Document) builder.build("http://localhost:8084/calcserver.xml");
 
        //Se obtiene la raiz 'URLS
        Element rootNode = document.getRootElement();
 
        //Se obtiene la lista de hijos de la raiz 'URLS'
        List list = rootNode.getChildren( "url" );
 
        //Se recorre la lista de hijos de 'url'
        for ( int i = 0; i < list.size(); i++ )
        {
            //Se obtiene el elemento 'url'
            Element url = (Element) list.get(i);
 
            //Se obtiene el atributo 'name' que esta en el tag 'url'
            //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
            String urlName = url.getAttributeValue("name");
 
                switch(urlName){
                     case("REST"):
                     this.setMulsumServerREST( url.getChildTextTrim("sm")); 
                     this.setDivrestServerREST( url.getChildTextTrim("rd"));
                         break;
                     case("SOAP"):
                     this.setMulsumServerSOAP( url.getChildTextTrim("sm")); 
                     this.setDivrestServerSOAP( url.getChildTextTrim("rd"));
                         break;
                }
            //Se obtiene la lista de hijos del tag 'url'
           
 
         
               
 
                //Se obtienen los valores que estan entre los tags '<campo></campo>'
                //Se obtiene el valor que esta entre los tags '<nombre></nombre>'
                
 
                //Se obtiene el valor que esta entre los tags '<tipo></tipo>'
               
 
                
            
        }
        
    }catch ( IOException io ) {
        System.out.println( io.getMessage() );
    }catch ( JDOMException jdomex ) {
        System.out.println( jdomex.getMessage() );
    
    }
}

    public String getMulsumServerREST() {
        return mulsumServerREST;
    }

    public void setMulsumServerREST(String mulsumServerREST) {
        this.mulsumServerREST = mulsumServerREST;
    }

    public String getDivrestServerREST() {
        return divrestServerREST;
    }

    public void setDivrestServerREST(String divrestServerREST) {
        this.divrestServerREST = divrestServerREST;
    }

    public String getMulsumServerSOAP() {
        return mulsumServerSOAP;
    }

    public void setMulsumServerSOAP(String mulsumServerSOAP) {
        this.mulsumServerSOAP = mulsumServerSOAP;
    }

    public String getDivrestServerSOAP() {
        return divrestServerSOAP;
    }

    public void setDivrestServerSOAP(String divrestServerSOAP) {
        this.divrestServerSOAP = divrestServerSOAP;
    }
    
    
}
