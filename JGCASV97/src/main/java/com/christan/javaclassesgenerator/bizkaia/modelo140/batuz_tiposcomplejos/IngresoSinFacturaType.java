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
 * <p>Clase Java para IngresoSinFacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresoSinFacturaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoIngreso" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoIngresoEnum"/>
 *         &lt;element name="DescripcionIngreso" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax40Type"/>
 *         &lt;element name="Pagador" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DocumentoPersonaType" minOccurs="0"/>
 *         &lt;element name="FechaOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="Renta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DetalleRentaIngresosSinFacturaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresoSinFacturaType", propOrder = {
    "tipoIngreso",
    "descripcionIngreso",
    "pagador",
    "fechaOperacion",
    "renta"
})
public class IngresoSinFacturaType {

    @XmlElement(name = "TipoIngreso", required = true)
    protected String tipoIngreso;
    @XmlElement(name = "DescripcionIngreso", required = true)
    protected String descripcionIngreso;
    @XmlElement(name = "Pagador")
    protected DocumentoPersonaType pagador;
    @XmlElement(name = "FechaOperacion", required = true)
    protected String fechaOperacion;
    @XmlElement(name = "Renta", required = true)
    protected DetalleRentaIngresosSinFacturaType renta;

    /**
     * Obtiene el valor de la propiedad tipoIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIngreso() {
        return tipoIngreso;
    }

    /**
     * Define el valor de la propiedad tipoIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIngreso(String value) {
        this.tipoIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionIngreso() {
        return descripcionIngreso;
    }

    /**
     * Define el valor de la propiedad descripcionIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionIngreso(String value) {
        this.descripcionIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad pagador.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public DocumentoPersonaType getPagador() {
        return pagador;
    }

    /**
     * Define el valor de la propiedad pagador.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public void setPagador(DocumentoPersonaType value) {
        this.pagador = value;
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
     *     {@link DetalleRentaIngresosSinFacturaType }
     *     
     */
    public DetalleRentaIngresosSinFacturaType getRenta() {
        return renta;
    }

    /**
     * Define el valor de la propiedad renta.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleRentaIngresosSinFacturaType }
     *     
     */
    public void setRenta(DetalleRentaIngresosSinFacturaType value) {
        this.renta = value;
    }

}
