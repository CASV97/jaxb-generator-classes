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
 * <p>Clase Java para IngresoSinSGType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresoSinSGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Factura" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}FacturaSinSGType"/>
 *         &lt;element name="Renta" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}RentaIngresosType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresoSinSGType", propOrder = {
    "factura",
    "renta"
})
public class IngresoSinSGType {

    @XmlElement(name = "Factura", required = true)
    protected FacturaSinSGType factura;
    @XmlElement(name = "Renta", required = true)
    protected RentaIngresosType renta;

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link FacturaSinSGType }
     *     
     */
    public FacturaSinSGType getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaSinSGType }
     *     
     */
    public void setFactura(FacturaSinSGType value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad renta.
     * 
     * @return
     *     possible object is
     *     {@link RentaIngresosType }
     *     
     */
    public RentaIngresosType getRenta() {
        return renta;
    }

    /**
     * Define el valor de la propiedad renta.
     * 
     * @param value
     *     allowed object is
     *     {@link RentaIngresosType }
     *     
     */
    public void setRenta(RentaIngresosType value) {
        this.renta = value;
    }

}
