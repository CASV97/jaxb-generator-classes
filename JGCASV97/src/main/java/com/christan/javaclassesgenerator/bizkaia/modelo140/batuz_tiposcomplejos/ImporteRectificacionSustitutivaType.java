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
 * <p>Clase Java para ImporteRectificacionSustitutivaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImporteRectificacionSustitutivaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseRectificada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="CuotaRectificada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="CuotaRecargoRectificada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImporteRectificacionSustitutivaType", propOrder = {
    "baseRectificada",
    "cuotaRectificada",
    "cuotaRecargoRectificada"
})
public class ImporteRectificacionSustitutivaType {

    @XmlElement(name = "BaseRectificada", required = true)
    protected String baseRectificada;
    @XmlElement(name = "CuotaRectificada", required = true)
    protected String cuotaRectificada;
    @XmlElement(name = "CuotaRecargoRectificada")
    protected String cuotaRecargoRectificada;

    /**
     * Obtiene el valor de la propiedad baseRectificada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRectificada() {
        return baseRectificada;
    }

    /**
     * Define el valor de la propiedad baseRectificada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRectificada(String value) {
        this.baseRectificada = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaRectificada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaRectificada() {
        return cuotaRectificada;
    }

    /**
     * Define el valor de la propiedad cuotaRectificada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaRectificada(String value) {
        this.cuotaRectificada = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaRecargoRectificada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaRecargoRectificada() {
        return cuotaRecargoRectificada;
    }

    /**
     * Define el valor de la propiedad cuotaRecargoRectificada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaRecargoRectificada(String value) {
        this.cuotaRecargoRectificada = value;
    }

}
