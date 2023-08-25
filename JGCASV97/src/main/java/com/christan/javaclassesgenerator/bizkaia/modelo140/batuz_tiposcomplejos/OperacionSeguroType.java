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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.ClaveOperacionSeguroEnum;


/**
 * <p>Clase Java para OperacionSeguroType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OperacionSeguroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Declarado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DocumentoPersonaType"/>
 *         &lt;element name="ClaveOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}ClaveOperacionSeguroEnum"/>
 *         &lt;element name="ImporteTotal" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="OtraInformacionTrascendenciaTributaria" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}OtraInformacionTrascendenciaTributariaPJType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacionSeguroType", propOrder = {
    "declarado",
    "claveOperacion",
    "importeTotal",
    "otraInformacionTrascendenciaTributaria"
})
public class OperacionSeguroType {

    @XmlElement(name = "Declarado", required = true)
    protected DocumentoPersonaType declarado;
    @XmlElement(name = "ClaveOperacion", required = true)
    @XmlSchemaType(name = "string")
    protected ClaveOperacionSeguroEnum claveOperacion;
    @XmlElement(name = "ImporteTotal", required = true)
    protected String importeTotal;
    @XmlElement(name = "OtraInformacionTrascendenciaTributaria")
    protected OtraInformacionTrascendenciaTributariaPJType otraInformacionTrascendenciaTributaria;

    /**
     * Obtiene el valor de la propiedad declarado.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public DocumentoPersonaType getDeclarado() {
        return declarado;
    }

    /**
     * Define el valor de la propiedad declarado.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public void setDeclarado(DocumentoPersonaType value) {
        this.declarado = value;
    }

    /**
     * Obtiene el valor de la propiedad claveOperacion.
     * 
     * @return
     *     possible object is
     *     {@link ClaveOperacionSeguroEnum }
     *     
     */
    public ClaveOperacionSeguroEnum getClaveOperacion() {
        return claveOperacion;
    }

    /**
     * Define el valor de la propiedad claveOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveOperacionSeguroEnum }
     *     
     */
    public void setClaveOperacion(ClaveOperacionSeguroEnum value) {
        this.claveOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTotal(String value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad otraInformacionTrascendenciaTributaria.
     * 
     * @return
     *     possible object is
     *     {@link OtraInformacionTrascendenciaTributariaPJType }
     *     
     */
    public OtraInformacionTrascendenciaTributariaPJType getOtraInformacionTrascendenciaTributaria() {
        return otraInformacionTrascendenciaTributaria;
    }

    /**
     * Define el valor de la propiedad otraInformacionTrascendenciaTributaria.
     * 
     * @param value
     *     allowed object is
     *     {@link OtraInformacionTrascendenciaTributariaPJType }
     *     
     */
    public void setOtraInformacionTrascendenciaTributaria(OtraInformacionTrascendenciaTributariaPJType value) {
        this.otraInformacionTrascendenciaTributaria = value;
    }

}
