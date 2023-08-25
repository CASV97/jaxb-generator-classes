//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.25 a las 03:01:04 PM CEST 
//


package com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_tiposcomplejos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OperacionOriginalPagoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OperacionOriginalPagoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ConFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}PagoConFacturaType"/>
 *           &lt;element name="SinFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}PagoSinFacturaType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacionOriginalPagoType", propOrder = {
    "conFactura",
    "sinFactura"
})
public class OperacionOriginalPagoType {

    @XmlElement(name = "ConFactura")
    protected PagoConFacturaType conFactura;
    @XmlElement(name = "SinFactura")
    protected PagoSinFacturaType sinFactura;

    /**
     * Obtiene el valor de la propiedad conFactura.
     * 
     * @return
     *     possible object is
     *     {@link PagoConFacturaType }
     *     
     */
    public PagoConFacturaType getConFactura() {
        return conFactura;
    }

    /**
     * Define el valor de la propiedad conFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link PagoConFacturaType }
     *     
     */
    public void setConFactura(PagoConFacturaType value) {
        this.conFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad sinFactura.
     * 
     * @return
     *     possible object is
     *     {@link PagoSinFacturaType }
     *     
     */
    public PagoSinFacturaType getSinFactura() {
        return sinFactura;
    }

    /**
     * Define el valor de la propiedad sinFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link PagoSinFacturaType }
     *     
     */
    public void setSinFactura(PagoSinFacturaType value) {
        this.sinFactura = value;
    }

}
