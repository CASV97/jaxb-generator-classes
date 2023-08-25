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
 * <p>Clase Java para IVABienBajaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IVABienBajaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProrrataAnoInicio" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}intPorcentajeType" minOccurs="0"/>
 *         &lt;element name="RegularizacionTransmisionOtros" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVABienBajaType", propOrder = {
    "prorrataAnoInicio",
    "regularizacionTransmisionOtros"
})
public class IVABienBajaType {

    @XmlElement(name = "ProrrataAnoInicio")
    protected Integer prorrataAnoInicio;
    @XmlElement(name = "RegularizacionTransmisionOtros")
    protected String regularizacionTransmisionOtros;

    /**
     * Obtiene el valor de la propiedad prorrataAnoInicio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProrrataAnoInicio() {
        return prorrataAnoInicio;
    }

    /**
     * Define el valor de la propiedad prorrataAnoInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProrrataAnoInicio(Integer value) {
        this.prorrataAnoInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad regularizacionTransmisionOtros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularizacionTransmisionOtros() {
        return regularizacionTransmisionOtros;
    }

    /**
     * Define el valor de la propiedad regularizacionTransmisionOtros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularizacionTransmisionOtros(String value) {
        this.regularizacionTransmisionOtros = value;
    }

}
