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

import com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados.ClaveDeclaranteEnum;


/**
 * <p>Clase Java para VentaBienEnConsignaPJType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VentaBienEnConsignaPJType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaveDeclarante" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}ClaveDeclaranteEnum"/>
 *         &lt;element name="IdRegistroDeclarado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}IDRegistroDeclaradoType"/>
 *         &lt;element name="TipoOperacion" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd}TipoOperacionVentasEnConsignaEnum"/>
 *         &lt;element name="Declarado" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DeclaradoIntracomunitarioType" minOccurs="0"/>
 *         &lt;element name="SustitutoDestinatarioInicial" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DeclaradoIntracomunitarioType" minOccurs="0"/>
 *         &lt;element name="Deposito" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}DepositoPJType" minOccurs="0"/>
 *         &lt;element name="OperacionIntracomunitaria" type="{https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_TiposComplejos.xsd}OperacionIntracomunitariaPJType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VentaBienEnConsignaPJType", propOrder = {
    "claveDeclarante",
    "idRegistroDeclarado",
    "tipoOperacion",
    "declarado",
    "sustitutoDestinatarioInicial",
    "deposito",
    "operacionIntracomunitaria"
})
public class VentaBienEnConsignaPJType {

    @XmlElement(name = "ClaveDeclarante", required = true)
    @XmlSchemaType(name = "string")
    protected ClaveDeclaranteEnum claveDeclarante;
    @XmlElement(name = "IdRegistroDeclarado", required = true)
    protected IDRegistroDeclaradoType idRegistroDeclarado;
    @XmlElement(name = "TipoOperacion", required = true)
    protected String tipoOperacion;
    @XmlElement(name = "Declarado")
    protected DeclaradoIntracomunitarioType declarado;
    @XmlElement(name = "SustitutoDestinatarioInicial")
    protected DeclaradoIntracomunitarioType sustitutoDestinatarioInicial;
    @XmlElement(name = "Deposito")
    protected DepositoPJType deposito;
    @XmlElement(name = "OperacionIntracomunitaria", required = true)
    protected OperacionIntracomunitariaPJType operacionIntracomunitaria;

    /**
     * Obtiene el valor de la propiedad claveDeclarante.
     * 
     * @return
     *     possible object is
     *     {@link ClaveDeclaranteEnum }
     *     
     */
    public ClaveDeclaranteEnum getClaveDeclarante() {
        return claveDeclarante;
    }

    /**
     * Define el valor de la propiedad claveDeclarante.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveDeclaranteEnum }
     *     
     */
    public void setClaveDeclarante(ClaveDeclaranteEnum value) {
        this.claveDeclarante = value;
    }

    /**
     * Obtiene el valor de la propiedad idRegistroDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link IDRegistroDeclaradoType }
     *     
     */
    public IDRegistroDeclaradoType getIdRegistroDeclarado() {
        return idRegistroDeclarado;
    }

    /**
     * Define el valor de la propiedad idRegistroDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRegistroDeclaradoType }
     *     
     */
    public void setIdRegistroDeclarado(IDRegistroDeclaradoType value) {
        this.idRegistroDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad declarado.
     * 
     * @return
     *     possible object is
     *     {@link DeclaradoIntracomunitarioType }
     *     
     */
    public DeclaradoIntracomunitarioType getDeclarado() {
        return declarado;
    }

    /**
     * Define el valor de la propiedad declarado.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaradoIntracomunitarioType }
     *     
     */
    public void setDeclarado(DeclaradoIntracomunitarioType value) {
        this.declarado = value;
    }

    /**
     * Obtiene el valor de la propiedad sustitutoDestinatarioInicial.
     * 
     * @return
     *     possible object is
     *     {@link DeclaradoIntracomunitarioType }
     *     
     */
    public DeclaradoIntracomunitarioType getSustitutoDestinatarioInicial() {
        return sustitutoDestinatarioInicial;
    }

    /**
     * Define el valor de la propiedad sustitutoDestinatarioInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaradoIntracomunitarioType }
     *     
     */
    public void setSustitutoDestinatarioInicial(DeclaradoIntracomunitarioType value) {
        this.sustitutoDestinatarioInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad deposito.
     * 
     * @return
     *     possible object is
     *     {@link DepositoPJType }
     *     
     */
    public DepositoPJType getDeposito() {
        return deposito;
    }

    /**
     * Define el valor de la propiedad deposito.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositoPJType }
     *     
     */
    public void setDeposito(DepositoPJType value) {
        this.deposito = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionIntracomunitaria.
     * 
     * @return
     *     possible object is
     *     {@link OperacionIntracomunitariaPJType }
     *     
     */
    public OperacionIntracomunitariaPJType getOperacionIntracomunitaria() {
        return operacionIntracomunitaria;
    }

    /**
     * Define el valor de la propiedad operacionIntracomunitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionIntracomunitariaPJType }
     *     
     */
    public void setOperacionIntracomunitaria(OperacionIntracomunitariaPJType value) {
        this.operacionIntracomunitaria = value;
    }

}
