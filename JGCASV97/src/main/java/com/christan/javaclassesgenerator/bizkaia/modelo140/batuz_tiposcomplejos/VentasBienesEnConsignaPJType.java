//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.25 a las 03:01:04 PM CEST 
//


package com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_tiposcomplejos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VentasBienesEnConsignaPJType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VentasBienesEnConsignaPJType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VentaEnConsigna" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}VentaBienEnConsignaPJType" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VentasBienesEnConsignaPJType", propOrder = {
    "ventaEnConsigna"
})
public class VentasBienesEnConsignaPJType {

    @XmlElement(name = "VentaEnConsigna", required = true)
    protected List<VentaBienEnConsignaPJType> ventaEnConsigna;

    /**
     * Gets the value of the ventaEnConsigna property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ventaEnConsigna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVentaEnConsigna().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VentaBienEnConsignaPJType }
     * 
     * 
     */
    public List<VentaBienEnConsignaPJType> getVentaEnConsigna() {
        if (ventaEnConsigna == null) {
            ventaEnConsigna = new ArrayList<VentaBienEnConsignaPJType>();
        }
        return this.ventaEnConsigna;
    }

}
