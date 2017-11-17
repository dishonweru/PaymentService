
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgreementBeneficiariesImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementBeneficiariesImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAddressCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgrAdditionalActionsComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAgreementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InAgreementTypeProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementWorkBeneficiaryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBenefCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDefaultAgreementBenefMainBenefFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultAgreementBenefTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogReversalIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSsSecurityCmcbPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInAgreementBeneficiaryItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementBeneficiariesImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inAddressCustomerCustId",
    "inAgrAdditionalActionsComments",
    "inAgreementAccKind",
    "inAgreementAgrStatus",
    "inAgreementTmstamp",
    "inAgreementTypeProductIdProduct",
    "inAgreementWorkBeneficiaryType",
    "inAuthGrantedIefSuppliedFlag",
    "inBenefCustomerCustId",
    "inCustAddressSerialNum",
    "inDefaultAgreementBenefMainBenefFlg",
    "inDefaultAgreementBenefTmstamp",
    "inIefSuppliedCommand",
    "inIefSuppliedFlag",
    "inJustificDescription",
    "inJustificIdJustific",
    "inLogReversalIefSuppliedFlag",
    "inPrftTransactionIdTransact",
    "inTrxTerminalTerminalNumber",
    "inSsSecurityCmcbPrftSystem",
    "inTrxTeamInformationSuper1Code",
    "inTrxTeamInformationSuper2Code",
    "inListGrp"
})
public class AgreementBeneficiariesImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InAddressCustomerCustId")
    protected int inAddressCustomerCustId;
    @XmlElement(name = "InAgrAdditionalActionsComments")
    protected String inAgrAdditionalActionsComments;
    @XmlElement(name = "InAgreementAccKind")
    protected String inAgreementAccKind;
    @XmlElement(name = "InAgreementAgrStatus")
    protected String inAgreementAgrStatus;
    @XmlElement(name = "InAgreementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inAgreementTmstamp;
    @XmlElement(name = "InAgreementTypeProductIdProduct")
    protected int inAgreementTypeProductIdProduct;
    @XmlElement(name = "InAgreementWorkBeneficiaryType")
    protected String inAgreementWorkBeneficiaryType;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InBenefCustomerCustId")
    protected int inBenefCustomerCustId;
    @XmlElement(name = "InCustAddressSerialNum")
    protected short inCustAddressSerialNum;
    @XmlElement(name = "InDefaultAgreementBenefMainBenefFlg")
    protected String inDefaultAgreementBenefMainBenefFlg;
    @XmlElement(name = "InDefaultAgreementBenefTmstamp", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDefaultAgreementBenefTmstamp;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InIefSuppliedFlag")
    protected String inIefSuppliedFlag;
    @XmlElement(name = "InJustificDescription")
    protected String inJustificDescription;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLogReversalIefSuppliedFlag")
    protected String inLogReversalIefSuppliedFlag;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "InSsSecurityCmcbPrftSystem")
    protected short inSsSecurityCmcbPrftSystem;
    @XmlElement(name = "InTrxTeamInformationSuper1Code")
    protected String inTrxTeamInformationSuper1Code;
    @XmlElement(name = "InTrxTeamInformationSuper2Code")
    protected String inTrxTeamInformationSuper2Code;
    @XmlElement(name = "InListGrp")
    protected ArrayOfInAgreementBeneficiaryItem inListGrp;

    /**
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inAddressCustomerCustId property.
     * 
     */
    public int getInAddressCustomerCustId() {
        return inAddressCustomerCustId;
    }

    /**
     * Sets the value of the inAddressCustomerCustId property.
     * 
     */
    public void setInAddressCustomerCustId(int value) {
        this.inAddressCustomerCustId = value;
    }

    /**
     * Gets the value of the inAgrAdditionalActionsComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgrAdditionalActionsComments() {
        return inAgrAdditionalActionsComments;
    }

    /**
     * Sets the value of the inAgrAdditionalActionsComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgrAdditionalActionsComments(String value) {
        this.inAgrAdditionalActionsComments = value;
    }

    /**
     * Gets the value of the inAgreementAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAccKind() {
        return inAgreementAccKind;
    }

    /**
     * Sets the value of the inAgreementAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAccKind(String value) {
        this.inAgreementAccKind = value;
    }

    /**
     * Gets the value of the inAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementAgrStatus() {
        return inAgreementAgrStatus;
    }

    /**
     * Sets the value of the inAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementAgrStatus(String value) {
        this.inAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the inAgreementTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInAgreementTmstamp() {
        return inAgreementTmstamp;
    }

    /**
     * Sets the value of the inAgreementTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInAgreementTmstamp(XMLGregorianCalendar value) {
        this.inAgreementTmstamp = value;
    }

    /**
     * Gets the value of the inAgreementTypeProductIdProduct property.
     * 
     */
    public int getInAgreementTypeProductIdProduct() {
        return inAgreementTypeProductIdProduct;
    }

    /**
     * Sets the value of the inAgreementTypeProductIdProduct property.
     * 
     */
    public void setInAgreementTypeProductIdProduct(int value) {
        this.inAgreementTypeProductIdProduct = value;
    }

    /**
     * Gets the value of the inAgreementWorkBeneficiaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAgreementWorkBeneficiaryType() {
        return inAgreementWorkBeneficiaryType;
    }

    /**
     * Sets the value of the inAgreementWorkBeneficiaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAgreementWorkBeneficiaryType(String value) {
        this.inAgreementWorkBeneficiaryType = value;
    }

    /**
     * Gets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthGrantedIefSuppliedFlag() {
        return inAuthGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthGrantedIefSuppliedFlag(String value) {
        this.inAuthGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBenefCustomerCustId property.
     * 
     */
    public int getInBenefCustomerCustId() {
        return inBenefCustomerCustId;
    }

    /**
     * Sets the value of the inBenefCustomerCustId property.
     * 
     */
    public void setInBenefCustomerCustId(int value) {
        this.inBenefCustomerCustId = value;
    }

    /**
     * Gets the value of the inCustAddressSerialNum property.
     * 
     */
    public short getInCustAddressSerialNum() {
        return inCustAddressSerialNum;
    }

    /**
     * Sets the value of the inCustAddressSerialNum property.
     * 
     */
    public void setInCustAddressSerialNum(short value) {
        this.inCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inDefaultAgreementBenefMainBenefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDefaultAgreementBenefMainBenefFlg() {
        return inDefaultAgreementBenefMainBenefFlg;
    }

    /**
     * Sets the value of the inDefaultAgreementBenefMainBenefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDefaultAgreementBenefMainBenefFlg(String value) {
        this.inDefaultAgreementBenefMainBenefFlg = value;
    }

    /**
     * Gets the value of the inDefaultAgreementBenefTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDefaultAgreementBenefTmstamp() {
        return inDefaultAgreementBenefTmstamp;
    }

    /**
     * Sets the value of the inDefaultAgreementBenefTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDefaultAgreementBenefTmstamp(XMLGregorianCalendar value) {
        this.inDefaultAgreementBenefTmstamp = value;
    }

    /**
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedFlag() {
        return inIefSuppliedFlag;
    }

    /**
     * Sets the value of the inIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedFlag(String value) {
        this.inIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInJustificDescription() {
        return inJustificDescription;
    }

    /**
     * Sets the value of the inJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInJustificDescription(String value) {
        this.inJustificDescription = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inLogReversalIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogReversalIefSuppliedFlag() {
        return inLogReversalIefSuppliedFlag;
    }

    /**
     * Sets the value of the inLogReversalIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogReversalIefSuppliedFlag(String value) {
        this.inLogReversalIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public short getInSsSecurityCmcbPrftSystem() {
        return inSsSecurityCmcbPrftSystem;
    }

    /**
     * Sets the value of the inSsSecurityCmcbPrftSystem property.
     * 
     */
    public void setInSsSecurityCmcbPrftSystem(short value) {
        this.inSsSecurityCmcbPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTeamInformationSuper1Code() {
        return inTrxTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inTrxTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTeamInformationSuper1Code(String value) {
        this.inTrxTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inTrxTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTeamInformationSuper2Code() {
        return inTrxTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inTrxTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTeamInformationSuper2Code(String value) {
        this.inTrxTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInAgreementBeneficiaryItem }
     *     
     */
    public ArrayOfInAgreementBeneficiaryItem getInListGrp() {
        return inListGrp;
    }

    /**
     * Sets the value of the inListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInAgreementBeneficiaryItem }
     *     
     */
    public void setInListGrp(ArrayOfInAgreementBeneficiaryItem value) {
        this.inListGrp = value;
    }

}
