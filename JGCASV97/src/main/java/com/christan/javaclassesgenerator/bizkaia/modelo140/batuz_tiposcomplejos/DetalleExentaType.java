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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.CausaExencionEnum;


/**
 * <p>Clase Java para DetalleExentaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleExentaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CausaExencion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}CausaExencionEnum"/>
 *         &lt;element name="BaseImponible" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleExentaType", propOrder = {
    "causaExencion",
    "baseImponible"
})
public class DetalleExentaType {

    @XmlElement(name = "CausaExencion", required = true)
    @XmlSchemaType(name = "string")
    protected CausaExencionEnum causaExencion;
    @XmlElement(name = "BaseImponible", required = true)
    protected String baseImponible;

    /**
     * Obtiene el valor de la propiedad causaExencion.
     * 
     * @return
     *     possible object is
     *     {@link CausaExencionEnum }
     *     
     */
    public CausaExencionEnum getCausaExencion() {
        return causaExencion;
    }

    /**
     * Define el valor de la propiedad causaExencion.
     * 
     * @param value
     *     allowed object is
     *     {@link CausaExencionEnum }
     *     
     */
    public void setCausaExencion(CausaExencionEnum value) {
        this.causaExencion = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponible() {
        return baseImponible;
    }

    /**
     * Define el valor de la propiedad baseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponible(String value) {
        this.baseImponible = value;
    }

}
