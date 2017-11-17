
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0128VCustomerRelationshipListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0128VCustomerRelationshipListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRelationshipEffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRelationshipExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRelationshipRelComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRelationshipTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupAccounts" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0128VOutGroupAccountsItem" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0128VOutGrpItem" minOccurs="0"/>
 *         &lt;element name="OutGrpAccountsAllowed" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0128VOutGrpAccountsAllowedItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0128VOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpRelAllowed" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0128VOutGrpRelAllowedItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0128VCustomerRelationshipListExport", propOrder = {
    "outAListSetDescription",
    "outBListSetDescription",
    "outCurrPrintLineDate",
    "outCurrPrintLineTime",
    "outRelationshipEffectiveFrom",
    "outRelationshipExpiryDate",
    "outRelationshipRelComments",
    "outRelationshipTmstamp",
    "outGroupAccounts",
    "outGrp",
    "outGrpAccountsAllowed",
    "outGrpLog",
    "outGrpRelAllowed"
})
public class I0128VCustomerRelationshipListExport
    extends BaseExport
{

    @XmlElement(name = "OutAListSetDescription")
    protected String outAListSetDescription;
    @XmlElement(name = "OutBListSetDescription")
    protected String outBListSetDescription;
    @XmlElement(name = "OutCurrPrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrPrintLineDate;
    @XmlElement(name = "OutCurrPrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrPrintLineTime;
    @XmlElement(name = "OutRelationshipEffectiveFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRelationshipEffectiveFrom;
    @XmlElement(name = "OutRelationshipExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRelationshipExpiryDate;
    @XmlElement(name = "OutRelationshipRelComments")
    protected String outRelationshipRelComments;
    @XmlElement(name = "OutRelationshipTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRelationshipTmstamp;
    @XmlElement(name = "OutGroupAccounts")
    protected ArrayOfI0128VOutGroupAccountsItem outGroupAccounts;
    @XmlElement(name = "OutGrp")
    protected ArrayOfI0128VOutGrpItem outGrp;
    @XmlElement(name = "OutGrpAccountsAllowed")
    protected ArrayOfI0128VOutGrpAccountsAllowedItem outGrpAccountsAllowed;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfI0128VOutGrpLogItem outGrpLog;
    @XmlElement(name = "OutGrpRelAllowed")
    protected ArrayOfI0128VOutGrpRelAllowedItem outGrpRelAllowed;

    /**
     * Gets the value of the outAListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAListSetDescription() {
        return outAListSetDescription;
    }

    /**
     * Sets the value of the outAListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAListSetDescription(String value) {
        this.outAListSetDescription = value;
    }

    /**
     * Gets the value of the outBListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBListSetDescription() {
        return outBListSetDescription;
    }

    /**
     * Sets the value of the outBListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBListSetDescription(String value) {
        this.outBListSetDescription = value;
    }

    /**
     * Gets the value of the outCurrPrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrPrintLineDate() {
        return outCurrPrintLineDate;
    }

    /**
     * Sets the value of the outCurrPrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrPrintLineDate(XMLGregorianCalendar value) {
        this.outCurrPrintLineDate = value;
    }

    /**
     * Gets the value of the outCurrPrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrPrintLineTime() {
        return outCurrPrintLineTime;
    }

    /**
     * Sets the value of the outCurrPrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrPrintLineTime(XMLGregorianCalendar value) {
        this.outCurrPrintLineTime = value;
    }

    /**
     * Gets the value of the outRelationshipEffectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRelationshipEffectiveFrom() {
        return outRelationshipEffectiveFrom;
    }

    /**
     * Sets the value of the outRelationshipEffectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRelationshipEffectiveFrom(XMLGregorianCalendar value) {
        this.outRelationshipEffectiveFrom = value;
    }

    /**
     * Gets the value of the outRelationshipExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRelationshipExpiryDate() {
        return outRelationshipExpiryDate;
    }

    /**
     * Sets the value of the outRelationshipExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRelationshipExpiryDate(XMLGregorianCalendar value) {
        this.outRelationshipExpiryDate = value;
    }

    /**
     * Gets the value of the outRelationshipRelComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRelationshipRelComments() {
        return outRelationshipRelComments;
    }

    /**
     * Sets the value of the outRelationshipRelComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRelationshipRelComments(String value) {
        this.outRelationshipRelComments = value;
    }

    /**
     * Gets the value of the outRelationshipTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRelationshipTmstamp() {
        return outRelationshipTmstamp;
    }

    /**
     * Sets the value of the outRelationshipTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRelationshipTmstamp(XMLGregorianCalendar value) {
        this.outRelationshipTmstamp = value;
    }

    /**
     * Gets the value of the outGroupAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0128VOutGroupAccountsItem }
     *     
     */
    public ArrayOfI0128VOutGroupAccountsItem getOutGroupAccounts() {
        return outGroupAccounts;
    }

    /**
     * Sets the value of the outGroupAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0128VOutGroupAccountsItem }
     *     
     */
    public void setOutGroupAccounts(ArrayOfI0128VOutGroupAccountsItem value) {
        this.outGroupAccounts = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0128VOutGrpItem }
     *     
     */
    public ArrayOfI0128VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0128VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfI0128VOutGrpItem value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outGrpAccountsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0128VOutGrpAccountsAllowedItem }
     *     
     */
    public ArrayOfI0128VOutGrpAccountsAllowedItem getOutGrpAccountsAllowed() {
        return outGrpAccountsAllowed;
    }

    /**
     * Sets the value of the outGrpAccountsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0128VOutGrpAccountsAllowedItem }
     *     
     */
    public void setOutGrpAccountsAllowed(ArrayOfI0128VOutGrpAccountsAllowedItem value) {
        this.outGrpAccountsAllowed = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0128VOutGrpLogItem }
     *     
     */
    public ArrayOfI0128VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0128VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfI0128VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outGrpRelAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0128VOutGrpRelAllowedItem }
     *     
     */
    public ArrayOfI0128VOutGrpRelAllowedItem getOutGrpRelAllowed() {
        return outGrpRelAllowed;
    }

    /**
     * Sets the value of the outGrpRelAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0128VOutGrpRelAllowedItem }
     *     
     */
    public void setOutGrpRelAllowed(ArrayOfI0128VOutGrpRelAllowedItem value) {
        this.outGrpRelAllowed = value;
    }

}
