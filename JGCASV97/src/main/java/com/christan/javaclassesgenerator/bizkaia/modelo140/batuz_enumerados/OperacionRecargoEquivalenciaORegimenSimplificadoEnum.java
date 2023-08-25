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
 * <p>Clase Java para OperacionRecargoEquivalenciaORegimenSimplificadoEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OperacionRecargoEquivalenciaORegimenSimplificadoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperacionRecargoEquivalenciaORegimenSimplificadoEnum", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum OperacionRecargoEquivalenciaORegimenSimplificadoEnum {


    /**
     * Operaci�n en recargo de equivalencia
     * 
     */
    E,

    /**
     * Operaci�n en r�gimen simplificado
     * 
     */
    S,

    /**
     * Operaci�n que no est� ni en recargo de equivalencia ni en r�gimen simplificado
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static OperacionRecargoEquivalenciaORegimenSimplificadoEnum fromValue(String v) {
        return valueOf(v);
    }

}
