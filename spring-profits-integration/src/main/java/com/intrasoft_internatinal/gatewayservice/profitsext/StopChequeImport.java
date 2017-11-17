
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StopChequeImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChequeImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommChequeBookCommissionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepMntRecordingIAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InDepMntRecordingIComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepMntRecordingIStoppedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDomesticCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDomesticCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDomesticCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFinJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFinPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFromChequeBookItemChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InFromChequeBookItemChequeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFromChequeBookItemDishonourDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InFromChequeBookItemItemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InFromDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSupervisorsTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSupervisorsTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InToChequeBookItemChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InToChequeBookItemChequeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InToChequeBookItemItemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InUsedInputCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopChequeImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "command",
    "inParametersInTerminalTerminalNumber",
    "inAuthorGrantedIefSuppliedFlag",
    "inCollaborationBanksBankId",
    "inCollaborationBanksBankName",
    "inCommChequeBookCommissionFlag",
    "inDepMntRecordingIAmount1",
    "inDepMntRecordingIComments",
    "inDepMntRecordingIStoppedType",
    "inDomesticCurrencyDisplayedDecimalPlaces",
    "inDomesticCurrencyIdCurrency",
    "inDomesticCurrencyNationalFlag",
    "inFinJustificIdJustific",
    "inFinPrftTransactionIdTransact",
    "inFromChequeBookItemChequeCd",
    "inFromChequeBookItemChequeStatus",
    "inFromChequeBookItemDishonourDate",
    "inFromChequeBookItemItemSerialNumber",
    "inFromDepositAccountDesignation",
    "inPrftTransactionIdTransact",
    "inSupervisorsTeamInformationSuper1Code",
    "inSupervisorsTeamInformationSuper2Code",
    "inToChequeBookItemChequeCd",
    "inToChequeBookItemChequeStatus",
    "inToChequeBookItemItemSerialNumber",
    "inUsedInputCharSuppliedChar37"
})
public class StopChequeImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InCollaborationBanksBankId")
    protected int inCollaborationBanksBankId;
    @XmlElement(name = "InCollaborationBanksBankName")
    protected String inCollaborationBanksBankName;
    @XmlElement(name = "InCommChequeBookCommissionFlag")
    protected String inCommChequeBookCommissionFlag;
    @XmlElement(name = "InDepMntRecordingIAmount1", required = true)
    protected BigDecimal inDepMntRecordingIAmount1;
    @XmlElement(name = "InDepMntRecordingIComments")
    protected String inDepMntRecordingIComments;
    @XmlElement(name = "InDepMntRecordingIStoppedType")
    protected String inDepMntRecordingIStoppedType;
    @XmlElement(name = "InDomesticCurrencyDisplayedDecimalPlaces")
    protected short inDomesticCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "InDomesticCurrencyIdCurrency")
    protected int inDomesticCurrencyIdCurrency;
    @XmlElement(name = "InDomesticCurrencyNationalFlag")
    protected String inDomesticCurrencyNationalFlag;
    @XmlElement(name = "InFinJustificIdJustific")
    protected int inFinJustificIdJustific;
    @XmlElement(name = "InFinPrftTransactionIdTransact")
    protected int inFinPrftTransactionIdTransact;
    @XmlElement(name = "InFromChequeBookItemChequeCd")
    protected short inFromChequeBookItemChequeCd;
    @XmlElement(name = "InFromChequeBookItemChequeStatus")
    protected String inFromChequeBookItemChequeStatus;
    @XmlElement(name = "InFromChequeBookItemDishonourDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inFromChequeBookItemDishonourDate;
    @XmlElement(name = "InFromChequeBookItemItemSerialNumber")
    protected double inFromChequeBookItemItemSerialNumber;
    @XmlElement(name = "InFromDepositAccountDesignation")
    protected String inFromDepositAccountDesignation;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InSupervisorsTeamInformationSuper1Code")
    protected String inSupervisorsTeamInformationSuper1Code;
    @XmlElement(name = "InSupervisorsTeamInformationSuper2Code")
    protected String inSupervisorsTeamInformationSuper2Code;
    @XmlElement(name = "InToChequeBookItemChequeCd")
    protected short inToChequeBookItemChequeCd;
    @XmlElement(name = "InToChequeBookItemChequeStatus")
    protected String inToChequeBookItemChequeStatus;
    @XmlElement(name = "InToChequeBookItemItemSerialNumber")
    protected double inToChequeBookItemItemSerialNumber;
    @XmlElement(name = "InUsedInputCharSuppliedChar37")
    protected String inUsedInputCharSuppliedChar37;

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
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCollaborationBanksBankId property.
     * 
     */
    public int getInCollaborationBanksBankId() {
        return inCollaborationBanksBankId;
    }

    /**
     * Sets the value of the inCollaborationBanksBankId property.
     * 
     */
    public void setInCollaborationBanksBankId(int value) {
        this.inCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the inCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollaborationBanksBankName() {
        return inCollaborationBanksBankName;
    }

    /**
     * Sets the value of the inCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollaborationBanksBankName(String value) {
        this.inCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the inCommChequeBookCommissionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommChequeBookCommissionFlag() {
        return inCommChequeBookCommissionFlag;
    }

    /**
     * Sets the value of the inCommChequeBookCommissionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommChequeBookCommissionFlag(String value) {
        this.inCommChequeBookCommissionFlag = value;
    }

    /**
     * Gets the value of the inDepMntRecordingIAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepMntRecordingIAmount1() {
        return inDepMntRecordingIAmount1;
    }

    /**
     * Sets the value of the inDepMntRecordingIAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepMntRecordingIAmount1(BigDecimal value) {
        this.inDepMntRecordingIAmount1 = value;
    }

    /**
     * Gets the value of the inDepMntRecordingIComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepMntRecordingIComments() {
        return inDepMntRecordingIComments;
    }

    /**
     * Sets the value of the inDepMntRecordingIComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepMntRecordingIComments(String value) {
        this.inDepMntRecordingIComments = value;
    }

    /**
     * Gets the value of the inDepMntRecordingIStoppedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepMntRecordingIStoppedType() {
        return inDepMntRecordingIStoppedType;
    }

    /**
     * Sets the value of the inDepMntRecordingIStoppedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepMntRecordingIStoppedType(String value) {
        this.inDepMntRecordingIStoppedType = value;
    }

    /**
     * Gets the value of the inDomesticCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getInDomesticCurrencyDisplayedDecimalPlaces() {
        return inDomesticCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the inDomesticCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setInDomesticCurrencyDisplayedDecimalPlaces(short value) {
        this.inDomesticCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the inDomesticCurrencyIdCurrency property.
     * 
     */
    public int getInDomesticCurrencyIdCurrency() {
        return inDomesticCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inDomesticCurrencyIdCurrency property.
     * 
     */
    public void setInDomesticCurrencyIdCurrency(int value) {
        this.inDomesticCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inDomesticCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDomesticCurrencyNationalFlag() {
        return inDomesticCurrencyNationalFlag;
    }

    /**
     * Sets the value of the inDomesticCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDomesticCurrencyNationalFlag(String value) {
        this.inDomesticCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the inFinJustificIdJustific property.
     * 
     */
    public int getInFinJustificIdJustific() {
        return inFinJustificIdJustific;
    }

    /**
     * Sets the value of the inFinJustificIdJustific property.
     * 
     */
    public void setInFinJustificIdJustific(int value) {
        this.inFinJustificIdJustific = value;
    }

    /**
     * Gets the value of the inFinPrftTransactionIdTransact property.
     * 
     */
    public int getInFinPrftTransactionIdTransact() {
        return inFinPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inFinPrftTransactionIdTransact property.
     * 
     */
    public void setInFinPrftTransactionIdTransact(int value) {
        this.inFinPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inFromChequeBookItemChequeCd property.
     * 
     */
    public short getInFromChequeBookItemChequeCd() {
        return inFromChequeBookItemChequeCd;
    }

    /**
     * Sets the value of the inFromChequeBookItemChequeCd property.
     * 
     */
    public void setInFromChequeBookItemChequeCd(short value) {
        this.inFromChequeBookItemChequeCd = value;
    }

    /**
     * Gets the value of the inFromChequeBookItemChequeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFromChequeBookItemChequeStatus() {
        return inFromChequeBookItemChequeStatus;
    }

    /**
     * Sets the value of the inFromChequeBookItemChequeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFromChequeBookItemChequeStatus(String value) {
        this.inFromChequeBookItemChequeStatus = value;
    }

    /**
     * Gets the value of the inFromChequeBookItemDishonourDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInFromChequeBookItemDishonourDate() {
        return inFromChequeBookItemDishonourDate;
    }

    /**
     * Sets the value of the inFromChequeBookItemDishonourDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInFromChequeBookItemDishonourDate(XMLGregorianCalendar value) {
        this.inFromChequeBookItemDishonourDate = value;
    }

    /**
     * Gets the value of the inFromChequeBookItemItemSerialNumber property.
     * 
     */
    public double getInFromChequeBookItemItemSerialNumber() {
        return inFromChequeBookItemItemSerialNumber;
    }

    /**
     * Sets the value of the inFromChequeBookItemItemSerialNumber property.
     * 
     */
    public void setInFromChequeBookItemItemSerialNumber(double value) {
        this.inFromChequeBookItemItemSerialNumber = value;
    }

    /**
     * Gets the value of the inFromDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFromDepositAccountDesignation() {
        return inFromDepositAccountDesignation;
    }

    /**
     * Sets the value of the inFromDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFromDepositAccountDesignation(String value) {
        this.inFromDepositAccountDesignation = value;
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
     * Gets the value of the inSupervisorsTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSupervisorsTeamInformationSuper1Code() {
        return inSupervisorsTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inSupervisorsTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSupervisorsTeamInformationSuper1Code(String value) {
        this.inSupervisorsTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inSupervisorsTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSupervisorsTeamInformationSuper2Code() {
        return inSupervisorsTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inSupervisorsTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSupervisorsTeamInformationSuper2Code(String value) {
        this.inSupervisorsTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inToChequeBookItemChequeCd property.
     * 
     */
    public short getInToChequeBookItemChequeCd() {
        return inToChequeBookItemChequeCd;
    }

    /**
     * Sets the value of the inToChequeBookItemChequeCd property.
     * 
     */
    public void setInToChequeBookItemChequeCd(short value) {
        this.inToChequeBookItemChequeCd = value;
    }

    /**
     * Gets the value of the inToChequeBookItemChequeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInToChequeBookItemChequeStatus() {
        return inToChequeBookItemChequeStatus;
    }

    /**
     * Sets the value of the inToChequeBookItemChequeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInToChequeBookItemChequeStatus(String value) {
        this.inToChequeBookItemChequeStatus = value;
    }

    /**
     * Gets the value of the inToChequeBookItemItemSerialNumber property.
     * 
     */
    public double getInToChequeBookItemItemSerialNumber() {
        return inToChequeBookItemItemSerialNumber;
    }

    /**
     * Sets the value of the inToChequeBookItemItemSerialNumber property.
     * 
     */
    public void setInToChequeBookItemItemSerialNumber(double value) {
        this.inToChequeBookItemItemSerialNumber = value;
    }

    /**
     * Gets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsedInputCharSuppliedChar37() {
        return inUsedInputCharSuppliedChar37;
    }

    /**
     * Sets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsedInputCharSuppliedChar37(String value) {
        this.inUsedInputCharSuppliedChar37 = value;
    }

}
