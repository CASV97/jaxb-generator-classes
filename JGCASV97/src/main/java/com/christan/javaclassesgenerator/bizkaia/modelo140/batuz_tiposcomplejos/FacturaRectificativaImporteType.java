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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.ClaveCodigoFacturaRectificativaEnum;
import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.ClaveTipoRectificativaEnum;


/**
 * <p>Clase Java para FacturaRectificativaImporteType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaRectificativaImporteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}ClaveCodigoFacturaRectificativaEnum"/>
 *         &lt;element name="Tipo" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}ClaveTipoRectificativaEnum"/>
 *         &lt;element name="ImporteRectificacionSustitutiva" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}ImporteRectificacionSustitutivaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaRectificativaImporteType", propOrder = {
    "codigo",
    "tipo",
    "importeRectificacionSustitutiva"
})
public class FacturaRectificativaImporteType {

    @XmlElement(name = "Codigo", required = true)
    @XmlSchemaType(name = "string")
    protected ClaveCodigoFacturaRectificativaEnum codigo;
    @XmlElement(name = "Tipo", required = true)
    @XmlSchemaType(name = "string")
    protected ClaveTipoRectificativaEnum tipo;
    @XmlElement(name = "ImporteRectificacionSustitutiva")
    protected ImporteRectificacionSustitutivaType importeRectificacionSustitutiva;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link ClaveCodigoFacturaRectificativaEnum }
     *     
     */
    public ClaveCodigoFacturaRectificativaEnum getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveCodigoFacturaRectificativaEnum }
     *     
     */
    public void setCodigo(ClaveCodigoFacturaRectificativaEnum value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link ClaveTipoRectificativaEnum }
     *     
     */
    public ClaveTipoRectificativaEnum getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveTipoRectificativaEnum }
     *     
     */
    public void setTipo(ClaveTipoRectificativaEnum value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad importeRectificacionSustitutiva.
     * 
     * @return
     *     possible object is
     *     {@link ImporteRectificacionSustitutivaType }
     *     
     */
    public ImporteRectificacionSustitutivaType getImporteRectificacionSustitutiva() {
        return importeRectificacionSustitutiva;
    }

    /**
     * Define el valor de la propiedad importeRectificacionSustitutiva.
     * 
     * @param value
     *     allowed object is
     *     {@link ImporteRectificacionSustitutivaType }
     *     
     */
    public void setImporteRectificacionSustitutiva(ImporteRectificacionSustitutivaType value) {
        this.importeRectificacionSustitutiva = value;
    }

}
