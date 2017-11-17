
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T1477VOutGrpVoucherItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1477VOutGrpVoucherItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1477VOutGrpVoucherItem", propOrder = {
    "outGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn",
    "outGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine"
})
public class T1477VOutGrpVoucherItem {

    @XmlElement(name = "OutGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn")
    protected short outGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn;
    @XmlElement(name = "OutGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine")
    protected String outGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine;

    /**
     * Gets the value of the outGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn property.
     * 
     */
    public short getOutGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn() {
        return outGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn;
    }

    /**
     * Sets the value of the outGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn property.
     * 
     */
    public void setOutGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn(short value) {
        this.outGrpVoucherOutGrmVoucherDcdVoucherRunInternalSn = value;
    }

    /**
     * Gets the value of the outGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine() {
        return outGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine(String value) {
        this.outGrpVoucherOutGrmVoucherDcdVoucherRunVoucherLine = value;
    }

}
