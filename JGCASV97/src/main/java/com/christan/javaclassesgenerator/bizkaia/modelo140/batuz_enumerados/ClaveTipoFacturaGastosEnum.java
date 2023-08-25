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
 * <p>Clase Java para ClaveTipoFacturaGastosEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaveTipoFacturaGastosEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F1"/>
 *     &lt;enumeration value="F2"/>
 *     &lt;enumeration value="F3"/>
 *     &lt;enumeration value="F4"/>
 *     &lt;enumeration value="F5"/>
 *     &lt;enumeration value="F6"/>
 *     &lt;enumeration value="LC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaveTipoFacturaGastosEnum", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum ClaveTipoFacturaGastosEnum {


    /**
     * Factura con identificaci�n del destinatario o de la destinataria
     * 
     */
    @XmlEnumValue("F1")
    F_1("F1"),

    /**
     * Factura sin identificaci�n del destinatario o de la destinataria
     * 
     */
    @XmlEnumValue("F2")
    F_2("F2"),

    /**
     * Factura emitida en sustituci�n de facturas simplificadas y declaradas con anterioridad
     * 
     */
    @XmlEnumValue("F3")
    F_3("F3"),

    /**
     * Asiento resumen de facturas
     * 
     */
    @XmlEnumValue("F4")
    F_4("F4"),

    /**
     * Importaciones con DUA
     * 
     */
    @XmlEnumValue("F5")
    F_5("F5"),

    /**
     * Otros justificantes
     * 
     */
    @XmlEnumValue("F6")
    F_6("F6"),

    /**
     * Aduanas-Liquidaci�n complementaria
     * 
     */
    LC("LC");
    private final String value;

    ClaveTipoFacturaGastosEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaveTipoFacturaGastosEnum fromValue(String v) {
        for (ClaveTipoFacturaGastosEnum c: ClaveTipoFacturaGastosEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
