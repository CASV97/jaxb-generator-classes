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
 * <p>Clase Java para DetalleRentaIngresosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleRentaIngresosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Epigrafe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}stringMax7Digits"/>
 *         &lt;element name="IngresoAComputarIRPFDiferenteBaseImpoIVA" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *         &lt;element name="ImporteIngresoIRPF" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
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
@XmlType(name = "DetalleRentaIngresosType", propOrder = {
    "epigrafe",
    "ingresoAComputarIRPFDiferenteBaseImpoIVA",
    "importeIngresoIRPF",
    "criterioCobrosYPagos"
})
public class DetalleRentaIngresosType {

    @XmlElement(name = "Epigrafe", required = true)
    protected String epigrafe;
    @XmlElement(name = "IngresoAComputarIRPFDiferenteBaseImpoIVA")
    @XmlSchemaType(name = "string")
    protected SiNoEnum ingresoAComputarIRPFDiferenteBaseImpoIVA;
    @XmlElement(name = "ImporteIngresoIRPF")
    protected String importeIngresoIRPF;
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
     * Obtiene el valor de la propiedad ingresoAComputarIRPFDiferenteBaseImpoIVA.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getIngresoAComputarIRPFDiferenteBaseImpoIVA() {
        return ingresoAComputarIRPFDiferenteBaseImpoIVA;
    }

    /**
     * Define el valor de la propiedad ingresoAComputarIRPFDiferenteBaseImpoIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setIngresoAComputarIRPFDiferenteBaseImpoIVA(SiNoEnum value) {
        this.ingresoAComputarIRPFDiferenteBaseImpoIVA = value;
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
