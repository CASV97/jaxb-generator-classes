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
 * <p>Clase Java para GananciaDetalleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GananciaDetalleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GananciaTransmision" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="GananciaExentaReinversion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GananciaDetalleType", propOrder = {
    "gananciaTransmision",
    "gananciaExentaReinversion"
})
public class GananciaDetalleType {

    @XmlElement(name = "GananciaTransmision")
    protected String gananciaTransmision;
    @XmlElement(name = "GananciaExentaReinversion")
    protected String gananciaExentaReinversion;

    /**
     * Obtiene el valor de la propiedad gananciaTransmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGananciaTransmision() {
        return gananciaTransmision;
    }

    /**
     * Define el valor de la propiedad gananciaTransmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGananciaTransmision(String value) {
        this.gananciaTransmision = value;
    }

    /**
     * Obtiene el valor de la propiedad gananciaExentaReinversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGananciaExentaReinversion() {
        return gananciaExentaReinversion;
    }

    /**
     * Define el valor de la propiedad gananciaExentaReinversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGananciaExentaReinversion(String value) {
        this.gananciaExentaReinversion = value;
    }

}
