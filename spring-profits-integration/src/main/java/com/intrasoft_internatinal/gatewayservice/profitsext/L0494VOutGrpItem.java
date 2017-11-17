
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0494VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0494VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrpLstLnsMediatorAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrpLstLnsMediatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpSelectCharIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0494VOutGrpItem", propOrder = {
    "outGrpOutGrpLstLnsMediatorAgreementNo",
    "outGrpOutGrpLstLnsMediatorName",
    "outGrpOutGrpSelectCharIefSuppliedSelectChar"
})
public class L0494VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrpLstLnsMediatorAgreementNo")
    protected int outGrpOutGrpLstLnsMediatorAgreementNo;
    @XmlElement(name = "OutGrpOutGrpLstLnsMediatorName")
    protected String outGrpOutGrpLstLnsMediatorName;
    @XmlElement(name = "OutGrpOutGrpSelectCharIefSuppliedSelectChar")
    protected String outGrpOutGrpSelectCharIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpOutGrpLstLnsMediatorAgreementNo property.
     * 
     */
    public int getOutGrpOutGrpLstLnsMediatorAgreementNo() {
        return outGrpOutGrpLstLnsMediatorAgreementNo;
    }

    /**
     * Sets the value of the outGrpOutGrpLstLnsMediatorAgreementNo property.
     * 
     */
    public void setOutGrpOutGrpLstLnsMediatorAgreementNo(int value) {
        this.outGrpOutGrpLstLnsMediatorAgreementNo = value;
    }

    /**
     * Gets the value of the outGrpOutGrpLstLnsMediatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpLstLnsMediatorName() {
        return outGrpOutGrpLstLnsMediatorName;
    }

    /**
     * Sets the value of the outGrpOutGrpLstLnsMediatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpLstLnsMediatorName(String value) {
        this.outGrpOutGrpLstLnsMediatorName = value;
    }

    /**
     * Gets the value of the outGrpOutGrpSelectCharIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpSelectCharIefSuppliedSelectChar() {
        return outGrpOutGrpSelectCharIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpOutGrpSelectCharIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpSelectCharIefSuppliedSelectChar(String value) {
        this.outGrpOutGrpSelectCharIefSuppliedSelectChar = value;
    }

}
