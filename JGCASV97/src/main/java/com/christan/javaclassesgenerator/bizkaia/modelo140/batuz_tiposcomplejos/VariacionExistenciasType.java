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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.MetodoEstimacionEnum;


/**
 * <p>Clase Java para VariacionExistenciasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VariacionExistenciasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Epigrafe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}stringMax7Digits"/>
 *         &lt;element name="MetodoEstimacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}MetodoEstimacionEnum"/>
 *         &lt;element name="ExistenciasIniciales" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="ExistenciasFinales" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariacionExistenciasType", propOrder = {
    "epigrafe",
    "metodoEstimacion",
    "existenciasIniciales",
    "existenciasFinales"
})
public class VariacionExistenciasType {

    @XmlElement(name = "Epigrafe", required = true)
    protected String epigrafe;
    @XmlElement(name = "MetodoEstimacion", required = true)
    @XmlSchemaType(name = "string")
    protected MetodoEstimacionEnum metodoEstimacion;
    @XmlElement(name = "ExistenciasIniciales", required = true)
    protected String existenciasIniciales;
    @XmlElement(name = "ExistenciasFinales", required = true)
    protected String existenciasFinales;

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
     * Obtiene el valor de la propiedad metodoEstimacion.
     * 
     * @return
     *     possible object is
     *     {@link MetodoEstimacionEnum }
     *     
     */
    public MetodoEstimacionEnum getMetodoEstimacion() {
        return metodoEstimacion;
    }

    /**
     * Define el valor de la propiedad metodoEstimacion.
     * 
     * @param value
     *     allowed object is
     *     {@link MetodoEstimacionEnum }
     *     
     */
    public void setMetodoEstimacion(MetodoEstimacionEnum value) {
        this.metodoEstimacion = value;
    }

    /**
     * Obtiene el valor de la propiedad existenciasIniciales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistenciasIniciales() {
        return existenciasIniciales;
    }

    /**
     * Define el valor de la propiedad existenciasIniciales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistenciasIniciales(String value) {
        this.existenciasIniciales = value;
    }

    /**
     * Obtiene el valor de la propiedad existenciasFinales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistenciasFinales() {
        return existenciasFinales;
    }

    /**
     * Define el valor de la propiedad existenciasFinales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistenciasFinales(String value) {
        this.existenciasFinales = value;
    }

}
