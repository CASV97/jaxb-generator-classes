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
 * <p>Clase Java para IDTransferenciaPericialOtroType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IDTransferenciaPericialOtroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmisorFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}NIFNIFIVAType"/>
 *         &lt;element name="SerieFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="NumFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax20Type"/>
 *         &lt;element name="FechaExpedicionFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="FechaOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDTransferenciaPericialOtroType", propOrder = {
    "emisorFactura",
    "serieFactura",
    "numFactura",
    "fechaExpedicionFactura",
    "fechaOperacion"
})
public class IDTransferenciaPericialOtroType {

    @XmlElement(name = "EmisorFactura", required = true)
    protected NIFNIFIVAType emisorFactura;
    @XmlElement(name = "SerieFactura")
    protected String serieFactura;
    @XmlElement(name = "NumFactura", required = true)
    protected String numFactura;
    @XmlElement(name = "FechaExpedicionFactura", required = true)
    protected String fechaExpedicionFactura;
    @XmlElement(name = "FechaOperacion", required = true)
    protected String fechaOperacion;

    /**
     * Obtiene el valor de la propiedad emisorFactura.
     * 
     * @return
     *     possible object is
     *     {@link NIFNIFIVAType }
     *     
     */
    public NIFNIFIVAType getEmisorFactura() {
        return emisorFactura;
    }

    /**
     * Define el valor de la propiedad emisorFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link NIFNIFIVAType }
     *     
     */
    public void setEmisorFactura(NIFNIFIVAType value) {
        this.emisorFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad serieFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieFactura() {
        return serieFactura;
    }

    /**
     * Define el valor de la propiedad serieFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieFactura(String value) {
        this.serieFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad numFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFactura() {
        return numFactura;
    }

    /**
     * Define el valor de la propiedad numFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFactura(String value) {
        this.numFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicionFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionFactura() {
        return fechaExpedicionFactura;
    }

    /**
     * Define el valor de la propiedad fechaExpedicionFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionFactura(String value) {
        this.fechaExpedicionFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Define el valor de la propiedad fechaOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacion(String value) {
        this.fechaOperacion = value;
    }

}
