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
 * <p>Clase Java para CriterioCajaPagoPFType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CriterioCajaPagoPFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Epigrafe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}stringMax7Digits"/>
 *         &lt;element name="OperacionOriginal" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}OperacionOriginalPagoType"/>
 *         &lt;element name="FechaPago" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="ImportePagado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="CuotaIVASoportada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="CuotaIVADeducible" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="ImporteGastoIRPF" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="MedioDePago" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}MedioDeCobroPagoEnum" minOccurs="0"/>
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
@XmlType(name = "CriterioCajaPagoPFType", propOrder = {
    "epigrafe",
    "operacionOriginal",
    "fechaPago",
    "importePagado",
    "cuotaIVASoportada",
    "cuotaIVADeducible",
    "importeGastoIRPF",
    "medioDePago",
    "descripcionMedio"
})
public class CriterioCajaPagoPFType {

    @XmlElement(name = "Epigrafe", required = true)
    protected String epigrafe;
    @XmlElement(name = "OperacionOriginal", required = true)
    protected OperacionOriginalPagoType operacionOriginal;
    @XmlElement(name = "FechaPago", required = true)
    protected String fechaPago;
    @XmlElement(name = "ImportePagado", required = true)
    protected String importePagado;
    @XmlElement(name = "CuotaIVASoportada")
    protected String cuotaIVASoportada;
    @XmlElement(name = "CuotaIVADeducible")
    protected String cuotaIVADeducible;
    @XmlElement(name = "ImporteGastoIRPF")
    protected String importeGastoIRPF;
    @XmlElement(name = "MedioDePago")
    protected String medioDePago;
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
     *     {@link OperacionOriginalPagoType }
     *     
     */
    public OperacionOriginalPagoType getOperacionOriginal() {
        return operacionOriginal;
    }

    /**
     * Define el valor de la propiedad operacionOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionOriginalPagoType }
     *     
     */
    public void setOperacionOriginal(OperacionOriginalPagoType value) {
        this.operacionOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad importePagado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportePagado() {
        return importePagado;
    }

    /**
     * Define el valor de la propiedad importePagado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportePagado(String value) {
        this.importePagado = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaIVASoportada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaIVASoportada() {
        return cuotaIVASoportada;
    }

    /**
     * Define el valor de la propiedad cuotaIVASoportada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaIVASoportada(String value) {
        this.cuotaIVASoportada = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaIVADeducible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaIVADeducible() {
        return cuotaIVADeducible;
    }

    /**
     * Define el valor de la propiedad cuotaIVADeducible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaIVADeducible(String value) {
        this.cuotaIVADeducible = value;
    }

    /**
     * Obtiene el valor de la propiedad importeGastoIRPF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteGastoIRPF() {
        return importeGastoIRPF;
    }

    /**
     * Define el valor de la propiedad importeGastoIRPF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteGastoIRPF(String value) {
        this.importeGastoIRPF = value;
    }

    /**
     * Obtiene el valor de la propiedad medioDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioDePago() {
        return medioDePago;
    }

    /**
     * Define el valor de la propiedad medioDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioDePago(String value) {
        this.medioDePago = value;
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
