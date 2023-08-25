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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TipoVehiculoEnum;


/**
 * <p>Clase Java para TipoBienVehiculoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoBienVehiculoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoVehiculo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoVehiculoEnum"/>
 *         &lt;element name="Matricula" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax12Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoBienVehiculoType", propOrder = {
    "tipoVehiculo",
    "matricula"
})
public class TipoBienVehiculoType {

    @XmlElement(name = "TipoVehiculo", required = true)
    @XmlSchemaType(name = "string")
    protected TipoVehiculoEnum tipoVehiculo;
    @XmlElement(name = "Matricula", required = true)
    protected String matricula;

    /**
     * Obtiene el valor de la propiedad tipoVehiculo.
     * 
     * @return
     *     possible object is
     *     {@link TipoVehiculoEnum }
     *     
     */
    public TipoVehiculoEnum getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * Define el valor de la propiedad tipoVehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoVehiculoEnum }
     *     
     */
    public void setTipoVehiculo(TipoVehiculoEnum value) {
        this.tipoVehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

}
