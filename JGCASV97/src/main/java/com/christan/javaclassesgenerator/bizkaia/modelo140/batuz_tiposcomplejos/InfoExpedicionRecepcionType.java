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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.CountryMiembroType;


/**
 * <p>Clase Java para InfoExpedicionRecepcionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoExpedicionRecepcionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValorBienes" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="EmPartida" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}CountryMiembroType" minOccurs="0"/>
 *         &lt;element name="EmLlegada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}CountryMiembroType" minOccurs="0"/>
 *         &lt;element name="FechaExpedicion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType" minOccurs="0"/>
 *         &lt;element name="FechaLlegada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType" minOccurs="0"/>
 *         &lt;element name="Cantidad" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax120Type"/>
 *         &lt;element name="DescripBienes" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax120Type"/>
 *         &lt;element name="FechaSustitucion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoExpedicionRecepcionType", propOrder = {
    "valorBienes",
    "emPartida",
    "emLlegada",
    "fechaExpedicion",
    "fechaLlegada",
    "cantidad",
    "descripBienes",
    "fechaSustitucion"
})
public class InfoExpedicionRecepcionType {

    @XmlElement(name = "ValorBienes")
    protected String valorBienes;
    @XmlElement(name = "EmPartida")
    @XmlSchemaType(name = "string")
    protected CountryMiembroType emPartida;
    @XmlElement(name = "EmLlegada")
    @XmlSchemaType(name = "string")
    protected CountryMiembroType emLlegada;
    @XmlElement(name = "FechaExpedicion")
    protected String fechaExpedicion;
    @XmlElement(name = "FechaLlegada")
    protected String fechaLlegada;
    @XmlElement(name = "Cantidad", required = true)
    protected String cantidad;
    @XmlElement(name = "DescripBienes", required = true)
    protected String descripBienes;
    @XmlElement(name = "FechaSustitucion")
    protected String fechaSustitucion;

    /**
     * Obtiene el valor de la propiedad valorBienes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorBienes() {
        return valorBienes;
    }

    /**
     * Define el valor de la propiedad valorBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorBienes(String value) {
        this.valorBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad emPartida.
     * 
     * @return
     *     possible object is
     *     {@link CountryMiembroType }
     *     
     */
    public CountryMiembroType getEmPartida() {
        return emPartida;
    }

    /**
     * Define el valor de la propiedad emPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryMiembroType }
     *     
     */
    public void setEmPartida(CountryMiembroType value) {
        this.emPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad emLlegada.
     * 
     * @return
     *     possible object is
     *     {@link CountryMiembroType }
     *     
     */
    public CountryMiembroType getEmLlegada() {
        return emLlegada;
    }

    /**
     * Define el valor de la propiedad emLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryMiembroType }
     *     
     */
    public void setEmLlegada(CountryMiembroType value) {
        this.emLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaLlegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * Define el valor de la propiedad fechaLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaLlegada(String value) {
        this.fechaLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripBienes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripBienes() {
        return descripBienes;
    }

    /**
     * Define el valor de la propiedad descripBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripBienes(String value) {
        this.descripBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSustitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSustitucion() {
        return fechaSustitucion;
    }

    /**
     * Define el valor de la propiedad fechaSustitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSustitucion(String value) {
        this.fechaSustitucion = value;
    }

}
