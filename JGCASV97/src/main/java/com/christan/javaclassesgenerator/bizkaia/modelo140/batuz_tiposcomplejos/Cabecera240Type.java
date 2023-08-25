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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.OperacionEnum;


/**
 * <p>Clase Java para Cabecera240Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cabecera240Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Modelo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}Modelo240Enum"/>
 *         &lt;element name="Capitulo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}CapituloModelo240Enum"/>
 *         &lt;element name="Subcapitulo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SubcapituloModelo240Enum" minOccurs="0"/>
 *         &lt;element name="Operacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}OperacionEnum"/>
 *         &lt;element name="Version" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}IDVersionEnum"/>
 *         &lt;element name="Ejercicio" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}YearType"/>
 *         &lt;element name="ObligadoTributario" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}NIFPersonaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cabecera240Type", propOrder = {
    "modelo",
    "capitulo",
    "subcapitulo",
    "operacion",
    "version",
    "ejercicio",
    "obligadoTributario"
})
public class Cabecera240Type {

    @XmlElement(name = "Modelo", required = true)
    protected String modelo;
    @XmlElement(name = "Capitulo", required = true)
    protected String capitulo;
    @XmlElement(name = "Subcapitulo")
    protected String subcapitulo;
    @XmlElement(name = "Operacion", required = true)
    @XmlSchemaType(name = "string")
    protected OperacionEnum operacion;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Ejercicio")
    protected int ejercicio;
    @XmlElement(name = "ObligadoTributario", required = true)
    protected NIFPersonaType obligadoTributario;

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad capitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitulo() {
        return capitulo;
    }

    /**
     * Define el valor de la propiedad capitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitulo(String value) {
        this.capitulo = value;
    }

    /**
     * Obtiene el valor de la propiedad subcapitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcapitulo() {
        return subcapitulo;
    }

    /**
     * Define el valor de la propiedad subcapitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcapitulo(String value) {
        this.subcapitulo = value;
    }

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link OperacionEnum }
     *     
     */
    public OperacionEnum getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionEnum }
     *     
     */
    public void setOperacion(OperacionEnum value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

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
     * Obtiene el valor de la propiedad obligadoTributario.
     * 
     * @return
     *     possible object is
     *     {@link NIFPersonaType }
     *     
     */
    public NIFPersonaType getObligadoTributario() {
        return obligadoTributario;
    }

    /**
     * Define el valor de la propiedad obligadoTributario.
     * 
     * @param value
     *     allowed object is
     *     {@link NIFPersonaType }
     *     
     */
    public void setObligadoTributario(NIFPersonaType value) {
        this.obligadoTributario = value;
    }

}
