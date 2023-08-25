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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TipoOperacionSujetaNoExentaEnum;


/**
 * <p>Clase Java para DetalleNoExentaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleNoExentaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoNoExenta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoOperacionSujetaNoExentaEnum"/>
 *         &lt;element name="DesgloseIVA" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DesgloseIVAType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleNoExentaType", propOrder = {
    "tipoNoExenta",
    "desgloseIVA"
})
public class DetalleNoExentaType {

    @XmlElement(name = "TipoNoExenta", required = true)
    @XmlSchemaType(name = "string")
    protected TipoOperacionSujetaNoExentaEnum tipoNoExenta;
    @XmlElement(name = "DesgloseIVA", required = true)
    protected DesgloseIVAType desgloseIVA;

    /**
     * Obtiene el valor de la propiedad tipoNoExenta.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperacionSujetaNoExentaEnum }
     *     
     */
    public TipoOperacionSujetaNoExentaEnum getTipoNoExenta() {
        return tipoNoExenta;
    }

    /**
     * Define el valor de la propiedad tipoNoExenta.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperacionSujetaNoExentaEnum }
     *     
     */
    public void setTipoNoExenta(TipoOperacionSujetaNoExentaEnum value) {
        this.tipoNoExenta = value;
    }

    /**
     * Obtiene el valor de la propiedad desgloseIVA.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseIVAType }
     *     
     */
    public DesgloseIVAType getDesgloseIVA() {
        return desgloseIVA;
    }

    /**
     * Define el valor de la propiedad desgloseIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseIVAType }
     *     
     */
    public void setDesgloseIVA(DesgloseIVAType value) {
        this.desgloseIVA = value;
    }

}
