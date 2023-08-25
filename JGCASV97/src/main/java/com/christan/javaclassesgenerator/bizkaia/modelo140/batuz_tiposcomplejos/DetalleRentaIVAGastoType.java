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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.BienAfectoIRPFYOIVAEnum;
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.OperacionRecargoEquivalenciaORegimenSimplificadoEnum;
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.SiNoEnum;


/**
 * <p>Clase Java para DetalleRentaIVAGastoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleRentaIVAGastoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Epigrafe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}stringMax7Digits"/>
 *         &lt;element name="BienAfectoIRPFYOIVA" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}BienAfectoIRPFYOIVAEnum" minOccurs="0"/>
 *         &lt;element name="Concepto" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}ConceptoEnum" minOccurs="0"/>
 *         &lt;element name="ReferenciaBien" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax10Type" minOccurs="0"/>
 *         &lt;element name="InversionSujetoPasivo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum"/>
 *         &lt;element name="OperacionEnRecargoDeEquivalenciaORegimenSimplificado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}OperacionRecargoEquivalenciaORegimenSimplificadoEnum" minOccurs="0"/>
 *         &lt;element name="BaseImponible" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="TipoImpositivo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}Importe3.2Type" minOccurs="0"/>
 *         &lt;element name="CuotaIVASoportada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="CuotaIVADeducible" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="TipoRecargoEquivalencia" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}Importe3.2Type" minOccurs="0"/>
 *         &lt;element name="CuotaRecargoEquivalencia" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="PorcentajeCompensacionREAGYP" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}Importe3.2Type" minOccurs="0"/>
 *         &lt;element name="ImporteCompensacionREAGYP" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="ImporteGastoIRPF" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
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
@XmlType(name = "DetalleRentaIVAGastoType", propOrder = {
    "epigrafe",
    "bienAfectoIRPFYOIVA",
    "concepto",
    "referenciaBien",
    "inversionSujetoPasivo",
    "operacionEnRecargoDeEquivalenciaORegimenSimplificado",
    "baseImponible",
    "tipoImpositivo",
    "cuotaIVASoportada",
    "cuotaIVADeducible",
    "tipoRecargoEquivalencia",
    "cuotaRecargoEquivalencia",
    "porcentajeCompensacionREAGYP",
    "importeCompensacionREAGYP",
    "importeGastoIRPF",
    "criterioCobrosYPagos"
})
public class DetalleRentaIVAGastoType {

    @XmlElement(name = "Epigrafe", required = true)
    protected String epigrafe;
    @XmlElement(name = "BienAfectoIRPFYOIVA")
    @XmlSchemaType(name = "string")
    protected BienAfectoIRPFYOIVAEnum bienAfectoIRPFYOIVA;
    @XmlElement(name = "Concepto")
    protected String concepto;
    @XmlElement(name = "ReferenciaBien")
    protected String referenciaBien;
    @XmlElement(name = "InversionSujetoPasivo", required = true)
    @XmlSchemaType(name = "string")
    protected SiNoEnum inversionSujetoPasivo;
    @XmlElement(name = "OperacionEnRecargoDeEquivalenciaORegimenSimplificado")
    @XmlSchemaType(name = "string")
    protected OperacionRecargoEquivalenciaORegimenSimplificadoEnum operacionEnRecargoDeEquivalenciaORegimenSimplificado;
    @XmlElement(name = "BaseImponible", required = true)
    protected String baseImponible;
    @XmlElement(name = "TipoImpositivo")
    protected String tipoImpositivo;
    @XmlElement(name = "CuotaIVASoportada")
    protected String cuotaIVASoportada;
    @XmlElement(name = "CuotaIVADeducible")
    protected String cuotaIVADeducible;
    @XmlElement(name = "TipoRecargoEquivalencia")
    protected String tipoRecargoEquivalencia;
    @XmlElement(name = "CuotaRecargoEquivalencia")
    protected String cuotaRecargoEquivalencia;
    @XmlElement(name = "PorcentajeCompensacionREAGYP")
    protected String porcentajeCompensacionREAGYP;
    @XmlElement(name = "ImporteCompensacionREAGYP")
    protected String importeCompensacionREAGYP;
    @XmlElement(name = "ImporteGastoIRPF")
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
     * Obtiene el valor de la propiedad bienAfectoIRPFYOIVA.
     * 
     * @return
     *     possible object is
     *     {@link BienAfectoIRPFYOIVAEnum }
     *     
     */
    public BienAfectoIRPFYOIVAEnum getBienAfectoIRPFYOIVA() {
        return bienAfectoIRPFYOIVA;
    }

    /**
     * Define el valor de la propiedad bienAfectoIRPFYOIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link BienAfectoIRPFYOIVAEnum }
     *     
     */
    public void setBienAfectoIRPFYOIVA(BienAfectoIRPFYOIVAEnum value) {
        this.bienAfectoIRPFYOIVA = value;
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
     * Obtiene el valor de la propiedad inversionSujetoPasivo.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getInversionSujetoPasivo() {
        return inversionSujetoPasivo;
    }

    /**
     * Define el valor de la propiedad inversionSujetoPasivo.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setInversionSujetoPasivo(SiNoEnum value) {
        this.inversionSujetoPasivo = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionEnRecargoDeEquivalenciaORegimenSimplificado.
     * 
     * @return
     *     possible object is
     *     {@link OperacionRecargoEquivalenciaORegimenSimplificadoEnum }
     *     
     */
    public OperacionRecargoEquivalenciaORegimenSimplificadoEnum getOperacionEnRecargoDeEquivalenciaORegimenSimplificado() {
        return operacionEnRecargoDeEquivalenciaORegimenSimplificado;
    }

    /**
     * Define el valor de la propiedad operacionEnRecargoDeEquivalenciaORegimenSimplificado.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionRecargoEquivalenciaORegimenSimplificadoEnum }
     *     
     */
    public void setOperacionEnRecargoDeEquivalenciaORegimenSimplificado(OperacionRecargoEquivalenciaORegimenSimplificadoEnum value) {
        this.operacionEnRecargoDeEquivalenciaORegimenSimplificado = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponible() {
        return baseImponible;
    }

    /**
     * Define el valor de la propiedad baseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponible(String value) {
        this.baseImponible = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoImpositivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImpositivo() {
        return tipoImpositivo;
    }

    /**
     * Define el valor de la propiedad tipoImpositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImpositivo(String value) {
        this.tipoImpositivo = value;
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
     * Obtiene el valor de la propiedad tipoRecargoEquivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRecargoEquivalencia() {
        return tipoRecargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad tipoRecargoEquivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRecargoEquivalencia(String value) {
        this.tipoRecargoEquivalencia = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaRecargoEquivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaRecargoEquivalencia() {
        return cuotaRecargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad cuotaRecargoEquivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaRecargoEquivalencia(String value) {
        this.cuotaRecargoEquivalencia = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeCompensacionREAGYP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeCompensacionREAGYP() {
        return porcentajeCompensacionREAGYP;
    }

    /**
     * Define el valor de la propiedad porcentajeCompensacionREAGYP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeCompensacionREAGYP(String value) {
        this.porcentajeCompensacionREAGYP = value;
    }

    /**
     * Obtiene el valor de la propiedad importeCompensacionREAGYP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteCompensacionREAGYP() {
        return importeCompensacionREAGYP;
    }

    /**
     * Define el valor de la propiedad importeCompensacionREAGYP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteCompensacionREAGYP(String value) {
        this.importeCompensacionREAGYP = value;
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
