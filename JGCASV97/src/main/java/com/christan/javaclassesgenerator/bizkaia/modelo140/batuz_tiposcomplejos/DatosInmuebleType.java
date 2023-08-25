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
 * <p>Clase Java para DatosInmuebleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosInmuebleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SituacionInmueble" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SituacionInmuebleEnum"/>
 *         &lt;choice>
 *           &lt;element name="ReferenciaCatastral" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax25Type"/>
 *           &lt;element name="DireccionInmueble" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax100Type"/>
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
@XmlType(name = "DatosInmuebleType", propOrder = {
    "situacionInmueble",
    "referenciaCatastral",
    "direccionInmueble"
})
public class DatosInmuebleType {

    @XmlElement(name = "SituacionInmueble", required = true)
    protected String situacionInmueble;
    @XmlElement(name = "ReferenciaCatastral")
    protected String referenciaCatastral;
    @XmlElement(name = "DireccionInmueble")
    protected String direccionInmueble;

    /**
     * Obtiene el valor de la propiedad situacionInmueble.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacionInmueble() {
        return situacionInmueble;
    }

    /**
     * Define el valor de la propiedad situacionInmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacionInmueble(String value) {
        this.situacionInmueble = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaCatastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaCatastral() {
        return referenciaCatastral;
    }

    /**
     * Define el valor de la propiedad referenciaCatastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaCatastral(String value) {
        this.referenciaCatastral = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionInmueble.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionInmueble() {
        return direccionInmueble;
    }

    /**
     * Define el valor de la propiedad direccionInmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionInmueble(String value) {
        this.direccionInmueble = value;
    }

}
