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
 * <p>Clase Java para ImportesTrimestresType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImportesTrimestresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImporteTrimestre1" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="ImporteTrimestre2" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="ImporteTrimestre3" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="ImporteTrimestre4" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportesTrimestresType", propOrder = {
    "importeTrimestre1",
    "importeTrimestre2",
    "importeTrimestre3",
    "importeTrimestre4"
})
public class ImportesTrimestresType {

    @XmlElement(name = "ImporteTrimestre1", required = true)
    protected String importeTrimestre1;
    @XmlElement(name = "ImporteTrimestre2", required = true)
    protected String importeTrimestre2;
    @XmlElement(name = "ImporteTrimestre3", required = true)
    protected String importeTrimestre3;
    @XmlElement(name = "ImporteTrimestre4", required = true)
    protected String importeTrimestre4;

    /**
     * Obtiene el valor de la propiedad importeTrimestre1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTrimestre1() {
        return importeTrimestre1;
    }

    /**
     * Define el valor de la propiedad importeTrimestre1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTrimestre1(String value) {
        this.importeTrimestre1 = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTrimestre2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTrimestre2() {
        return importeTrimestre2;
    }

    /**
     * Define el valor de la propiedad importeTrimestre2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTrimestre2(String value) {
        this.importeTrimestre2 = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTrimestre3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTrimestre3() {
        return importeTrimestre3;
    }

    /**
     * Define el valor de la propiedad importeTrimestre3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTrimestre3(String value) {
        this.importeTrimestre3 = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTrimestre4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTrimestre4() {
        return importeTrimestre4;
    }

    /**
     * Define el valor de la propiedad importeTrimestre4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTrimestre4(String value) {
        this.importeTrimestre4 = value;
    }

}
