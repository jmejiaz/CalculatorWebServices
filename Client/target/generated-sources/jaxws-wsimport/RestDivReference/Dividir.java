
package RestDivReference;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dividir complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dividir">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="second" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dividir", propOrder = {
    "first",
    "second"
})
public class Dividir {

    protected double first;
    protected double second;

    /**
     * Obtiene el valor de la propiedad first.
     * 
     */
    public double getFirst() {
        return first;
    }

    /**
     * Define el valor de la propiedad first.
     * 
     */
    public void setFirst(double value) {
        this.first = value;
    }

    /**
     * Obtiene el valor de la propiedad second.
     * 
     */
    public double getSecond() {
        return second;
    }

    /**
     * Define el valor de la propiedad second.
     * 
     */
    public void setSecond(double value) {
        this.second = value;
    }

}
