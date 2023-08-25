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
 * <p>Clase Java para RentaGastosLineaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RentaGastosLineaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Epigrafe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}stringMax7Digits"/>
 *         &lt;element name="Concepto" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}ConceptoEnum"/>
 *         &lt;element name="Linea" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}int1to99Type"/>
 *         &lt;element name="ReferenciaBien" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax10Type" minOccurs="0"/>
 *         &lt;element name="ImporteGastoIRPF" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="CriterioCobrosYPagos" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentaGastosLineaType", propOrder = {
    "epigrafe",
    "concepto",
    "linea",
    "referenciaBien",
    "importeGastoIRPF",
    "criterioCobrosYPagos"
})
public class RentaGastosLineaType {

    @XmlElement(name = "Epigrafe", required = true)
    protected String epigrafe;
    @XmlElement(name = "Concepto", required = true)
    protected String concepto;
    @XmlElement(name = "Linea")
    protected int linea;
    @XmlElement(name = "ReferenciaBien")
    protected String referenciaBien;
    @XmlElement(name = "ImporteGastoIRPF", required = true)
    protected String importeGastoIRPF;
    @XmlElement(name = "CriterioCobrosYPagos")
    @XmlSchemaType(name = "string")
    protected SiNoEnum criterioCobrosYPagos;

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
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcepto(String value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad linea.
     * 
     */
    public int getLinea() {
        return linea;
    }

    /**
     * Define el valor de la propiedad linea.
     * 
     */
    public void setLinea(int value) {
        this.linea = value;
    }

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
     * Obtiene el valor de la propiedad criterioCobrosYPagos.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getCriterioCobrosYPagos() {
        return criterioCobrosYPagos;
    }

    /**
     * Define el valor de la propiedad criterioCobrosYPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setCriterioCobrosYPagos(SiNoEnum value) {
        this.criterioCobrosYPagos = value;
    }

}
