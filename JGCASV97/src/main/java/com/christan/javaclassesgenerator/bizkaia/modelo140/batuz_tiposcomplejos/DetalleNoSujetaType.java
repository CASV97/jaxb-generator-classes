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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.CausaNoSujetaEnum;


/**
 * <p>Clase Java para DetalleNoSujetaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleNoSujetaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CausaNoSujecion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}CausaNoSujetaEnum"/>
 *         &lt;element name="Importe" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleNoSujetaType", propOrder = {
    "causaNoSujecion",
    "importe"
})
public class DetalleNoSujetaType {

    @XmlElement(name = "CausaNoSujecion", required = true)
    @XmlSchemaType(name = "string")
    protected CausaNoSujetaEnum causaNoSujecion;
    @XmlElement(name = "Importe", required = true)
    protected String importe;

    /**
     * Obtiene el valor de la propiedad causaNoSujecion.
     * 
     * @return
     *     possible object is
     *     {@link CausaNoSujetaEnum }
     *     
     */
    public CausaNoSujetaEnum getCausaNoSujecion() {
        return causaNoSujecion;
    }

    /**
     * Define el valor de la propiedad causaNoSujecion.
     * 
     * @param value
     *     allowed object is
     *     {@link CausaNoSujetaEnum }
     *     
     */
    public void setCausaNoSujecion(CausaNoSujetaEnum value) {
        this.causaNoSujecion = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporte(String value) {
        this.importe = value;
    }

}
