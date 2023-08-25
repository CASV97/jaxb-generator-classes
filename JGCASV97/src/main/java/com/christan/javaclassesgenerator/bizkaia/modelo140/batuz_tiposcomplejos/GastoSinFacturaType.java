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
 * <p>Clase Java para GastoSinFacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GastoSinFacturaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContraparteDeclaradaProveedora" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DocumentoPersonaType" minOccurs="0"/>
 *         &lt;element name="FechaOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="Renta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}RentaGastosLineaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GastoSinFacturaType", propOrder = {
    "contraparteDeclaradaProveedora",
    "fechaOperacion",
    "renta"
})
public class GastoSinFacturaType {

    @XmlElement(name = "ContraparteDeclaradaProveedora")
    protected DocumentoPersonaType contraparteDeclaradaProveedora;
    @XmlElement(name = "FechaOperacion", required = true)
    protected String fechaOperacion;
    @XmlElement(name = "Renta", required = true)
    protected RentaGastosLineaType renta;

    /**
     * Obtiene el valor de la propiedad contraparteDeclaradaProveedora.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public DocumentoPersonaType getContraparteDeclaradaProveedora() {
        return contraparteDeclaradaProveedora;
    }

    /**
     * Define el valor de la propiedad contraparteDeclaradaProveedora.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public void setContraparteDeclaradaProveedora(DocumentoPersonaType value) {
        this.contraparteDeclaradaProveedora = value;
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
     * Obtiene el valor de la propiedad renta.
     * 
     * @return
     *     possible object is
     *     {@link RentaGastosLineaType }
     *     
     */
    public RentaGastosLineaType getRenta() {
        return renta;
    }

    /**
     * Define el valor de la propiedad renta.
     * 
     * @param value
     *     allowed object is
     *     {@link RentaGastosLineaType }
     *     
     */
    public void setRenta(RentaGastosLineaType value) {
        this.renta = value;
    }

}
