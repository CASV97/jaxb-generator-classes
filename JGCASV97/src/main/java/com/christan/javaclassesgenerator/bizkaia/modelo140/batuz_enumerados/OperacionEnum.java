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
 * <p>Clase Java para OperacionEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OperacionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A00"/>
 *     &lt;enumeration value="A01"/>
 *     &lt;enumeration value="M00"/>
 *     &lt;enumeration value="M01"/>
 *     &lt;enumeration value="AN0"/>
 *     &lt;enumeration value="C00"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperacionEnum", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum OperacionEnum {


    /**
     * ALTA
     * 
     */
    @XmlEnumValue("A00")
    A_00("A00"),

    /**
     * ALTA DEVOLUCI�N EN R�GIMEN DE VIAJEROS
     * 
     */
    @XmlEnumValue("A01")
    A_01("A01"),

    /**
     * MODIFICACI�N
     * 
     */
    @XmlEnumValue("M00")
    M_00("M00"),

    /**
     * MODIFICACI�N DEVOLUCI�N EN R�GIMEN DE VIAJEROS
     * 
     */
    @XmlEnumValue("M01")
    M_01("M01"),

    /**
     * ANULACI�N
     * 
     */
    @XmlEnumValue("AN0")
    AN_0("AN0"),

    /**
     * CONSULTA
     * 
     */
    @XmlEnumValue("C00")
    C_00("C00");
    private final String value;

    OperacionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperacionEnum fromValue(String v) {
        for (OperacionEnum c: OperacionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
