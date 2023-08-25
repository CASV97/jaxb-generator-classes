//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.25 a las 03:01:04 PM CEST 
//


package com.christan.javaclassesgenerator.bizkaia.modelo140.batuz_enumerados;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CountryMiembroType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryMiembroType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="CZ"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="SE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryMiembroType", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum CountryMiembroType {

    DE,
    AT,
    BE,
    BG,
    CZ,
    CY,
    HR,
    DK,
    SK,
    SI,
    ES,
    EE,
    FI,
    FR,
    GR,
    HU,
    IE,
    IT,
    LV,
    LT,
    LU,
    MT,
    NL,
    PL,
    PT,
    GB,
    RO,
    SE;

    public String value() {
        return name();
    }

    public static CountryMiembroType fromValue(String v) {
        return valueOf(v);
    }

}
