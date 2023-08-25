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
 * <p>Clase Java para TipoBienEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoBienEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoBienEnum", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum TipoBienEnum {


    /**
     * Local
     * 
     */
    A,

    /**
     * Otros inmuebles
     * 
     */
    B,

    /**
     * Medios de transporte
     * 
     */
    C,

    /**
     * Tel�fono fijo
     * 
     */
    D,

    /**
     * Tel�fono m�vil
     * 
     */
    E,

    /**
     * Mobiliario
     * 
     */
    G,

    /**
     * Maquinaria
     * 
     */
    H,

    /**
     * Equipo inform�tico
     * 
     */
    I,

    /**
     * Instalaciones
     * 
     */
    J,

    /**
     * Inmovilizaciones intangibles
     * 
     */
    K,

    /**
     * Otros inmovilizados materiales
     * 
     */
    L,

    /**
     * Inmovilizaciones materiales en curso
     * 
     */
    M,

    /**
     * Solar
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static TipoBienEnum fromValue(String v) {
        return valueOf(v);
    }

}
