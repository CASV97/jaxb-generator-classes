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
 * <p>Clase Java para FacturaRecibidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaRecibidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmisorFacturaRecibida" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DocumentoPersonaType"/>
 *         &lt;element name="CabeceraFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}CabeceraFacturaGastosRecibidasType"/>
 *         &lt;element name="DatosFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DatosFacturaRecibidaType"/>
 *         &lt;element name="IVA" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}IVAFacturaRecibidaType"/>
 *         &lt;element name="OtraInformacionTrascendenciaTributaria" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}OtraInformacionTrascendenciaTributariaRecibidaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaRecibidaType", propOrder = {
    "emisorFacturaRecibida",
    "cabeceraFactura",
    "datosFactura",
    "iva",
    "otraInformacionTrascendenciaTributaria"
})
public class FacturaRecibidaType {

    @XmlElement(name = "EmisorFacturaRecibida", required = true)
    protected DocumentoPersonaType emisorFacturaRecibida;
    @XmlElement(name = "CabeceraFactura", required = true)
    protected CabeceraFacturaGastosRecibidasType cabeceraFactura;
    @XmlElement(name = "DatosFactura", required = true)
    protected DatosFacturaRecibidaType datosFactura;
    @XmlElement(name = "IVA", required = true)
    protected IVAFacturaRecibidaType iva;
    @XmlElement(name = "OtraInformacionTrascendenciaTributaria")
    protected OtraInformacionTrascendenciaTributariaRecibidaType otraInformacionTrascendenciaTributaria;

    /**
     * Obtiene el valor de la propiedad emisorFacturaRecibida.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public DocumentoPersonaType getEmisorFacturaRecibida() {
        return emisorFacturaRecibida;
    }

    /**
     * Define el valor de la propiedad emisorFacturaRecibida.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public void setEmisorFacturaRecibida(DocumentoPersonaType value) {
        this.emisorFacturaRecibida = value;
    }

    /**
     * Obtiene el valor de la propiedad cabeceraFactura.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraFacturaGastosRecibidasType }
     *     
     */
    public CabeceraFacturaGastosRecibidasType getCabeceraFactura() {
        return cabeceraFactura;
    }

    /**
     * Define el valor de la propiedad cabeceraFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraFacturaGastosRecibidasType }
     *     
     */
    public void setCabeceraFactura(CabeceraFacturaGastosRecibidasType value) {
        this.cabeceraFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad datosFactura.
     * 
     * @return
     *     possible object is
     *     {@link DatosFacturaRecibidaType }
     *     
     */
    public DatosFacturaRecibidaType getDatosFactura() {
        return datosFactura;
    }

    /**
     * Define el valor de la propiedad datosFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosFacturaRecibidaType }
     *     
     */
    public void setDatosFactura(DatosFacturaRecibidaType value) {
        this.datosFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     * @return
     *     possible object is
     *     {@link IVAFacturaRecibidaType }
     *     
     */
    public IVAFacturaRecibidaType getIVA() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     * @param value
     *     allowed object is
     *     {@link IVAFacturaRecibidaType }
     *     
     */
    public void setIVA(IVAFacturaRecibidaType value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad otraInformacionTrascendenciaTributaria.
     * 
     * @return
     *     possible object is
     *     {@link OtraInformacionTrascendenciaTributariaRecibidaType }
     *     
     */
    public OtraInformacionTrascendenciaTributariaRecibidaType getOtraInformacionTrascendenciaTributaria() {
        return otraInformacionTrascendenciaTributaria;
    }

    /**
     * Define el valor de la propiedad otraInformacionTrascendenciaTributaria.
     * 
     * @param value
     *     allowed object is
     *     {@link OtraInformacionTrascendenciaTributariaRecibidaType }
     *     
     */
    public void setOtraInformacionTrascendenciaTributaria(OtraInformacionTrascendenciaTributariaRecibidaType value) {
        this.otraInformacionTrascendenciaTributaria = value;
    }

}
