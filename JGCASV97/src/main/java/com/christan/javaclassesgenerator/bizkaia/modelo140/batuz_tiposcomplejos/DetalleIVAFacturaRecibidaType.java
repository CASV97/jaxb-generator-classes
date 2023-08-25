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
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.TipoCompraGastoBienEnum;


/**
 * <p>Clase Java para DetalleIVAFacturaRecibidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleIVAFacturaRecibidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompraBienesCorrientesGastosBienesInversion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoCompraGastoBienEnum"/>
 *         &lt;element name="InversionSujetoPasivo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}SiNoEnum"/>
 *         &lt;element name="BaseImponible" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="TipoImpositivo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}Importe3.2Type" minOccurs="0"/>
 *         &lt;element name="CuotaIVASoportada" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="CuotaIVADeducible" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="PorcentajeCompensacionREAGYP" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}Importe3.2Type" minOccurs="0"/>
 *         &lt;element name="ImporteCompensacionREAGYP" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposBasicos.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleIVAFacturaRecibidaType", propOrder = {
    "compraBienesCorrientesGastosBienesInversion",
    "inversionSujetoPasivo",
    "baseImponible",
    "tipoImpositivo",
    "cuotaIVASoportada",
    "cuotaIVADeducible",
    "porcentajeCompensacionREAGYP",
    "importeCompensacionREAGYP"
})
public class DetalleIVAFacturaRecibidaType {

    @XmlElement(name = "CompraBienesCorrientesGastosBienesInversion", required = true)
    @XmlSchemaType(name = "string")
    protected TipoCompraGastoBienEnum compraBienesCorrientesGastosBienesInversion;
    @XmlElement(name = "InversionSujetoPasivo", required = true)
    @XmlSchemaType(name = "string")
    protected SiNoEnum inversionSujetoPasivo;
    @XmlElement(name = "BaseImponible", required = true)
    protected String baseImponible;
    @XmlElement(name = "TipoImpositivo")
    protected String tipoImpositivo;
    @XmlElement(name = "CuotaIVASoportada")
    protected String cuotaIVASoportada;
    @XmlElement(name = "CuotaIVADeducible")
    protected String cuotaIVADeducible;
    @XmlElement(name = "PorcentajeCompensacionREAGYP")
    protected String porcentajeCompensacionREAGYP;
    @XmlElement(name = "ImporteCompensacionREAGYP")
    protected String importeCompensacionREAGYP;

    /**
     * Obtiene el valor de la propiedad compraBienesCorrientesGastosBienesInversion.
     * 
     * @return
     *     possible object is
     *     {@link TipoCompraGastoBienEnum }
     *     
     */
    public TipoCompraGastoBienEnum getCompraBienesCorrientesGastosBienesInversion() {
        return compraBienesCorrientesGastosBienesInversion;
    }

    /**
     * Define el valor de la propiedad compraBienesCorrientesGastosBienesInversion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCompraGastoBienEnum }
     *     
     */
    public void setCompraBienesCorrientesGastosBienesInversion(TipoCompraGastoBienEnum value) {
        this.compraBienesCorrientesGastosBienesInversion = value;
    }

    /**
     * Obtiene el valor de la propiedad inversionSujetoPasivo.
     * 
     * @return
     *     possible object is
     *     {@link SiNoEnum }
     *     
     */
    public SiNoEnum getInversionSujetoPasivo() {
        return inversionSujetoPasivo;
    }

    /**
     * Define el valor de la propiedad inversionSujetoPasivo.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoEnum }
     *     
     */
    public void setInversionSujetoPasivo(SiNoEnum value) {
        this.inversionSujetoPasivo = value;
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

    /**
     * Obtiene el valor de la propiedad tipoImpositivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImpositivo() {
        return tipoImpositivo;
    }

    /**
     * Define el valor de la propiedad tipoImpositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImpositivo(String value) {
        this.tipoImpositivo = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaIVASoportada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaIVASoportada() {
        return cuotaIVASoportada;
    }

    /**
     * Define el valor de la propiedad cuotaIVASoportada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaIVASoportada(String value) {
        this.cuotaIVASoportada = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaIVADeducible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaIVADeducible() {
        return cuotaIVADeducible;
    }

    /**
     * Define el valor de la propiedad cuotaIVADeducible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaIVADeducible(String value) {
        this.cuotaIVADeducible = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeCompensacionREAGYP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeCompensacionREAGYP() {
        return porcentajeCompensacionREAGYP;
    }

    /**
     * Define el valor de la propiedad porcentajeCompensacionREAGYP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeCompensacionREAGYP(String value) {
        this.porcentajeCompensacionREAGYP = value;
    }

    /**
     * Obtiene el valor de la propiedad importeCompensacionREAGYP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteCompensacionREAGYP() {
        return importeCompensacionREAGYP;
    }

    /**
     * Define el valor de la propiedad importeCompensacionREAGYP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteCompensacionREAGYP(String value) {
        this.importeCompensacionREAGYP = value;
    }

}
