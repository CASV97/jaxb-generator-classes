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
 * <p>Clase Java para DatosFacturaGastoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosFacturaGastoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescripcionOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax250Type"/>
 *         &lt;element name="Claves" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}ClavesGastoType"/>
 *         &lt;element name="ImporteTotalFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosFacturaGastoType", propOrder = {
    "descripcionOperacion",
    "claves",
    "importeTotalFactura"
})
public class DatosFacturaGastoType {

    @XmlElement(name = "DescripcionOperacion", required = true)
    protected String descripcionOperacion;
    @XmlElement(name = "Claves", required = true)
    protected ClavesGastoType claves;
    @XmlElement(name = "ImporteTotalFactura", required = true)
    protected String importeTotalFactura;

    /**
     * Obtiene el valor de la propiedad descripcionOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    /**
     * Define el valor de la propiedad descripcionOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionOperacion(String value) {
        this.descripcionOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad claves.
     * 
     * @return
     *     possible object is
     *     {@link ClavesGastoType }
     *     
     */
    public ClavesGastoType getClaves() {
        return claves;
    }

    /**
     * Define el valor de la propiedad claves.
     * 
     * @param value
     *     allowed object is
     *     {@link ClavesGastoType }
     *     
     */
    public void setClaves(ClavesGastoType value) {
        this.claves = value;
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

}
