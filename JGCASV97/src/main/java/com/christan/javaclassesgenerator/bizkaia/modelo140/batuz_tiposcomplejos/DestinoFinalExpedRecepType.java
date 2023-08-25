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
 * <p>Clase Java para DestinoFinalExpedRecepType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DestinoFinalExpedRecepType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescripBienes" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax120Type"/>
 *         &lt;element name="Cantidad" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax120Type"/>
 *         &lt;element name="FechaOpDeclarada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="DestinatarioFinal" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DeclaradoIntracomunitarioType" minOccurs="0"/>
 *         &lt;element name="BaseImponibleValor" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="PrecioUnitario" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinoFinalExpedRecepType", propOrder = {
    "descripBienes",
    "cantidad",
    "fechaOpDeclarada",
    "destinatarioFinal",
    "baseImponibleValor",
    "precioUnitario"
})
public class DestinoFinalExpedRecepType {

    @XmlElement(name = "DescripBienes", required = true)
    protected String descripBienes;
    @XmlElement(name = "Cantidad", required = true)
    protected String cantidad;
    @XmlElement(name = "FechaOpDeclarada", required = true)
    protected String fechaOpDeclarada;
    @XmlElement(name = "DestinatarioFinal")
    protected DeclaradoIntracomunitarioType destinatarioFinal;
    @XmlElement(name = "BaseImponibleValor", required = true)
    protected String baseImponibleValor;
    @XmlElement(name = "PrecioUnitario")
    protected String precioUnitario;

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
     * Obtiene el valor de la propiedad fechaOpDeclarada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOpDeclarada() {
        return fechaOpDeclarada;
    }

    /**
     * Define el valor de la propiedad fechaOpDeclarada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOpDeclarada(String value) {
        this.fechaOpDeclarada = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatarioFinal.
     * 
     * @return
     *     possible object is
     *     {@link DeclaradoIntracomunitarioType }
     *     
     */
    public DeclaradoIntracomunitarioType getDestinatarioFinal() {
        return destinatarioFinal;
    }

    /**
     * Define el valor de la propiedad destinatarioFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaradoIntracomunitarioType }
     *     
     */
    public void setDestinatarioFinal(DeclaradoIntracomunitarioType value) {
        this.destinatarioFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponibleValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponibleValor() {
        return baseImponibleValor;
    }

    /**
     * Define el valor de la propiedad baseImponibleValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponibleValor(String value) {
        this.baseImponibleValor = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Define el valor de la propiedad precioUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioUnitario(String value) {
        this.precioUnitario = value;
    }

}
