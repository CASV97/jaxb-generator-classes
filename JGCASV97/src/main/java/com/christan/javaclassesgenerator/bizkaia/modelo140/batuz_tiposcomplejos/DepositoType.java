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
 * <p>Clase Java para DepositoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DepositoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Depositario" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DocumentoPersonaType" minOccurs="0"/>
 *         &lt;element name="DireccionAlmacen" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax120Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositoType", propOrder = {
    "depositario",
    "direccionAlmacen"
})
public class DepositoType {

    @XmlElement(name = "Depositario")
    protected DocumentoPersonaType depositario;
    @XmlElement(name = "DireccionAlmacen", required = true)
    protected String direccionAlmacen;

    /**
     * Obtiene el valor de la propiedad depositario.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public DocumentoPersonaType getDepositario() {
        return depositario;
    }

    /**
     * Define el valor de la propiedad depositario.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public void setDepositario(DocumentoPersonaType value) {
        this.depositario = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionAlmacen() {
        return direccionAlmacen;
    }

    /**
     * Define el valor de la propiedad direccionAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionAlmacen(String value) {
        this.direccionAlmacen = value;
    }

}
