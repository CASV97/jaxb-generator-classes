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
 * <p>Clase Java para DatosTipoBienType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosTipoBienType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Inmueble" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}TipoBienInmuebleType"/>
 *           &lt;element name="Vehiculo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}TipoBienVehiculoType"/>
 *           &lt;element name="Telefono" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}TipoBienTelefonoType"/>
 *           &lt;element name="Otro" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}TipoBienOtroType"/>
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
@XmlType(name = "DatosTipoBienType", propOrder = {
    "inmueble",
    "vehiculo",
    "telefono",
    "otro"
})
public class DatosTipoBienType {

    @XmlElement(name = "Inmueble")
    protected TipoBienInmuebleType inmueble;
    @XmlElement(name = "Vehiculo")
    protected TipoBienVehiculoType vehiculo;
    @XmlElement(name = "Telefono")
    protected TipoBienTelefonoType telefono;
    @XmlElement(name = "Otro")
    protected TipoBienOtroType otro;

    /**
     * Obtiene el valor de la propiedad inmueble.
     * 
     * @return
     *     possible object is
     *     {@link TipoBienInmuebleType }
     *     
     */
    public TipoBienInmuebleType getInmueble() {
        return inmueble;
    }

    /**
     * Define el valor de la propiedad inmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBienInmuebleType }
     *     
     */
    public void setInmueble(TipoBienInmuebleType value) {
        this.inmueble = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculo.
     * 
     * @return
     *     possible object is
     *     {@link TipoBienVehiculoType }
     *     
     */
    public TipoBienVehiculoType getVehiculo() {
        return vehiculo;
    }

    /**
     * Define el valor de la propiedad vehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBienVehiculoType }
     *     
     */
    public void setVehiculo(TipoBienVehiculoType value) {
        this.vehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link TipoBienTelefonoType }
     *     
     */
    public TipoBienTelefonoType getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBienTelefonoType }
     *     
     */
    public void setTelefono(TipoBienTelefonoType value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad otro.
     * 
     * @return
     *     possible object is
     *     {@link TipoBienOtroType }
     *     
     */
    public TipoBienOtroType getOtro() {
        return otro;
    }

    /**
     * Define el valor de la propiedad otro.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBienOtroType }
     *     
     */
    public void setOtro(TipoBienOtroType value) {
        this.otro = value;
    }

}
