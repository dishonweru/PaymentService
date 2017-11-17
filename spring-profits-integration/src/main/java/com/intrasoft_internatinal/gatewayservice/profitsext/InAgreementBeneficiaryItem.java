
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InAgreementBeneficiaryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InAgreementBeneficiaryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InListGrpInListCustomerGrmListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmAgreementBenefBenefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmAgreementBenefMainBenefFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmAgreementBenefRemovalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrpInListGrmAgreementBenefTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrpInListGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InListGrpInListGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInListGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InAgreementBeneficiaryItem", propOrder = {
    "inListGrpInListCustomerGrmListSetDescription",
    "inListGrpInListGrmAgreementBenefBenefStatus",
    "inListGrpInListGrmAgreementBenefMainBenefFlg",
    "inListGrpInListGrmAgreementBenefRemovalDt",
    "inListGrpInListGrmAgreementBenefTmstamp",
    "inListGrpInListGrmCustomerCustId",
    "inListGrpInListGrmIefSuppliedFlag",
    "inListGrpInListGrmIefSuppliedSelectChar"
})
public class InAgreementBeneficiaryItem {

    @XmlElement(name = "InListGrpInListCustomerGrmListSetDescription")
    protected String inListGrpInListCustomerGrmListSetDescription;
    @XmlElement(name = "InListGrpInListGrmAgreementBenefBenefStatus")
    protected String inListGrpInListGrmAgreementBenefBenefStatus;
    @XmlElement(name = "InListGrpInListGrmAgreementBenefMainBenefFlg")
    protected String inListGrpInListGrmAgreementBenefMainBenefFlg;
    @XmlElement(name = "InListGrpInListGrmAgreementBenefRemovalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrpInListGrmAgreementBenefRemovalDt;
    @XmlElement(name = "InListGrpInListGrmAgreementBenefTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrpInListGrmAgreementBenefTmstamp;
    @XmlElement(name = "InListGrpInListGrmCustomerCustId")
    protected int inListGrpInListGrmCustomerCustId;
    @XmlElement(name = "InListGrpInListGrmIefSuppliedFlag")
    protected String inListGrpInListGrmIefSuppliedFlag;
    @XmlElement(name = "InListGrpInListGrmIefSuppliedSelectChar")
    protected String inListGrpInListGrmIefSuppliedSelectChar;

    /**
     * Gets the value of the inListGrpInListCustomerGrmListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListCustomerGrmListSetDescription() {
        return inListGrpInListCustomerGrmListSetDescription;
    }

    /**
     * Sets the value of the inListGrpInListCustomerGrmListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListCustomerGrmListSetDescription(String value) {
        this.inListGrpInListCustomerGrmListSetDescription = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmAgreementBenefBenefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmAgreementBenefBenefStatus() {
        return inListGrpInListGrmAgreementBenefBenefStatus;
    }

    /**
     * Sets the value of the inListGrpInListGrmAgreementBenefBenefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmAgreementBenefBenefStatus(String value) {
        this.inListGrpInListGrmAgreementBenefBenefStatus = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmAgreementBenefMainBenefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmAgreementBenefMainBenefFlg() {
        return inListGrpInListGrmAgreementBenefMainBenefFlg;
    }

    /**
     * Sets the value of the inListGrpInListGrmAgreementBenefMainBenefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmAgreementBenefMainBenefFlg(String value) {
        this.inListGrpInListGrmAgreementBenefMainBenefFlg = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmAgreementBenefRemovalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrpInListGrmAgreementBenefRemovalDt() {
        return inListGrpInListGrmAgreementBenefRemovalDt;
    }

    /**
     * Sets the value of the inListGrpInListGrmAgreementBenefRemovalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrpInListGrmAgreementBenefRemovalDt(XMLGregorianCalendar value) {
        this.inListGrpInListGrmAgreementBenefRemovalDt = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmAgreementBenefTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrpInListGrmAgreementBenefTmstamp() {
        return inListGrpInListGrmAgreementBenefTmstamp;
    }

    /**
     * Sets the value of the inListGrpInListGrmAgreementBenefTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrpInListGrmAgreementBenefTmstamp(XMLGregorianCalendar value) {
        this.inListGrpInListGrmAgreementBenefTmstamp = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmCustomerCustId property.
     * 
     */
    public int getInListGrpInListGrmCustomerCustId() {
        return inListGrpInListGrmCustomerCustId;
    }

    /**
     * Sets the value of the inListGrpInListGrmCustomerCustId property.
     * 
     */
    public void setInListGrpInListGrmCustomerCustId(int value) {
        this.inListGrpInListGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmIefSuppliedFlag() {
        return inListGrpInListGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the inListGrpInListGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmIefSuppliedFlag(String value) {
        this.inListGrpInListGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inListGrpInListGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInListGrmIefSuppliedSelectChar() {
        return inListGrpInListGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inListGrpInListGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInListGrmIefSuppliedSelectChar(String value) {
        this.inListGrpInListGrmIefSuppliedSelectChar = value;
    }

}
