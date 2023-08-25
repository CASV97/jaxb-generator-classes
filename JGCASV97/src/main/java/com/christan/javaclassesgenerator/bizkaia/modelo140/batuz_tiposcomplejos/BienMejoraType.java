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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TituloEnum;


/**
 * <p>Clase Java para BienMejoraType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BienMejoraType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenciaBien" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax10Type"/>
 *         &lt;element name="ReferenciaBienOriginal" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax10Type"/>
 *         &lt;element name="FechaOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="FechaInicioUtilizacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType" minOccurs="0"/>
 *         &lt;element name="Titulo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TituloEnum"/>
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
@XmlType(name = "BienMejoraType", propOrder = {
    "referenciaBien",
    "referenciaBienOriginal",
    "fechaOperacion",
    "fechaInicioUtilizacion",
    "titulo",
    "porcentajeAfectacion",
    "valorAmortizableInicial",
    "sistemaAmortizacion",
    "amortizacionAcumulada31DiciEjercicioAnt"
})
public class BienMejoraType {

    @XmlElement(name = "ReferenciaBien", required = true)
    protected String referenciaBien;
    @XmlElement(name = "ReferenciaBienOriginal", required = true)
    protected String referenciaBienOriginal;
    @XmlElement(name = "FechaOperacion", required = true)
    protected String fechaOperacion;
    @XmlElement(name = "FechaInicioUtilizacion")
    protected String fechaInicioUtilizacion;
    @XmlElement(name = "Titulo", required = true)
    @XmlSchemaType(name = "string")
    protected TituloEnum titulo;
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
     * Obtiene el valor de la propiedad referenciaBienOriginal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaBienOriginal() {
        return referenciaBienOriginal;
    }

    /**
     * Define el valor de la propiedad referenciaBienOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaBienOriginal(String value) {
        this.referenciaBienOriginal = value;
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
