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
 * <p>Clase Java para RegistroCriterioCajaPagoPJType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroCriterioCajaPagoPJType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDPago" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}IDCriterioCajaPagoPJType"/>
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
@XmlType(name = "RegistroCriterioCajaPagoPJType", propOrder = {
    "idPago",
    "situacionRegistro"
})
public class RegistroCriterioCajaPagoPJType {

    @XmlElement(name = "IDPago", required = true)
    protected IDCriterioCajaPagoPJType idPago;
    @XmlElement(name = "SituacionRegistro", required = true)
    protected SituacionRegistroType situacionRegistro;

    /**
     * Obtiene el valor de la propiedad idPago.
     * 
     * @return
     *     possible object is
     *     {@link IDCriterioCajaPagoPJType }
     *     
     */
    public IDCriterioCajaPagoPJType getIDPago() {
        return idPago;
    }

    /**
     * Define el valor de la propiedad idPago.
     * 
     * @param value
     *     allowed object is
     *     {@link IDCriterioCajaPagoPJType }
     *     
     */
    public void setIDPago(IDCriterioCajaPagoPJType value) {
        this.idPago = value;
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
