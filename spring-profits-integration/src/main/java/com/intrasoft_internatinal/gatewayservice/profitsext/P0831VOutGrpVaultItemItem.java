
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for P0831VOutGrpVaultItemItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P0831VOutGrpVaultItemItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemCheckedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemFileExists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemInsertedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemItemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemItemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemItemValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemRemovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemReturnedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemVaultLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVaultItemOutGrmVaultItemVaultItemVaultUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P0831VOutGrpVaultItemItem", propOrder = {
    "outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault",
    "outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault",
    "outGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar",
    "outGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription",
    "outGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum",
    "outGrpVaultItemOutGrmVaultItemVaultItemAccountCd",
    "outGrpVaultItemOutGrmVaultItemVaultItemCheckedDate",
    "outGrpVaultItemOutGrmVaultItemVaultItemCustId",
    "outGrpVaultItemOutGrmVaultItemVaultItemEntryStatus",
    "outGrpVaultItemOutGrmVaultItemVaultItemFileExists",
    "outGrpVaultItemOutGrmVaultItemVaultItemInsertDate",
    "outGrpVaultItemOutGrmVaultItemVaultItemInsertUnit",
    "outGrpVaultItemOutGrmVaultItemVaultItemInsertUser",
    "outGrpVaultItemOutGrmVaultItemVaultItemInsertedDate",
    "outGrpVaultItemOutGrmVaultItemVaultItemItemDescription",
    "outGrpVaultItemOutGrmVaultItemVaultItemItemDetails",
    "outGrpVaultItemOutGrmVaultItemVaultItemItemStatus",
    "outGrpVaultItemOutGrmVaultItemVaultItemItemValue",
    "outGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount",
    "outGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem",
    "outGrpVaultItemOutGrmVaultItemVaultItemRemovalDate",
    "outGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser",
    "outGrpVaultItemOutGrmVaultItemVaultItemReturnedDate",
    "outGrpVaultItemOutGrmVaultItemVaultItemSn",
    "outGrpVaultItemOutGrmVaultItemVaultItemTmstamp",
    "outGrpVaultItemOutGrmVaultItemVaultItemUpdateDate",
    "outGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit",
    "outGrpVaultItemOutGrmVaultItemVaultItemUpdateUser",
    "outGrpVaultItemOutGrmVaultItemVaultItemVaultLocation",
    "outGrpVaultItemOutGrmVaultItemVaultItemVaultUnit"
})
public class P0831VOutGrpVaultItemItem {

    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault")
    protected double outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault")
    protected double outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar")
    protected String outGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription")
    protected String outGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum")
    protected int outGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemAccountCd")
    protected short outGrpVaultItemOutGrmVaultItemVaultItemAccountCd;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemCheckedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpVaultItemOutGrmVaultItemVaultItemCheckedDate;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemCustId")
    protected int outGrpVaultItemOutGrmVaultItemVaultItemCustId;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemEntryStatus")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemEntryStatus;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemFileExists")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemFileExists;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpVaultItemOutGrmVaultItemVaultItemInsertDate;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemInsertUnit")
    protected int outGrpVaultItemOutGrmVaultItemVaultItemInsertUnit;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemInsertUser")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemInsertUser;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemInsertedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpVaultItemOutGrmVaultItemVaultItemInsertedDate;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemItemDescription")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemItemDescription;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemItemDetails")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemItemDetails;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemItemStatus")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemItemStatus;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemItemValue", required = true)
    protected BigDecimal outGrpVaultItemOutGrmVaultItemVaultItemItemValue;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem")
    protected short outGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemRemovalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpVaultItemOutGrmVaultItemVaultItemRemovalDate;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemReturnedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpVaultItemOutGrmVaultItemVaultItemReturnedDate;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemSn")
    protected double outGrpVaultItemOutGrmVaultItemVaultItemSn;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpVaultItemOutGrmVaultItemVaultItemTmstamp;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpVaultItemOutGrmVaultItemVaultItemUpdateDate;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit")
    protected int outGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemUpdateUser")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemUpdateUser;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemVaultLocation")
    protected String outGrpVaultItemOutGrmVaultItemVaultItemVaultLocation;
    @XmlElement(name = "OutGrpVaultItemOutGrmVaultItemVaultItemVaultUnit")
    protected int outGrpVaultItemOutGrmVaultItemVaultItemVaultUnit;

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault property.
     * 
     */
    public double getOutGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault() {
        return outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault(double value) {
        this.outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysInVault = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault property.
     * 
     */
    public double getOutGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault() {
        return outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault(double value) {
        this.outGrpVaultItemOutGrmVaultItemAgingVaultLogItemDaysNotinVault = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar() {
        return outGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar(String value) {
        this.outGrpVaultItemOutGrmVaultItemIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription() {
        return outGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription(String value) {
        this.outGrpVaultItemOutGrmVaultItemTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum() {
        return outGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum(int value) {
        this.outGrpVaultItemOutGrmVaultItemTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemAccountCd property.
     * 
     */
    public short getOutGrpVaultItemOutGrmVaultItemVaultItemAccountCd() {
        return outGrpVaultItemOutGrmVaultItemVaultItemAccountCd;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemAccountCd property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemAccountCd(short value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemAccountCd = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemCheckedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpVaultItemOutGrmVaultItemVaultItemCheckedDate() {
        return outGrpVaultItemOutGrmVaultItemVaultItemCheckedDate;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemCheckedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemCheckedDate(XMLGregorianCalendar value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemCheckedDate = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemCustId property.
     * 
     */
    public int getOutGrpVaultItemOutGrmVaultItemVaultItemCustId() {
        return outGrpVaultItemOutGrmVaultItemVaultItemCustId;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemCustId property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemCustId(int value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemCustId = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemEntryStatus() {
        return outGrpVaultItemOutGrmVaultItemVaultItemEntryStatus;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemEntryStatus(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemFileExists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemFileExists() {
        return outGrpVaultItemOutGrmVaultItemVaultItemFileExists;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemFileExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemFileExists(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemFileExists = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpVaultItemOutGrmVaultItemVaultItemInsertDate() {
        return outGrpVaultItemOutGrmVaultItemVaultItemInsertDate;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemInsertDate(XMLGregorianCalendar value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemInsertDate = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemInsertUnit property.
     * 
     */
    public int getOutGrpVaultItemOutGrmVaultItemVaultItemInsertUnit() {
        return outGrpVaultItemOutGrmVaultItemVaultItemInsertUnit;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemInsertUnit property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemInsertUnit(int value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemInsertUnit = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemInsertUser() {
        return outGrpVaultItemOutGrmVaultItemVaultItemInsertUser;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemInsertUser(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemInsertUser = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemInsertedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpVaultItemOutGrmVaultItemVaultItemInsertedDate() {
        return outGrpVaultItemOutGrmVaultItemVaultItemInsertedDate;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemInsertedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemInsertedDate(XMLGregorianCalendar value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemInsertedDate = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemItemDescription() {
        return outGrpVaultItemOutGrmVaultItemVaultItemItemDescription;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemItemDescription(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemItemDescription = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemItemDetails() {
        return outGrpVaultItemOutGrmVaultItemVaultItemItemDetails;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemItemDetails(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemItemDetails = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemItemStatus() {
        return outGrpVaultItemOutGrmVaultItemVaultItemItemStatus;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemItemStatus(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemItemStatus = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemItemValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpVaultItemOutGrmVaultItemVaultItemItemValue() {
        return outGrpVaultItemOutGrmVaultItemVaultItemItemValue;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemItemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemItemValue(BigDecimal value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemItemValue = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount() {
        return outGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemProfitsAccount = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem property.
     * 
     */
    public short getOutGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem() {
        return outGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem(short value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemProfitsSystem = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemRemovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpVaultItemOutGrmVaultItemVaultItemRemovalDate() {
        return outGrpVaultItemOutGrmVaultItemVaultItemRemovalDate;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemRemovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemRemovalDate(XMLGregorianCalendar value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemRemovalDate = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser() {
        return outGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemResponsibleUser = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemReturnedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpVaultItemOutGrmVaultItemVaultItemReturnedDate() {
        return outGrpVaultItemOutGrmVaultItemVaultItemReturnedDate;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemReturnedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemReturnedDate(XMLGregorianCalendar value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemReturnedDate = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemSn property.
     * 
     */
    public double getOutGrpVaultItemOutGrmVaultItemVaultItemSn() {
        return outGrpVaultItemOutGrmVaultItemVaultItemSn;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemSn property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemSn(double value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemSn = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpVaultItemOutGrmVaultItemVaultItemTmstamp() {
        return outGrpVaultItemOutGrmVaultItemVaultItemTmstamp;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemTmstamp(XMLGregorianCalendar value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemTmstamp = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpVaultItemOutGrmVaultItemVaultItemUpdateDate() {
        return outGrpVaultItemOutGrmVaultItemVaultItemUpdateDate;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemUpdateDate(XMLGregorianCalendar value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemUpdateDate = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit property.
     * 
     */
    public int getOutGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit() {
        return outGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit(int value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemUpdateUnit = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemUpdateUser() {
        return outGrpVaultItemOutGrmVaultItemVaultItemUpdateUser;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemUpdateUser(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemUpdateUser = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemVaultLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpVaultItemOutGrmVaultItemVaultItemVaultLocation() {
        return outGrpVaultItemOutGrmVaultItemVaultItemVaultLocation;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemVaultLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemVaultLocation(String value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemVaultLocation = value;
    }

    /**
     * Gets the value of the outGrpVaultItemOutGrmVaultItemVaultItemVaultUnit property.
     * 
     */
    public int getOutGrpVaultItemOutGrmVaultItemVaultItemVaultUnit() {
        return outGrpVaultItemOutGrmVaultItemVaultItemVaultUnit;
    }

    /**
     * Sets the value of the outGrpVaultItemOutGrmVaultItemVaultItemVaultUnit property.
     * 
     */
    public void setOutGrpVaultItemOutGrmVaultItemVaultItemVaultUnit(int value) {
        this.outGrpVaultItemOutGrmVaultItemVaultItemVaultUnit = value;
    }

}
