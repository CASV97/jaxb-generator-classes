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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.SiNoEnum;


/**
 * <p>Clase Java para CabeceraFacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CabeceraFacturaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SerieFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="NumFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax20Type"/>
 *         &lt;element name="FechaExpedicionFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="FacturaSimplificada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *         &lt;element name="FacturaEmitidaSustitucionSimplificada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *         &lt;element name="AsientoResumen" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *         &lt;element name="NumFacturaFin" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="FacturaRectificativa" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}FacturaRectificativaImporteType" minOccurs="0"/>
 *         &lt;element name="FacturasRectificadasSustituidas" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}FacturasRectificadasSustituidasType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabeceraFacturaType", propOrder = {
    "serieFactura",
    "numFactura",
    "fechaExpedicionFactura",
    "facturaSimplificada",
    "facturaEmitidaSustitucionSimplificada",
    "asientoResumen",
    "numFacturaFin",
    "facturaRectificativa",
    "facturasRectificadasSustituidas"
})
public class CabeceraFacturaType {

    @XmlElement(name = "SerieFactura")
    protected String serieFactura;
    @XmlElement(name = "NumFactura", required = true)
    protected String numFactura;
    @XmlElement(name = "FechaExpedicionFactura", required = true)
    protected String fechaExpedicionFactura;
    @XmlElement(name = "FacturaSimplificada")
    @XmlSchemaType(name = "string")
    protected SiNoEnum facturaSimplificada;
    @XmlElement(name = "FacturaEmitidaSustitucionSimplificada")
    @XmlSchemaType(name = "string")
    protected SiNoEnum facturaEmitidaSustitucionSimplificada;
    @XmlElement(name = "AsientoResumen")
    @XmlSchemaType(name = "string")
    protected SiNoEnum asientoResumen;
    @XmlElement(name = "NumFacturaFin")
    protected String numFacturaFin;
    @XmlElement(name = "FacturaRectificativa")
    protected FacturaRectificativaImporteType facturaRectificativa;
    @XmlElement(name = "FacturasRectificadasSustituidas")
    protected FacturasRectificadasSustituidasType facturasRectificadasSustituidas;

    /**
     * Obtiene el valor de la propiedad serieFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieFactura() {
        return serieFactura;
    }

    /**
     * Define el valor de la propiedad serieFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieFactura(String value) {
        this.serieFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad numFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFactura() {
        return numFactura;
    }

    /**
     * Define el valor de la propiedad numFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFactura(String value) {
        this.numFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicionFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionFactura() {
        return fechaExpedicionFactura;
    }

    /**
     * Define el valor de la propiedad fechaExpedicionFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionFactura(String value) {
        this.fechaExpedicionFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaSimplificada.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getFacturaSimplificada() {
        return facturaSimplificada;
    }

    /**
     * Define el valor de la propiedad facturaSimplificada.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setFacturaSimplificada(SiNoEnum value) {
        this.facturaSimplificada = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaEmitidaSustitucionSimplificada.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getFacturaEmitidaSustitucionSimplificada() {
        return facturaEmitidaSustitucionSimplificada;
    }

    /**
     * Define el valor de la propiedad facturaEmitidaSustitucionSimplificada.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setFacturaEmitidaSustitucionSimplificada(SiNoEnum value) {
        this.facturaEmitidaSustitucionSimplificada = value;
    }

    /**
     * Obtiene el valor de la propiedad asientoResumen.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getAsientoResumen() {
        return asientoResumen;
    }

    /**
     * Define el valor de la propiedad asientoResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setAsientoResumen(SiNoEnum value) {
        this.asientoResumen = value;
    }

    /**
     * Obtiene el valor de la propiedad numFacturaFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFacturaFin() {
        return numFacturaFin;
    }

    /**
     * Define el valor de la propiedad numFacturaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFacturaFin(String value) {
        this.numFacturaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaRectificativa.
     * 
     * @return
     *     possible object is
     *     {@link FacturaRectificativaImporteType }
     *     
     */
    public FacturaRectificativaImporteType getFacturaRectificativa() {
        return facturaRectificativa;
    }

    /**
     * Define el valor de la propiedad facturaRectificativa.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaRectificativaImporteType }
     *     
     */
    public void setFacturaRectificativa(FacturaRectificativaImporteType value) {
        this.facturaRectificativa = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasRectificadasSustituidas.
     * 
     * @return
     *     possible object is
     *     {@link FacturasRectificadasSustituidasType }
     *     
     */
    public FacturasRectificadasSustituidasType getFacturasRectificadasSustituidas() {
        return facturasRectificadasSustituidas;
    }

    /**
     * Define el valor de la propiedad facturasRectificadasSustituidas.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturasRectificadasSustituidasType }
     *     
     */
    public void setFacturasRectificadasSustituidas(FacturasRectificadasSustituidasType value) {
        this.facturasRectificadasSustituidas = value;
    }

}
