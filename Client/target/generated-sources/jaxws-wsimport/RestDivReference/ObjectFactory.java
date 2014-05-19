
package RestDivReference;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the RestDivReference package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DividirResponse_QNAME = new QName("http://WebServices/", "dividirResponse");
    private final static QName _RestarResponse_QNAME = new QName("http://WebServices/", "restarResponse");
    private final static QName _Dividir_QNAME = new QName("http://WebServices/", "dividir");
    private final static QName _Restar_QNAME = new QName("http://WebServices/", "restar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: RestDivReference
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DividirResponse }
     * 
     */
    public DividirResponse createDividirResponse() {
        return new DividirResponse();
    }

    /**
     * Create an instance of {@link RestarResponse }
     * 
     */
    public RestarResponse createRestarResponse() {
        return new RestarResponse();
    }

    /**
     * Create an instance of {@link Dividir }
     * 
     */
    public Dividir createDividir() {
        return new Dividir();
    }

    /**
     * Create an instance of {@link Restar }
     * 
     */
    public Restar createRestar() {
        return new Restar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "dividirResponse")
    public JAXBElement<DividirResponse> createDividirResponse(DividirResponse value) {
        return new JAXBElement<DividirResponse>(_DividirResponse_QNAME, DividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "restarResponse")
    public JAXBElement<RestarResponse> createRestarResponse(RestarResponse value) {
        return new JAXBElement<RestarResponse>(_RestarResponse_QNAME, RestarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "dividir")
    public JAXBElement<Dividir> createDividir(Dividir value) {
        return new JAXBElement<Dividir>(_Dividir_QNAME, Dividir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "restar")
    public JAXBElement<Restar> createRestar(Restar value) {
        return new JAXBElement<Restar>(_Restar_QNAME, Restar.class, null, value);
    }

}
