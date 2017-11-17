
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpBeneficiary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpBeneficiary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpBeneficiaryOutGrmAgreementBenefBenefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpBeneficiaryOutGrmAgreementBenefTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpBeneficiaryOutGrmBenefCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpBeneficiaryOutGrmBenefCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpBeneficiaryOutGrmBenefListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpBeneficiary", propOrder = {
    "outGrpBeneficiaryOutGrmAgreementBenefBenefStatus",
    "outGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg",
    "outGrpBeneficiaryOutGrmAgreementBenefTmstamp",
    "outGrpBeneficiaryOutGrmBenefCustomerCDigit",
    "outGrpBeneficiaryOutGrmBenefCustomerCustId",
    "outGrpBeneficiaryOutGrmBenefListSetDescription"
})
public class OutGrpBeneficiary {

    @XmlElement(name = "OutGrpBeneficiaryOutGrmAgreementBenefBenefStatus")
    protected String outGrpBeneficiaryOutGrmAgreementBenefBenefStatus;
    @XmlElement(name = "OutGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg")
    protected String outGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg;
    @XmlElement(name = "OutGrpBeneficiaryOutGrmAgreementBenefTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpBeneficiaryOutGrmAgreementBenefTmstamp;
    @XmlElement(name = "OutGrpBeneficiaryOutGrmBenefCustomerCDigit")
    protected short outGrpBeneficiaryOutGrmBenefCustomerCDigit;
    @XmlElement(name = "OutGrpBeneficiaryOutGrmBenefCustomerCustId")
    protected int outGrpBeneficiaryOutGrmBenefCustomerCustId;
    @XmlElement(name = "OutGrpBeneficiaryOutGrmBenefListSetDescription")
    protected String outGrpBeneficiaryOutGrmBenefListSetDescription;

    /**
     * Gets the value of the outGrpBeneficiaryOutGrmAgreementBenefBenefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBeneficiaryOutGrmAgreementBenefBenefStatus() {
        return outGrpBeneficiaryOutGrmAgreementBenefBenefStatus;
    }

    /**
     * Sets the value of the outGrpBeneficiaryOutGrmAgreementBenefBenefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBeneficiaryOutGrmAgreementBenefBenefStatus(String value) {
        this.outGrpBeneficiaryOutGrmAgreementBenefBenefStatus = value;
    }

    /**
     * Gets the value of the outGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg() {
        return outGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg;
    }

    /**
     * Sets the value of the outGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg(String value) {
        this.outGrpBeneficiaryOutGrmAgreementBenefMainBenefFlg = value;
    }

    /**
     * Gets the value of the outGrpBeneficiaryOutGrmAgreementBenefTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpBeneficiaryOutGrmAgreementBenefTmstamp() {
        return outGrpBeneficiaryOutGrmAgreementBenefTmstamp;
    }

    /**
     * Sets the value of the outGrpBeneficiaryOutGrmAgreementBenefTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpBeneficiaryOutGrmAgreementBenefTmstamp(XMLGregorianCalendar value) {
        this.outGrpBeneficiaryOutGrmAgreementBenefTmstamp = value;
    }

    /**
     * Gets the value of the outGrpBeneficiaryOutGrmBenefCustomerCDigit property.
     * 
     */
    public short getOutGrpBeneficiaryOutGrmBenefCustomerCDigit() {
        return outGrpBeneficiaryOutGrmBenefCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpBeneficiaryOutGrmBenefCustomerCDigit property.
     * 
     */
    public void setOutGrpBeneficiaryOutGrmBenefCustomerCDigit(short value) {
        this.outGrpBeneficiaryOutGrmBenefCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpBeneficiaryOutGrmBenefCustomerCustId property.
     * 
     */
    public int getOutGrpBeneficiaryOutGrmBenefCustomerCustId() {
        return outGrpBeneficiaryOutGrmBenefCustomerCustId;
    }

    /**
     * Sets the value of the outGrpBeneficiaryOutGrmBenefCustomerCustId property.
     * 
     */
    public void setOutGrpBeneficiaryOutGrmBenefCustomerCustId(int value) {
        this.outGrpBeneficiaryOutGrmBenefCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpBeneficiaryOutGrmBenefListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpBeneficiaryOutGrmBenefListSetDescription() {
        return outGrpBeneficiaryOutGrmBenefListSetDescription;
    }

    /**
     * Sets the value of the outGrpBeneficiaryOutGrmBenefListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpBeneficiaryOutGrmBenefListSetDescription(String value) {
        this.outGrpBeneficiaryOutGrmBenefListSetDescription = value;
    }

}
