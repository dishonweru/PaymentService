
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTF099VOutGrpErrorMsgDatafieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTF099VOutGrpErrorMsgDatafieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTF099VOutGrpErrorMsgDatafieldsItem", propOrder = {
    "outGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100",
    "outGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar",
    "outGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1"
})
public class DTF099VOutGrpErrorMsgDatafieldsItem {

    @XmlElement(name = "OutGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100")
    protected String outGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100;
    @XmlElement(name = "OutGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar")
    protected String outGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1")
    protected String outGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1;

    /**
     * Gets the value of the outGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100() {
        return outGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100;
    }

    /**
     * Sets the value of the outGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100(String value) {
        this.outGrpErrorMsgDatafieldsOutGrmErrorDescriptionIefSuppliedChar100 = value;
    }

    /**
     * Gets the value of the outGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar() {
        return outGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar(String value) {
        this.outGrpErrorMsgDatafieldsOutGrmErrorMsgDatafieldsIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1() {
        return outGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1;
    }

    /**
     * Sets the value of the outGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1(String value) {
        this.outGrpErrorMsgDatafieldsOutGrmIsSuccessfulIefSuppliedChar1 = value;
    }

}
