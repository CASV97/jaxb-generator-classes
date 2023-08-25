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
 * <p>Clase Java para DesgloseOperacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DesgloseOperacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrestacionServicios" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DesgloseFacturaType" minOccurs="0"/>
 *         &lt;element name="Entrega" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DesgloseFacturaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesgloseOperacionType", propOrder = {
    "prestacionServicios",
    "entrega"
})
public class DesgloseOperacionType {

    @XmlElement(name = "PrestacionServicios")
    protected DesgloseFacturaType prestacionServicios;
    @XmlElement(name = "Entrega")
    protected DesgloseFacturaType entrega;

    /**
     * Obtiene el valor de la propiedad prestacionServicios.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseFacturaType }
     *     
     */
    public DesgloseFacturaType getPrestacionServicios() {
        return prestacionServicios;
    }

    /**
     * Define el valor de la propiedad prestacionServicios.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseFacturaType }
     *     
     */
    public void setPrestacionServicios(DesgloseFacturaType value) {
        this.prestacionServicios = value;
    }

    /**
     * Obtiene el valor de la propiedad entrega.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseFacturaType }
     *     
     */
    public DesgloseFacturaType getEntrega() {
        return entrega;
    }

    /**
     * Define el valor de la propiedad entrega.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseFacturaType }
     *     
     */
    public void setEntrega(DesgloseFacturaType value) {
        this.entrega = value;
    }

}
