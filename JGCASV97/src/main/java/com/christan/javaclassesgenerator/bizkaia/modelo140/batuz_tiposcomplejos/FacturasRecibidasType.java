//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.25 a las 03:01:04 PM CEST 
//


package com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_tiposcomplejos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturasRecibidasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturasRecibidasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacturaRecibida" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}FacturaRecibidaType" maxOccurs="10000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturasRecibidasType", propOrder = {
    "facturaRecibida"
})
public class FacturasRecibidasType {

    @XmlElement(name = "FacturaRecibida", required = true)
    protected List<FacturaRecibidaType> facturaRecibida;

    /**
     * Gets the value of the facturaRecibida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facturaRecibida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturaRecibida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaRecibidaType }
     * 
     * 
     */
    public List<FacturaRecibidaType> getFacturaRecibida() {
        if (facturaRecibida == null) {
            facturaRecibida = new ArrayList<FacturaRecibidaType>();
        }
        return this.facturaRecibida;
    }

}