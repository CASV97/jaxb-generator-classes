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
 * <p>Clase Java para OperacionIntracomunitariaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OperacionIntracomunitariaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoExpedicionRecepcion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}InfoExpedicionRecepcionType" minOccurs="0"/>
 *         &lt;element name="IdRegistroExpInicial" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}IDRegistroExpInicialType" minOccurs="0"/>
 *         &lt;element name="DestinoFinalExpedRecep" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DestinoFinalExpedRecepType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacionIntracomunitariaType", propOrder = {
    "infoExpedicionRecepcion",
    "idRegistroExpInicial",
    "destinoFinalExpedRecep"
})
public class OperacionIntracomunitariaType {

    @XmlElement(name = "InfoExpedicionRecepcion")
    protected InfoExpedicionRecepcionType infoExpedicionRecepcion;
    @XmlElement(name = "IdRegistroExpInicial")
    protected IDRegistroExpInicialType idRegistroExpInicial;
    @XmlElement(name = "DestinoFinalExpedRecep")
    protected DestinoFinalExpedRecepType destinoFinalExpedRecep;

    /**
     * Obtiene el valor de la propiedad infoExpedicionRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link InfoExpedicionRecepcionType }
     *     
     */
    public InfoExpedicionRecepcionType getInfoExpedicionRecepcion() {
        return infoExpedicionRecepcion;
    }

    /**
     * Define el valor de la propiedad infoExpedicionRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoExpedicionRecepcionType }
     *     
     */
    public void setInfoExpedicionRecepcion(InfoExpedicionRecepcionType value) {
        this.infoExpedicionRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idRegistroExpInicial.
     * 
     * @return
     *     possible object is
     *     {@link IDRegistroExpInicialType }
     *     
     */
    public IDRegistroExpInicialType getIdRegistroExpInicial() {
        return idRegistroExpInicial;
    }

    /**
     * Define el valor de la propiedad idRegistroExpInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRegistroExpInicialType }
     *     
     */
    public void setIdRegistroExpInicial(IDRegistroExpInicialType value) {
        this.idRegistroExpInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad destinoFinalExpedRecep.
     * 
     * @return
     *     possible object is
     *     {@link DestinoFinalExpedRecepType }
     *     
     */
    public DestinoFinalExpedRecepType getDestinoFinalExpedRecep() {
        return destinoFinalExpedRecep;
    }

    /**
     * Define el valor de la propiedad destinoFinalExpedRecep.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinoFinalExpedRecepType }
     *     
     */
    public void setDestinoFinalExpedRecep(DestinoFinalExpedRecepType value) {
        this.destinoFinalExpedRecep = value;
    }

}
