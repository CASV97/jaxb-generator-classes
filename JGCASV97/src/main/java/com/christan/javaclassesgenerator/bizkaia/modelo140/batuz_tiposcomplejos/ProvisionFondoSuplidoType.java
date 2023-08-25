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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TipoOperacionProvisionSuplidoEnum;


/**
 * <p>Clase Java para ProvisionFondoSuplidoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProvisionFondoSuplidoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoOperacionProvisionSuplidoEnum"/>
 *         &lt;element name="Epigrafe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}stringMax7Digits"/>
 *         &lt;element name="FechaOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="ImportePercibido" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="Declarado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DocumentoPersonaType"/>
 *         &lt;element name="DatosOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DatosOperacionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvisionFondoSuplidoType", propOrder = {
    "tipoOperacion",
    "epigrafe",
    "fechaOperacion",
    "importePercibido",
    "declarado",
    "datosOperacion"
})
public class ProvisionFondoSuplidoType {

    @XmlElement(name = "TipoOperacion", required = true)
    @XmlSchemaType(name = "string")
    protected TipoOperacionProvisionSuplidoEnum tipoOperacion;
    @XmlElement(name = "Epigrafe", required = true)
    protected String epigrafe;
    @XmlElement(name = "FechaOperacion", required = true)
    protected String fechaOperacion;
    @XmlElement(name = "ImportePercibido", required = true)
    protected String importePercibido;
    @XmlElement(name = "Declarado", required = true)
    protected DocumentoPersonaType declarado;
    @XmlElement(name = "DatosOperacion")
    protected DatosOperacionType datosOperacion;

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperacionProvisionSuplidoEnum }
     *     
     */
    public TipoOperacionProvisionSuplidoEnum getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperacionProvisionSuplidoEnum }
     *     
     */
    public void setTipoOperacion(TipoOperacionProvisionSuplidoEnum value) {
        this.tipoOperacion = value;
    }

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

    /**
     * Obtiene el valor de la propiedad importePercibido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportePercibido() {
        return importePercibido;
    }

    /**
     * Define el valor de la propiedad importePercibido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportePercibido(String value) {
        this.importePercibido = value;
    }

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
     * Obtiene el valor de la propiedad datosOperacion.
     * 
     * @return
     *     possible object is
     *     {@link DatosOperacionType }
     *     
     */
    public DatosOperacionType getDatosOperacion() {
        return datosOperacion;
    }

    /**
     * Define el valor de la propiedad datosOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosOperacionType }
     *     
     */
    public void setDatosOperacion(DatosOperacionType value) {
        this.datosOperacion = value;
    }

}
