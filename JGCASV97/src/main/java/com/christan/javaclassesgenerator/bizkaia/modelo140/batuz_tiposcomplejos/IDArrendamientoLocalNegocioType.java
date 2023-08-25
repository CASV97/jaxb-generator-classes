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
 * <p>Clase Java para IDArrendamientoLocalNegocioType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IDArrendamientoLocalNegocioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Declarado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DocumentoType"/>
 *         &lt;element name="DatosInmueble" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DatosInmuebleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDArrendamientoLocalNegocioType", propOrder = {
    "declarado",
    "datosInmueble"
})
public class IDArrendamientoLocalNegocioType {

    @XmlElement(name = "Declarado", required = true)
    protected DocumentoType declarado;
    @XmlElement(name = "DatosInmueble", required = true)
    protected DatosInmuebleType datosInmueble;

    /**
     * Obtiene el valor de la propiedad declarado.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoType }
     *     
     */
    public DocumentoType getDeclarado() {
        return declarado;
    }

    /**
     * Define el valor de la propiedad declarado.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoType }
     *     
     */
    public void setDeclarado(DocumentoType value) {
        this.declarado = value;
    }

    /**
     * Obtiene el valor de la propiedad datosInmueble.
     * 
     * @return
     *     possible object is
     *     {@link DatosInmuebleType }
     *     
     */
    public DatosInmuebleType getDatosInmueble() {
        return datosInmueble;
    }

    /**
     * Define el valor de la propiedad datosInmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosInmuebleType }
     *     
     */
    public void setDatosInmueble(DatosInmuebleType value) {
        this.datosInmueble = value;
    }

}
