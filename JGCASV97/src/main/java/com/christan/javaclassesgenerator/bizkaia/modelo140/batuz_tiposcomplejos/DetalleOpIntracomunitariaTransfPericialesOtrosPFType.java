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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.CountryMiembroType;
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TipoDeclaradoEnum;
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TipoOperacionIntracomunitariaEnum;

/**
 * <p>Clase Java para DetalleOpIntracomunitariaTransfPericialesOtrosPFType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleOpIntracomunitariaTransfPericialesOtrosPFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoOperacionIntracomunitariaEnum"/>
 *         &lt;element name="ClaveDeclarado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoDeclaradoEnum"/>
 *         &lt;element name="CodigoEstadoMiembroOrigenODestino" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}CountryMiembroType"/>
 *         &lt;element name="PlazoOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}intOf3Digits" minOccurs="0"/>
 *         &lt;element name="DescripcionBienes" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax35Type"/>
 *         &lt;element name="DireccionOperador" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax120Type"/>
 *         &lt;element name="OtrasFacturasDocumentacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax135Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleOpIntracomunitariaTransfPericialesOtrosPFType", propOrder = {
    "tipoOperacion",
    "claveDeclarado",
    "codigoEstadoMiembroOrigenODestino",
    "plazoOperacion",
    "descripcionBienes",
    "direccionOperador",
    "otrasFacturasDocumentacion"
})
public class DetalleOpIntracomunitariaTransfPericialesOtrosPFType {

    @XmlElement(name = "TipoOperacion", required = true)
    @XmlSchemaType(name = "string")
    protected TipoOperacionIntracomunitariaEnum tipoOperacion;
    @XmlElement(name = "ClaveDeclarado", required = true)
    @XmlSchemaType(name = "string")
    protected TipoDeclaradoEnum claveDeclarado;
    @XmlElement(name = "CodigoEstadoMiembroOrigenODestino", required = true)
    @XmlSchemaType(name = "string")
    protected CountryMiembroType codigoEstadoMiembroOrigenODestino;
    @XmlElement(name = "PlazoOperacion")
    protected Integer plazoOperacion;
    @XmlElement(name = "DescripcionBienes", required = true)
    protected String descripcionBienes;
    @XmlElement(name = "DireccionOperador", required = true)
    protected String direccionOperador;
    @XmlElement(name = "OtrasFacturasDocumentacion")
    protected String otrasFacturasDocumentacion;

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperacionIntracomunitariaEnum }
     *     
     */
    public TipoOperacionIntracomunitariaEnum getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperacionIntracomunitariaEnum }
     *     
     */
    public void setTipoOperacion(TipoOperacionIntracomunitariaEnum value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad claveDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link TipoDeclaradoEnum }
     *     
     */
    public TipoDeclaradoEnum getClaveDeclarado() {
        return claveDeclarado;
    }

    /**
     * Define el valor de la propiedad claveDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDeclaradoEnum }
     *     
     */
    public void setClaveDeclarado(TipoDeclaradoEnum value) {
        this.claveDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstadoMiembroOrigenODestino.
     * 
     * @return
     *     possible object is
     *     {@link CountryMiembroType }
     *     
     */
    public CountryMiembroType getCodigoEstadoMiembroOrigenODestino() {
        return codigoEstadoMiembroOrigenODestino;
    }

    /**
     * Define el valor de la propiedad codigoEstadoMiembroOrigenODestino.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryMiembroType }
     *     
     */
    public void setCodigoEstadoMiembroOrigenODestino(CountryMiembroType value) {
        this.codigoEstadoMiembroOrigenODestino = value;
    }

    /**
     * Obtiene el valor de la propiedad plazoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlazoOperacion() {
        return plazoOperacion;
    }

    /**
     * Define el valor de la propiedad plazoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlazoOperacion(Integer value) {
        this.plazoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionBienes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionBienes() {
        return descripcionBienes;
    }

    /**
     * Define el valor de la propiedad descripcionBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionBienes(String value) {
        this.descripcionBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionOperador() {
        return direccionOperador;
    }

    /**
     * Define el valor de la propiedad direccionOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionOperador(String value) {
        this.direccionOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad otrasFacturasDocumentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtrasFacturasDocumentacion() {
        return otrasFacturasDocumentacion;
    }

    /**
     * Define el valor de la propiedad otrasFacturasDocumentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtrasFacturasDocumentacion(String value) {
        this.otrasFacturasDocumentacion = value;
    }

}
