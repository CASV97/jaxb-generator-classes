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
 * <p>Clase Java para ClaveCodigoFacturaRectificativaEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaveCodigoFacturaRectificativaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="R1"/>
 *     &lt;enumeration value="R2"/>
 *     &lt;enumeration value="R3"/>
 *     &lt;enumeration value="R4"/>
 *     &lt;enumeration value="R5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaveCodigoFacturaRectificativaEnum", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum ClaveCodigoFacturaRectificativaEnum {


    /**
     * Factura rectificativa: error fundado en derecho y Art. 80 Uno, Dos y Seis de la Norma Foral del IVA
     * 
     */
    @XmlEnumValue("R1")
    R_1("R1"),

    /**
     * Factura rectificativa: art�culo 80 Tres de la Norma Foral del IVA
     * 
     */
    @XmlEnumValue("R2")
    R_2("R2"),

    /**
     * Factura rectificativa: art�culo 80 Cuatro de la Norma Foral del IVA
     * 
     */
    @XmlEnumValue("R3")
    R_3("R3"),

    /**
     * Factura rectificativa: Resto
     * 
     */
    @XmlEnumValue("R4")
    R_4("R4"),

    /**
     * Factura rectificativa en facturas simplificadas
     * 
     */
    @XmlEnumValue("R5")
    R_5("R5");
    private final String value;

    ClaveCodigoFacturaRectificativaEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaveCodigoFacturaRectificativaEnum fromValue(String v) {
        for (ClaveCodigoFacturaRectificativaEnum c: ClaveCodigoFacturaRectificativaEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
