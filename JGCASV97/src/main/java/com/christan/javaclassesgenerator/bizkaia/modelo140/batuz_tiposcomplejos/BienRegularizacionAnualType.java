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
 * <p>Clase Java para BienRegularizacionAnualType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BienRegularizacionAnualType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenciaBien" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax10Type"/>
 *         &lt;element name="ProrrataAnoInicio" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}intPorcentajeType"/>
 *         &lt;element name="ProrrataAnualDefinitiva" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}intPorcentajeType"/>
 *         &lt;element name="RegularizacionAnualDeduccion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BienRegularizacionAnualType", propOrder = {
    "referenciaBien",
    "prorrataAnoInicio",
    "prorrataAnualDefinitiva",
    "regularizacionAnualDeduccion"
})
public class BienRegularizacionAnualType {

    @XmlElement(name = "ReferenciaBien", required = true)
    protected String referenciaBien;
    @XmlElement(name = "ProrrataAnoInicio")
    protected int prorrataAnoInicio;
    @XmlElement(name = "ProrrataAnualDefinitiva")
    protected int prorrataAnualDefinitiva;
    @XmlElement(name = "RegularizacionAnualDeduccion", required = true)
    protected String regularizacionAnualDeduccion;

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
     * Obtiene el valor de la propiedad prorrataAnoInicio.
     * 
     */
    public int getProrrataAnoInicio() {
        return prorrataAnoInicio;
    }

    /**
     * Define el valor de la propiedad prorrataAnoInicio.
     * 
     */
    public void setProrrataAnoInicio(int value) {
        this.prorrataAnoInicio = value;
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

}
