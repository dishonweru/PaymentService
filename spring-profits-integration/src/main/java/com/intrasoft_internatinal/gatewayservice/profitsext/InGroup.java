
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGroupInGrpChequeBookItemChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGroupInGrpChequeBookItemIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGroupInGrpChequesForCollectionChequeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpDepositAccountBookNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGroupInGrpDepTrxRecordingIAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInGrpDepTrxRecordingIComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpDepTrxRecordingIReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpDepTrxRecordingTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGroupInGrpDepUnclearTransAvailabilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGroupInGrpDpTrxSpecialAgrAvailDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGroupInGrpDpTrxSpecialAgrValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGroupInGrpFdValeurBalanceValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGroupInGrpIbanCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpIefSuppliedDescCrDrFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGroupInGrpOnlyForSafDepTrxjustTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpSupervisorsTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpSupervisorsTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpSupervisorsTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpBigCommentsCharSuppliedChar500" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGroup", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inGroupInGrpChequeBookItemChequeCd",
    "inGroupInGrpChequeBookItemIssueDate",
    "inGroupInGrpChequesForCollectionChequeNumber",
    "inGroupInGrpDepositAccountBookNo",
    "inGroupInGrpDepTrxRecordingIAmount",
    "inGroupInGrpDepTrxRecordingIComments",
    "inGroupInGrpDepTrxRecordingIReferenceNumber",
    "inGroupInGrpDepTrxRecordingTunInternalSn",
    "inGroupInGrpDepUnclearTransAvailabilityDate",
    "inGroupInGrpDpTrxSpecialAgrAvailDateSpread",
    "inGroupInGrpDpTrxSpecialAgrValueDateSpread",
    "inGroupInGrpFdValeurBalanceValueDate",
    "inGroupInGrpIbanCharSuppliedChar37",
    "inGroupInGrpIefSuppliedDescCrDrFlag",
    "inGroupInGrpIefSuppliedSelectChar",
    "inGroupInGrpJustificDescription",
    "inGroupInGrpJustificIdJustific",
    "inGroupInGrpOnlyForSafDepTrxjustTrnType",
    "inGroupInGrpSupervisorsTeamInformationAuthorizationResult",
    "inGroupInGrpSupervisorsTeamInformationSuper1Code",
    "inGroupInGrpSupervisorsTeamInformationSuper2Code",
    "inGroupInGrpBigCommentsCharSuppliedChar500"
})
public class InGroup {

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InGroupInGrpChequeBookItemChequeCd")
    protected short inGroupInGrpChequeBookItemChequeCd;
    @XmlElement(name = "InGroupInGrpChequeBookItemIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGroupInGrpChequeBookItemIssueDate;
    @XmlElement(name = "InGroupInGrpChequesForCollectionChequeNumber")
    protected String inGroupInGrpChequesForCollectionChequeNumber;
    @XmlElement(name = "InGroupInGrpDepositAccountBookNo")
    protected int inGroupInGrpDepositAccountBookNo;
    @XmlElement(name = "InGroupInGrpDepTrxRecordingIAmount", required = true)
    protected BigDecimal inGroupInGrpDepTrxRecordingIAmount;
    @XmlElement(name = "InGroupInGrpDepTrxRecordingIComments")
    protected String inGroupInGrpDepTrxRecordingIComments;
    @XmlElement(name = "InGroupInGrpDepTrxRecordingIReferenceNumber")
    protected String inGroupInGrpDepTrxRecordingIReferenceNumber;
    @XmlElement(name = "InGroupInGrpDepTrxRecordingTunInternalSn")
    protected short inGroupInGrpDepTrxRecordingTunInternalSn;
    @XmlElement(name = "InGroupInGrpDepUnclearTransAvailabilityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGroupInGrpDepUnclearTransAvailabilityDate;
    @XmlElement(name = "InGroupInGrpDpTrxSpecialAgrAvailDateSpread")
    protected short inGroupInGrpDpTrxSpecialAgrAvailDateSpread;
    @XmlElement(name = "InGroupInGrpDpTrxSpecialAgrValueDateSpread")
    protected short inGroupInGrpDpTrxSpecialAgrValueDateSpread;
    @XmlElement(name = "InGroupInGrpFdValeurBalanceValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGroupInGrpFdValeurBalanceValueDate;
    @XmlElement(name = "InGroupInGrpIbanCharSuppliedChar37")
    protected String inGroupInGrpIbanCharSuppliedChar37;
    @XmlElement(name = "InGroupInGrpIefSuppliedDescCrDrFlag")
    protected String inGroupInGrpIefSuppliedDescCrDrFlag;
    @XmlElement(name = "InGroupInGrpIefSuppliedSelectChar")
    protected String inGroupInGrpIefSuppliedSelectChar;
    @XmlElement(name = "InGroupInGrpJustificDescription")
    protected String inGroupInGrpJustificDescription;
    @XmlElement(name = "InGroupInGrpJustificIdJustific")
    protected int inGroupInGrpJustificIdJustific;
    @XmlElement(name = "InGroupInGrpOnlyForSafDepTrxjustTrnType")
    protected String inGroupInGrpOnlyForSafDepTrxjustTrnType;
    @XmlElement(name = "InGroupInGrpSupervisorsTeamInformationAuthorizationResult")
    protected String inGroupInGrpSupervisorsTeamInformationAuthorizationResult;
    @XmlElement(name = "InGroupInGrpSupervisorsTeamInformationSuper1Code")
    protected String inGroupInGrpSupervisorsTeamInformationSuper1Code;
    @XmlElement(name = "InGroupInGrpSupervisorsTeamInformationSuper2Code")
    protected String inGroupInGrpSupervisorsTeamInformationSuper2Code;
    @XmlElement(name = "InGroupInGrpBigCommentsCharSuppliedChar500")
    protected String inGroupInGrpBigCommentsCharSuppliedChar500;

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
     * Gets the value of the inGroupInGrpChequeBookItemChequeCd property.
     * 
     */
    public short getInGroupInGrpChequeBookItemChequeCd() {
        return inGroupInGrpChequeBookItemChequeCd;
    }

    /**
     * Sets the value of the inGroupInGrpChequeBookItemChequeCd property.
     * 
     */
    public void setInGroupInGrpChequeBookItemChequeCd(short value) {
        this.inGroupInGrpChequeBookItemChequeCd = value;
    }

    /**
     * Gets the value of the inGroupInGrpChequeBookItemIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGroupInGrpChequeBookItemIssueDate() {
        return inGroupInGrpChequeBookItemIssueDate;
    }

    /**
     * Sets the value of the inGroupInGrpChequeBookItemIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGroupInGrpChequeBookItemIssueDate(XMLGregorianCalendar value) {
        this.inGroupInGrpChequeBookItemIssueDate = value;
    }

    /**
     * Gets the value of the inGroupInGrpChequesForCollectionChequeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpChequesForCollectionChequeNumber() {
        return inGroupInGrpChequesForCollectionChequeNumber;
    }

    /**
     * Sets the value of the inGroupInGrpChequesForCollectionChequeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpChequesForCollectionChequeNumber(String value) {
        this.inGroupInGrpChequesForCollectionChequeNumber = value;
    }

    /**
     * Gets the value of the inGroupInGrpDepositAccountBookNo property.
     * 
     */
    public int getInGroupInGrpDepositAccountBookNo() {
        return inGroupInGrpDepositAccountBookNo;
    }

    /**
     * Sets the value of the inGroupInGrpDepositAccountBookNo property.
     * 
     */
    public void setInGroupInGrpDepositAccountBookNo(int value) {
        this.inGroupInGrpDepositAccountBookNo = value;
    }

    /**
     * Gets the value of the inGroupInGrpDepTrxRecordingIAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInGrpDepTrxRecordingIAmount() {
        return inGroupInGrpDepTrxRecordingIAmount;
    }

    /**
     * Sets the value of the inGroupInGrpDepTrxRecordingIAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInGrpDepTrxRecordingIAmount(BigDecimal value) {
        this.inGroupInGrpDepTrxRecordingIAmount = value;
    }

    /**
     * Gets the value of the inGroupInGrpDepTrxRecordingIComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpDepTrxRecordingIComments() {
        return inGroupInGrpDepTrxRecordingIComments;
    }

    /**
     * Sets the value of the inGroupInGrpDepTrxRecordingIComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpDepTrxRecordingIComments(String value) {
        this.inGroupInGrpDepTrxRecordingIComments = value;
    }

    /**
     * Gets the value of the inGroupInGrpDepTrxRecordingIReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpDepTrxRecordingIReferenceNumber() {
        return inGroupInGrpDepTrxRecordingIReferenceNumber;
    }

    /**
     * Sets the value of the inGroupInGrpDepTrxRecordingIReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpDepTrxRecordingIReferenceNumber(String value) {
        this.inGroupInGrpDepTrxRecordingIReferenceNumber = value;
    }

    /**
     * Gets the value of the inGroupInGrpDepTrxRecordingTunInternalSn property.
     * 
     */
    public short getInGroupInGrpDepTrxRecordingTunInternalSn() {
        return inGroupInGrpDepTrxRecordingTunInternalSn;
    }

    /**
     * Sets the value of the inGroupInGrpDepTrxRecordingTunInternalSn property.
     * 
     */
    public void setInGroupInGrpDepTrxRecordingTunInternalSn(short value) {
        this.inGroupInGrpDepTrxRecordingTunInternalSn = value;
    }

    /**
     * Gets the value of the inGroupInGrpDepUnclearTransAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGroupInGrpDepUnclearTransAvailabilityDate() {
        return inGroupInGrpDepUnclearTransAvailabilityDate;
    }

    /**
     * Sets the value of the inGroupInGrpDepUnclearTransAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGroupInGrpDepUnclearTransAvailabilityDate(XMLGregorianCalendar value) {
        this.inGroupInGrpDepUnclearTransAvailabilityDate = value;
    }

    /**
     * Gets the value of the inGroupInGrpDpTrxSpecialAgrAvailDateSpread property.
     * 
     */
    public short getInGroupInGrpDpTrxSpecialAgrAvailDateSpread() {
        return inGroupInGrpDpTrxSpecialAgrAvailDateSpread;
    }

    /**
     * Sets the value of the inGroupInGrpDpTrxSpecialAgrAvailDateSpread property.
     * 
     */
    public void setInGroupInGrpDpTrxSpecialAgrAvailDateSpread(short value) {
        this.inGroupInGrpDpTrxSpecialAgrAvailDateSpread = value;
    }

    /**
     * Gets the value of the inGroupInGrpDpTrxSpecialAgrValueDateSpread property.
     * 
     */
    public short getInGroupInGrpDpTrxSpecialAgrValueDateSpread() {
        return inGroupInGrpDpTrxSpecialAgrValueDateSpread;
    }

    /**
     * Sets the value of the inGroupInGrpDpTrxSpecialAgrValueDateSpread property.
     * 
     */
    public void setInGroupInGrpDpTrxSpecialAgrValueDateSpread(short value) {
        this.inGroupInGrpDpTrxSpecialAgrValueDateSpread = value;
    }

    /**
     * Gets the value of the inGroupInGrpFdValeurBalanceValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGroupInGrpFdValeurBalanceValueDate() {
        return inGroupInGrpFdValeurBalanceValueDate;
    }

    /**
     * Sets the value of the inGroupInGrpFdValeurBalanceValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGroupInGrpFdValeurBalanceValueDate(XMLGregorianCalendar value) {
        this.inGroupInGrpFdValeurBalanceValueDate = value;
    }

    /**
     * Gets the value of the inGroupInGrpIbanCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpIbanCharSuppliedChar37() {
        return inGroupInGrpIbanCharSuppliedChar37;
    }

    /**
     * Sets the value of the inGroupInGrpIbanCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpIbanCharSuppliedChar37(String value) {
        this.inGroupInGrpIbanCharSuppliedChar37 = value;
    }

    /**
     * Gets the value of the inGroupInGrpIefSuppliedDescCrDrFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpIefSuppliedDescCrDrFlag() {
        return inGroupInGrpIefSuppliedDescCrDrFlag;
    }

    /**
     * Sets the value of the inGroupInGrpIefSuppliedDescCrDrFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpIefSuppliedDescCrDrFlag(String value) {
        this.inGroupInGrpIefSuppliedDescCrDrFlag = value;
    }

    /**
     * Gets the value of the inGroupInGrpIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpIefSuppliedSelectChar() {
        return inGroupInGrpIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGroupInGrpIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpIefSuppliedSelectChar(String value) {
        this.inGroupInGrpIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inGroupInGrpJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpJustificDescription() {
        return inGroupInGrpJustificDescription;
    }

    /**
     * Sets the value of the inGroupInGrpJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpJustificDescription(String value) {
        this.inGroupInGrpJustificDescription = value;
    }

    /**
     * Gets the value of the inGroupInGrpJustificIdJustific property.
     * 
     */
    public int getInGroupInGrpJustificIdJustific() {
        return inGroupInGrpJustificIdJustific;
    }

    /**
     * Sets the value of the inGroupInGrpJustificIdJustific property.
     * 
     */
    public void setInGroupInGrpJustificIdJustific(int value) {
        this.inGroupInGrpJustificIdJustific = value;
    }

    /**
     * Gets the value of the inGroupInGrpOnlyForSafDepTrxjustTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpOnlyForSafDepTrxjustTrnType() {
        return inGroupInGrpOnlyForSafDepTrxjustTrnType;
    }

    /**
     * Sets the value of the inGroupInGrpOnlyForSafDepTrxjustTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpOnlyForSafDepTrxjustTrnType(String value) {
        this.inGroupInGrpOnlyForSafDepTrxjustTrnType = value;
    }

    /**
     * Gets the value of the inGroupInGrpSupervisorsTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpSupervisorsTeamInformationAuthorizationResult() {
        return inGroupInGrpSupervisorsTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the inGroupInGrpSupervisorsTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpSupervisorsTeamInformationAuthorizationResult(String value) {
        this.inGroupInGrpSupervisorsTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the inGroupInGrpSupervisorsTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpSupervisorsTeamInformationSuper1Code() {
        return inGroupInGrpSupervisorsTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inGroupInGrpSupervisorsTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpSupervisorsTeamInformationSuper1Code(String value) {
        this.inGroupInGrpSupervisorsTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inGroupInGrpSupervisorsTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpSupervisorsTeamInformationSuper2Code() {
        return inGroupInGrpSupervisorsTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inGroupInGrpSupervisorsTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpSupervisorsTeamInformationSuper2Code(String value) {
        this.inGroupInGrpSupervisorsTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inGroupInGrpBigCommentsCharSuppliedChar500 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpBigCommentsCharSuppliedChar500() {
        return inGroupInGrpBigCommentsCharSuppliedChar500;
    }

    /**
     * Sets the value of the inGroupInGrpBigCommentsCharSuppliedChar500 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpBigCommentsCharSuppliedChar500(String value) {
        this.inGroupInGrpBigCommentsCharSuppliedChar500 = value;
    }

}
