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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.SiNoEnum;


/**
 * <p>Clase Java para TipoBienInmuebleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoBienInmuebleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Direccion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DireccionType"/>
 *         &lt;element name="MarcaReferenciaCatastralInexistente" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *         &lt;element name="ReferenciaCatastral" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax25Type" minOccurs="0"/>
 *         &lt;element name="ImporteValorSuelo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="ImporteValorConstruccion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoBienInmuebleType", propOrder = {
    "direccion",
    "marcaReferenciaCatastralInexistente",
    "referenciaCatastral",
    "importeValorSuelo",
    "importeValorConstruccion"
})
public class TipoBienInmuebleType {

    @XmlElement(name = "Direccion", required = true)
    protected DireccionType direccion;
    @XmlElement(name = "MarcaReferenciaCatastralInexistente")
    @XmlSchemaType(name = "string")
    protected SiNoEnum marcaReferenciaCatastralInexistente;
    @XmlElement(name = "ReferenciaCatastral")
    protected String referenciaCatastral;
    @XmlElement(name = "ImporteValorSuelo")
    protected String importeValorSuelo;
    @XmlElement(name = "ImporteValorConstruccion")
    protected String importeValorConstruccion;

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link DireccionType }
     *     
     */
    public DireccionType getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionType }
     *     
     */
    public void setDireccion(DireccionType value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaReferenciaCatastralInexistente.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getMarcaReferenciaCatastralInexistente() {
        return marcaReferenciaCatastralInexistente;
    }

    /**
     * Define el valor de la propiedad marcaReferenciaCatastralInexistente.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setMarcaReferenciaCatastralInexistente(SiNoEnum value) {
        this.marcaReferenciaCatastralInexistente = value;
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
     * Obtiene el valor de la propiedad importeValorSuelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteValorSuelo() {
        return importeValorSuelo;
    }

    /**
     * Define el valor de la propiedad importeValorSuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteValorSuelo(String value) {
        this.importeValorSuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad importeValorConstruccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteValorConstruccion() {
        return importeValorConstruccion;
    }

    /**
     * Define el valor de la propiedad importeValorConstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteValorConstruccion(String value) {
        this.importeValorConstruccion = value;
    }

}
