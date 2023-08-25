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
 * <p>Clase Java para TipoOperacionIntracomunitariaEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoOperacionIntracomunitariaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoOperacionIntracomunitariaEnum", namespace = "https://www.batuz.eus/fitxategiak/batuz/LROE/esquemas/batuz_Enumerados.xsd")
@XmlEnum
public enum TipoOperacionIntracomunitariaEnum {


    /**
     * Env�o o recepci�n de bienes para la realizaci�n de los informes periciales o trabajos mencionados en el art�culo 70 Uno 7.� b) de la Norma Foral del IVA
     * 
     */
    A,

    /**
     * Transferencias de bienes y adquisiciones intracomunitarias de bienes (art�culo 9.3 y 16. 2 de la Norma Foral del IVA) incluidas, en ambos casos, las contempladas en las excepciones correspondientes a las letras e), f) y g) del art�culo 9.3 de la Norma Foral del IVA
     * 
     */
    B;

    public String value() {
        return name();
    }

    public static TipoOperacionIntracomunitariaEnum fromValue(String v) {
        return valueOf(v);
    }

}
