//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.25 a las 03:01:04 PM CEST 
//


package com.christan.javaclassesgenerator.bizkaia.modelo140.lroe_pf_140_1_1_ingresos_confacturaconsg_altapeticion_v1_0_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_tiposcomplejos.Cabecera140Type;
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_tiposcomplejos.IngresosConSGCodificadoType;

/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cabecera" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}Cabecera140Type"/>
 *         &lt;element name="Ingresos" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}IngresosConSGCodificadoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabecera",
    "ingresos"
})
@XmlRootElement(name = "LROEPF140IngresosConFacturaConSGAltaPeticion")
public class LROEPF140IngresosConFacturaConSGAltaPeticion {

    @XmlElement(name = "Cabecera", required = true)
    protected Cabecera140Type cabecera;
    @XmlElement(name = "Ingresos", required = true)
    protected IngresosConSGCodificadoType ingresos;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link Cabecera140Type }
     *     
     */
    public Cabecera140Type getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link Cabecera140Type }
     *     
     */
    public void setCabecera(Cabecera140Type value) {
        this.cabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresos.
     * 
     * @return
     *     possible object is
     *     {@link IngresosConSGCodificadoType }
     *     
     */
    public IngresosConSGCodificadoType getIngresos() {
        return ingresos;
    }

    /**
     * Define el valor de la propiedad ingresos.
     * 
     * @param value
     *     allowed object is
     *     {@link IngresosConSGCodificadoType }
     *     
     */
    public void setIngresos(IngresosConSGCodificadoType value) {
        this.ingresos = value;
    }

}
