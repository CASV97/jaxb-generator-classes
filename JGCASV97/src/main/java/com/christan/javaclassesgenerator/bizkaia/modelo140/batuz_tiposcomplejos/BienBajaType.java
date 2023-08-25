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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.MotivoBajaBienEnum;


/**
 * <p>Clase Java para BienBajaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BienBajaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenciaBien" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax10Type"/>
 *         &lt;element name="FechaOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}FechaType"/>
 *         &lt;element name="Motivo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}MotivoBajaBienEnum"/>
 *         &lt;element name="DescripcionMotivoBaja" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax50Type" minOccurs="0"/>
 *         &lt;element name="IdentiFacturaJustificante" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax60Type" minOccurs="0"/>
 *         &lt;element name="Renta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}GananciaOPerdidaType" minOccurs="0"/>
 *         &lt;element name="IVA" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}IVABienBajaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BienBajaType", propOrder = {
    "referenciaBien",
    "fechaOperacion",
    "motivo",
    "descripcionMotivoBaja",
    "identiFacturaJustificante",
    "renta",
    "iva"
})
public class BienBajaType {

    @XmlElement(name = "ReferenciaBien", required = true)
    protected String referenciaBien;
    @XmlElement(name = "FechaOperacion", required = true)
    protected String fechaOperacion;
    @XmlElement(name = "Motivo", required = true)
    @XmlSchemaType(name = "string")
    protected MotivoBajaBienEnum motivo;
    @XmlElement(name = "DescripcionMotivoBaja")
    protected String descripcionMotivoBaja;
    @XmlElement(name = "IdentiFacturaJustificante")
    protected String identiFacturaJustificante;
    @XmlElement(name = "Renta")
    protected GananciaOPerdidaType renta;
    @XmlElement(name = "IVA")
    protected IVABienBajaType iva;

    /**
     * Obtiene el valor de la propiedad referenciaBien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaBien() {
        return referenciaBien;
    }

    /**
     * Define el valor de la propiedad referenciaBien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaBien(String value) {
        this.referenciaBien = value;
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
     * Obtiene el valor de la propiedad motivo.
     * 
     * @return
     *     possible object is
     *     {@link MotivoBajaBienEnum }
     *     
     */
    public MotivoBajaBienEnum getMotivo() {
        return motivo;
    }

    /**
     * Define el valor de la propiedad motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link MotivoBajaBienEnum }
     *     
     */
    public void setMotivo(MotivoBajaBienEnum value) {
        this.motivo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMotivoBaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMotivoBaja() {
        return descripcionMotivoBaja;
    }

    /**
     * Define el valor de la propiedad descripcionMotivoBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMotivoBaja(String value) {
        this.descripcionMotivoBaja = value;
    }

    /**
     * Obtiene el valor de la propiedad identiFacturaJustificante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentiFacturaJustificante() {
        return identiFacturaJustificante;
    }

    /**
     * Define el valor de la propiedad identiFacturaJustificante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentiFacturaJustificante(String value) {
        this.identiFacturaJustificante = value;
    }

    /**
     * Obtiene el valor de la propiedad renta.
     * 
     * @return
     *     possible object is
     *     {@link GananciaOPerdidaType }
     *     
     */
    public GananciaOPerdidaType getRenta() {
        return renta;
    }

    /**
     * Define el valor de la propiedad renta.
     * 
     * @param value
     *     allowed object is
     *     {@link GananciaOPerdidaType }
     *     
     */
    public void setRenta(GananciaOPerdidaType value) {
        this.renta = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     * @return
     *     possible object is
     *     {@link IVABienBajaType }
     *     
     */
    public IVABienBajaType getIVA() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     * @param value
     *     allowed object is
     *     {@link IVABienBajaType }
     *     
     */
    public void setIVA(IVABienBajaType value) {
        this.iva = value;
    }

}
