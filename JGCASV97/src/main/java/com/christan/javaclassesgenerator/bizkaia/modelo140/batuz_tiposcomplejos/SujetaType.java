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
 * <p>Clase Java para SujetaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SujetaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exenta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}ExentaType" minOccurs="0"/>
 *         &lt;element name="NoExenta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}NoExentaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SujetaType", propOrder = {
    "exenta",
    "noExenta"
})
public class SujetaType {

    @XmlElement(name = "Exenta")
    protected ExentaType exenta;
    @XmlElement(name = "NoExenta")
    protected NoExentaType noExenta;

    /**
     * Obtiene el valor de la propiedad exenta.
     * 
     * @return
     *     possible object is
     *     {@link ExentaType }
     *     
     */
    public ExentaType getExenta() {
        return exenta;
    }

    /**
     * Define el valor de la propiedad exenta.
     * 
     * @param value
     *     allowed object is
     *     {@link ExentaType }
     *     
     */
    public void setExenta(ExentaType value) {
        this.exenta = value;
    }

    /**
     * Obtiene el valor de la propiedad noExenta.
     * 
     * @return
     *     possible object is
     *     {@link NoExentaType }
     *     
     */
    public NoExentaType getNoExenta() {
        return noExenta;
    }

    /**
     * Define el valor de la propiedad noExenta.
     * 
     * @param value
     *     allowed object is
     *     {@link NoExentaType }
     *     
     */
    public void setNoExenta(NoExentaType value) {
        this.noExenta = value;
    }

}
