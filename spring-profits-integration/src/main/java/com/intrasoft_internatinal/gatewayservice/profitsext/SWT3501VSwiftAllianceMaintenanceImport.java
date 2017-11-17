
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SWT3501V_SwiftAllianceMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501V_SwiftAllianceMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChannelInGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChannelInGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChannelOutGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InChannelOutGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterBankNameFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupIndexSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMoreEntriesIefSuppliedNumber8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRmaValidateForSwiftAllnceRmaBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRmaValidateForSwiftAllnceRmaEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRmaValidateForSwiftAllnceRmaStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRmaValidateForSwiftAllnceRmaSwiftConnIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRmaValidateForSwiftAllnceRmaSwiftConnOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRmaValidateForSwiftAllnceRmaSwiftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectionSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectionSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectionSwiftAllnceBicsSwiftConnFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsBankDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsCountry2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsExtraAddrInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsPob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsSubInfor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsSwiftConnFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsValueAdded1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsValueAdded2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSwiftAllnceBicsZipCodeTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRma" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSWT3501VInGrpRmaItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501V_SwiftAllianceMaintenanceImport", propOrder = {
    "command",
    "inChannelInGenericDetailParameterType",
    "inChannelInGenericDetailShortDescription",
    "inChannelOutGenericDetailParameterType",
    "inChannelOutGenericDetailShortDescription",
    "inFilterBankNameFlagIefSuppliedFlag",
    "inFilterFlagIefSuppliedFlag",
    "inGroupIndexSwiftAllnceBicsBic",
    "inMoreEntriesIefSuppliedNumber8",
    "inParametersInTerminalTerminalNumber",
    "inRmaValidateForSwiftAllnceRmaBic",
    "inRmaValidateForSwiftAllnceRmaEndDate",
    "inRmaValidateForSwiftAllnceRmaStartDate",
    "inRmaValidateForSwiftAllnceRmaSwiftConnIn",
    "inRmaValidateForSwiftAllnceRmaSwiftConnOut",
    "inRmaValidateForSwiftAllnceRmaSwiftType",
    "inSelectionSwiftAllnceBicsBankDescr",
    "inSelectionSwiftAllnceBicsBic",
    "inSelectionSwiftAllnceBicsSwiftConnFlag",
    "inSwiftAllnceBicsAddress",
    "inSwiftAllnceBicsAddress2",
    "inSwiftAllnceBicsAddress3",
    "inSwiftAllnceBicsBankDept",
    "inSwiftAllnceBicsBankDescr",
    "inSwiftAllnceBicsBic",
    "inSwiftAllnceBicsCity",
    "inSwiftAllnceBicsCountry",
    "inSwiftAllnceBicsCountry2",
    "inSwiftAllnceBicsExtraAddrInfo",
    "inSwiftAllnceBicsLocation",
    "inSwiftAllnceBicsPob",
    "inSwiftAllnceBicsPrefix",
    "inSwiftAllnceBicsSubInfor",
    "inSwiftAllnceBicsSwiftConnFlag",
    "inSwiftAllnceBicsValueAdded1",
    "inSwiftAllnceBicsValueAdded2",
    "inSwiftAllnceBicsZipCodeTown",
    "inGrpRma"
})
public class SWT3501VSwiftAllianceMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InChannelInGenericDetailParameterType")
    protected String inChannelInGenericDetailParameterType;
    @XmlElement(name = "InChannelInGenericDetailShortDescription")
    protected String inChannelInGenericDetailShortDescription;
    @XmlElement(name = "InChannelOutGenericDetailParameterType")
    protected String inChannelOutGenericDetailParameterType;
    @XmlElement(name = "InChannelOutGenericDetailShortDescription")
    protected String inChannelOutGenericDetailShortDescription;
    @XmlElement(name = "InFilterBankNameFlagIefSuppliedFlag")
    protected String inFilterBankNameFlagIefSuppliedFlag;
    @XmlElement(name = "InFilterFlagIefSuppliedFlag")
    protected String inFilterFlagIefSuppliedFlag;
    @XmlElement(name = "InGroupIndexSwiftAllnceBicsBic")
    protected String inGroupIndexSwiftAllnceBicsBic;
    @XmlElement(name = "InMoreEntriesIefSuppliedNumber8")
    protected int inMoreEntriesIefSuppliedNumber8;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InRmaValidateForSwiftAllnceRmaBic")
    protected String inRmaValidateForSwiftAllnceRmaBic;
    @XmlElement(name = "InRmaValidateForSwiftAllnceRmaEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRmaValidateForSwiftAllnceRmaEndDate;
    @XmlElement(name = "InRmaValidateForSwiftAllnceRmaStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRmaValidateForSwiftAllnceRmaStartDate;
    @XmlElement(name = "InRmaValidateForSwiftAllnceRmaSwiftConnIn")
    protected String inRmaValidateForSwiftAllnceRmaSwiftConnIn;
    @XmlElement(name = "InRmaValidateForSwiftAllnceRmaSwiftConnOut")
    protected String inRmaValidateForSwiftAllnceRmaSwiftConnOut;
    @XmlElement(name = "InRmaValidateForSwiftAllnceRmaSwiftType")
    protected String inRmaValidateForSwiftAllnceRmaSwiftType;
    @XmlElement(name = "InSelectionSwiftAllnceBicsBankDescr")
    protected String inSelectionSwiftAllnceBicsBankDescr;
    @XmlElement(name = "InSelectionSwiftAllnceBicsBic")
    protected String inSelectionSwiftAllnceBicsBic;
    @XmlElement(name = "InSelectionSwiftAllnceBicsSwiftConnFlag")
    protected String inSelectionSwiftAllnceBicsSwiftConnFlag;
    @XmlElement(name = "InSwiftAllnceBicsAddress")
    protected String inSwiftAllnceBicsAddress;
    @XmlElement(name = "InSwiftAllnceBicsAddress2")
    protected String inSwiftAllnceBicsAddress2;
    @XmlElement(name = "InSwiftAllnceBicsAddress3")
    protected String inSwiftAllnceBicsAddress3;
    @XmlElement(name = "InSwiftAllnceBicsBankDept")
    protected String inSwiftAllnceBicsBankDept;
    @XmlElement(name = "InSwiftAllnceBicsBankDescr")
    protected String inSwiftAllnceBicsBankDescr;
    @XmlElement(name = "InSwiftAllnceBicsBic")
    protected String inSwiftAllnceBicsBic;
    @XmlElement(name = "InSwiftAllnceBicsCity")
    protected String inSwiftAllnceBicsCity;
    @XmlElement(name = "InSwiftAllnceBicsCountry")
    protected String inSwiftAllnceBicsCountry;
    @XmlElement(name = "InSwiftAllnceBicsCountry2")
    protected String inSwiftAllnceBicsCountry2;
    @XmlElement(name = "InSwiftAllnceBicsExtraAddrInfo")
    protected String inSwiftAllnceBicsExtraAddrInfo;
    @XmlElement(name = "InSwiftAllnceBicsLocation")
    protected String inSwiftAllnceBicsLocation;
    @XmlElement(name = "InSwiftAllnceBicsPob")
    protected String inSwiftAllnceBicsPob;
    @XmlElement(name = "InSwiftAllnceBicsPrefix")
    protected String inSwiftAllnceBicsPrefix;
    @XmlElement(name = "InSwiftAllnceBicsSubInfor")
    protected String inSwiftAllnceBicsSubInfor;
    @XmlElement(name = "InSwiftAllnceBicsSwiftConnFlag")
    protected String inSwiftAllnceBicsSwiftConnFlag;
    @XmlElement(name = "InSwiftAllnceBicsValueAdded1")
    protected String inSwiftAllnceBicsValueAdded1;
    @XmlElement(name = "InSwiftAllnceBicsValueAdded2")
    protected String inSwiftAllnceBicsValueAdded2;
    @XmlElement(name = "InSwiftAllnceBicsZipCodeTown")
    protected String inSwiftAllnceBicsZipCodeTown;
    @XmlElement(name = "InGrpRma")
    protected ArrayOfSWT3501VInGrpRmaItem inGrpRma;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inChannelInGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChannelInGenericDetailParameterType() {
        return inChannelInGenericDetailParameterType;
    }

    /**
     * Sets the value of the inChannelInGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChannelInGenericDetailParameterType(String value) {
        this.inChannelInGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inChannelInGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChannelInGenericDetailShortDescription() {
        return inChannelInGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inChannelInGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChannelInGenericDetailShortDescription(String value) {
        this.inChannelInGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inChannelOutGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChannelOutGenericDetailParameterType() {
        return inChannelOutGenericDetailParameterType;
    }

    /**
     * Sets the value of the inChannelOutGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChannelOutGenericDetailParameterType(String value) {
        this.inChannelOutGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inChannelOutGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChannelOutGenericDetailShortDescription() {
        return inChannelOutGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inChannelOutGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChannelOutGenericDetailShortDescription(String value) {
        this.inChannelOutGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inFilterBankNameFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterBankNameFlagIefSuppliedFlag() {
        return inFilterBankNameFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFilterBankNameFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterBankNameFlagIefSuppliedFlag(String value) {
        this.inFilterBankNameFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inFilterFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterFlagIefSuppliedFlag() {
        return inFilterFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFilterFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterFlagIefSuppliedFlag(String value) {
        this.inFilterFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGroupIndexSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupIndexSwiftAllnceBicsBic() {
        return inGroupIndexSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inGroupIndexSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupIndexSwiftAllnceBicsBic(String value) {
        this.inGroupIndexSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the inMoreEntriesIefSuppliedNumber8 property.
     * 
     */
    public int getInMoreEntriesIefSuppliedNumber8() {
        return inMoreEntriesIefSuppliedNumber8;
    }

    /**
     * Sets the value of the inMoreEntriesIefSuppliedNumber8 property.
     * 
     */
    public void setInMoreEntriesIefSuppliedNumber8(int value) {
        this.inMoreEntriesIefSuppliedNumber8 = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inRmaValidateForSwiftAllnceRmaBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRmaValidateForSwiftAllnceRmaBic() {
        return inRmaValidateForSwiftAllnceRmaBic;
    }

    /**
     * Sets the value of the inRmaValidateForSwiftAllnceRmaBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRmaValidateForSwiftAllnceRmaBic(String value) {
        this.inRmaValidateForSwiftAllnceRmaBic = value;
    }

    /**
     * Gets the value of the inRmaValidateForSwiftAllnceRmaEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRmaValidateForSwiftAllnceRmaEndDate() {
        return inRmaValidateForSwiftAllnceRmaEndDate;
    }

    /**
     * Sets the value of the inRmaValidateForSwiftAllnceRmaEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRmaValidateForSwiftAllnceRmaEndDate(XMLGregorianCalendar value) {
        this.inRmaValidateForSwiftAllnceRmaEndDate = value;
    }

    /**
     * Gets the value of the inRmaValidateForSwiftAllnceRmaStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRmaValidateForSwiftAllnceRmaStartDate() {
        return inRmaValidateForSwiftAllnceRmaStartDate;
    }

    /**
     * Sets the value of the inRmaValidateForSwiftAllnceRmaStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRmaValidateForSwiftAllnceRmaStartDate(XMLGregorianCalendar value) {
        this.inRmaValidateForSwiftAllnceRmaStartDate = value;
    }

    /**
     * Gets the value of the inRmaValidateForSwiftAllnceRmaSwiftConnIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRmaValidateForSwiftAllnceRmaSwiftConnIn() {
        return inRmaValidateForSwiftAllnceRmaSwiftConnIn;
    }

    /**
     * Sets the value of the inRmaValidateForSwiftAllnceRmaSwiftConnIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRmaValidateForSwiftAllnceRmaSwiftConnIn(String value) {
        this.inRmaValidateForSwiftAllnceRmaSwiftConnIn = value;
    }

    /**
     * Gets the value of the inRmaValidateForSwiftAllnceRmaSwiftConnOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRmaValidateForSwiftAllnceRmaSwiftConnOut() {
        return inRmaValidateForSwiftAllnceRmaSwiftConnOut;
    }

    /**
     * Sets the value of the inRmaValidateForSwiftAllnceRmaSwiftConnOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRmaValidateForSwiftAllnceRmaSwiftConnOut(String value) {
        this.inRmaValidateForSwiftAllnceRmaSwiftConnOut = value;
    }

    /**
     * Gets the value of the inRmaValidateForSwiftAllnceRmaSwiftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRmaValidateForSwiftAllnceRmaSwiftType() {
        return inRmaValidateForSwiftAllnceRmaSwiftType;
    }

    /**
     * Sets the value of the inRmaValidateForSwiftAllnceRmaSwiftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRmaValidateForSwiftAllnceRmaSwiftType(String value) {
        this.inRmaValidateForSwiftAllnceRmaSwiftType = value;
    }

    /**
     * Gets the value of the inSelectionSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectionSwiftAllnceBicsBankDescr() {
        return inSelectionSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the inSelectionSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectionSwiftAllnceBicsBankDescr(String value) {
        this.inSelectionSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the inSelectionSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectionSwiftAllnceBicsBic() {
        return inSelectionSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inSelectionSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectionSwiftAllnceBicsBic(String value) {
        this.inSelectionSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the inSelectionSwiftAllnceBicsSwiftConnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectionSwiftAllnceBicsSwiftConnFlag() {
        return inSelectionSwiftAllnceBicsSwiftConnFlag;
    }

    /**
     * Sets the value of the inSelectionSwiftAllnceBicsSwiftConnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectionSwiftAllnceBicsSwiftConnFlag(String value) {
        this.inSelectionSwiftAllnceBicsSwiftConnFlag = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsAddress() {
        return inSwiftAllnceBicsAddress;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsAddress(String value) {
        this.inSwiftAllnceBicsAddress = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsAddress2() {
        return inSwiftAllnceBicsAddress2;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsAddress2(String value) {
        this.inSwiftAllnceBicsAddress2 = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsAddress3() {
        return inSwiftAllnceBicsAddress3;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsAddress3(String value) {
        this.inSwiftAllnceBicsAddress3 = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsBankDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsBankDept() {
        return inSwiftAllnceBicsBankDept;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsBankDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsBankDept(String value) {
        this.inSwiftAllnceBicsBankDept = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsBankDescr() {
        return inSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsBankDescr(String value) {
        this.inSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsBic() {
        return inSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsBic(String value) {
        this.inSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsCity() {
        return inSwiftAllnceBicsCity;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsCity(String value) {
        this.inSwiftAllnceBicsCity = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsCountry() {
        return inSwiftAllnceBicsCountry;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsCountry(String value) {
        this.inSwiftAllnceBicsCountry = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsCountry2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsCountry2() {
        return inSwiftAllnceBicsCountry2;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsCountry2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsCountry2(String value) {
        this.inSwiftAllnceBicsCountry2 = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsExtraAddrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsExtraAddrInfo() {
        return inSwiftAllnceBicsExtraAddrInfo;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsExtraAddrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsExtraAddrInfo(String value) {
        this.inSwiftAllnceBicsExtraAddrInfo = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsLocation() {
        return inSwiftAllnceBicsLocation;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsLocation(String value) {
        this.inSwiftAllnceBicsLocation = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsPob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsPob() {
        return inSwiftAllnceBicsPob;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsPob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsPob(String value) {
        this.inSwiftAllnceBicsPob = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsPrefix() {
        return inSwiftAllnceBicsPrefix;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsPrefix(String value) {
        this.inSwiftAllnceBicsPrefix = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsSubInfor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsSubInfor() {
        return inSwiftAllnceBicsSubInfor;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsSubInfor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsSubInfor(String value) {
        this.inSwiftAllnceBicsSubInfor = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsSwiftConnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsSwiftConnFlag() {
        return inSwiftAllnceBicsSwiftConnFlag;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsSwiftConnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsSwiftConnFlag(String value) {
        this.inSwiftAllnceBicsSwiftConnFlag = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsValueAdded1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsValueAdded1() {
        return inSwiftAllnceBicsValueAdded1;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsValueAdded1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsValueAdded1(String value) {
        this.inSwiftAllnceBicsValueAdded1 = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsValueAdded2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsValueAdded2() {
        return inSwiftAllnceBicsValueAdded2;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsValueAdded2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsValueAdded2(String value) {
        this.inSwiftAllnceBicsValueAdded2 = value;
    }

    /**
     * Gets the value of the inSwiftAllnceBicsZipCodeTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSwiftAllnceBicsZipCodeTown() {
        return inSwiftAllnceBicsZipCodeTown;
    }

    /**
     * Sets the value of the inSwiftAllnceBicsZipCodeTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSwiftAllnceBicsZipCodeTown(String value) {
        this.inSwiftAllnceBicsZipCodeTown = value;
    }

    /**
     * Gets the value of the inGrpRma property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSWT3501VInGrpRmaItem }
     *     
     */
    public ArrayOfSWT3501VInGrpRmaItem getInGrpRma() {
        return inGrpRma;
    }

    /**
     * Sets the value of the inGrpRma property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSWT3501VInGrpRmaItem }
     *     
     */
    public void setInGrpRma(ArrayOfSWT3501VInGrpRmaItem value) {
        this.inGrpRma = value;
    }

}
