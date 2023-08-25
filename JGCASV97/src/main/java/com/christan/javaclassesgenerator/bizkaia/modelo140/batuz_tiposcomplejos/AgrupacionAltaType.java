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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TipoAgrupacionEnum;


/**
 * <p>Clase Java para AgrupacionAltaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AgrupacionAltaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenciaAgrupacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax10Type"/>
 *         &lt;element name="TipoAgrupacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoAgrupacionEnum"/>
 *         &lt;element name="DescripcionAgrupacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax50Type"/>
 *         &lt;element name="FechaOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="Bienes" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}BienesAgrupacionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgrupacionAltaType", propOrder = {
    "referenciaAgrupacion",
    "tipoAgrupacion",
    "descripcionAgrupacion",
    "fechaOperacion",
    "bienes"
})
public class AgrupacionAltaType {

    @XmlElement(name = "ReferenciaAgrupacion", required = true)
    protected String referenciaAgrupacion;
    @XmlElement(name = "TipoAgrupacion", required = true)
    @XmlSchemaType(name = "string")
    protected TipoAgrupacionEnum tipoAgrupacion;
    @XmlElement(name = "DescripcionAgrupacion", required = true)
    protected String descripcionAgrupacion;
    @XmlElement(name = "FechaOperacion", required = true)
    protected String fechaOperacion;
    @XmlElement(name = "Bienes", required = true)
    protected BienesAgrupacionType bienes;

    /**
     * Obtiene el valor de la propiedad referenciaAgrupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaAgrupacion() {
        return referenciaAgrupacion;
    }

    /**
     * Define el valor de la propiedad referenciaAgrupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaAgrupacion(String value) {
        this.referenciaAgrupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAgrupacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoAgrupacionEnum }
     *     
     */
    public TipoAgrupacionEnum getTipoAgrupacion() {
        return tipoAgrupacion;
    }

    /**
     * Define el valor de la propiedad tipoAgrupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAgrupacionEnum }
     *     
     */
    public void setTipoAgrupacion(TipoAgrupacionEnum value) {
        this.tipoAgrupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionAgrupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionAgrupacion() {
        return descripcionAgrupacion;
    }

    /**
     * Define el valor de la propiedad descripcionAgrupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionAgrupacion(String value) {
        this.descripcionAgrupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Define el valor de la propiedad fechaOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacion(String value) {
        this.fechaOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad bienes.
     * 
     * @return
     *     possible object is
     *     {@link BienesAgrupacionType }
     *     
     */
    public BienesAgrupacionType getBienes() {
        return bienes;
    }

    /**
     * Define el valor de la propiedad bienes.
     * 
     * @param value
     *     allowed object is
     *     {@link BienesAgrupacionType }
     *     
     */
    public void setBienes(BienesAgrupacionType value) {
        this.bienes = value;
    }

}
