
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SL705VOutListboxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SL705VOutListboxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutListboxOutListboxActiveInactiveCharSuppliedChar10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxAtmUserIefSuppliedText15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxBankEmployeeBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxBankEmployeeBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxBankEmployeeBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxBankEmployeeBankemployeeStaffNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxLoggedUserLoggedUserPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListboxOutListboxLoginStatusLoggedUserLoginStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxMainSecRoleCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListboxOutListboxMainSecRoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxMainUnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxPassEndLoggedUserPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListboxOutListboxSecondSecRoleCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListboxOutListboxSecondSecRoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxSecondUnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxThirdSecRoleCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListboxOutListboxThirdSecRoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxThirdUnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListboxOutListboxUserUsrAtmUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxUserUsrBatchUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxUserUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxUserUsrVirtualUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListboxOutListboxWorkIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SL705VOutListboxItem", propOrder = {
    "outListboxOutListboxActiveInactiveCharSuppliedChar10",
    "outListboxOutListboxAtmUserIefSuppliedText15",
    "outListboxOutListboxBankEmployeeBankemployeeFirstName",
    "outListboxOutListboxBankEmployeeBankemployeeId",
    "outListboxOutListboxBankEmployeeBankemployeeLastName",
    "outListboxOutListboxBankEmployeeBankemployeeStaffNo",
    "outListboxOutListboxLoggedUserLoggedUserPasswordChangeDate",
    "outListboxOutListboxLoginStatusLoggedUserLoginStatus",
    "outListboxOutListboxMainSecRoleCode",
    "outListboxOutListboxMainSecRoleDescription",
    "outListboxOutListboxMainUnitCategoryPerRoleId",
    "outListboxOutListboxPassEndLoggedUserPasswordChangeDate",
    "outListboxOutListboxSecondSecRoleCode",
    "outListboxOutListboxSecondSecRoleDescription",
    "outListboxOutListboxSecondUnitCategoryPerRoleId",
    "outListboxOutListboxThirdSecRoleCode",
    "outListboxOutListboxThirdSecRoleDescription",
    "outListboxOutListboxThirdUnitCategoryPerRoleId",
    "outListboxOutListboxUnitUnitCode",
    "outListboxOutListboxUserUsrAtmUser",
    "outListboxOutListboxUserUsrBatchUser",
    "outListboxOutListboxUserUsrCode",
    "outListboxOutListboxUserUsrVirtualUser",
    "outListboxOutListboxWorkIefSuppliedSelectChar"
})
public class SL705VOutListboxItem {

