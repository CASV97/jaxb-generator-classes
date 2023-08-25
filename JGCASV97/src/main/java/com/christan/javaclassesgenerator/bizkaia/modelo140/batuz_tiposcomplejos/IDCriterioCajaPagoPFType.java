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
 * <p>Clase Java para IDCriterioCajaPagoPFType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IDCriterioCajaPagoPFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Epigrafe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}stringMax7Digits"/>
 *         &lt;element name="OperacionOriginal" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}IDOperacionOriginalPagoType"/>
 *         &lt;element name="FechaPago" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDCriterioCajaPagoPFType", propOrder = {
    "epigrafe",
    "operacionOriginal",
    "fechaPago"
})
public class IDCriterioCajaPagoPFType {

    @XmlElement(name = "Epigrafe", required = true)
    protected String epigrafe;
    @XmlElement(name = "OperacionOriginal", required = true)
    protected IDOperacionOriginalPagoType operacionOriginal;
    @XmlElement(name = "FechaPago", required = true)
    protected String fechaPago;

    /**
     * Obtiene el valor de la propiedad epigrafe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpigrafe() {
        return epigrafe;
    }

    /**
     * Define el valor de la propiedad epigrafe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpigrafe(String value) {
        this.epigrafe = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionOriginal.
     * 
     * @return
     *     possible object is
     *     {@link IDOperacionOriginalPagoType }
     *     
     */
    public IDOperacionOriginalPagoType getOperacionOriginal() {
        return operacionOriginal;
    }

    /**
     * Define el valor de la propiedad operacionOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link IDOperacionOriginalPagoType }
     *     
     */
    public void setOperacionOriginal(IDOperacionOriginalPagoType value) {
        this.operacionOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

}
