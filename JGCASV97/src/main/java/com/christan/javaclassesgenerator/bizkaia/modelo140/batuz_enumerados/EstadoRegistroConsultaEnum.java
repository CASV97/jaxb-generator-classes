//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.25 a las 03:01:04 PM CEST 
//


package com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoRegistroConsultaEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoRegistroConsultaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Correcto"/>
 *     &lt;enumeration value="AceptadoConErrores"/>
 *     &lt;enumeration value="Anulado"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstadoRegistroConsultaEnum", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum EstadoRegistroConsultaEnum {


    /**
     * Correcto
     * 
     */
    @XmlEnumValue("Correcto")
    CORRECTO("Correcto"),

    /**
     * Aceptado con errores
     * 
     */
    @XmlEnumValue("AceptadoConErrores")
    ACEPTADO_CON_ERRORES("AceptadoConErrores"),

    /**
     * Anulado
     * 
     */
    @XmlEnumValue("Anulado")
    ANULADO("Anulado");
    private final String value;

    EstadoRegistroConsultaEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoRegistroConsultaEnum fromValue(String v) {
        for (EstadoRegistroConsultaEnum c: EstadoRegistroConsultaEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
