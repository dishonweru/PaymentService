
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VOutGrpErrorItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VOutGrpErrorItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpErrorOutGrmErrorFailureDetailsComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpErrorOutGrmErrorPfgSetupDetailTagLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VOutGrpErrorItem", propOrder = {
    "outGrpErrorOutGrmErrorFailureDetailsComment",
    "outGrpErrorOutGrmErrorPfgSetupDetailTagLabel"
})
public class PFG004VOutGrpErrorItem {

    @XmlElement(name = "OutGrpErrorOutGrmErrorFailureDetailsComment")
    protected String outGrpErrorOutGrmErrorFailureDetailsComment;
    @XmlElement(name = "OutGrpErrorOutGrmErrorPfgSetupDetailTagLabel")
    protected String outGrpErrorOutGrmErrorPfgSetupDetailTagLabel;

    /**
     * Gets the value of the outGrpErrorOutGrmErrorFailureDetailsComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpErrorOutGrmErrorFailureDetailsComment() {
        return outGrpErrorOutGrmErrorFailureDetailsComment;
    }

    /**
     * Sets the value of the outGrpErrorOutGrmErrorFailureDetailsComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpErrorOutGrmErrorFailureDetailsComment(String value) {
        this.outGrpErrorOutGrmErrorFailureDetailsComment = value;
    }

    /**
     * Gets the value of the outGrpErrorOutGrmErrorPfgSetupDetailTagLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpErrorOutGrmErrorPfgSetupDetailTagLabel() {
        return outGrpErrorOutGrmErrorPfgSetupDetailTagLabel;
    }

    /**
     * Sets the value of the outGrpErrorOutGrmErrorPfgSetupDetailTagLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpErrorOutGrmErrorPfgSetupDetailTagLabel(String value) {
        this.outGrpErrorOutGrmErrorPfgSetupDetailTagLabel = value;
    }

}
