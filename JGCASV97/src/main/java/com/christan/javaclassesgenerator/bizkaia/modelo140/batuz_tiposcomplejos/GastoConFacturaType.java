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
 * <p>Clase Java para GastoConFacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GastoConFacturaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmisorFacturaRecibida" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DocumentoPersonaType"/>
 *         &lt;element name="CabeceraFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}CabeceraFacturaGastosRecibidasType"/>
 *         &lt;element name="DatosFactura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DatosFacturaGastoType"/>
 *         &lt;element name="RentaIVA" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}RentaIVAGastoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GastoConFacturaType", propOrder = {
    "emisorFacturaRecibida",
    "cabeceraFactura",
    "datosFactura",
    "rentaIVA"
})
public class GastoConFacturaType {

    @XmlElement(name = "EmisorFacturaRecibida", required = true)
    protected DocumentoPersonaType emisorFacturaRecibida;
    @XmlElement(name = "CabeceraFactura", required = true)
    protected CabeceraFacturaGastosRecibidasType cabeceraFactura;
    @XmlElement(name = "DatosFactura", required = true)
    protected DatosFacturaGastoType datosFactura;
    @XmlElement(name = "RentaIVA", required = true)
    protected RentaIVAGastoType rentaIVA;

    /**
     * Obtiene el valor de la propiedad emisorFacturaRecibida.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public DocumentoPersonaType getEmisorFacturaRecibida() {
        return emisorFacturaRecibida;
    }

    /**
     * Define el valor de la propiedad emisorFacturaRecibida.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoPersonaType }
     *     
     */
    public void setEmisorFacturaRecibida(DocumentoPersonaType value) {
        this.emisorFacturaRecibida = value;
    }

    /**
     * Obtiene el valor de la propiedad cabeceraFactura.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraFacturaGastosRecibidasType }
     *     
     */
    public CabeceraFacturaGastosRecibidasType getCabeceraFactura() {
        return cabeceraFactura;
    }

    /**
     * Define el valor de la propiedad cabeceraFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraFacturaGastosRecibidasType }
     *     
     */
    public void setCabeceraFactura(CabeceraFacturaGastosRecibidasType value) {
        this.cabeceraFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad datosFactura.
     * 
     * @return
     *     possible object is
     *     {@link DatosFacturaGastoType }
     *     
     */
    public DatosFacturaGastoType getDatosFactura() {
        return datosFactura;
    }

    /**
     * Define el valor de la propiedad datosFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosFacturaGastoType }
     *     
     */
    public void setDatosFactura(DatosFacturaGastoType value) {
        this.datosFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad rentaIVA.
     * 
     * @return
     *     possible object is
     *     {@link RentaIVAGastoType }
     *     
     */
    public RentaIVAGastoType getRentaIVA() {
        return rentaIVA;
    }

    /**
     * Define el valor de la propiedad rentaIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link RentaIVAGastoType }
     *     
     */
    public void setRentaIVA(RentaIVAGastoType value) {
        this.rentaIVA = value;
    }

}
