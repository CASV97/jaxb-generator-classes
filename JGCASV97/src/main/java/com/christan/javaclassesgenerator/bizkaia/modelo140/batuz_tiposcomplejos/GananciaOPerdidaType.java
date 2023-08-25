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
 * <p>Clase Java para GananciaOPerdidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GananciaOPerdidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Ganancia" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}GananciaDetalleType"/>
 *           &lt;element name="Perdida" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GananciaOPerdidaType", propOrder = {
    "ganancia",
    "perdida"
})
public class GananciaOPerdidaType {

    @XmlElement(name = "Ganancia")
    protected GananciaDetalleType ganancia;
    @XmlElement(name = "Perdida")
    protected String perdida;

    /**
     * Obtiene el valor de la propiedad ganancia.
     * 
     * @return
     *     possible object is
     *     {@link GananciaDetalleType }
     *     
     */
    public GananciaDetalleType getGanancia() {
        return ganancia;
    }

    /**
     * Define el valor de la propiedad ganancia.
     * 
     * @param value
     *     allowed object is
     *     {@link GananciaDetalleType }
     *     
     */
    public void setGanancia(GananciaDetalleType value) {
        this.ganancia = value;
    }

    /**
     * Obtiene el valor de la propiedad perdida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerdida() {
        return perdida;
    }

    /**
     * Define el valor de la propiedad perdida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerdida(String value) {
        this.perdida = value;
    }

}
