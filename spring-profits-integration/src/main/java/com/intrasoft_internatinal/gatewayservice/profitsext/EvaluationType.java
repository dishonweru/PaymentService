
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EvaluationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EvaluationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Exception"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EvaluationType")
@XmlEnum
public enum EvaluationType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception");
    private final String value;

    EvaluationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EvaluationType fromValue(String v) {
        for (EvaluationType c: EvaluationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
