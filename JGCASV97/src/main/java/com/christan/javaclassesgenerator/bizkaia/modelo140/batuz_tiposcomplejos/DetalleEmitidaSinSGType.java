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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.EmitidaPorTercerosEnum;
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.SiNoEnum;


/**
 * <p>Clase Java para DetalleEmitidaSinSGType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleEmitidaSinSGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destinatarios" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DestinatariosType" minOccurs="0"/>
 *         &lt;element name="VariosDestinatarios" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *         &lt;element name="EmitidaPorTercerosODestinatario" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}EmitidaPorTercerosEnum" minOccurs="0"/>
 *         &lt;element name="CabeceraFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}CabeceraFacturaType"/>
 *         &lt;element name="DatosFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DatosFacturaEmitidaType"/>
 *         &lt;element name="TipoDesglose" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}TipoDesgloseType"/>
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
@XmlType(name = "DetalleEmitidaSinSGType", propOrder = {
    "destinatarios",
    "variosDestinatarios",
    "emitidaPorTercerosODestinatario",
    "cabeceraFactura",
    "datosFactura",
    "tipoDesglose",
    "otraInformacionTrascendenciaTributaria"
})
public class DetalleEmitidaSinSGType {

    @XmlElement(name = "Destinatarios")
    protected DestinatariosType destinatarios;
    @XmlElement(name = "VariosDestinatarios")
    @XmlSchemaType(name = "string")
    protected SiNoEnum variosDestinatarios;
    @XmlElement(name = "EmitidaPorTercerosODestinatario")
    @XmlSchemaType(name = "string")
    protected EmitidaPorTercerosEnum emitidaPorTercerosODestinatario;
    @XmlElement(name = "CabeceraFactura", required = true)
    protected CabeceraFacturaType cabeceraFactura;
    @XmlElement(name = "DatosFactura", required = true)
    protected DatosFacturaEmitidaType datosFactura;
    @XmlElement(name = "TipoDesglose", required = true)
    protected TipoDesgloseType tipoDesglose;
    @XmlElement(name = "OtraInformacionTrascendenciaTributaria")
    protected OtraInformacionTrascendenciaTributariaType otraInformacionTrascendenciaTributaria;

    /**
     * Obtiene el valor de la propiedad destinatarios.
     * 
     * @return
     *     possible object is
     *     {@link DestinatariosType }
     *     
     */
    public DestinatariosType getDestinatarios() {
        return destinatarios;
    }

    /**
     * Define el valor de la propiedad destinatarios.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinatariosType }
     *     
     */
    public void setDestinatarios(DestinatariosType value) {
        this.destinatarios = value;
    }

    /**
     * Obtiene el valor de la propiedad variosDestinatarios.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getVariosDestinatarios() {
        return variosDestinatarios;
    }

    /**
     * Define el valor de la propiedad variosDestinatarios.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setVariosDestinatarios(SiNoEnum value) {
        this.variosDestinatarios = value;
    }

    /**
     * Obtiene el valor de la propiedad emitidaPorTercerosODestinatario.
     * 
     * @return
     *     possible object is
     *     {@link EmitidaPorTercerosEnum }
     *     
     */
    public EmitidaPorTercerosEnum getEmitidaPorTercerosODestinatario() {
        return emitidaPorTercerosODestinatario;
    }

    /**
     * Define el valor de la propiedad emitidaPorTercerosODestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link EmitidaPorTercerosEnum }
     *     
     */
    public void setEmitidaPorTercerosODestinatario(EmitidaPorTercerosEnum value) {
        this.emitidaPorTercerosODestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad cabeceraFactura.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraFacturaType }
     *     
     */
    public CabeceraFacturaType getCabeceraFactura() {
        return cabeceraFactura;
    }

    /**
     * Define el valor de la propiedad cabeceraFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraFacturaType }
     *     
     */
    public void setCabeceraFactura(CabeceraFacturaType value) {
        this.cabeceraFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad datosFactura.
     * 
     * @return
     *     possible object is
     *     {@link DatosFacturaEmitidaType }
     *     
     */
    public DatosFacturaEmitidaType getDatosFactura() {
        return datosFactura;
    }

    /**
     * Define el valor de la propiedad datosFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosFacturaEmitidaType }
     *     
     */
    public void setDatosFactura(DatosFacturaEmitidaType value) {
        this.datosFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDesglose.
     * 
     * @return
     *     possible object is
     *     {@link TipoDesgloseType }
     *     
     */
    public TipoDesgloseType getTipoDesglose() {
        return tipoDesglose;
    }

    /**
     * Define el valor de la propiedad tipoDesglose.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDesgloseType }
     *     
     */
    public void setTipoDesglose(TipoDesgloseType value) {
        this.tipoDesglose = value;
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
