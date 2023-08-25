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
 * <p>Clase Java para TransmisionInmuebleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransmisionInmuebleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Declarado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DocumentoPersonaType"/>
 *         &lt;element name="Importes" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}ImportesTrimestresType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmisionInmuebleType", propOrder = {
    "declarado",
    "importes"
})
public class TransmisionInmuebleType {

    @XmlElement(name = "Declarado", required = true)
    protected DocumentoPersonaType declarado;
    @XmlElement(name = "Importes", required = true)
    protected ImportesTrimestresType importes;

    /**
     * Obtiene el valor de la propiedad declarado.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public DocumentoPersonaType getDeclarado() {
        return declarado;
    }

    /**
     * Define el valor de la propiedad declarado.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public void setDeclarado(DocumentoPersonaType value) {
        this.declarado = value;
    }

    /**
     * Obtiene el valor de la propiedad importes.
     * 
     * @return
     *     possible object is
     *     {@link ImportesTrimestresType }
     *     
     */
    public ImportesTrimestresType getImportes() {
        return importes;
    }

    /**
     * Define el valor de la propiedad importes.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportesTrimestresType }
     *     
     */
    public void setImportes(ImportesTrimestresType value) {
        this.importes = value;
    }

}
