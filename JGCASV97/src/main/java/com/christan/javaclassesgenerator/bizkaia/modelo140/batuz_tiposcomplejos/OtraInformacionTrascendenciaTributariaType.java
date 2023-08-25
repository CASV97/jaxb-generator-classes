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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.SiNoEnum;


/**
 * <p>Clase Java para OtraInformacionTrascendenciaTributariaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtraInformacionTrascendenciaTributariaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NIFRepresentanteDeclarado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}NIFType" minOccurs="0"/>
 *         &lt;element name="Inmuebles" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}InmueblesType" minOccurs="0"/>
 *         &lt;element name="ImporteTransmisionInmueblesSujetoAIVA" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="NumRegistroAcuerdoFacturacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax15Type" minOccurs="0"/>
 *         &lt;element name="ReferenciaExterna" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}TextMax60Type" minOccurs="0"/>
 *         &lt;element name="Cupon" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *         &lt;element name="EntidadSucedida" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}EntidadSucedidaType" minOccurs="0"/>
 *         &lt;element name="FacturacionDispAdicionalSegundaYQuinta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtraInformacionTrascendenciaTributariaType", propOrder = {
    "nifRepresentanteDeclarado",
    "inmuebles",
    "importeTransmisionInmueblesSujetoAIVA",
    "numRegistroAcuerdoFacturacion",
    "referenciaExterna",
    "cupon",
    "entidadSucedida",
    "facturacionDispAdicionalSegundaYQuinta"
})
public class OtraInformacionTrascendenciaTributariaType {

    @XmlElement(name = "NIFRepresentanteDeclarado")
    protected String nifRepresentanteDeclarado;
    @XmlElement(name = "Inmuebles")
    protected InmueblesType inmuebles;
    @XmlElement(name = "ImporteTransmisionInmueblesSujetoAIVA")
    protected String importeTransmisionInmueblesSujetoAIVA;
    @XmlElement(name = "NumRegistroAcuerdoFacturacion")
    protected String numRegistroAcuerdoFacturacion;
    @XmlElement(name = "ReferenciaExterna")
    protected String referenciaExterna;
    @XmlElement(name = "Cupon")
    @XmlSchemaType(name = "string")
    protected SiNoEnum cupon;
    @XmlElement(name = "EntidadSucedida")
    protected EntidadSucedidaType entidadSucedida;
    @XmlElement(name = "FacturacionDispAdicionalSegundaYQuinta")
    @XmlSchemaType(name = "string")
    protected SiNoEnum facturacionDispAdicionalSegundaYQuinta;

    /**
     * Obtiene el valor de la propiedad nifRepresentanteDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIFRepresentanteDeclarado() {
        return nifRepresentanteDeclarado;
    }

    /**
     * Define el valor de la propiedad nifRepresentanteDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIFRepresentanteDeclarado(String value) {
        this.nifRepresentanteDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad inmuebles.
     * 
     * @return
     *     possible object is
     *     {@link InmueblesType }
     *     
     */
    public InmueblesType getInmuebles() {
        return inmuebles;
    }

    /**
     * Define el valor de la propiedad inmuebles.
     * 
     * @param value
     *     allowed object is
     *     {@link InmueblesType }
     *     
     */
    public void setInmuebles(InmueblesType value) {
        this.inmuebles = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTransmisionInmueblesSujetoAIVA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTransmisionInmueblesSujetoAIVA() {
        return importeTransmisionInmueblesSujetoAIVA;
    }

    /**
     * Define el valor de la propiedad importeTransmisionInmueblesSujetoAIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTransmisionInmueblesSujetoAIVA(String value) {
        this.importeTransmisionInmueblesSujetoAIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegistroAcuerdoFacturacion() {
        return numRegistroAcuerdoFacturacion;
    }

    /**
     * Define el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegistroAcuerdoFacturacion(String value) {
        this.numRegistroAcuerdoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaExterna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaExterna() {
        return referenciaExterna;
    }

    /**
     * Define el valor de la propiedad referenciaExterna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaExterna(String value) {
        this.referenciaExterna = value;
    }

    /**
     * Obtiene el valor de la propiedad cupon.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getCupon() {
        return cupon;
    }

    /**
     * Define el valor de la propiedad cupon.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setCupon(SiNoEnum value) {
        this.cupon = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadSucedida.
     * 
     * @return
     *     possible object is
     *     {@link EntidadSucedidaType }
     *     
     */
    public EntidadSucedidaType getEntidadSucedida() {
        return entidadSucedida;
    }

    /**
     * Define el valor de la propiedad entidadSucedida.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadSucedidaType }
     *     
     */
    public void setEntidadSucedida(EntidadSucedidaType value) {
        this.entidadSucedida = value;
    }

    /**
     * Obtiene el valor de la propiedad facturacionDispAdicionalSegundaYQuinta.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getFacturacionDispAdicionalSegundaYQuinta() {
        return facturacionDispAdicionalSegundaYQuinta;
    }

    /**
     * Define el valor de la propiedad facturacionDispAdicionalSegundaYQuinta.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setFacturacionDispAdicionalSegundaYQuinta(SiNoEnum value) {
        this.facturacionDispAdicionalSegundaYQuinta = value;
    }

}
