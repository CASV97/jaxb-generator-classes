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
 * <p>Clase Java para TipoDesgloseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoDesgloseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DesgloseFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DesgloseFacturaType"/>
 *           &lt;element name="DesgloseTipoOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DesgloseOperacionType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDesgloseType", propOrder = {
    "desgloseFactura",
    "desgloseTipoOperacion"
})
public class TipoDesgloseType {

    @XmlElement(name = "DesgloseFactura")
    protected DesgloseFacturaType desgloseFactura;
    @XmlElement(name = "DesgloseTipoOperacion")
    protected DesgloseOperacionType desgloseTipoOperacion;

    /**
     * Obtiene el valor de la propiedad desgloseFactura.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseFacturaType }
     *     
     */
    public DesgloseFacturaType getDesgloseFactura() {
        return desgloseFactura;
    }

    /**
     * Define el valor de la propiedad desgloseFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseFacturaType }
     *     
     */
    public void setDesgloseFactura(DesgloseFacturaType value) {
        this.desgloseFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad desgloseTipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseOperacionType }
     *     
     */
    public DesgloseOperacionType getDesgloseTipoOperacion() {
        return desgloseTipoOperacion;
    }

    /**
     * Define el valor de la propiedad desgloseTipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseOperacionType }
     *     
     */
    public void setDesgloseTipoOperacion(DesgloseOperacionType value) {
        this.desgloseTipoOperacion = value;
    }

}
