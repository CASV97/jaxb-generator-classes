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
 * <p>Clase Java para DatosFacturaEmitidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosFacturaEmitidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType" minOccurs="0"/>
 *         &lt;element name="DescripcionFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax250Type"/>
 *         &lt;element name="ImporteTotalFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="RetencionSoportada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="BaseImponibleACoste" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="Claves" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}ClavesFacturaEmitidaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosFacturaEmitidaType", propOrder = {
    "fechaOperacion",
    "descripcionFactura",
    "importeTotalFactura",
    "retencionSoportada",
    "baseImponibleACoste",
    "claves"
})
public class DatosFacturaEmitidaType {

    @XmlElement(name = "FechaOperacion")
    protected String fechaOperacion;
    @XmlElement(name = "DescripcionFactura", required = true)
    protected String descripcionFactura;
    @XmlElement(name = "ImporteTotalFactura", required = true)
    protected String importeTotalFactura;
    @XmlElement(name = "RetencionSoportada")
    protected String retencionSoportada;
    @XmlElement(name = "BaseImponibleACoste")
    protected String baseImponibleACoste;
    @XmlElement(name = "Claves", required = true)
    protected ClavesFacturaEmitidaType claves;

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
     * Obtiene el valor de la propiedad descripcionFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionFactura() {
        return descripcionFactura;
    }

    /**
     * Define el valor de la propiedad descripcionFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionFactura(String value) {
        this.descripcionFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotalFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTotalFactura() {
        return importeTotalFactura;
    }

    /**
     * Define el valor de la propiedad importeTotalFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTotalFactura(String value) {
        this.importeTotalFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad retencionSoportada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetencionSoportada() {
        return retencionSoportada;
    }

    /**
     * Define el valor de la propiedad retencionSoportada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetencionSoportada(String value) {
        this.retencionSoportada = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponibleACoste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponibleACoste() {
        return baseImponibleACoste;
    }

    /**
     * Define el valor de la propiedad baseImponibleACoste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponibleACoste(String value) {
        this.baseImponibleACoste = value;
    }

    /**
     * Obtiene el valor de la propiedad claves.
     * 
     * @return
     *     possible object is
     *     {@link ClavesFacturaEmitidaType }
     *     
     */
    public ClavesFacturaEmitidaType getClaves() {
        return claves;
    }

    /**
     * Define el valor de la propiedad claves.
     * 
     * @param value
     *     allowed object is
     *     {@link ClavesFacturaEmitidaType }
     *     
     */
    public void setClaves(ClavesFacturaEmitidaType value) {
        this.claves = value;
    }

}
