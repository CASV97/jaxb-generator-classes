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
 * <p>Clase Java para CausaExencionEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CausaExencionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E1"/>
 *     &lt;enumeration value="E2"/>
 *     &lt;enumeration value="E3"/>
 *     &lt;enumeration value="E4"/>
 *     &lt;enumeration value="E5"/>
 *     &lt;enumeration value="E6"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CausaExencionEnum", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum CausaExencionEnum {


    /**
     * Exenta por el art�culo 20 de la Norma Foral del IVA
     * 
     */
    @XmlEnumValue("E1")
    E_1("E1"),

    /**
     * Exenta por el art�culo 21 de la Norma Foral del IVA
     * 
     */
    @XmlEnumValue("E2")
    E_2("E2"),

    /**
     * Exenta por el art�culo 22 de la Norma Foral del IVA
     * 
     */
    @XmlEnumValue("E3")
    E_3("E3"),

    /**
     * Exenta por el art�culo 23 y 24 de la Norma Foral del IVA
     * 
     */
    @XmlEnumValue("E4")
    E_4("E4"),

    /**
     * Exenta por el art�culo 25 de la Norma Foral del IVA
     * 
     */
    @XmlEnumValue("E5")
    E_5("E5"),

    /**
     * Exenta por otra causa
     * 
     */
    @XmlEnumValue("E6")
    E_6("E6");
    private final String value;

    CausaExencionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CausaExencionEnum fromValue(String v) {
        for (CausaExencionEnum c: CausaExencionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
