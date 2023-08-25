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
 * <p>Clase Java para CriterioCajaCobroPFType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CriterioCajaCobroPFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Epigrafe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}stringMax7Digits"/>
 *         &lt;element name="OperacionOriginal" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}OperacionOriginalCobroType"/>
 *         &lt;element name="FechaCobro" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="ImporteCobrado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="CuotaIVADevengada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="ImporteIngresoIRPF" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="MedioDeCobro" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}MedioDeCobroPagoEnum" minOccurs="0"/>
 *         &lt;element name="DescripcionMedio" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax34Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriterioCajaCobroPFType", propOrder = {
    "epigrafe",
    "operacionOriginal",
    "fechaCobro",
    "importeCobrado",
    "cuotaIVADevengada",
    "importeIngresoIRPF",
    "medioDeCobro",
    "descripcionMedio"
})
public class CriterioCajaCobroPFType {

    @XmlElement(name = "Epigrafe", required = true)
    protected String epigrafe;
    @XmlElement(name = "OperacionOriginal", required = true)
    protected OperacionOriginalCobroType operacionOriginal;
    @XmlElement(name = "FechaCobro", required = true)
    protected String fechaCobro;
    @XmlElement(name = "ImporteCobrado", required = true)
    protected String importeCobrado;
    @XmlElement(name = "CuotaIVADevengada")
    protected String cuotaIVADevengada;
    @XmlElement(name = "ImporteIngresoIRPF")
    protected String importeIngresoIRPF;
    @XmlElement(name = "MedioDeCobro")
    protected String medioDeCobro;
    @XmlElement(name = "DescripcionMedio")
    protected String descripcionMedio;

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
     * Obtiene el valor de la propiedad operacionOriginal.
     * 
     * @return
     *     possible object is
     *     {@link OperacionOriginalCobroType }
     *     
     */
    public OperacionOriginalCobroType getOperacionOriginal() {
        return operacionOriginal;
    }

    /**
     * Define el valor de la propiedad operacionOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionOriginalCobroType }
     *     
     */
    public void setOperacionOriginal(OperacionOriginalCobroType value) {
        this.operacionOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCobro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCobro() {
        return fechaCobro;
    }

    /**
     * Define el valor de la propiedad fechaCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCobro(String value) {
        this.fechaCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad importeCobrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteCobrado() {
        return importeCobrado;
    }

    /**
     * Define el valor de la propiedad importeCobrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteCobrado(String value) {
        this.importeCobrado = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaIVADevengada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaIVADevengada() {
        return cuotaIVADevengada;
    }

    /**
     * Define el valor de la propiedad cuotaIVADevengada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaIVADevengada(String value) {
        this.cuotaIVADevengada = value;
    }

    /**
     * Obtiene el valor de la propiedad importeIngresoIRPF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteIngresoIRPF() {
        return importeIngresoIRPF;
    }

    /**
     * Define el valor de la propiedad importeIngresoIRPF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteIngresoIRPF(String value) {
        this.importeIngresoIRPF = value;
    }

    /**
     * Obtiene el valor de la propiedad medioDeCobro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioDeCobro() {
        return medioDeCobro;
    }

    /**
     * Define el valor de la propiedad medioDeCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioDeCobro(String value) {
        this.medioDeCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMedio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMedio() {
        return descripcionMedio;
    }

    /**
     * Define el valor de la propiedad descripcionMedio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMedio(String value) {
        this.descripcionMedio = value;
    }

}
