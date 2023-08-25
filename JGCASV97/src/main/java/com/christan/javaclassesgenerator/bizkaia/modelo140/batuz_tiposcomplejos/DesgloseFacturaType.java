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
 * <p>Clase Java para DesgloseFacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DesgloseFacturaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sujeta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}SujetaType" minOccurs="0"/>
 *         &lt;element name="NoSujeta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}NoSujetaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesgloseFacturaType", propOrder = {
    "sujeta",
    "noSujeta"
})
public class DesgloseFacturaType {

    @XmlElement(name = "Sujeta")
    protected SujetaType sujeta;
    @XmlElement(name = "NoSujeta")
    protected NoSujetaType noSujeta;

    /**
     * Obtiene el valor de la propiedad sujeta.
     * 
     * @return
     *     possible object is
     *     {@link SujetaType }
     *     
     */
    public SujetaType getSujeta() {
        return sujeta;
    }

    /**
     * Define el valor de la propiedad sujeta.
     * 
     * @param value
     *     allowed object is
     *     {@link SujetaType }
     *     
     */
    public void setSujeta(SujetaType value) {
        this.sujeta = value;
    }

    /**
     * Obtiene el valor de la propiedad noSujeta.
     * 
     * @return
     *     possible object is
     *     {@link NoSujetaType }
     *     
     */
    public NoSujetaType getNoSujeta() {
        return noSujeta;
    }

    /**
     * Define el valor de la propiedad noSujeta.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSujetaType }
     *     
     */
    public void setNoSujeta(NoSujetaType value) {
        this.noSujeta = value;
    }

}
