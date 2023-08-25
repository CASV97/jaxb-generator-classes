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
 * <p>Clase Java para TipoOperacionSujetaNoExentaEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoOperacionSujetaNoExentaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S1"/>
 *     &lt;enumeration value="S2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoOperacionSujetaNoExentaEnum", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum TipoOperacionSujetaNoExentaEnum {


    /**
     * Sin inversi�n del sujeto pasivo
     * 
     */
    @XmlEnumValue("S1")
    S_1("S1"),

    /**
     * Con inversi�n del sujeto pasivo
     * 
     */
    @XmlEnumValue("S2")
    S_2("S2");
    private final String value;

    TipoOperacionSujetaNoExentaEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoOperacionSujetaNoExentaEnum fromValue(String v) {
        for (TipoOperacionSujetaNoExentaEnum c: TipoOperacionSujetaNoExentaEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
