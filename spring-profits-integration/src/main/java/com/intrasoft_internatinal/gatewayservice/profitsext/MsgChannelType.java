
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MsgChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="Email"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MsgChannelType")
@XmlEnum
public enum MsgChannelType {

    SMS("SMS"),
    @XmlEnumValue("Email")
    EMAIL("Email");
    private final String value;

    MsgChannelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MsgChannelType fromValue(String v) {
        for (MsgChannelType c: MsgChannelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
