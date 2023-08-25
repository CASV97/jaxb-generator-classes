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
 * <p>Clase Java para EntregaBienesInversionPeriodoRegularizacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntregaBienesInversionPeriodoRegularizacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacturaEntrega" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}IDFacturaType"/>
 *         &lt;element name="RegularizacionDeduccionEfectuada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntregaBienesInversionPeriodoRegularizacionType", propOrder = {
    "facturaEntrega",
    "regularizacionDeduccionEfectuada"
})
public class EntregaBienesInversionPeriodoRegularizacionType {

    @XmlElement(name = "FacturaEntrega", required = true)
    protected IDFacturaType facturaEntrega;
    @XmlElement(name = "RegularizacionDeduccionEfectuada", required = true)
    protected String regularizacionDeduccionEfectuada;

    /**
     * Obtiene el valor de la propiedad facturaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaType }
     *     
     */
    public IDFacturaType getFacturaEntrega() {
        return facturaEntrega;
    }

    /**
     * Define el valor de la propiedad facturaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaType }
     *     
     */
    public void setFacturaEntrega(IDFacturaType value) {
        this.facturaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad regularizacionDeduccionEfectuada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularizacionDeduccionEfectuada() {
        return regularizacionDeduccionEfectuada;
    }

    /**
     * Define el valor de la propiedad regularizacionDeduccionEfectuada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularizacionDeduccionEfectuada(String value) {
        this.regularizacionDeduccionEfectuada = value;
    }

}