    @XmlElement(name = "OutListboxOutListboxActiveInactiveCharSuppliedChar10")
    protected String outListboxOutListboxActiveInactiveCharSuppliedChar10;
    @XmlElement(name = "OutListboxOutListboxAtmUserIefSuppliedText15")
    protected String outListboxOutListboxAtmUserIefSuppliedText15;
    @XmlElement(name = "OutListboxOutListboxBankEmployeeBankemployeeFirstName")
    protected String outListboxOutListboxBankEmployeeBankemployeeFirstName;
    @XmlElement(name = "OutListboxOutListboxBankEmployeeBankemployeeId")
    protected String outListboxOutListboxBankEmployeeBankemployeeId;
    @XmlElement(name = "OutListboxOutListboxBankEmployeeBankemployeeLastName")
    protected String outListboxOutListboxBankEmployeeBankemployeeLastName;
    @XmlElement(name = "OutListboxOutListboxBankEmployeeBankemployeeStaffNo")
    protected String outListboxOutListboxBankEmployeeBankemployeeStaffNo;
    @XmlElement(name = "OutListboxOutListboxLoggedUserLoggedUserPasswordChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListboxOutListboxLoggedUserLoggedUserPasswordChangeDate;
    @XmlElement(name = "OutListboxOutListboxLoginStatusLoggedUserLoginStatus")
    protected String outListboxOutListboxLoginStatusLoggedUserLoginStatus;
    @XmlElement(name = "OutListboxOutListboxMainSecRoleCode")
    protected int outListboxOutListboxMainSecRoleCode;
    @XmlElement(name = "OutListboxOutListboxMainSecRoleDescription")
    protected String outListboxOutListboxMainSecRoleDescription;
    @XmlElement(name = "OutListboxOutListboxMainUnitCategoryPerRoleId")
    protected String outListboxOutListboxMainUnitCategoryPerRoleId;
    @XmlElement(name = "OutListboxOutListboxPassEndLoggedUserPasswordChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListboxOutListboxPassEndLoggedUserPasswordChangeDate;
    @XmlElement(name = "OutListboxOutListboxSecondSecRoleCode")
    protected int outListboxOutListboxSecondSecRoleCode;
    @XmlElement(name = "OutListboxOutListboxSecondSecRoleDescription")
    protected String outListboxOutListboxSecondSecRoleDescription;
    @XmlElement(name = "OutListboxOutListboxSecondUnitCategoryPerRoleId")
    protected String outListboxOutListboxSecondUnitCategoryPerRoleId;
    @XmlElement(name = "OutListboxOutListboxThirdSecRoleCode")
    protected int outListboxOutListboxThirdSecRoleCode;
    @XmlElement(name = "OutListboxOutListboxThirdSecRoleDescription")
    protected String outListboxOutListboxThirdSecRoleDescription;
    @XmlElement(name = "OutListboxOutListboxThirdUnitCategoryPerRoleId")
    protected String outListboxOutListboxThirdUnitCategoryPerRoleId;
    @XmlElement(name = "OutListboxOutListboxUnitUnitCode")
    protected int outListboxOutListboxUnitUnitCode;
    @XmlElement(name = "OutListboxOutListboxUserUsrAtmUser")
    protected String outListboxOutListboxUserUsrAtmUser;
    @XmlElement(name = "OutListboxOutListboxUserUsrBatchUser")
    protected String outListboxOutListboxUserUsrBatchUser;
    @XmlElement(name = "OutListboxOutListboxUserUsrCode")
    protected String outListboxOutListboxUserUsrCode;
    @XmlElement(name = "OutListboxOutListboxUserUsrVirtualUser")
    protected String outListboxOutListboxUserUsrVirtualUser;
    @XmlElement(name = "OutListboxOutListboxWorkIefSuppliedSelectChar")
    protected String outListboxOutListboxWorkIefSuppliedSelectChar;

    /**
     * Gets the value of the outListboxOutListboxActiveInactiveCharSuppliedChar10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxActiveInactiveCharSuppliedChar10() {
        return outListboxOutListboxActiveInactiveCharSuppliedChar10;
    }

    /**
     * Sets the value of the outListboxOutListboxActiveInactiveCharSuppliedChar10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxActiveInactiveCharSuppliedChar10(String value) {
        this.outListboxOutListboxActiveInactiveCharSuppliedChar10 = value;
    }

    /**
     * Gets the value of the outListboxOutListboxAtmUserIefSuppliedText15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxAtmUserIefSuppliedText15() {
        return outListboxOutListboxAtmUserIefSuppliedText15;
    }

    /**
     * Sets the value of the outListboxOutListboxAtmUserIefSuppliedText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxAtmUserIefSuppliedText15(String value) {
        this.outListboxOutListboxAtmUserIefSuppliedText15 = value;
    }

    /**
     * Gets the value of the outListboxOutListboxBankEmployeeBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxBankEmployeeBankemployeeFirstName() {
        return outListboxOutListboxBankEmployeeBankemployeeFirstName;
    }

    /**
     * Sets the value of the outListboxOutListboxBankEmployeeBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxBankEmployeeBankemployeeFirstName(String value) {
        this.outListboxOutListboxBankEmployeeBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outListboxOutListboxBankEmployeeBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxBankEmployeeBankemployeeId() {
        return outListboxOutListboxBankEmployeeBankemployeeId;
    }

    /**
     * Sets the value of the outListboxOutListboxBankEmployeeBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxBankEmployeeBankemployeeId(String value) {
        this.outListboxOutListboxBankEmployeeBankemployeeId = value;
    }

    /**
     * Gets the value of the outListboxOutListboxBankEmployeeBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxBankEmployeeBankemployeeLastName() {
        return outListboxOutListboxBankEmployeeBankemployeeLastName;
    }

    /**
     * Sets the value of the outListboxOutListboxBankEmployeeBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxBankEmployeeBankemployeeLastName(String value) {
        this.outListboxOutListboxBankEmployeeBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outListboxOutListboxBankEmployeeBankemployeeStaffNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxBankEmployeeBankemployeeStaffNo() {
        return outListboxOutListboxBankEmployeeBankemployeeStaffNo;
    }

    /**
     * Sets the value of the outListboxOutListboxBankEmployeeBankemployeeStaffNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxBankEmployeeBankemployeeStaffNo(String value) {
        this.outListboxOutListboxBankEmployeeBankemployeeStaffNo = value;
    }

    /**
     * Gets the value of the outListboxOutListboxLoggedUserLoggedUserPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListboxOutListboxLoggedUserLoggedUserPasswordChangeDate() {
        return outListboxOutListboxLoggedUserLoggedUserPasswordChangeDate;
    }

    /**
     * Sets the value of the outListboxOutListboxLoggedUserLoggedUserPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListboxOutListboxLoggedUserLoggedUserPasswordChangeDate(XMLGregorianCalendar value) {
        this.outListboxOutListboxLoggedUserLoggedUserPasswordChangeDate = value;
    }

    /**
     * Gets the value of the outListboxOutListboxLoginStatusLoggedUserLoginStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxLoginStatusLoggedUserLoginStatus() {
        return outListboxOutListboxLoginStatusLoggedUserLoginStatus;
    }

    /**
     * Sets the value of the outListboxOutListboxLoginStatusLoggedUserLoginStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxLoginStatusLoggedUserLoginStatus(String value) {
        this.outListboxOutListboxLoginStatusLoggedUserLoginStatus = value;
    }

    /**
     * Gets the value of the outListboxOutListboxMainSecRoleCode property.
     * 
     */
    public int getOutListboxOutListboxMainSecRoleCode() {
        return outListboxOutListboxMainSecRoleCode;
    }

    /**
     * Sets the value of the outListboxOutListboxMainSecRoleCode property.
     * 
     */
    public void setOutListboxOutListboxMainSecRoleCode(int value) {
        this.outListboxOutListboxMainSecRoleCode = value;
    }

    /**
     * Gets the value of the outListboxOutListboxMainSecRoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxMainSecRoleDescription() {
        return outListboxOutListboxMainSecRoleDescription;
    }

    /**
     * Sets the value of the outListboxOutListboxMainSecRoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxMainSecRoleDescription(String value) {
        this.outListboxOutListboxMainSecRoleDescription = value;
    }

    /**
     * Gets the value of the outListboxOutListboxMainUnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxMainUnitCategoryPerRoleId() {
        return outListboxOutListboxMainUnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outListboxOutListboxMainUnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxMainUnitCategoryPerRoleId(String value) {
        this.outListboxOutListboxMainUnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outListboxOutListboxPassEndLoggedUserPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListboxOutListboxPassEndLoggedUserPasswordChangeDate() {
        return outListboxOutListboxPassEndLoggedUserPasswordChangeDate;
    }

    /**
     * Sets the value of the outListboxOutListboxPassEndLoggedUserPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListboxOutListboxPassEndLoggedUserPasswordChangeDate(XMLGregorianCalendar value) {
        this.outListboxOutListboxPassEndLoggedUserPasswordChangeDate = value;
    }

    /**
     * Gets the value of the outListboxOutListboxSecondSecRoleCode property.
     * 
     */
    public int getOutListboxOutListboxSecondSecRoleCode() {
        return outListboxOutListboxSecondSecRoleCode;
    }

    /**
     * Sets the value of the outListboxOutListboxSecondSecRoleCode property.
     * 
     */
    public void setOutListboxOutListboxSecondSecRoleCode(int value) {
        this.outListboxOutListboxSecondSecRoleCode = value;
    }

    /**
     * Gets the value of the outListboxOutListboxSecondSecRoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxSecondSecRoleDescription() {
        return outListboxOutListboxSecondSecRoleDescription;
    }

    /**
     * Sets the value of the outListboxOutListboxSecondSecRoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxSecondSecRoleDescription(String value) {
        this.outListboxOutListboxSecondSecRoleDescription = value;
    }

    /**
     * Gets the value of the outListboxOutListboxSecondUnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxSecondUnitCategoryPerRoleId() {
        return outListboxOutListboxSecondUnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outListboxOutListboxSecondUnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxSecondUnitCategoryPerRoleId(String value) {
        this.outListboxOutListboxSecondUnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outListboxOutListboxThirdSecRoleCode property.
     * 
     */
    public int getOutListboxOutListboxThirdSecRoleCode() {
        return outListboxOutListboxThirdSecRoleCode;
    }

    /**
     * Sets the value of the outListboxOutListboxThirdSecRoleCode property.
     * 
     */
    public void setOutListboxOutListboxThirdSecRoleCode(int value) {
        this.outListboxOutListboxThirdSecRoleCode = value;
    }

    /**
     * Gets the value of the outListboxOutListboxThirdSecRoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxThirdSecRoleDescription() {
        return outListboxOutListboxThirdSecRoleDescription;
    }

    /**
     * Sets the value of the outListboxOutListboxThirdSecRoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxThirdSecRoleDescription(String value) {
        this.outListboxOutListboxThirdSecRoleDescription = value;
    }

    /**
     * Gets the value of the outListboxOutListboxThirdUnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxThirdUnitCategoryPerRoleId() {
        return outListboxOutListboxThirdUnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outListboxOutListboxThirdUnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxThirdUnitCategoryPerRoleId(String value) {
        this.outListboxOutListboxThirdUnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the outListboxOutListboxUnitUnitCode property.
     * 
     */
    public int getOutListboxOutListboxUnitUnitCode() {
        return outListboxOutListboxUnitUnitCode;
    }

    /**
     * Sets the value of the outListboxOutListboxUnitUnitCode property.
     * 
     */
    public void setOutListboxOutListboxUnitUnitCode(int value) {
        this.outListboxOutListboxUnitUnitCode = value;
    }

    /**
     * Gets the value of the outListboxOutListboxUserUsrAtmUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxUserUsrAtmUser() {
        return outListboxOutListboxUserUsrAtmUser;
    }

    /**
     * Sets the value of the outListboxOutListboxUserUsrAtmUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxUserUsrAtmUser(String value) {
        this.outListboxOutListboxUserUsrAtmUser = value;
    }

    /**
     * Gets the value of the outListboxOutListboxUserUsrBatchUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxUserUsrBatchUser() {
        return outListboxOutListboxUserUsrBatchUser;
    }

    /**
     * Sets the value of the outListboxOutListboxUserUsrBatchUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxUserUsrBatchUser(String value) {
        this.outListboxOutListboxUserUsrBatchUser = value;
    }

    /**
     * Gets the value of the outListboxOutListboxUserUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxUserUsrCode() {
        return outListboxOutListboxUserUsrCode;
    }

    /**
     * Sets the value of the outListboxOutListboxUserUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxUserUsrCode(String value) {
        this.outListboxOutListboxUserUsrCode = value;
    }

    /**
     * Gets the value of the outListboxOutListboxUserUsrVirtualUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxUserUsrVirtualUser() {
        return outListboxOutListboxUserUsrVirtualUser;
    }

    /**
     * Sets the value of the outListboxOutListboxUserUsrVirtualUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxUserUsrVirtualUser(String value) {
        this.outListboxOutListboxUserUsrVirtualUser = value;
    }

    /**
     * Gets the value of the outListboxOutListboxWorkIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListboxOutListboxWorkIefSuppliedSelectChar() {
        return outListboxOutListboxWorkIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outListboxOutListboxWorkIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListboxOutListboxWorkIefSuppliedSelectChar(String value) {
        this.outListboxOutListboxWorkIefSuppliedSelectChar = value;
    }

}
