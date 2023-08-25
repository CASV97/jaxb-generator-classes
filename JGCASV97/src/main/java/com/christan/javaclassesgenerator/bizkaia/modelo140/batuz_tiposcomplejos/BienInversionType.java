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
 * <p>Clase Java para BienInversionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BienInversionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacionBien" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax40Type"/>
 *         &lt;element name="FechaInicioUtilizacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="ProrrataAnualDefinitiva" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}intPorcentajeType"/>
 *         &lt;element name="RegularizacionAnualDeduccion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="EntregaBienesInversionPeriodoRegularizacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}EntregaBienesInversionPeriodoRegularizacionType" minOccurs="0"/>
 *         &lt;element name="OtraInformacionTrascendenciaTributaria" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}OtraInfTrascendenciaTributariaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BienInversionType", propOrder = {
    "identificacionBien",
    "fechaInicioUtilizacion",
    "prorrataAnualDefinitiva",
    "regularizacionAnualDeduccion",
    "entregaBienesInversionPeriodoRegularizacion",
    "otraInformacionTrascendenciaTributaria"
})
public class BienInversionType {

    @XmlElement(name = "IdentificacionBien", required = true)
    protected String identificacionBien;
    @XmlElement(name = "FechaInicioUtilizacion", required = true)
    protected String fechaInicioUtilizacion;
    @XmlElement(name = "ProrrataAnualDefinitiva")
    protected int prorrataAnualDefinitiva;
    @XmlElement(name = "RegularizacionAnualDeduccion")
    protected String regularizacionAnualDeduccion;
    @XmlElement(name = "EntregaBienesInversionPeriodoRegularizacion")
    protected EntregaBienesInversionPeriodoRegularizacionType entregaBienesInversionPeriodoRegularizacion;
    @XmlElement(name = "OtraInformacionTrascendenciaTributaria")
    protected OtraInfTrascendenciaTributariaType otraInformacionTrascendenciaTributaria;

    /**
     * Obtiene el valor de la propiedad identificacionBien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionBien() {
        return identificacionBien;
    }

    /**
     * Define el valor de la propiedad identificacionBien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionBien(String value) {
        this.identificacionBien = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioUtilizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioUtilizacion() {
        return fechaInicioUtilizacion;
    }

    /**
     * Define el valor de la propiedad fechaInicioUtilizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioUtilizacion(String value) {
        this.fechaInicioUtilizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad prorrataAnualDefinitiva.
     * 
     */
    public int getProrrataAnualDefinitiva() {
        return prorrataAnualDefinitiva;
    }

    /**
     * Define el valor de la propiedad prorrataAnualDefinitiva.
     * 
     */
    public void setProrrataAnualDefinitiva(int value) {
        this.prorrataAnualDefinitiva = value;
    }

    /**
     * Obtiene el valor de la propiedad regularizacionAnualDeduccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularizacionAnualDeduccion() {
        return regularizacionAnualDeduccion;
    }

    /**
     * Define el valor de la propiedad regularizacionAnualDeduccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularizacionAnualDeduccion(String value) {
        this.regularizacionAnualDeduccion = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaBienesInversionPeriodoRegularizacion.
     * 
     * @return
     *     possible object is
     *     {@link EntregaBienesInversionPeriodoRegularizacionType }
     *     
     */
    public EntregaBienesInversionPeriodoRegularizacionType getEntregaBienesInversionPeriodoRegularizacion() {
        return entregaBienesInversionPeriodoRegularizacion;
    }

    /**
     * Define el valor de la propiedad entregaBienesInversionPeriodoRegularizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaBienesInversionPeriodoRegularizacionType }
     *     
     */
    public void setEntregaBienesInversionPeriodoRegularizacion(EntregaBienesInversionPeriodoRegularizacionType value) {
        this.entregaBienesInversionPeriodoRegularizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad otraInformacionTrascendenciaTributaria.
     * 
     * @return
     *     possible object is
     *     {@link OtraInfTrascendenciaTributariaType }
     *     
     */
    public OtraInfTrascendenciaTributariaType getOtraInformacionTrascendenciaTributaria() {
        return otraInformacionTrascendenciaTributaria;
    }

    /**
     * Define el valor de la propiedad otraInformacionTrascendenciaTributaria.
     * 
     * @param value
     *     allowed object is
     *     {@link OtraInfTrascendenciaTributariaType }
     *     
     */
    public void setOtraInformacionTrascendenciaTributaria(OtraInfTrascendenciaTributariaType value) {
        this.otraInformacionTrascendenciaTributaria = value;
    }

}
