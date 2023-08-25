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
 * <p>Clase Java para IDRegistroExpInicialType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IDRegistroExpInicialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ejercicio" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}YearType"/>
 *         &lt;element name="Periodo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}PeriodoEnum"/>
 *         &lt;element name="IDExpInicial" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax60Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDRegistroExpInicialType", propOrder = {
    "ejercicio",
    "periodo",
    "idExpInicial"
})
public class IDRegistroExpInicialType {

    @XmlElement(name = "Ejercicio")
    protected int ejercicio;
    @XmlElement(name = "Periodo", required = true)
    protected String periodo;
    @XmlElement(name = "IDExpInicial", required = true)
    protected String idExpInicial;

    /**
     * Obtiene el valor de la propiedad ejercicio.
     * 
     */
    public int getEjercicio() {
        return ejercicio;
    }

    /**
     * Define el valor de la propiedad ejercicio.
     * 
     */
    public void setEjercicio(int value) {
        this.ejercicio = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Obtiene el valor de la propiedad idExpInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDExpInicial() {
        return idExpInicial;
    }

    /**
     * Define el valor de la propiedad idExpInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDExpInicial(String value) {
        this.idExpInicial = value;
    }

}
