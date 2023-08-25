//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.25 a las 03:01:04 PM CEST 
//


package com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_tiposcomplejos;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.SiNoEnum;
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TipoBienEnum;
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TituloEnum;


/**
 * <p>Clase Java para BienAltaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BienAltaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenciaBien" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax10Type"/>
 *         &lt;element name="MarcaBienInversionEfectosIVA" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *         &lt;element name="FechaOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="FechaInicioUtilizacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType" minOccurs="0"/>
 *         &lt;element name="Titulo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TituloEnum"/>
 *         &lt;element name="TipoBien" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoBienEnum"/>
 *         &lt;element name="DatosBien" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DatosTipoBienType"/>
 *         &lt;element name="Epigrafe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}stringMax7Digits"/>
 *         &lt;element name="PorcentajeAfectacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}decimalPorcentajeType" minOccurs="0"/>
 *         &lt;element name="ValorAmortizableInicial" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="SistemaAmortizacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SistemaAmortizacionEnum" minOccurs="0"/>
 *         &lt;element name="AmortizacionAcumulada31DiciEjercicioAnt" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BienAltaType", propOrder = {
    "referenciaBien",
    "marcaBienInversionEfectosIVA",
    "fechaOperacion",
    "fechaInicioUtilizacion",
    "titulo",
    "tipoBien",
    "datosBien",
    "epigrafe",
    "porcentajeAfectacion",
    "valorAmortizableInicial",
    "sistemaAmortizacion",
    "amortizacionAcumulada31DiciEjercicioAnt"
})
public class BienAltaType {

    @XmlElement(name = "ReferenciaBien", required = true)
    protected String referenciaBien;
    @XmlElement(name = "MarcaBienInversionEfectosIVA")
    @XmlSchemaType(name = "string")
    protected SiNoEnum marcaBienInversionEfectosIVA;
    @XmlElement(name = "FechaOperacion", required = true)
    protected String fechaOperacion;
    @XmlElement(name = "FechaInicioUtilizacion")
    protected String fechaInicioUtilizacion;
    @XmlElement(name = "Titulo", required = true)
    @XmlSchemaType(name = "string")
    protected TituloEnum titulo;
    @XmlElement(name = "TipoBien", required = true)
    @XmlSchemaType(name = "string")
    protected TipoBienEnum tipoBien;
    @XmlElement(name = "DatosBien", required = true)
    protected DatosTipoBienType datosBien;
    @XmlElement(name = "Epigrafe", required = true)
    protected String epigrafe;
    @XmlElement(name = "PorcentajeAfectacion")
    protected BigDecimal porcentajeAfectacion;
    @XmlElement(name = "ValorAmortizableInicial")
    protected String valorAmortizableInicial;
    @XmlElement(name = "SistemaAmortizacion")
    protected String sistemaAmortizacion;
    @XmlElement(name = "AmortizacionAcumulada31DiciEjercicioAnt")
    protected String amortizacionAcumulada31DiciEjercicioAnt;

    /**
     * Obtiene el valor de la propiedad referenciaBien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaBien() {
        return referenciaBien;
    }

    /**
     * Define el valor de la propiedad referenciaBien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaBien(String value) {
        this.referenciaBien = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaBienInversionEfectosIVA.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getMarcaBienInversionEfectosIVA() {
        return marcaBienInversionEfectosIVA;
    }

    /**
     * Define el valor de la propiedad marcaBienInversionEfectosIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setMarcaBienInversionEfectosIVA(SiNoEnum value) {
        this.marcaBienInversionEfectosIVA = value;
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
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link TituloEnum }
     *     
     */
    public TituloEnum getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link TituloEnum }
     *     
     */
    public void setTitulo(TituloEnum value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoBien.
     * 
     * @return
     *     possible object is
     *     {@link TipoBienEnum }
     *     
     */
    public TipoBienEnum getTipoBien() {
        return tipoBien;
    }

    /**
     * Define el valor de la propiedad tipoBien.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBienEnum }
     *     
     */
    public void setTipoBien(TipoBienEnum value) {
        this.tipoBien = value;
    }

    /**
     * Obtiene el valor de la propiedad datosBien.
     * 
     * @return
     *     possible object is
     *     {@link DatosTipoBienType }
     *     
     */
    public DatosTipoBienType getDatosBien() {
        return datosBien;
    }

    /**
     * Define el valor de la propiedad datosBien.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosTipoBienType }
     *     
     */
    public void setDatosBien(DatosTipoBienType value) {
        this.datosBien = value;
    }

    /**
     * Obtiene el valor de la propiedad epigrafe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpigrafe() {
        return epigrafe;
    }

    /**
     * Define el valor de la propiedad epigrafe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpigrafe(String value) {
        this.epigrafe = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeAfectacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeAfectacion() {
        return porcentajeAfectacion;
    }

    /**
     * Define el valor de la propiedad porcentajeAfectacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeAfectacion(BigDecimal value) {
        this.porcentajeAfectacion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorAmortizableInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorAmortizableInicial() {
        return valorAmortizableInicial;
    }

    /**
     * Define el valor de la propiedad valorAmortizableInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorAmortizableInicial(String value) {
        this.valorAmortizableInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad sistemaAmortizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaAmortizacion() {
        return sistemaAmortizacion;
    }

    /**
     * Define el valor de la propiedad sistemaAmortizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaAmortizacion(String value) {
        this.sistemaAmortizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad amortizacionAcumulada31DiciEjercicioAnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmortizacionAcumulada31DiciEjercicioAnt() {
        return amortizacionAcumulada31DiciEjercicioAnt;
    }

    /**
     * Define el valor de la propiedad amortizacionAcumulada31DiciEjercicioAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmortizacionAcumulada31DiciEjercicioAnt(String value) {
        this.amortizacionAcumulada31DiciEjercicioAnt = value;
    }

}
