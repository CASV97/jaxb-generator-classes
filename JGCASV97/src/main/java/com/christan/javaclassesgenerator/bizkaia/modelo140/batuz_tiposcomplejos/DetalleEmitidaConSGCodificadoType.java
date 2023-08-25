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
 * <p>Clase Java para DetalleEmitidaConSGCodificadoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleEmitidaConSGCodificadoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketBai" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="OtraInformacionTrascendenciaTributaria" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}OtraInformacionTrascendenciaTributariaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleEmitidaConSGCodificadoType", propOrder = {
    "ticketBai",
    "otraInformacionTrascendenciaTributaria"
})
public class DetalleEmitidaConSGCodificadoType {

    @XmlElement(name = "TicketBai", required = true)
    protected byte[] ticketBai;
    @XmlElement(name = "OtraInformacionTrascendenciaTributaria")
    protected OtraInformacionTrascendenciaTributariaType otraInformacionTrascendenciaTributaria;

    /**
     * Obtiene el valor de la propiedad ticketBai.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTicketBai() {
        return ticketBai;
    }

    /**
     * Define el valor de la propiedad ticketBai.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTicketBai(byte[] value) {
        this.ticketBai = value;
    }

    /**
     * Obtiene el valor de la propiedad otraInformacionTrascendenciaTributaria.
     * 
     * @return
     *     possible object is
     *     {@link OtraInformacionTrascendenciaTributariaType }
     *     
     */
    public OtraInformacionTrascendenciaTributariaType getOtraInformacionTrascendenciaTributaria() {
        return otraInformacionTrascendenciaTributaria;
    }

    /**
     * Define el valor de la propiedad otraInformacionTrascendenciaTributaria.
     * 
     * @param value
     *     allowed object is
     *     {@link OtraInformacionTrascendenciaTributariaType }
     *     
     */
    public void setOtraInformacionTrascendenciaTributaria(OtraInformacionTrascendenciaTributariaType value) {
        this.otraInformacionTrascendenciaTributaria = value;
    }

}
