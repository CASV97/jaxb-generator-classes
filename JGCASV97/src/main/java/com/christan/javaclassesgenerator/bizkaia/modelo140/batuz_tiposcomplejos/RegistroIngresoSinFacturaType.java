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
 * <p>Clase Java para RegistroIngresoSinFacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroIngresoSinFacturaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDIngreso" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}IDIngresoSinFacturaType"/>
 *         &lt;element name="SituacionRegistro" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}SituacionRegistroType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroIngresoSinFacturaType", propOrder = {
    "idIngreso",
    "situacionRegistro"
})
public class RegistroIngresoSinFacturaType {

    @XmlElement(name = "IDIngreso", required = true)
    protected IDIngresoSinFacturaType idIngreso;
    @XmlElement(name = "SituacionRegistro", required = true)
    protected SituacionRegistroType situacionRegistro;

    /**
     * Obtiene el valor de la propiedad idIngreso.
     * 
     * @return
     *     possible object is
     *     {@link IDIngresoSinFacturaType }
     *     
     */
    public IDIngresoSinFacturaType getIDIngreso() {
        return idIngreso;
    }

    /**
     * Define el valor de la propiedad idIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIngresoSinFacturaType }
     *     
     */
    public void setIDIngreso(IDIngresoSinFacturaType value) {
        this.idIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad situacionRegistro.
     * 
     * @return
     *     possible object is
     *     {@link SituacionRegistroType }
     *     
     */
    public SituacionRegistroType getSituacionRegistro() {
        return situacionRegistro;
    }

    /**
     * Define el valor de la propiedad situacionRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacionRegistroType }
     *     
     */
    public void setSituacionRegistro(SituacionRegistroType value) {
        this.situacionRegistro = value;
    }

}
